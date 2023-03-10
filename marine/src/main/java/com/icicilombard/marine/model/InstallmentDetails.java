//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.01 at 08:39:48 AM IST 
//


package com.icicilombard.marine.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InstallmentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstallmentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="installmentCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="installmentNetPremium" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="installmentTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="installmentToatlPremium" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="installmentStampDuty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallmentDetails", propOrder = {
    "installmentCount",
    "installmentNetPremium",
    "installmentTaxAmount",
    "installmentToatlPremium",
    "installmentStampDuty"
})
public class InstallmentDetails
    implements Serializable
{

    private final static long serialVersionUID = -6026937020915831338L;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "integer")
    protected Integer installmentCount;
    @XmlElement(required = true)
    protected BigDecimal installmentNetPremium;
    @XmlElement(required = true)
    protected BigDecimal installmentTaxAmount;
    @XmlElement(required = true)
    protected BigDecimal installmentToatlPremium;
    @XmlElement(required = true)
    protected BigDecimal installmentStampDuty;

    /**
     * Gets the value of the installmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getInstallmentCount() {
        return installmentCount;
    }

    /**
     * Sets the value of the installmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallmentCount(Integer value) {
        this.installmentCount = value;
    }

    /**
     * Gets the value of the installmentNetPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstallmentNetPremium() {
        return installmentNetPremium;
    }

    /**
     * Sets the value of the installmentNetPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstallmentNetPremium(BigDecimal value) {
        this.installmentNetPremium = value;
    }

    /**
     * Gets the value of the installmentTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstallmentTaxAmount() {
        return installmentTaxAmount;
    }

    /**
     * Sets the value of the installmentTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstallmentTaxAmount(BigDecimal value) {
        this.installmentTaxAmount = value;
    }

    /**
     * Gets the value of the installmentToatlPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstallmentToatlPremium() {
        return installmentToatlPremium;
    }

    /**
     * Sets the value of the installmentToatlPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstallmentToatlPremium(BigDecimal value) {
        this.installmentToatlPremium = value;
    }

    /**
     * Gets the value of the installmentStampDuty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstallmentStampDuty() {
        return installmentStampDuty;
    }

    /**
     * Sets the value of the installmentStampDuty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstallmentStampDuty(BigDecimal value) {
        this.installmentStampDuty = value;
    }

}
