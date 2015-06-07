package jaxws.example;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ekokuykin on 07.06.15.
 */
public class HelloWsClient {
    public static void main(String[] args) {
        HelloWsService helloService = new HelloWsService();
        HelloWs hello = helloService.getHelloWsPort();


        CreditCard creditCard = new CreditCard();
        creditCard.setNumber("1234");

        System.out.println(hello.validate(creditCard));


        creditCard.setNumber("1211");

        System.out.println(hello.validate(creditCard));
    }
}
