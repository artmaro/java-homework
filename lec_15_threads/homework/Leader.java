package lec_15_threads.homework;

/**
 Which are true? (Choose all that apply.)
 Какие утверждения верны?

 A. Compilation fails/Ошибка компиляции
 B. The output could be  r1 r2 m1 m2/программа может вывести r1 r2 m1 m2
 C. The output could be  m1 m2 r1 r2/программа может вывести m1 m2 r1 r2
 D. The output could be  m1 r1 r2 m2/программа может вывести m1 r1 r2 m2
 E. The output could be  m1 r1 m2 r2/программа может вывести m1 r1 m2 r2
 F.  An exception is thrown at runtime/Ошибка времени выполнения

 */
public class Leader implements Runnable {
    public static void main(String[] args) {
        Thread t = new Thread(new Leader());
        t.start();
        System.out.print("m1 ");
        t.join();
        System.out.print("m2 ");
    }
    public void run() {
        System.out.print("r1 ");
        System.out.print("r2 ");
    }
}

