package lec_2_ifs.homework;

/**
 What is the result? / Какой будет результат работы программы?
 A.  -
 B.  -r
 C.  -rg
 D. Compilation fails/Ошибка компиляции
 E. An exception is thrown at runtime/Ошибка времени выполнения
 */

public class Flipper {
    public static void main(String[] args) {
        String o = "-";
        switch("FRED".toLowerCase().substring(1,3)) {
            case "yellow":
                o += "y";
            case "red":
                o += "r";
            case "green":
                o += "g";
        }
        System.out.println(o);
    }
}