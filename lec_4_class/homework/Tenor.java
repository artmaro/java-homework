package lec_4_class.homework;

/**
 * What is the result?/Какой будет результат выполнения программы?
 * A.  fa fa
 * B.  fa la
 * C.  la la
 * D. Compilation fails/Ошибка компиляции
 * E. An exception is thrown at runtime/Ошибка времени выполнения
 */
public class Tenor extends Singer {
    public static String sing() {
        return "fa";
    }

    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.println(t.sing() + " " + s.sing());
    }
}

class Singer {
    public static String sing() {
        return "la";
    }
}