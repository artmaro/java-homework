package wsgen.example;

import javax.xml.ws.Endpoint;

/**
 * Created by ekokuykin on 06.06.15.
 */
public class WsPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/ws/server", new ServerInfo());

        System.out.println("Service is published!");
    }
}
