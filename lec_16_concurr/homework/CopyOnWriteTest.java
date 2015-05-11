package lec_16_concur.homework;

/**
Какой будет результат выполнения программы?
 A.  6
 B.  12
 C.  4 2
 D.  4 2 6
 E. Compilation fails/Ошибка компилиции
 F.  An exception is thrown at runtime/Ошибка времени выполнения
 */
public class CopyOnWriteTest {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<>();
        cowList.add(4);
        cowList.add(2);
        Iterator<Integer> it = cowList.iterator();
        cowList.add(6);
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
