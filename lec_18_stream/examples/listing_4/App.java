package lec_18_stream.examples.listing_4;

/**


 */
import java.util.List;
import static java.util.Arrays.asList;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        List<String> list0 = asList("10", "20", "30");

        MyStream.stream(list0.iterator())
                .filter((String x) -> !x.contains("2"))
                .map(Integer::valueOf)
                .map(x -> x * x)
                .forEach(System.out::println);
    }
}

class MyStream<T> {
    private final Iterator<T> iter;
    public MyStream(Iterator<T> iter) {this.iter = iter;}
    public static <X> MyStream<X> stream(Iterator<X> iter) {
        return new MyStream<>(iter);
    }

    public <R> MyStream<R> map(Function<T, R> function) {
        return new MyStream<>(new Iterator<R>() {
            private T last;
            {last = iter.hasNext() ? iter.next() : null;}
            public boolean hasNext() {return last != null;}
            public R next() {
                if (last == null) {
                    throw new NoSuchElementException();
                } else {
                    T tmp = last;
                    last = iter.hasNext() ? iter.next() : null;
                    return function.apply(tmp);
                }
            }
        });
    }

    public MyStream<T> filter(Predicate<T> p) {
        return new MyStream<>(new Iterator<T>() {
            private T last;
            {seek();}
            private void seek() {
                while (last == null && iter.hasNext()) {
                    T tmp = iter.next();
                    last = p.test(tmp) ? tmp : null;
                }
            }
            public boolean hasNext() {return last != null;}
            public T next() {
                if (last == null) {
                    throw new NoSuchElementException();
                } else {
                    T tmp = last;
                    last = null;
                    seek();
                    return tmp;
                }
            }
        });
    }

    public void forEach(Consumer<T> c) {
        while (iter.hasNext()) {
            c.accept(iter.next());
        }
    }
}
