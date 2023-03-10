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
 * <p>Java class for SubCommodityDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubCommodityDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subcommodityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subcommodityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commodityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commodityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubCommodityDetails", propOrder = {
    "subcommodityName",
    "subcommodityCode",
    "commodityName",
    "commodityCode",
    "description"
})
public class SubCommodityDetails
    implements Serializable
{

    private final static long serialVersionUID = -6026937020915831338L;
    @XmlElement(required = true)
    protected String subcommodityName;
    @XmlElement(required = true)
    protected String subcommodityCode;
    @XmlElement(required = true)
    protected String commodityName;
    @XmlElement(required = true)
    protected String commodityCode;
    @XmlElement(required = true)
    protected String description;

    /**
     * Gets the value of the subcommodityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcommodityName() {
        return subcommodityName;
    }

    /**
     * Sets the value of the subcommodityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcommodityName(String value) {
        this.subcommodityName = value;
    }

    /**
     * Gets the value of the subcommodityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcommodityCode() {
        return subcommodityCode;
    }

    /**
     * Sets the value of the subcommodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcommodityCode(String value) {
        this.subcommodityCode = value;
    }

    /**
     * Gets the value of the commodityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * Sets the value of the commodityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityName(String value) {
        this.commodityName = value;
    }

    /**
     * Gets the value of the commodityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * Sets the value of the commodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCode(String value) {
        this.commodityCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
