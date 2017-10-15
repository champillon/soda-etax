//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.14 at 02:43:46 PM ICT 
//


package un.unece.uncefact.codelist.standard.unece.deliverytermscode._2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryTermsCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryTermsCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="2"/>
 *     &lt;enumeration value="CFR"/>
 *     &lt;enumeration value="CIF"/>
 *     &lt;enumeration value="CIP"/>
 *     &lt;enumeration value="CPT"/>
 *     &lt;enumeration value="DAP"/>
 *     &lt;enumeration value="DAT"/>
 *     &lt;enumeration value="DDP"/>
 *     &lt;enumeration value="EXW"/>
 *     &lt;enumeration value="FAS"/>
 *     &lt;enumeration value="FCA"/>
 *     &lt;enumeration value="FOB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryTermsCodeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:DeliveryTermsCode:2010")
@XmlEnum
public enum DeliveryTermsCodeContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64053="urn:un:unece:uncefact:codelist:standard:UNECE:DeliveryTermsCode:2010" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Delivery arranged by the supplier&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64053="urn:un:unece:uncefact:codelist:standard:UNECE:DeliveryTermsCode:2010" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indicates that the supplier will arrange delivery of the goods.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("1")
    VALUE_1("1"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64053="urn:un:unece:uncefact:codelist:standard:UNECE:DeliveryTermsCode:2010" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Delivery arranged by logistic service provider&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64053="urn:un:unece:uncefact:codelist:standard:UNECE:DeliveryTermsCode:2010" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code indicating that the logistic service provider has arranged the delivery of goods.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("2")
    VALUE_2("2"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64053="urn:un:unece:uncefact:codelist:standard:UNECE:DeliveryTermsCode:2010" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cost and Freight (insert named port of destination)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CFR")
    VALUE_3("CFR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64053="urn:un:unece:uncefact:codelist:standard:UNECE:DeliveryTermsCode:2010" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cost, Insurance and Freight (insert named port of destination)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CIF")
    VALUE_4("CIF"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64053="urn:un:unece:uncefact:codelist:standard:UNECE:DeliveryTermsCode:2010" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Carriage and Insurance Paid to (insert named place of destination)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CIP")
    VALUE_5("CIP"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64053="urn:un:unece:uncefact:codelist:standard:UNECE:DeliveryTermsCode:2010" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Carriage Paid To (insert named place of destination)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CPT")
    VALUE_6("CPT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64053="urn:un:unece:uncefact:codelist:standard:UNECE:DeliveryTermsCode:2010" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Delivered At Place (insert named place of destination)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DAP")
    VALUE_7("DAP"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64053="urn:un:unece:uncefact:codelist:standard:UNECE:DeliveryTermsCode:2010" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Delivered At Terminal (insert named terminal at port or place of destination)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DAT")
    VALUE_8("DAT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64053="urn:un:unece:uncefact:codelist:standard:UNECE:DeliveryTermsCode:2010" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Delivered Duty Paid (insert named place of destination)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DDP")
    VALUE_9("DDP"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64053="urn:un:unece:uncefact:codelist:standard:UNECE:DeliveryTermsCode:2010" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Ex Works (insert named place of delivery)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("EXW")
    VALUE_10("EXW"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64053="urn:un:unece:uncefact:codelist:standard:UNECE:DeliveryTermsCode:2010" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Free Alongside Ship (insert named port of shipment)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("FAS")
    VALUE_11("FAS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64053="urn:un:unece:uncefact:codelist:standard:UNECE:DeliveryTermsCode:2010" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Free Carrier (insert named place of delivery)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("FCA")
    VALUE_12("FCA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64053="urn:un:unece:uncefact:codelist:standard:UNECE:DeliveryTermsCode:2010" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Free On Board (insert named port of shipment)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("FOB")
    VALUE_13("FOB");
    private final String value;

    DeliveryTermsCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryTermsCodeContentType fromValue(String v) {
        for (DeliveryTermsCodeContentType c: DeliveryTermsCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
