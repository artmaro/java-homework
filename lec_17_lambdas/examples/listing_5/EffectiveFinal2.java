package lec_17_lambdas.examples.listing_5;

/**


 */
public class EffectiveFinal2 {
    public static void main(String... args) {
        StringBuilder message = new StringBuilder();
        Runnable r = () -> System.out.println(message);
        message.append("Howdy, ");
        message.append("world!");
        r.run();
    }
}
