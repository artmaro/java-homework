package lec_9_strings.homework;

/**
 What is the result?/Какой будет результат?
 A.  1 2
 B.  1 2 3 45 6
 C.  1 2 3 4 5 6
 D.  1 2 a 3 45 6
 E. Compilation fails/Ошибка компиляции
 F.  1 2 followed by an exception/В консоли будет напечатано 1 2 и потом выброшено исключение

 */

import java.util.*;

public class Looking {
    public static void main(String[] args) {
        String input = "1 2 a 3 45 6";
        Scanner sc = new Scanner(input);
        int x = 0;
        do {
            x = sc.nextInt();
            System.out.print(x + " ");
        } while (x != 0);
    }
}