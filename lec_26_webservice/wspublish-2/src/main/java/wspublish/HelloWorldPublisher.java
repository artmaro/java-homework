package wspublish;

import javax.xml.ws.Endpoint;


//Endpoint publisher
public class HelloWorldPublisher{

    public static void main(String[] args) {
        //wsdl location http://localhost:9999/ws/hello?wsdl
        Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
    }

}