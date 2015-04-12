package lec_3_arrays.homework;

/**

 And given the command-line invocation:/Программа запускается с параметрами


 Java Flip2 RED Green YeLLow

 Which are true? (Choose all that apply.)/Выбрать все верные утверждения
 A. The string  rgy will appear somewhere in the output/Строка rgy содержится в результате программы
 B. The string  rgg will appear somewhere in the output/Строка rgg содержится в результате программы
 C. The string  gyr will appear somewhere in the output/Строка gyr содержится в результате программы
 D. Compilation fails/Ошибка компиляции
 E. An exception is thrown at runtime/Ошибка времени выполнения

 */
public class Flip2 {
    public static void main(String[] args) {
        String o = "-";
        String[] sa = new String[4];
        for(int i = 0; i < args.length; i++)
            sa[i] = args[i];
        for(String n: sa) {
            switch(n.toLowerCase()) {
                case "yellow": o += "y";
                case "red": o += "r";
                case "green": o += "g";
            }
        }
        System.out.print(o);
    }
}
