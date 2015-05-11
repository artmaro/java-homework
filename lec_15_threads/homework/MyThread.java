package lec_15_threads.homework;

/**
 What is the result of this code?
 Какой будет результат выполнения программы?

 A. Compilation fails/Ошибка компиляции
 B.  1..2..3..
 C.  0..1..2..3..
 D.  0..1..2..
 E. An exception occurs at runtime/Ошибка времени выполнения

 */
class MyThread1 extends Thread {
    public static void main(String [] args) {
        MyThread t = new MyThread();
        Thread x = new Thread(t);
        x.start();
    }
    public void run() {
        for(int i=0;i<3;++i) {
            System.out.print(i + "..");
        }
    }
}
