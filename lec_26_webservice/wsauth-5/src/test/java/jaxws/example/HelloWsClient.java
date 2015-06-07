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

        Map<String, Object> req_ctx = ((BindingProvider)hello).getRequestContext();
        //req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);

        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put("Username", Collections.singletonList("newuser"));
        headers.put("Password", Collections.singletonList("password"));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

        System.out.println(hello.sayHello("test message"));
    }
}
