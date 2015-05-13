package lec_17_lambdas.examples.listing_6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**


 */

class Person {
    public String firstName;
    public String lastName;
    public int age;

    public final static Comparator<Person> compareFirstName =
            (lhs, rhs) -> lhs.firstName.compareTo(rhs.firstName);

    public final static Comparator<Person> compareLastName =
            (lhs, rhs) -> lhs.lastName.compareTo(rhs.lastName);

    public Person(String f, String l, int a) {
        firstName = f; lastName = l; age = a;
    }

    public static int compareFirstNames(Person lhs, Person rhs) {
        return lhs.firstName.compareTo(rhs.firstName);
    }

    public String toString() {
        return "[Person: firstName:" + firstName + " " +
                "lastName:" + lastName + " " +
                "age:" + age + "]";
    }
}

public class MethodRef {

    public static void main(String... args) {
        Person[] people = new Person[] {
                new Person("Ted", "Neward", 41),
                new Person("Charlotte", "Neward", 41),
                new Person("Michael", "Neward", 19),
                new Person("Matthew", "Neward", 13)
        };
        // Sort by first name
        // Sort by first name
        Arrays.sort(people, Person.compareFirstName);
        for (Person p : people)
            System.out.println(p);

        //method ref
        Arrays.sort(people, Person::compareFirstNames);



        List<Person> persons = Arrays.asList(people);
        persons.forEach(p -> System.out.println("person = " + p));
    }
}
