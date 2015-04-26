package lec_9_strings.homework;

/**
 * Which are true? (Choose all that apply.)/Выберете все подходящие варианты
 * A. Compilation fails/Ошибка компиляции
 * B. The first line of output is  abc abc true/Первая строка вывода  abc abc true
 * C. The first line of output is  abc abc false/Первая строка вывода  abc abc false
 * D. The first line of output is  abcd abc false/Первая строка вывода  abcd abc false
 * E. The second line of output is  abcd abc false/Второая строка вывода abcd abc false
 * F.  The second line of output is  abcd abcd true/Второая строка вывода abcd abcd true
 * G. The second line of output is  abcd abcd false/Второая строка вывода abcd abcd false
 */
public class Theory {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1;
        s1 += "d";
        System.out.println(s1 + " " + s2 + " " + (s1 == s2));

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));
    }
}