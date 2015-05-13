package lec_18_stream.examples.listing_5;

import java.util.OptionalDouble;
import java.util.OptionalInt;

import static java.util.Arrays.asList;

/**


 */
public class App {
    public static void main(String[] args) {
        asList("10", "20", "30").stream()
                .filter((String x) -> !x.contains("2"))
                .map(Integer::valueOf)
                .map(x -> x * x)
                .forEach(System.out::println);

        OptionalDouble average = asList("10", "20", "30").stream()

                .map(Integer::valueOf)
                .map(x -> x * x)
                .mapToInt(Integer::intValue)
                .average();

        System.out.println("average = " + average);

        OptionalInt max = asList("10", "20", "30").stream()

                .map(Integer::valueOf)
                .map(x -> x * x)
                .mapToInt(Integer::intValue)
                .max();

        System.out.println("max = " + max);
    }
}
