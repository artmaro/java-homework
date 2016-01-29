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

        BookService16 bookService = container.instance().select(BookService16.class).get();

        Book16 book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");

        System.out.println(book);

        weld.shutdown();
    }
}
