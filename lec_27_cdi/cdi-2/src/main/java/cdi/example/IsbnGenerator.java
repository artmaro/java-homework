package cdi.example;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by ekokuykin on 22.06.15.
 */
@ThirteenDigits @Default
public class IsbnGenerator implements NumberGenerator {

    public String generateNumber() {
        String isbn = "13-84356-" + Math.abs(new Random().nextInt());
        return isbn;
    }
}