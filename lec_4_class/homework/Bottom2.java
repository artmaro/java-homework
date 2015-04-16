package lec_4_class.homework;

/**
 * What is the result?/Какой будет результат выполнения программы?
 * A.  BD
 * B.  DB
 * C.  BDC
 * D.  DBC
 * E. Compilation fails/Ошибка компиляции
 */
class Top {
    public Top(String s) {
        System.out.print("B");
    }
}

public class Bottom2 extends Top {
    public Bottom2(String s) {
        System.out.print("D");
    }

    public static void main(String[] args) {
        new Bottom2("C");
        System.out.println(" ");
    }
}
