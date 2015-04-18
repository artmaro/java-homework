package lec_5_class_design.homework;

/**
 What is the result?/Какой результат выполнения программы
 A.  furry bray
 B.  stripes bray
 C.  furry generic noise
 D.  stripes generic noise
 E. Compilation fails/Ошибка компиляции
 F.  An exception is thrown at runtime/Ошибка времени выполнения

 */
class Mammal {
    String name = "furry ";
    String makeNoise() { return "generic noise"; }
}

class Zebra extends Mammal {
    String name = "stripes ";
    String makeNoise() { return "bray"; }
}

public class ZooKeeper {
    public static void main(String[] args) { new ZooKeeper().go(); }
    void go() {
        Mammal m = new Zebra();
        System.out.println(m.name + m.makeNoise());
    }
}
