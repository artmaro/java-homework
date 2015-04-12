package lec_3_arrays.homework;

/**
 * And, if the code compiles, the command line:/Программа запускается с параметрами
 * java Hilltop eyra vafi draumur kara
 * What is the result?/Какой будет результат выполнения программы?
 * A.  EYRA VAFI DRAUMUR KARA
 * B.  EYRA VAFI DRAUMUR KARA null
 * C. An exception is thrown with no other output/Исключение выброшены. Вывод программы пустой.
 * D.  EYRA VAFI DRAUMUR KARA , and then a  NullPointerException/Строка EYRA VAFI DRAUMUR KARA и ошибка времени выполнения NullPointerException
 * E.  EYRA VAFI DRAUMUR KARA , and then an  ArrayIndexOutOfBoundsException/Строка EYRA VAFI DRAUMUR KARA  и ошибка времени выполнения ArrayIndexOutOfBoundsException
 * F.  Compilation fails/Ошибка компиляции
 */
public class Hilltop {
    public static void main(String[] args) {
        String[] horses = new String[5];
        horses[4] = null;
        for (int i = 0; i < horses.length; i++) {
            if (i < args.length)
                horses[i] = args[i];
            System.out.print(horses[i].toUpperCase() + " ");
        }
    }
}
