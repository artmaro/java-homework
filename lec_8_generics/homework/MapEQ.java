package lec_8_generics.homework;

/**

 Which is correct? (Choose all that apply.)
 Выберете все верные утрверждения

 A. As the code stands, it will not compile/В текущем виде, код не скопилируется
 B. As the code stands, the output will be  2/В текущем виде, в результате будет напечатано 2
 C. As the code stands, the output will be  3/В текущем виде, в результате будет напечатано 3
 D. If the  hashCode() method is uncommented, the output will be  2/Если раскомментировать метод hashCode, то в результате будет напечатано 2
 E. If the  hashCode() method is uncommented, the output will be  3/Если раскомментировать метод hashCode, то в результате будет напечатано 3
 F.  If the  hashCode() method is uncommented, the code will not compile/Если раскомментировать метод hashCode, код не скомпилируется

 */

import java.util.*;

class MapEQ {
    public static void main(String[] args) {
        Map<ToDos, String> m = new HashMap<ToDos, String>();
        ToDos t1 = new ToDos("Monday");
        ToDos t2 = new ToDos("Monday");
        ToDos t3 = new ToDos("Tuesday");
        m.put(t1, "doLaundry");
        m.put(t2, "payBills");
        m.put(t3, "cleanAttic");
        System.out.println(m.size());
    }
}

class ToDos {
    String day;

    ToDos(String d) {
        day = d;
    }

    public boolean equals(Object o) {
        return ((ToDos) o).day.equals(this.day);
    }
    // public int hashCode() { return 9; }
}