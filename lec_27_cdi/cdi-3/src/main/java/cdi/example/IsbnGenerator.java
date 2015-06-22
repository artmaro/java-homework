package cdi.example;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by ekokuykin on 22.06.15.
 */
@ThirteenDigits
@Default
@ApplicationScoped
public class IsbnGenerator implements NumberGenerator {

    @PostConstruct
    public void setupIsbn(){
        System.out.println("Setup 13 digit generator");
    }

    public String generateNumber() {
        String isbn = "13-84356-" + Math.abs(new Random().nextInt());
        return isbn;
    }
}