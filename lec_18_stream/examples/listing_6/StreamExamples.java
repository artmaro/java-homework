package hot.code;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        String collect = numbers.stream()
                .map(Object::toString)
                .sorted((i1, i2) -> i2.compareTo(i1))
                .collect(Collectors.joining(";"));

        System.out.println("collect = " + collect);

        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }

        int sum1 = numbers.stream().reduce(0, (x,y) -> x+y);

        int sum2 = numbers.stream().reduce(0, Integer::sum);

        int sum3 = numbers.parallelStream().reduce(0, Integer::sum);

        System.out.println("sum = " + sum + " sum1 = " + sum1  + " sum2 = " + sum2  + " sum3 = " + sum3 );


        List<String> l = new ArrayList(Arrays.asList("one", "two"));
        Stream<String> sl = l.stream();
        l.add("three");
        String s = sl.collect(Collectors.joining(" "));
        System.out.println("l = " + l);

    }
}
