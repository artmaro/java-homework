package lec_15_threads.homework;

/**
 Which letters will eventually appear somewhere in the output? (Choose all that apply.)
 Какие буквы будут попадаться в выводе программы?

 A.  A
 B.  B
 C.  C
 D.  D
 E.  E
 F.  F
 G. The answer cannot be reliably determined/Ответ не может быть точно определен
 H. The code does not compile/Код не скомпилируется

 */
public class TwoThreads {
    static Thread laurel, hardy;
    public static void main(String[] args) {
        laurel = new Thread() {
            public void run() {
                System.out.println("A");
                try {
                    hardy.sleep(1000);
                } catch (Exception e) {
                    System.out.println("B");
                }
                System.out.println("C");
            }
        };
        hardy = new Thread() {
            public void run() {
                System.out.println("D");
                try {
                    laurel.wait();
                } catch (Exception e) {
                    System.out.println("E");
                }
                System.out.println("F");
            }
        };
        laurel.start();
        hardy.start();
    }
}
