package lec_17_lambdas.examples.listing_3;

/**


 */
public class ObjectLambda {
    public static void main4(String... args) {
        //Object o = () -> System.out.println("Howdy, world!");
        // will not compile

        Object o2 = (Runnable) () -> System.out.println("Howdy, world!");
        // now we're all good
    }
}
