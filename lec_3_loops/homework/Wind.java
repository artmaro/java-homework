package lec_3_loops.homework;

/**
 * What is the result?/Какой будет результат выполнения программы?
 * A.  0 1 2 3
 * B. 1 1 1 3 3
 * C.  0 1 1 1 2 3 3
 * D.  1 1 1 3 3 4 4 4
 * E.  0 1 1 1 2 3 3 4 4 4
 * F.  Compilation fails/Ошибка комплияции
 */
public class Wind {
    public static void main(String[] args) {
        foreach:
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(" " + j);
                if (j == 3 && k == 1) break foreach;
                if (j == 0 || j == 2) break;
            }
        }
    }
}