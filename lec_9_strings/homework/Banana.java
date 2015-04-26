package lec_9_strings.homework;

/**
 * And two invocations:
 * java Banana " "
 * java Banana "\d"
 *
 * Программа запускается с аргументами:
 * java Banana " "
 * java Banana "\d"
 *
 * What is the result? (Choose all that apply.)/Выберете все подходящие варианты ответа
 * A. In both cases, the count will be 5/В обоих случаях count будет 5
 * B. In both cases, the count will be 6/В обоих случаях count будет 6
 * C. In one case, the count will be 5, and in the other case, 6/В одном случае count будет 5, в другом 6
 * D. Banana cannot be invoked because it will not compile/Ошибка компиляции
 * E. At least one of the invocations will throw an exception/Как минимум в одном случае будет выброшена ошибка
 */
public class Banana {
    public static void main(String[] args) {
        String in = "1 a2 b 3 c4d 5e";
        String[] chunks = in.split(args[0]);
        System.out.println("count " + chunks.length);
        for (String s : chunks)
            System.out.print(">" + s + "< ");
    }
}