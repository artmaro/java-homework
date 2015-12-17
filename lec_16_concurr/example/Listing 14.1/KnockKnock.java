package hot.code;

import java.util.concurrent.Exchanger;

public class KnockKnock {
    public static void main(String []args) {
        Exchanger<String> sillyTalk = new Exchanger<String>();
        new CoffeeShopThread(sillyTalk).start();
        new DukeThread(sillyTalk).start();
    }
}

class DukeThread extends Thread {
    private Exchanger<String> sillyTalk;

    public DukeThread(Exchanger<String> args) {
        sillyTalk = args;
    }
    public void run() {
        String reply = null;
        try {

            reply = sillyTalk.exchange("Knock knock!");

            System.out.println("CoffeeShop: " + reply);


            reply = sillyTalk.exchange("Duke");

            System.out.println("CoffeeShop: " + reply);


            reply = sillyTalk.exchange("The one who was born in this coffee shop!");

        } catch(InterruptedException ie) {
            System.err.println("Got interrupted during my silly talk");
        }
    }
}


class CoffeeShopThread extends Thread {
    private Exchanger<String> sillyTalk;
    public CoffeeShopThread(Exchanger<String> args) {
        sillyTalk = args;
    }
    public void run() {
        String reply = null;
        try {
            Thread.sleep(1000);
            reply = sillyTalk.exchange("Who's there?");

            System.out.println("Duke: " + reply);


                    reply = sillyTalk.exchange("Duke who?");

            System.out.println("Duke: " + reply);

            reply = sillyTalk.exchange("");
            System.out.println("Duke: " + reply);
        } catch(InterruptedException ie) {
            System.err.println("Got interrupted during my silly talk");
        }
    }
}