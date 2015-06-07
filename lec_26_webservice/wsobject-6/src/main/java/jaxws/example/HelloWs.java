package jaxws.example;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.List;
import java.util.Map;

@WebService
@SOAPBinding(style = Style.RPC)
public class HelloWs {


    public String sayHello(String name) {

        if (name == null) {
            return "Hello";
        }

        return "Hello, " + name + "!";
    }


    public boolean validate(CreditCard creditCard) {

        Character lastDigit = creditCard.getNumber().charAt(creditCard.getNumber().length() - 1);


        if (Integer.parseInt(lastDigit.toString()) % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
