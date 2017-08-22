
package net.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oocl.bituiga.sw1.webservice package. 
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

    private final static QName _CalculateThis_QNAME = new QName("http://webservice.sw1.bituiga.oocl.com/", "calculateThis");
    private final static QName _CalculateThisResponse_QNAME = new QName("http://webservice.sw1.bituiga.oocl.com/", "calculateThisResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oocl.bituiga.sw1.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateThisResponse }
     * 
     */
    public CalculateThisResponse createCalculateThisResponse() {
        return new CalculateThisResponse();
    }

    /**
     * Create an instance of {@link CalculateThis }
     * 
     */
    public CalculateThis createCalculateThis() {
        return new CalculateThis();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateThis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sw1.bituiga.oocl.com/", name = "calculateThis")
    public JAXBElement<CalculateThis> createCalculateThis(CalculateThis value) {
        return new JAXBElement<CalculateThis>(_CalculateThis_QNAME, CalculateThis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateThisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sw1.bituiga.oocl.com/", name = "calculateThisResponse")
    public JAXBElement<CalculateThisResponse> createCalculateThisResponse(CalculateThisResponse value) {
        return new JAXBElement<CalculateThisResponse>(_CalculateThisResponse_QNAME, CalculateThisResponse.class, null, value);
    }

}
