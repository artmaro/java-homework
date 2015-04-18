package lec_6_inner.homework;

/**
 * Which, inserted independently at line 5, produce the output  "hi" ? (Choose all that apply.)
 * Какая строка вставленная в строку // insert code here в результате работы напечатает "hi". Выбрать все варианты.
 * A.  { Car.drive(); }
 * B.  { this.drive(); }
 * C.  { Car.this.drive(); }
 * D.  { this.Car.this.drive(); }
 * E.  Engine() { Car.drive(); }
 * F.  Engine() { this.drive(); }
 * G.  Engine() { Car.this.drive(); }
 */
public class Car {
    class Engine {
        // insert code here
    }

    public static void main(String[] args) {
        new Car().go();
    }

    void go() {
        new Engine();
    }

    void drive() {
        System.out.println("hi");
    }
}