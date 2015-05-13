package lec_18_stream.examples.listing_2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import static java.util.Arrays.asList;
/**


 */
public class App {
    public static void main(String[] args) {
        List<String> list0 = asList("10", "20", "30");

        List<String> list1 = new ArrayList<>();
        for (String elem : list0) {
            if (!elem.contains("2")) {
                list1.add(elem);
            }
        }
        System.out.println(list1);

        List<String> list2 = filter(list0, x -> !x.contains("2"));

        System.out.println(list2);

        List<Integer> listInteger = asList(1,2,3);
        System.out.println(
                filter(listInteger, (Integer i) -> !i.equals(2))
        );
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T elem : list) {
            if (p.test(elem)) {
                result.add(elem);
            }
        }
        return result;
    }
}
