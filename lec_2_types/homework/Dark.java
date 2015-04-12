package lec_2_types.homework;

/**
 * What is the result?/Какой будет результат?
 * A. 2
 * B. 3
 * C. 4
 * D. 5
 * E. Compilation fails/Ошибка компиляции
 * F.  An exception is thrown at runtime/Ошибка времени выполнения
 */
public class Dark {
    int x = 3;

    public static void main(String[] args) {
        new Dark().go1();
    }

    void go1() {
        int x;
        go2(++x);
    }

    void go2(int y) {
        int x = ++y;
        System.out.println(x);
    }
}
