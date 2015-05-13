package lec_17_lambdas.examples.listing_2;

import java.util.Comparator;

/**


 */
public class LambdaCompare {
    public static void main(String... args) {
        Comparator<String> c =
                (String lhs, String rhs) -> lhs.compareTo(rhs);
        int result = c.compare("Hello", "World");
        System.out.println("result = " + result);


        Comparator<String> c2 =
                (String lhs, String rhs) ->
                {
                    System.out.println("I am comparing" +
                            lhs + " to " + rhs);
                    return lhs.compareTo(rhs);
                };
        int result2 = c2.compare("Hello", "World");
        System.out.println("result2 = " + result2);

        //Автоматическое определение типов
        Comparator<String> c3 =
                (lhs, rhs) ->
                {
                    System.out.println("I am comparing" +
                            lhs + " to " + rhs);
                    return lhs.compareTo(rhs);
                };
        int result3 = c3.compare("Hello", "World");
    }
}
