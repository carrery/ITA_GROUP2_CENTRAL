
package com.oocl.ita.yapo.day17.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oocl.ita.yapo.day17.webservice package. 
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

    private final static QName _GetCalculationResponse_QNAME = new QName("http://webservice.day17.yapo.ita.oocl.com/", "getCalculationResponse");
    private final static QName _GetOperationsResponse_QNAME = new QName("http://webservice.day17.yapo.ita.oocl.com/", "getOperationsResponse");
    private final static QName _GetCalculation_QNAME = new QName("http://webservice.day17.yapo.ita.oocl.com/", "getCalculation");
    private final static QName _GetOperations_QNAME = new QName("http://webservice.day17.yapo.ita.oocl.com/", "getOperations");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oocl.ita.yapo.day17.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOperations }
     * 
     */
    public GetOperations createGetOperations() {
        return new GetOperations();
    }

    /**
     * Create an instance of {@link GetCalculation }
     * 
     */
    public GetCalculation createGetCalculation() {
        return new GetCalculation();
    }

    /**
     * Create an instance of {@link GetCalculationResponse }
     * 
     */
    public GetCalculationResponse createGetCalculationResponse() {
        return new GetCalculationResponse();
    }

    /**
     * Create an instance of {@link GetOperationsResponse }
     * 
     */
    public GetOperationsResponse createGetOperationsResponse() {
        return new GetOperationsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalculationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.day17.yapo.ita.oocl.com/", name = "getCalculationResponse")
    public JAXBElement<GetCalculationResponse> createGetCalculationResponse(GetCalculationResponse value) {
        return new JAXBElement<GetCalculationResponse>(_GetCalculationResponse_QNAME, GetCalculationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOperationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.day17.yapo.ita.oocl.com/", name = "getOperationsResponse")
    public JAXBElement<GetOperationsResponse> createGetOperationsResponse(GetOperationsResponse value) {
        return new JAXBElement<GetOperationsResponse>(_GetOperationsResponse_QNAME, GetOperationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalculation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.day17.yapo.ita.oocl.com/", name = "getCalculation")
    public JAXBElement<GetCalculation> createGetCalculation(GetCalculation value) {
        return new JAXBElement<GetCalculation>(_GetCalculation_QNAME, GetCalculation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOperations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.day17.yapo.ita.oocl.com/", name = "getOperations")
    public JAXBElement<GetOperations> createGetOperations(GetOperations value) {
        return new JAXBElement<GetOperations>(_GetOperations_QNAME, GetOperations.class, null, value);
    }

}
