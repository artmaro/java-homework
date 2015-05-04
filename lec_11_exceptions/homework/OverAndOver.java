package lec13_exceptions.homework;

/**
 * What is the result?
 * Какой будет результат?
 * A.  12
 * B.  13
 * C.  123
 * D.  1234
 * E. Compilation fails/Ошибка компиляции
 * F.  123 followed by an exception/123 и затем выброшено исключение
 * G.  1234 followed by an exception/1234 и затем выброшено исключение
 * H. An exception is thrown with no other output/выброшено исключение до того как программа что либо напечатает.
 */
public class OverAndOver {
    static String s = "";

    public static void main(String[] args) {
        try {
            s += "1";
            throw new Exception();
        } catch (Exception e) {
            s += "2";
        } finally {
            s += "3";
            doStuff();
            s += "4";
        }
        System.out.println(s);
    }

    static void doStuff() {
        int x = 0;
        int y = 7 / x;
    }
}
