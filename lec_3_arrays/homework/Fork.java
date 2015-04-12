package lec_3_arrays.homework;

/**

 And the command-line invocation:/Программа запускается с аргументами
 java Fork live2
 What is the result?/Какой будет результат выполнения программы?
 A.  test case
 B.  production live2
 C.  test case live2
 D. Compilation fails/Ошибка компиляции
 E. An exception is thrown at runtime/Ошибка времени выполнения

 */
class Fork {
    public static void main(String[] args) {
        if(args.length == 1 | args[1].equals("test")) {
            System.out.println("test case");
        } else {
            System.out.println("production " + args[0]);
        }
    }
}
