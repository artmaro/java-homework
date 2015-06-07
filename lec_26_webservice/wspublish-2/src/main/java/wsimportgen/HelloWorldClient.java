package wsimportgen;

//wsimport -keep http://localhost:9999/ws/hello?wsdl
public class HelloWorldClient{

    public static void main(String[] args) {

        HelloWorldImplService helloService = new HelloWorldImplService();
        HelloWorld hello = helloService.getHelloWorldImplPort();

        System.out.println(hello.getHelloWorldAsString("test message"));

    }

}