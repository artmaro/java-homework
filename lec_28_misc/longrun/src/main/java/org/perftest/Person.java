package org.perftest;

/**
 * Created by ekokuykin on 02.07.15.
 */
public class Person {
    String name;
    int age;

    public static Person buildPerson(String name, int age){
        Person person = new Person();
        person.name = name;
        person.age = age;

        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
