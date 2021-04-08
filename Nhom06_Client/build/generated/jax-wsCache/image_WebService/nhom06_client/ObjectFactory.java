
package nhom06_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nhom06_client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Hello_QNAME = new QName("http://Service/", "hello");
    private final static QName _ImageService_QNAME = new QName("http://Service/", "image_Service");
    private final static QName _ImageServiceResponse_QNAME = new QName("http://Service/", "image_ServiceResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://Service/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nhom06_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ImageService }
     * 
     */
    public ImageService createImageService() {
        return new ImageService();
    }

    /**
     * Create an instance of {@link ImageServiceResponse }
     * 
     */
    public ImageServiceResponse createImageServiceResponse() {
        return new ImageServiceResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "image_Service")
    public JAXBElement<ImageService> createImageService(ImageService value) {
        return new JAXBElement<ImageService>(_ImageService_QNAME, ImageService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "image_ServiceResponse")
    public JAXBElement<ImageServiceResponse> createImageServiceResponse(ImageServiceResponse value) {
        return new JAXBElement<ImageServiceResponse>(_ImageServiceResponse_QNAME, ImageServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
