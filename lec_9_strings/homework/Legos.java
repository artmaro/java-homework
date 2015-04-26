package lec_9_strings.homework;

/**
 * What is the result?/Какой будет результат?
 * A.  0 8 abcdef78
 * B.  0 8 789abcde
 * C.  0 9 abcdef789
 * D.  0 9 789abcdef
 * E. Compilations fails/Ошибка компиляции
 * F.  0 , followed by an exception/В консоли будет 0 и потом выброшено исключение
 */
public class Legos {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(8);
        System.out.print(sb.length() + " " + sb + " ");
        sb.insert(0, "abcdef");
        sb.append("789");
        System.out.println(sb.length() + " " + sb);
    }
}
