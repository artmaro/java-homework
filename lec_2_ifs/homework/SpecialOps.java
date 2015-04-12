package lec_2_ifs.homework;

/**
 Which are true? (Choose all that apply.)/Выберете все верные утверждения
 A. Compilation fails/Ошибка компиляции
 B.  x will be included in the output/x содержится в выводе программы
 C.  y will be included in the output/y содержится в выводе программы
 D.  z will be included in the output/z содержится в выводе программы
 E. An exception is thrown at runtime/Ошибка времени выполнения

 */
public class SpecialOps {
    public static void main(String[] args) {
        String s = "";
        boolean b1 = true;
        boolean b2 = false;
        if((b2 = false) | (21%5) > 2) s += "x";
        if(b1 || (b2 == true)) s += "y";
        if(b2 == true) s += "z";
        System.out.println(s);
    }
}