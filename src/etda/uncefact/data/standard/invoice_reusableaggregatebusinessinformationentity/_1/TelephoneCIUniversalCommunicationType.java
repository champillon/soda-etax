//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.14 at 02:43:46 PM ICT 
//


package etda.uncefact.data.standard.invoice_reusableaggregatebusinessinformationentity._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import etda.uncefact.data.standard.invoice_qualifieddatatype._1.Max256IDType;


/**
 * <p>Java class for TelephoneCIUniversalCommunicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephoneCIUniversalCommunicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URIID" type="{urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1}Max256IDType" minOccurs="0"/>
 *         &lt;element name="CompleteNumber" type="{urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1}PhoneNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneCIUniversalCommunicationType", propOrder = {
    "uriid",
    "completeNumber"
})
public class TelephoneCIUniversalCommunicationType {

    @XmlElement(name = "URIID")
    protected Max256IDType uriid;
    @XmlElement(name = "CompleteNumber")
    protected String completeNumber;

    /**
     * Gets the value of the uriid property.
     * 
     * @return
     *     possible object is
     *     {@link Max256IDType }
     *     
     */
    public Max256IDType getURIID() {
        return uriid;
    }

    /**
     * Sets the value of the uriid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max256IDType }
     *     
     */
    public void setURIID(Max256IDType value) {
        this.uriid = value;
    }

    /**
     * Gets the value of the completeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompleteNumber() {
        return completeNumber;
    }

    /**
     * Sets the value of the completeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompleteNumber(String value) {
        this.completeNumber = value;
    }

}
