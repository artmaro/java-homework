package lec_18_stream.examples.listing_1;

import java.util.List;
import java.util.function.Consumer;

import static java.util.Arrays.asList;

/**


 */
public class App {
    public static void main(String[] args) {
        List<String> list = asList("10", "20", "30");

        for (String elem : list) {
            System.out.println(elem);
        }

        forEach(list, System.out::println);
        forEach(list, (String a) -> System.out.println("a = " + a));
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T elem : list) {
            c.accept(elem);
        }
    }
}
