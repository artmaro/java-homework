package hot.code;

public class StaticSyncMe {


    public static void main(String[] args) {
        WorkerStatic t0 = new WorkerStatic();
        t0.padding = "  -0-  ";
        t0.start();

        WorkerStatic t1 = new WorkerStatic();
        t1.padding = "  -1-  ";
        t1.start();

        WorkerStatic t2 = new WorkerStatic();
        t2.padding = "  -2-  ";
        t2.start();

        WorkerStatic t3 = new WorkerStatic();
        t3.padding = "  -3-  ";
        t3.start();
    }
}

class WorkerStatic extends Thread {


    String padding = "";



    public void setPadding(String padding) {
        this.padding = padding;
    }

    @Override
    public void run() {
        for(int i = 0; i < 4 ; i++){
            try {
                System.out.println(padding + Thread.currentThread().getName() + " before acquire lock. Waiting ... \n");
                Thread.sleep(20);
                SharedStaticState.critByClass(i);
                System.out.println(padding + Thread.currentThread().getName() + " after acquire lock \n");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class SharedStaticState {
    static String mask = "                                        ### ";
    static int timeToSleep = 500;


    public static synchronized void critByClass(int i){
        try {
            Thread.sleep(timeToSleep);
            System.out.println(mask + Thread.currentThread().getName() + " owns crit for " + i +  " time \n");
            Thread.sleep(timeToSleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void critByClass2(int i){
        synchronized (SharedStaticState.class) {
            try {
                Thread.sleep(timeToSleep);
                System.out.println(mask + Thread.currentThread().getName() + " owns crit for " + i +  " time \n");
                Thread.sleep(timeToSleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
