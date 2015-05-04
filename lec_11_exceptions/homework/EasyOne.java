package lec13_exceptions.homework;

/**
 * Which could be used to create an appropriate  catch block? (Choose all that apply.)
 Выберете все подходяще варианты для обработки исключения в catch блоке.

 * A.  ClassCastException
 * B.  IllegalStateException
 * C.  NumberFormatException
 * D.  IllegalArgumentException
 * E.  ExceptionInInitializerError
 * F.  ArrayIndexOutOfBoundsException
 */
public class EasyOne {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt("two");
        } catch ( ? ){

        }
    }
}
