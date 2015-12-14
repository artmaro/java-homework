package hot.code;

import java.util.concurrent.*;

class PriorityBlockingQueueExample {
    public static void main(String []args) {
        final PriorityBlockingQueue<Integer> priorityBlockingQueue
                = new PriorityBlockingQueue<>();
        new Thread() {
            public void run() {
                try {
// use take() instead of remove()
// note that take() blocks, whereas remove() doesn't block
                    System.out.println("The removed element is: "
                            + priorityBlockingQueue.take());
                } catch(InterruptedException ie) {

                    ie.printStackTrace();
                }
            }

        }.start();
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                priorityBlockingQueue.add(10);
                System.out.println("Successfully added an element to the queue ");
            }
        }.start();
    }
}