package lec13_exceptions.homework;

/**
 What will this code print?/Что напечатает следующий код?
 A.  a
 B.  ab
 C.  ac
 D.  abc
 E.  bc
 F.  Compilation fails/Ошибка компиляции

 */
public class Concert {
    static class PowerOutage extends Exception {}
    static class Thunderstorm extends Exception {}
    public static void main(String[] args) {
        try {
            new Concert().listen();
            System.out.println("a");
        } catch(PowerOutage | Thunderstorm e) {
            e = new PowerOutage();
            System.out.println("b");
        } finally { System.out.println("c"); }
    }
    public void listen() throws PowerOutage, Thunderstorm{ }
}
