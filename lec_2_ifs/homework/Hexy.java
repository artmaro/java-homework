package lec_2_ifs.homework;

/**
 What is the result? /Какой будет результат работы программы?
 A.  null
 B.  life
 C.  universe
 D.  everything
 E. Compilation fails/Ошибка компиляции
 F.  An exception is thrown at runtime/Ошибка времени выполнения

 */
class Hexy {
    public static void main(String[] args) {
        int i = 42;
        String s = (i<40)?"life":(i>50)?"universe":"everything";
        System.out.println(s);
    }
}
