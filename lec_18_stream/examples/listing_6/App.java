package lec_18_stream.examples.listing_6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**


 */
public class App {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person(1, "bob", "jones"),
                new Person(12, "marry", "jones"),
                new Person(4, "marry", "jones"),
                new Person(21, "jack", "smith"),
                new Person(17, "alice", "black")
        );

        Map<String, List<Person>> personByLastName = persons.stream()
                .filter(pers -> pers.age < 20)
                .collect(Collectors.groupingBy(pers -> pers.lastname));
        System.out.println("personByLastName = " + personByLastName);

        List<String> lastNames = persons.stream()
                .filter(pers -> pers.age < 20)
                .map(pers -> pers.lastname)
                .collect(Collectors.toList());
        System.out.println("lastNames = " + lastNames);

        Integer sumJonesAges = persons.stream()
                .filter(p -> p.lastname.equals("jones")) //оставляет только jones
                .map(p -> p.age)                        //оставляет поток возрастов jones: 1, 12, 4
                .reduce(0,//начальное значение
                        (a, b) -> a + b);//возвращает новое значение
                //0 + 1, 1 + 12, 13 + 4


        System.out.println("sumJonesAges = " + sumJonesAges);

        Map<String, Integer> collect = persons.stream()
                .filter(pers -> pers.age < 20)
                .collect(Collectors.groupingBy(
                        pers -> pers.lastname,
                        Collectors.reducing(
                                0,
                                pers -> pers.age,
                                Integer::sum
                        )

                ));
        System.out.println("collect = " + collect);

    }
}

class Person{
    int age;
    String name;
    String lastname;

    public Person(int age, String name, String lastname) {
        this.age = age;
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}