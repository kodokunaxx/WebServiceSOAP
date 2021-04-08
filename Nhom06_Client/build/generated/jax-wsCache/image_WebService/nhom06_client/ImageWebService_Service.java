
package nhom06_client;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "image_WebService", targetNamespace = "http://Service/", wsdlLocation = "http://localhost:8080/Nhom06/image_WebService?wsdl")
public class ImageWebService_Service
    extends Service
{

    private final static URL IMAGEWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException IMAGEWEBSERVICE_EXCEPTION;
    private final static QName IMAGEWEBSERVICE_QNAME = new QName("http://Service/", "image_WebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Nhom06/image_WebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IMAGEWEBSERVICE_WSDL_LOCATION = url;
        IMAGEWEBSERVICE_EXCEPTION = e;
    }

    public ImageWebService_Service() {
        super(__getWsdlLocation(), IMAGEWEBSERVICE_QNAME);
    }

    public ImageWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), IMAGEWEBSERVICE_QNAME, features);
    }

    public ImageWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, IMAGEWEBSERVICE_QNAME);
    }

    public ImageWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IMAGEWEBSERVICE_QNAME, features);
    }

    public ImageWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImageWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ImageWebService
     */
    @WebEndpoint(name = "image_WebServicePort")
    public ImageWebService getImageWebServicePort() {
        return super.getPort(new QName("http://Service/", "image_WebServicePort"), ImageWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImageWebService
     */
    @WebEndpoint(name = "image_WebServicePort")
    public ImageWebService getImageWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Service/", "image_WebServicePort"), ImageWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IMAGEWEBSERVICE_EXCEPTION!= null) {
            throw IMAGEWEBSERVICE_EXCEPTION;
        }
        return IMAGEWEBSERVICE_WSDL_LOCATION;
    }

}