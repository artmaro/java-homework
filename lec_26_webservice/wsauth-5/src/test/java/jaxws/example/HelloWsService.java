
package jaxws.example;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloWsService", targetNamespace = "http://example.jaxws/", wsdlLocation = "http://localhost:8080/HelloWs?wsdl")
public class HelloWsService
    extends Service
{

    private final static URL HELLOWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOWSSERVICE_EXCEPTION;
    private final static QName HELLOWSSERVICE_QNAME = new QName("http://example.jaxws/", "HelloWsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8989/HelloWs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOWSSERVICE_WSDL_LOCATION = url;
        HELLOWSSERVICE_EXCEPTION = e;
    }

    public HelloWsService() {
        super(__getWsdlLocation(), HELLOWSSERVICE_QNAME);
    }

    public HelloWsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOWSSERVICE_QNAME, features);
    }

    public HelloWsService(URL wsdlLocation) {
        super(wsdlLocation, HELLOWSSERVICE_QNAME);
    }

    public HelloWsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOWSSERVICE_QNAME, features);
    }

    public HelloWsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloWs
     */
    @WebEndpoint(name = "HelloWsPort")
    public HelloWs getHelloWsPort() {
        return super.getPort(new QName("http://example.jaxws/", "HelloWsPort"), HelloWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWs
     */
    @WebEndpoint(name = "HelloWsPort")
    public HelloWs getHelloWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://example.jaxws/", "HelloWsPort"), HelloWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWSSERVICE_EXCEPTION!= null) {
            throw HELLOWSSERVICE_EXCEPTION;
        }
        return HELLOWSSERVICE_WSDL_LOCATION;
    }

}
