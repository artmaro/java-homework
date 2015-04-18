package lec_5_class_design.homework;

/**
 What is the result? (Choose all that apply.)/Какой будет результат? (выбрать все подходящие варианты)
 A. An exception is thrown at runtime/Ошибка во времени выполнения программы
 B. The code compiles and runs with no output/Код выполняется без ошибок и не выводт результат
 C. Compilation fails/Ошибка компиляции


 */
public class Redwood extends Tree {
    public static void main(String[] args) {
        new Redwood().go();
    }
    void go() {
        go2(new Tree(), new Redwood());
        go2((Redwood) new Tree(), new Redwood());
    }
    void go2(Tree t1, Redwood r1) {
        Redwood r2 = (Redwood)t1;
        Tree t2 = (Tree)r1;
    }
}

class Tree { }