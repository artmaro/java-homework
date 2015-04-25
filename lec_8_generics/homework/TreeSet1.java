package lec_8_generics.homework;

/**

 * Which statements are true?
 * Какие утверждения верны?
 *
 * A. The  before() method will print  1 2/Метод before напечатает 1 2
 * B. The  before() method will print  1 2 3/Метод before напечатает 1 2 3
 * C. The  before() method will print three numbers, but the order cannot be determined/Метод before напечатает три значения, но порядок случаен
 * D. The  before() method will not compile/Метод не скомпилируется
 * E. The  before() method will throw an exception at runtime/Метод выбросит ошибку времени выполнения
 */
public class TreeSet1 {
    public static void before() {
        Set set = new TreeSet();
        set.add("2");
        set.add(3);
        set.add("1");
        Iterator it = set.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");
    }
}
