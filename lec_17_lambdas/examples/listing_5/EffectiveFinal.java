package lec_17_lambdas.examples.listing_5;

/**


 */
public class EffectiveFinal {
    public static void main(String... args) {
        String message = "Howdy, world!";
        Runnable r = () -> System.out.println(message);
        r.run();
    }
}
