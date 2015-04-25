package lec_8_generics.homework;

/**


 What is the result? /Какой результат работы программы?
 A.  1 2
 B.  2 2
 C.  2 3
 D.  3 2
 E.  3 3
 F.  Compilation fails/Ошибка компиляции
 G. An exception is thrown at runtime/Ошибка времени выполнения

 */

import java.util.*;

class Dog {
    int size;

    Dog(int s) {
        size = s;
    }
}

public class FirstGrade {
    public static void main(String[] args) {
        TreeSet<Integer> i = new TreeSet<Integer>();
        TreeSet<Dog> d = new TreeSet<Dog>();

        d.add(new Dog(1));
        d.add(new Dog(2));
        d.add(new Dog(1));
        i.add(1);
        i.add(2);
        i.add(1);
        System.out.println(d.size() + " " + i.size());
    }
}
