package lec_15_threads.homework;

/**
 What is the result of trying to compile and run this program?
 Какой будет результат при попытке компиляции и запуска этой программы?

 A. It fails to compile because the  IllegalMonitorStateException of  wait() is not dealt
 with in line 7/Не скомпилируется, т.к. IllegalMonitorStateException не обработано для метода wait
 B.  1 2 3
 C.  1 3
 D.  1 2
 E. At runtime, it throws an  IllegalMonitorStateException when trying to wait/IllegalMonitorStateException во время запуска программы
 F.  It will fail to compile because it has to be synchronized on the  this object/Нескомпилируется, т.к. synchronized должен блокировать текущий объект

 */
public class WaitTest {
    public static void main(String [] args) {
        System.out.print("1 ");
        synchronized(args){
            System.out.print("2 ");
            try {
                args.wait();
            }
            catch(InterruptedException e){}
        }
        System.out.print("3 ");
    }
}
