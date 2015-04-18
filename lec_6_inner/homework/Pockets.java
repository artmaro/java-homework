package lec_6_inner.homework;

/**
 Given:

 What is the result?/Какой будет результат выполнения программы?
 A. Compilation fails/Ошибка компиляции
 B.  button key lint nickel
 nickel lint key button
 C.  nickel button key lint
 button key lint nickel
 D.  nickel button key lint
 nickel button key lint
 E.  nickel button key lint
 nickel lint key button
 F.  An exception is thrown at runtime/Ошибка времени выполнения

 */

import java.util.*;

public class Pockets {
    public static void main(String[] args) {
        String[] sa = {"nickel", "button", "key", "lint"};
        Sorter s = new Sorter();
        for (String s2 : sa) System.out.print(s2 + " ");
        Arrays.sort(sa, s);
        System.out.println();
        for (String s2 : sa) System.out.print(s2 + " ");
    }

    class Sorter implements Comparator<String> {
        public int compare(String a, String b) {
            return b.compareTo(a);
        }
    }
}
