//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.14 at 02:43:46 PM ICT 
//


package etda.uncefact.data.standard.invoice_reusableaggregatebusinessinformationentity._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import etda.uncefact.data.standard.invoice_qualifieddatatype._1.AllowanceChargeIdentificationCodeType;
import etda.uncefact.data.standard.invoice_qualifieddatatype._1.AmountType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01005706&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CI_ Trade_ Allowance Charge. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A component of pricing, such as a service, promotion, allowance or charge, for Cross Industry (CI) trade purposes.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Allowance Charge&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CI&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Trade&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cross Industry Trade&lt;/ccts:BusinessProcessContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:GeopoliticalOrRegionContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:GeopoliticalOrRegionContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:OfficialConstraintContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;None&lt;/ccts:OfficialConstraintContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ProductContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:ProductContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:IndustryContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:IndustryContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessRoleContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:BusinessProcessRoleContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:SupportingRoleContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:SupportingRoleContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:SystemCapabilitiesContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1" xmlns:ram="urn:etda:uncefact:data:standard:Invoice_ReusableAggregateBusinessInformationEntity:2" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:16" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:SystemCapabilitiesContextValue&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CITradeAllowanceChargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CITradeAllowanceChargeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChargeIndicator" type="{urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1}TrueOrFalse" minOccurs="0"/>
 *         &lt;element name="ActualAmount" type="{urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{urn:etda:uncefact:data:standard:Invoice_QualifiedDataType:1}AllowanceChargeIdentificationCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CITradeAllowanceChargeType", propOrder = {
    "chargeIndicator",
    "actualAmount",
    "typeCode"
})
public class CITradeAllowanceChargeType {

    @XmlElement(name = "ChargeIndicator")
    protected Boolean chargeIndicator;
    @XmlElement(name = "ActualAmount")
    protected List<AmountType> actualAmount;
    @XmlElement(name = "TypeCode")
    protected AllowanceChargeIdentificationCodeType typeCode;

    /**
     * Gets the value of the chargeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChargeIndicator() {
        return chargeIndicator;
    }

    /**
     * Sets the value of the chargeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChargeIndicator(Boolean value) {
        this.chargeIndicator = value;
    }

    /**
     * Gets the value of the actualAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actualAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getActualAmount() {
        if (actualAmount == null) {
            actualAmount = new ArrayList<AmountType>();
        }
        return this.actualAmount;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceChargeIdentificationCodeType }
     *     
     */
    public AllowanceChargeIdentificationCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceChargeIdentificationCodeType }
     *     
     */
    public void setTypeCode(AllowanceChargeIdentificationCodeType value) {
        this.typeCode = value;
    }

}
