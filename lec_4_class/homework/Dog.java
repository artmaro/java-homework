package lec_4_class.homework;

/**
 * Created by Eugene on 06.04.2015.

 What is the result?
 A.  true true true
 B.  true true false
 C.  false true false
 D.  false true true
 E.  false false false
 F.  An exception will be thrown at runtime

 */
public class Dog {
    String name;
    Dog(String s) { name = s; }
    public static void main(String[] args) {
        Dog d1 = new Dog("Boi");
        Dog d2 = new Dog("Tyri");
        System.out.print((d1 == d2) + " ");
        Dog d3 = new Dog("Boi");
        d2 = d1;
        System.out.print((d1 == d2) + " ");
        System.out.print((d1 == d3) + " ");
    }
}