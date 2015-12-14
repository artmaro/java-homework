package hot.code;

//1.crit by instance
//2.static crit
//3.crit by this
//4.crit by object
//5.crit by class

public class SyncMe {
    public static void main(String[] args) {
        SharedState first = new SharedState("### ");



        Worker t0 = new Worker();
        t0.setSharedState(first);
        t0.padding = "  -0-  ";
        t0.start();

        Worker t1 = new Worker();
        t1.setSharedState(first);
        t1.padding = "  -1-  ";
        t1.start();

        SharedState second = new SharedState("                                         %%% ");
      //  second.lockObject = first.lockObject;

        second.timeToSleep = 2000;
        Worker t2 = new Worker();
        t2.setSharedState(second);
        t2.padding = "                                         -2-  ";
        t2.start();

        Worker t3 = new Worker();
        t3.setSharedState(second);
        t3.padding = "                                         -3-  ";
        t3.start();
    }
}

class Worker extends Thread {

    SharedState sharedState;
    String padding = "";

    public void setSharedState(SharedState sharedState) {
        this.sharedState = sharedState;
    }

    public void setPadding(String padding) {
        this.padding = padding;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5 ; i++){
            try {
                System.out.println(padding + Thread.currentThread().getName() + " before acquire lock. Waiting ... \n");
                Thread.sleep(20);
                sharedState.critByInstance();
                System.out.println(padding + Thread.currentThread().getName() + " after acquire lock \n");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class SharedState {
    String mask;
    int timeToSleep = 500;

    public SharedState(String mask) {
        this.mask = mask;
    }

    public synchronized void critByInstance(){
        try {
            Thread.sleep(timeToSleep);
            System.out.println(mask + Thread.currentThread().getName() + " owns crit\n");
            Thread.sleep(timeToSleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public void critByThis(){
        synchronized (this) {
            try {
                Thread.sleep(timeToSleep);
                System.out.println(mask + Thread.currentThread().getName() + " owns crit\n");
                Thread.sleep(timeToSleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    Object lockObject = new Object();
    public void critByObject(){
        synchronized (lockObject) {
            try {
                Thread.sleep(timeToSleep);
                System.out.println(mask + Thread.currentThread().getName() + " owns crit\n");
                Thread.sleep(timeToSleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
