package lec_5_class_design.homework;

/**
 What is the result?/Какой результат выполнения программы?
 A.  subsub
 B.  sub subsub
 C.  alpha subsub
 D.  alpha sub subsub
 E. Compilation fails/Ошибка компиляции
 F.  An exception is thrown at runtime/Ошибка времени выполнения

 */
class Alpha {
    static String s = " ";
    protected Alpha() { s += "alpha "; }
}

class SubAlpha extends Alpha {
    private SubAlpha() { s += "sub "; }
}

public class SubSubAlpha extends Alpha {
    private SubSubAlpha() { s += "subsub "; }
    public static void main(String[] args) {
        new SubSubAlpha();
        System.out.println(s);
    }
}
