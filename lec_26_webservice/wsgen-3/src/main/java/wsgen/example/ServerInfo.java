package wsgen.example;

import javax.jws.WebMethod;
import javax.jws.WebService;

//В директории main/java выполняется команда wsgen -verbose -keep -cp . wsgen.example.ServerInfo -wsdl
@WebService
public class ServerInfo{

    @WebMethod
    public String getIpAddress() {

        return "10.10.10.10";

    }

}
