package cdi.example;

import javax.inject.Inject;

/**
 * Created by ekokuykin on 22.06.15.
 */
public class BookService {

    /*
    без указания вызывается Default
    @Inject
    private NumberGenerator numberGenerator;
    */

    @Inject
    @EightDigits
    private NumberGenerator numberGenerator;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setNumber(numberGenerator.generateNumber());
        return book;
    }
}
