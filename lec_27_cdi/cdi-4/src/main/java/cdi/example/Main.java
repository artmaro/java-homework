package cdi.example;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Created by ekokuykin on 22.06.15.
 */
public class Main {
    public static void main(String[] args) {

        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        LegacyBookService12 bookService = container.instance().select(LegacyBookService12.class).get();
        //BookEvenService12 bookService = container.instance().select(BookEvenService12.class).get();
        //BookOddService12 bookService = container.instance().select(BookOddService12.class).get();

        Book12 book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");

        System.out.println(book);

        weld.shutdown();
    }
}
