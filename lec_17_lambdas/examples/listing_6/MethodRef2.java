package hot.code;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRef2 {
    public static void main(String[] args) {
        String[] stringArray = { "Barbara", "James", "Mary", "John",
                "Patricia", "Robert", "Michael", "ALinda" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);

        List<String> stringList = new ArrayList<>();
        Arrays.asList(stringArray).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                stringList.add(s);
            }
        });
        Arrays.asList(stringArray).forEach(s -> stringList.add(s));
        Arrays.asList(stringArray).forEach(stringList::add);

        System.out.println("stringArray = " + stringList);

        HashSet<String> objects0 = transferElements(Arrays.asList(stringArray), new Supplier<HashSet<String>>() {
            @Override
            public HashSet<String> get() {
                return new HashSet<>();
            }
        });

        HashSet<String> objects1 = transferElements(Arrays.asList(stringArray), HashSet::new);

        HashSet<String> objects2 = transferElements(Arrays.asList(stringArray), ()->new HashSet<>());

        System.out.println("objects = " + objects1);


    }



    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>>
    DEST transferElements(
            SOURCE sourceCollection,
            Supplier<DEST> collectionFactory) {

        DEST result = collectionFactory.get();
        for (T t : sourceCollection) {
            result.add(t);
        }
        return result;
    }
}
