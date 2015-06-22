package cdi.example;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by ekokuykin on 22.06.15.
 */
@EightDigits
public class IssnGenerator implements NumberGenerator {

    public String generateNumber() {
        String issn =  "8-" + Math.abs(new Random().nextInt());
        return issn;
    }
}