package lec_6_enums.homework;

/**
 What is the result?/Какой результат выполнения?
 A.  same old
 B.  newly new
 C. Compilation fails due to multiple errors/Несколько ошибок компиляции
 D. Compilation fails /Одна ошибка компиляции
 */
public class McGee {
    public static void main(String[] args) {
        Days d1 = Days.TH;
        Days d2 = Days.M;
        for(Days d: Days.values()) {
            if(d.equals(Days.F)) break;
            d2 = d;
        }
        System.out.println((d1 == d2)?"same old" : "newly new");
    }
    enum Days {M, T, W, TH, F, SA, SU};
}