package lec_15_threads.homework;

/**
 What is the result?
 Какой будет результат выполнения программы?

 A.  foo
 B.  MyThread foo
 C.  MyThread bar
 D.  foo bar
 E.  foo bar baz
 F.  bar foo
 G. Compilation fails/Ошибка компиляции
 H. An exception is thrown at runtime/Ошибка времени выполнения

 */
class MyThread extends Thread {
    MyThread() {
        System.out.print("MyThread ");
    }
    public void run() {
        System.out.print("bar ");
    }
    public void run(String s) {
        System.out.print("baz ");
    }
}
public class TestThreads {
    public static void main (String [] args) {
        Thread t = new MyThread() {
            public void run() {
                System.out.print("foo ");
            }
        };
        t.start();
    } }
