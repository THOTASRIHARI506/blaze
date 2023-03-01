//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.01 at 08:39:48 AM IST 
//


package com.icicilombard.marine.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxType" type="{http://marine.icicilombard.com}TaxType"/>
 *         &lt;element name="gstServiceDetails" type="{http://marine.icicilombard.com}GSTServiceDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gstTotalDetails" type="{http://marine.icicilombard.com}GSTTotalDetails" minOccurs="0"/>
 *         &lt;element name="totalServiceTax" type="{http://marine.icicilombard.com}ServiceTaxDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDetails", propOrder = {
    "taxType",
    "gstServiceDetails",
    "gstTotalDetails",
    "totalServiceTax"
})
public class TaxDetails
    implements Serializable
{

    private final static long serialVersionUID = -6026937020915831338L;
    @XmlElement(required = true)
    protected TaxType taxType;
    protected com.icicilombard.marine.model.GSTServiceDetails[] gstServiceDetails;
    protected GSTTotalDetails gstTotalDetails;
    @XmlElement(required = true)
    protected ServiceTaxDetails totalServiceTax;

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType }
     *     
     */
    public TaxType getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType }
     *     
     */
    public void setTaxType(TaxType value) {
        this.taxType = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link com.icicilombard.marine.model.GSTServiceDetails }
     *     
     */
    public com.icicilombard.marine.model.GSTServiceDetails[] getGstServiceDetails() {
        if (this.gstServiceDetails == null) {
            return new com.icicilombard.marine.model.GSTServiceDetails[ 0 ] ;
        }
        com.icicilombard.marine.model.GSTServiceDetails[] retVal = new com.icicilombard.marine.model.GSTServiceDetails[this.gstServiceDetails.length] ;
        System.arraycopy(this.gstServiceDetails, 0, retVal, 0, this.gstServiceDetails.length);
        return (retVal);
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link com.icicilombard.marine.model.GSTServiceDetails }
     *     
     */
    public com.icicilombard.marine.model.GSTServiceDetails getGstServiceDetails(int idx) {
        if (this.gstServiceDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.gstServiceDetails[idx];
    }

    public int getGstServiceDetailsLength() {
        if (this.gstServiceDetails == null) {
            return  0;
        }
        return this.gstServiceDetails.length;
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link com.icicilombard.marine.model.GSTServiceDetails }
     *     
     */
    public void setGstServiceDetails(com.icicilombard.marine.model.GSTServiceDetails[] values) {
        int len = values.length;
        this.gstServiceDetails = ((com.icicilombard.marine.model.GSTServiceDetails[]) new com.icicilombard.marine.model.GSTServiceDetails[len] );
        for (int i = 0; (i<len); i ++) {
            this.gstServiceDetails[i] = values[i];
        }
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link com.icicilombard.marine.model.GSTServiceDetails }
     *     
     */
    public com.icicilombard.marine.model.GSTServiceDetails setGstServiceDetails(int idx, com.icicilombard.marine.model.GSTServiceDetails value) {
        return this.gstServiceDetails[idx] = value;
    }

    /**
     * Gets the value of the gstTotalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GSTTotalDetails }
     *     
     */
    public GSTTotalDetails getGstTotalDetails() {
        return gstTotalDetails;
    }

    /**
     * Sets the value of the gstTotalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSTTotalDetails }
     *     
     */
    public void setGstTotalDetails(GSTTotalDetails value) {
        this.gstTotalDetails = value;
    }

    /**
     * Gets the value of the totalServiceTax property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTaxDetails }
     *     
     */
    public ServiceTaxDetails getTotalServiceTax() {
        return totalServiceTax;
    }

    /**
     * Sets the value of the totalServiceTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTaxDetails }
     *     
     */
    public void setTotalServiceTax(ServiceTaxDetails value) {
        this.totalServiceTax = value;
    }

}
