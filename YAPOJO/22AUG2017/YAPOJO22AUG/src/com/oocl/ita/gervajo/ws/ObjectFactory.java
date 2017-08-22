
package com.oocl.ita.gervajo.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oocl.ita.gervajo.ws package. 
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

    private final static QName _GetCalcMethodsResponse_QNAME = new QName("http://ws.gervajo.ita.oocl.com/", "getCalcMethodsResponse");
    private final static QName _GetAnswer_QNAME = new QName("http://ws.gervajo.ita.oocl.com/", "getAnswer");
    private final static QName _GetAnswerResponse_QNAME = new QName("http://ws.gervajo.ita.oocl.com/", "getAnswerResponse");
    private final static QName _GetCalcMethods_QNAME = new QName("http://ws.gervajo.ita.oocl.com/", "getCalcMethods");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oocl.ita.gervajo.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAnswer }
     * 
     */
    public GetAnswer createGetAnswer() {
        return new GetAnswer();
    }

    /**
     * Create an instance of {@link GetCalcMethodsResponse }
     * 
     */
    public GetCalcMethodsResponse createGetCalcMethodsResponse() {
        return new GetCalcMethodsResponse();
    }

    /**
     * Create an instance of {@link GetAnswerResponse }
     * 
     */
    public GetAnswerResponse createGetAnswerResponse() {
        return new GetAnswerResponse();
    }

    /**
     * Create an instance of {@link GetCalcMethods }
     * 
     */
    public GetCalcMethods createGetCalcMethods() {
        return new GetCalcMethods();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalcMethodsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gervajo.ita.oocl.com/", name = "getCalcMethodsResponse")
    public JAXBElement<GetCalcMethodsResponse> createGetCalcMethodsResponse(GetCalcMethodsResponse value) {
        return new JAXBElement<GetCalcMethodsResponse>(_GetCalcMethodsResponse_QNAME, GetCalcMethodsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAnswer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gervajo.ita.oocl.com/", name = "getAnswer")
    public JAXBElement<GetAnswer> createGetAnswer(GetAnswer value) {
        return new JAXBElement<GetAnswer>(_GetAnswer_QNAME, GetAnswer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAnswerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gervajo.ita.oocl.com/", name = "getAnswerResponse")
    public JAXBElement<GetAnswerResponse> createGetAnswerResponse(GetAnswerResponse value) {
        return new JAXBElement<GetAnswerResponse>(_GetAnswerResponse_QNAME, GetAnswerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalcMethods }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gervajo.ita.oocl.com/", name = "getCalcMethods")
    public JAXBElement<GetCalcMethods> createGetCalcMethods(GetCalcMethods value) {
        return new JAXBElement<GetCalcMethods>(_GetCalcMethods_QNAME, GetCalcMethods.class, null, value);
    }

}
