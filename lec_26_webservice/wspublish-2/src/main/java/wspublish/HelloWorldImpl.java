package wspublish;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "wsimportgen.HelloWorld")
public class HelloWorldImpl implements wsimportgen.HelloWorld {

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }

}