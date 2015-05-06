package lec_14_locale.homework;

/**

 Выберете все верные утверждения
 A. Результат выполнения программы будет  987.12345 987.12345
 B. Результат выполнения программы будет  987.12346 987.12345
 C. Результат выполнения программы будет  987.12345 987.123456
 D. Результат выполнения программы будет  987.12346 987.123456
 E. Блок try/catch block можно удалить
 F. Код компилируется и запускается без ошибок.
 G. Вызов метода parse() необходимо обернуть в try/catch блок

 */

import java.text.NumberFormat;

public class Slice {
    public static void main(String[] args) {
        String s = "987.123456";
        double d = 987.123456d;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(d) + " ");
        try {
            System.out.println(nf.parse(s));
        } catch (Exception e) {
            System.out.println("got exc");
        }
    }
}