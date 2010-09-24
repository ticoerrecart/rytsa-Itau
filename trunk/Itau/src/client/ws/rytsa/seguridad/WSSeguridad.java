
package client.ws.rytsa.seguridad;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1-b03-
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "WSSeguridad", targetNamespace = "http://tempuri.org/", wsdlLocation = "WSSeguridad.wsdl")
public class WSSeguridad
    extends Service
{

    private final static URL WSSEGURIDAD_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("file:/E:/DESARROLLO/jboss-4.2.3.GA/bin/WSSeguridad.wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        WSSEGURIDAD_WSDL_LOCATION = url;
    }

    public WSSeguridad(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSSeguridad() {
        super(WSSEGURIDAD_WSDL_LOCATION, new QName("http://tempuri.org/", "WSSeguridad"));
    }

    /**
     * 
     * @return
     *     returns WSSeguridadSoap
     */
    @WebEndpoint(name = "WSSeguridadSoap")
    public WSSeguridadSoap getWSSeguridadSoap() {
        return (WSSeguridadSoap)super.getPort(new QName("http://tempuri.org/", "WSSeguridadSoap"), WSSeguridadSoap.class);
    }

}
