import java.util.*;

public class ArrayAsList {
    public static void main(String[] args) {
        Double[] weeklyTemperature = {31.1, 30.0, 32.5, 34.9, 33.7, 27.8};
        List<Double> temperatures = Arrays.asList(weeklyTemperature);
        temperatures.add(32.3);//throws error
        System.out.println("Maximum temperature recorded was: " +
                Collections.max(temperatures));
        System.out.println("Minimum recorded was: " + Collections.min(temperatures));
    }
}