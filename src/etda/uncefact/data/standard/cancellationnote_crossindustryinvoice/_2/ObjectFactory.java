//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.14 at 02:43:46 PM ICT 
//


package etda.uncefact.data.standard.cancellationnote_crossindustryinvoice._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the etda.uncefact.data.standard.cancellationnote_crossindustryinvoice._2 package. 
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

    private final static QName _CancellationNoteCrossIndustryInvoice_QNAME = new QName("urn:etda:uncefact:data:standard:CancellationNote_CrossIndustryInvoice:2", "CancellationNote_CrossIndustryInvoice");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: etda.uncefact.data.standard.cancellationnote_crossindustryinvoice._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancellationNoteCrossIndustryInvoiceType }
     * 
     */
    public CancellationNoteCrossIndustryInvoiceType createCancellationNoteCrossIndustryInvoiceType() {
        return new CancellationNoteCrossIndustryInvoiceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancellationNoteCrossIndustryInvoiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:etda:uncefact:data:standard:CancellationNote_CrossIndustryInvoice:2", name = "CancellationNote_CrossIndustryInvoice")
    public JAXBElement<CancellationNoteCrossIndustryInvoiceType> createCancellationNoteCrossIndustryInvoice(CancellationNoteCrossIndustryInvoiceType value) {
        return new JAXBElement<CancellationNoteCrossIndustryInvoiceType>(_CancellationNoteCrossIndustryInvoice_QNAME, CancellationNoteCrossIndustryInvoiceType.class, null, value);
    }

}
