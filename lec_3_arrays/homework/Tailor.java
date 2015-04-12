package lec_3_arrays.homework;

/**
 What is the result?/Какой будет результат выполнения программы?
 A.  2 4
 B.  2 7
 C.  3 2
 D.  3 7
 E.  4 2
 F.  4 7
 G. Compilation fails/Ошибка компиляции

 */
public class Tailor {
    public static void main(String[] args) {
        byte[][] ba = {{1,2,3,4}, {1,2,3}};
        System.out.println(ba[1].length + " " + ba.length);
    }
}
