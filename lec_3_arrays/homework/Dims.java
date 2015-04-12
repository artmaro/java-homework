package lec_3_arrays.homework;

/**
 What is the result? (Choose all that apply.)/Какой будет результат выполнения программы? Выберете подходящие варианты
 A.  2
 B.  4
 C. An exception is thrown at runtime/Ошибка времени выполнения
 D. Compilation fails due to an error on line 4/Ошибка компиляции в строке 4
 E. Compilation fails due to an error on line 5/Ошибка компиляции в строке 5
 F.  Compilation fails due to an error on line 6/Ошибка компиляции в строке 6
 G. Compilation fails due to an error on line 7/Ошибка компиляции в строке 7

 */
class Dims {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[] b = (int[]) a[1];
        Object o1 = a;//line 4
        int[][] a2 = (int[][]) o1;//line 5
        int[] b2 = (int[]) o1;//line 6
        System.out.println(b[1]);//line 7
    }
}