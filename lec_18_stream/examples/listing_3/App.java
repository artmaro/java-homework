package lec_18_stream.examples.listing_3;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import static java.util.Arrays.asList;
/**


 */
public class App {
    public static void main(String[] args) {
        List<String> list0 = asList("10", "20", "30");

        List<Integer> list1 = new ArrayList<>();
        for (String elem : list0) {
            list1.add(Integer.valueOf(elem));
        }

        System.out.println(list1);

        List<Integer> list2 = map(list0, Integer::valueOf);

        System.out.println(list2);

        List<String> listOfString = map(list0, (String s) -> "pre_" + s);
        System.out.println("listOfString = " + listOfString);
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T elem : list) {
            result.add(f.apply(elem));
        }
        return result;
    }
}
