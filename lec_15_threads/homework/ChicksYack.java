package lec_15_threads.homework;

/**
 Which are true? (Choose all that apply.)
 Какие утверждения верны?

 A. Compilation fails/Ошибка компиляции
 B. The output could be  4 4 2 3/программа может вывести 4 4 2 3
 C. The output could be  4 4 2 2/программа может вывести 4 4 2 2
 D. The output could be  4 4 4 2/программа может вывести 4 4 4 2
 E. The output could be  2 2 4 4/программа может вывести 2 2 4 4
 F.  An exception is thrown at runtime/Ошибка времени выполнения

 */
class Chicks {
    synchronized void yack(long id) {
        for (int x = 1; x < 3; x++) {
            System.out.print(id + " ");
            Thread.yield();
        }
    }
}

public class ChicksYack implements Runnable {
    Chicks c;

    public static void main(String[] args) {
        new ChicksYack().go();
    }

    void go() {
        c = new Chicks();
        new Thread(new ChicksYack()).start();
        new Thread(new ChicksYack()).start();
    }

    public void run() {
        c.yack(Thread.currentThread().getId());
    }
}
