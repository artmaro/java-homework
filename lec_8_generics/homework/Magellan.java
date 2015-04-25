package lec_8_generics.homework;

/**
 Which of the  System.out.println statements will produce the output  1st after mango: p ?
 Какие из следующих строк, помеченных комментарием, после выполнения программы в результате наечатают 1st after mango: p ?

 (Choose all that apply.)
 A.  sop 1
 B.  sop 2
 C.  sop 3
 D.  sop 4
 E. None; compilation fails/Никакие. Ошибка компиляции
 F.  None; an exception is thrown at runtime/Ошибка времени выполнения
 */

import java.util.*;

public class Magellan {
    public static void main(String[] args) {
        TreeMap<String, String> myMap = new TreeMap<String, String>();
        myMap.put("a", "apple");
        myMap.put("d", "date");
        myMap.put("f", "fig");
        myMap.put("p", "pear");
        System.out.println("1st after mango: " + // sop 1
                myMap.higherKey("f"));
        System.out.println("1st after mango: " + // sop 2
                myMap.ceilingKey("f"));
        System.out.println("1st after mango: " + // sop 3
                myMap.floorKey("f"));
        SortedMap<String, String> sub = new TreeMap<String, String>();
        sub = myMap.tailMap("f");
        System.out.println("1st after mango: " + // sop 4
                sub.firstKey());
    }
}