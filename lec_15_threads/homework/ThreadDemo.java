package lec_15_threads.homework;

/**
 Which of the following pairs of method invocations could NEVER be executing at the same
 time? (Choose all that apply.)
 Выберете все пары вызова методов, которые не могут быть вызваны в одновременно

 A.  x.a()  в thread1 , и x.a()  в thread2
 B.  x.a( ) в  thread1 ,и  x.b() в  thread2
 C.  x.a()  в thread1 , и y.a()  в thread2
 D.  x.a()  в thread1 , и y.b()  в thread2
 E.  x.b()  в thread1 , и x.a()  в thread2
 F.  x.b()  в thread1 , и x.b()  в thread2
 G.  x.b()  в thread1 , и y.a()  в thread2
 H.  x.b()  в thread1 , и y.b()  в thread2

 */
public class ThreadDemo {
    synchronized void a() { actBusy(); }
    static synchronized void b() { actBusy(); }
    static void actBusy() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
    public static void main(String[] args) {
        final ThreadDemo x = new ThreadDemo();
        final ThreadDemo y = new ThreadDemo();
        Runnable runnable = new Runnable() {
            public void run() {
                int option = (int) (Math.random() * 4);
                switch (option) {
                    case 0: x.a(); break;
                    case 1: x.b(); break;
                    case 2: y.a(); break;
                    case 3: y.b(); break;
                }
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
