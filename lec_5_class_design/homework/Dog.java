package lec_5_class_design.homework;

/**
 What is the result? (Choose all that apply.)/Какой будет результат? (выбрать все подходящие варианты)
 A.  howl howl sniff
 B.  howl woof sniff
 C.  howl howl followed by an exception/howl howl с последующей ошибкой
 D.  howl woof followed by an exception/howl woof с последующей ошибкой
 E. Compilation fails /Ошибка компиляции


 */
class Dog {
    public void bark() { System.out.print("woof "); }
}

class Hound extends Dog {
    public void sniff() { System.out.print("sniff "); }
    public void bark() { System.out.print("howl "); }
}

public class DogShow {
    public static void main(String[] args) { new DogShow().go(); }
    void go() {
        new Hound().bark();
        ((Dog) new Hound()).bark();
        ((Dog) new Hound()).sniff();
    }
}