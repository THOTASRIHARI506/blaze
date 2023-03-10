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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GSTServiceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GSTServiceDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionType" type="{http://marine.icicilombard.com}TransactionType"/>
 *         &lt;element name="ILGICStateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="partyStateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemType" type="{http://marine.icicilombard.com}ItemType"/>
 *         &lt;element name="registeredCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HSNSACCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grossAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="taxExempted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HSNSACDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GSTIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="typeOfState" type="{http://marine.icicilombard.com}TypeOfState"/>
 *         &lt;element name="GstRegBrName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GstRegBrAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ISDCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CGSTRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CGSTAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SGSTRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SGSTAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IGSTRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IGSTAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="UTGSTRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="UTGSTAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GSTNetRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GSTAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SBCRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SBCAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="KKCRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="KKCAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="taxation1Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="taxation1Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="taxation2Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="taxation2Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="taxation3Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="taxation3Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="taxation4Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="taxation4Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="taxation5Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="taxation5Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="taxation6Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="taxation6Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="otherTaxesAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="totalTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="finalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GSTServiceDetails", propOrder = {
    "transactionId",
    "transactionType",
    "ilgicStateName",
    "partyStateName",
    "itemType",
    "registeredCustomer",
    "hsnsacCode",
    "grossAmount",
    "taxExempted",
    "hsnsacDescription",
    "gstin",
    "stateName",
    "stateCode",
    "typeOfState",
    "gstRegBrName",
    "gstRegBrAddress",
    "isdCode",
    "cgstRate",
    "cgstAmount",
    "sgstRate",
    "sgstAmount",
    "igstRate",
    "igstAmount",
    "utgstRate",
    "utgstAmount",
    "gstNetRate",
    "gstAmount",
    "sbcRate",
    "sbcAmount",
    "kkcRate",
    "kkcAmount",
    "taxation1Rate",
    "taxation1Amount",
    "taxation2Rate",
    "taxation2Amount",
    "taxation3Rate",
    "taxation3Amount",
    "taxation4Rate",
    "taxation4Amount",
    "taxation5Rate",
    "taxation5Amount",
    "taxation6Rate",
    "taxation6Amount",
    "otherTaxesAmount",
    "totalTax",
    "finalAmount"
})
public class GSTServiceDetails
    implements Serializable
{

    private final static long serialVersionUID = -6026937020915831338L;
    @XmlElement(required = true)
    protected String transactionId;
    @XmlElement(required = true)
    protected TransactionType transactionType;
    @XmlElement(name = "ILGICStateName", required = true)
    protected String ilgicStateName;
    @XmlElement(required = true)
    protected String partyStateName;
    @XmlElement(required = true)
    protected ItemType itemType;
    protected boolean registeredCustomer;
    @XmlElement(name = "HSNSACCode", required = true)
    protected String hsnsacCode;
    @XmlElement(required = true)
    protected BigDecimal grossAmount;
    protected boolean taxExempted;
    @XmlElement(name = "HSNSACDescription", required = true)
    protected String hsnsacDescription;
    @XmlElement(name = "GSTIN", required = true)
    protected String gstin;
    @XmlElement(required = true)
    protected String stateName;
    @XmlElement(required = true)
    protected String stateCode;
    @XmlElement(required = true)
    protected TypeOfState typeOfState;
    @XmlElement(name = "GstRegBrName", required = true)
    protected String gstRegBrName;
    @XmlElement(name = "GstRegBrAddress", required = true)
    protected String gstRegBrAddress;
    @XmlElement(name = "ISDCode", required = true)
    protected String isdCode;
    @XmlElement(name = "CGSTRate", required = true)
    protected BigDecimal cgstRate;
    @XmlElement(name = "CGSTAmount", required = true)
    protected BigDecimal cgstAmount;
    @XmlElement(name = "SGSTRate", required = true)
    protected BigDecimal sgstRate;
    @XmlElement(name = "SGSTAmount", required = true)
    protected BigDecimal sgstAmount;
    @XmlElement(name = "IGSTRate", required = true)
    protected BigDecimal igstRate;
    @XmlElement(name = "IGSTAmount", required = true)
    protected BigDecimal igstAmount;
    @XmlElement(name = "UTGSTRate", required = true)
    protected BigDecimal utgstRate;
    @XmlElement(name = "UTGSTAmount", required = true)
    protected BigDecimal utgstAmount;
    @XmlElement(name = "GSTNetRate", required = true)
    protected BigDecimal gstNetRate;
    @XmlElement(name = "GSTAmount", required = true)
    protected BigDecimal gstAmount;
    @XmlElement(name = "SBCRate", required = true)
    protected BigDecimal sbcRate;
    @XmlElement(name = "SBCAmount", required = true)
    protected BigDecimal sbcAmount;
    @XmlElement(name = "KKCRate", required = true)
    protected BigDecimal kkcRate;
    @XmlElement(name = "KKCAmount", required = true)
    protected BigDecimal kkcAmount;
    @XmlElement(required = true)
    protected BigDecimal taxation1Rate;
    @XmlElement(required = true)
    protected BigDecimal taxation1Amount;
    @XmlElement(required = true)
    protected BigDecimal taxation2Rate;
    @XmlElement(required = true)
    protected BigDecimal taxation2Amount;
    @XmlElement(required = true)
    protected BigDecimal taxation3Rate;
    @XmlElement(required = true)
    protected BigDecimal taxation3Amount;
    @XmlElement(required = true)
    protected BigDecimal taxation4Rate;
    @XmlElement(required = true)
    protected BigDecimal taxation4Amount;
    @XmlElement(required = true)
    protected BigDecimal taxation5Rate;
    @XmlElement(required = true)
    protected BigDecimal taxation5Amount;
    @XmlElement(required = true)
    protected BigDecimal taxation6Rate;
    @XmlElement(required = true)
    protected BigDecimal taxation6Amount;
    @XmlElement(required = true)
    protected BigDecimal otherTaxesAmount;
    @XmlElement(required = true)
    protected BigDecimal totalTax;
    @XmlElement(required = true)
    protected BigDecimal finalAmount;

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the ilgicStateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getILGICStateName() {
        return ilgicStateName;
    }

    /**
     * Sets the value of the ilgicStateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setILGICStateName(String value) {
        this.ilgicStateName = value;
    }

    /**
     * Gets the value of the partyStateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyStateName() {
        return partyStateName;
    }

    /**
     * Sets the value of the partyStateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyStateName(String value) {
        this.partyStateName = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItemType(ItemType value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the registeredCustomer property.
     * 
     */
    public boolean isRegisteredCustomer() {
        return registeredCustomer;
    }

    /**
     * Sets the value of the registeredCustomer property.
     * 
     */
    public void setRegisteredCustomer(boolean value) {
        this.registeredCustomer = value;
    }

    /**
     * Gets the value of the hsnsacCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSNSACCode() {
        return hsnsacCode;
    }

    /**
     * Sets the value of the hsnsacCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSNSACCode(String value) {
        this.hsnsacCode = value;
    }

    /**
     * Gets the value of the grossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossAmount() {
        return grossAmount;
    }

    /**
     * Sets the value of the grossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossAmount(BigDecimal value) {
        this.grossAmount = value;
    }

    /**
     * Gets the value of the taxExempted property.
     * 
     */
    public boolean isTaxExempted() {
        return taxExempted;
    }

    /**
     * Sets the value of the taxExempted property.
     * 
     */
    public void setTaxExempted(boolean value) {
        this.taxExempted = value;
    }

    /**
     * Gets the value of the hsnsacDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSNSACDescription() {
        return hsnsacDescription;
    }

    /**
     * Sets the value of the hsnsacDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSNSACDescription(String value) {
        this.hsnsacDescription = value;
    }

    /**
     * Gets the value of the gstin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSTIN() {
        return gstin;
    }

    /**
     * Sets the value of the gstin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSTIN(String value) {
        this.gstin = value;
    }

    /**
     * Gets the value of the stateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * Sets the value of the stateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateName(String value) {
        this.stateName = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the typeOfState property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfState }
     *     
     */
    public TypeOfState getTypeOfState() {
        return typeOfState;
    }

    /**
     * Sets the value of the typeOfState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfState }
     *     
     */
    public void setTypeOfState(TypeOfState value) {
        this.typeOfState = value;
    }

    /**
     * Gets the value of the gstRegBrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGstRegBrName() {
        return gstRegBrName;
    }

    /**
     * Sets the value of the gstRegBrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGstRegBrName(String value) {
        this.gstRegBrName = value;
    }

    /**
     * Gets the value of the gstRegBrAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGstRegBrAddress() {
        return gstRegBrAddress;
    }

    /**
     * Sets the value of the gstRegBrAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGstRegBrAddress(String value) {
        this.gstRegBrAddress = value;
    }

    /**
     * Gets the value of the isdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDCode() {
        return isdCode;
    }

    /**
     * Sets the value of the isdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDCode(String value) {
        this.isdCode = value;
    }

    /**
     * Gets the value of the cgstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCGSTRate() {
        return cgstRate;
    }

    /**
     * Sets the value of the cgstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCGSTRate(BigDecimal value) {
        this.cgstRate = value;
    }

    /**
     * Gets the value of the cgstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCGSTAmount() {
        return cgstAmount;
    }

    /**
     * Sets the value of the cgstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCGSTAmount(BigDecimal value) {
        this.cgstAmount = value;
    }

    /**
     * Gets the value of the sgstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSGSTRate() {
        return sgstRate;
    }

    /**
     * Sets the value of the sgstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSGSTRate(BigDecimal value) {
        this.sgstRate = value;
    }

    /**
     * Gets the value of the sgstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSGSTAmount() {
        return sgstAmount;
    }

    /**
     * Sets the value of the sgstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSGSTAmount(BigDecimal value) {
        this.sgstAmount = value;
    }

    /**
     * Gets the value of the igstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIGSTRate() {
        return igstRate;
    }

    /**
     * Sets the value of the igstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIGSTRate(BigDecimal value) {
        this.igstRate = value;
    }

    /**
     * Gets the value of the igstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIGSTAmount() {
        return igstAmount;
    }

    /**
     * Sets the value of the igstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIGSTAmount(BigDecimal value) {
        this.igstAmount = value;
    }

    /**
     * Gets the value of the utgstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUTGSTRate() {
        return utgstRate;
    }

    /**
     * Sets the value of the utgstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUTGSTRate(BigDecimal value) {
        this.utgstRate = value;
    }

    /**
     * Gets the value of the utgstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUTGSTAmount() {
        return utgstAmount;
    }

    /**
     * Sets the value of the utgstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUTGSTAmount(BigDecimal value) {
        this.utgstAmount = value;
    }

    /**
     * Gets the value of the gstNetRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGSTNetRate() {
        return gstNetRate;
    }

    /**
     * Sets the value of the gstNetRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGSTNetRate(BigDecimal value) {
        this.gstNetRate = value;
    }

    /**
     * Gets the value of the gstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGSTAmount() {
        return gstAmount;
    }

    /**
     * Sets the value of the gstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGSTAmount(BigDecimal value) {
        this.gstAmount = value;
    }

    /**
     * Gets the value of the sbcRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSBCRate() {
        return sbcRate;
    }

    /**
     * Sets the value of the sbcRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSBCRate(BigDecimal value) {
        this.sbcRate = value;
    }

    /**
     * Gets the value of the sbcAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSBCAmount() {
        return sbcAmount;
    }

    /**
     * Sets the value of the sbcAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSBCAmount(BigDecimal value) {
        this.sbcAmount = value;
    }

    /**
     * Gets the value of the kkcRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKKCRate() {
        return kkcRate;
    }

    /**
     * Sets the value of the kkcRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKKCRate(BigDecimal value) {
        this.kkcRate = value;
    }

    /**
     * Gets the value of the kkcAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKKCAmount() {
        return kkcAmount;
    }

    /**
     * Sets the value of the kkcAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKKCAmount(BigDecimal value) {
        this.kkcAmount = value;
    }

    /**
     * Gets the value of the taxation1Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxation1Rate() {
        return taxation1Rate;
    }

    /**
     * Sets the value of the taxation1Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxation1Rate(BigDecimal value) {
        this.taxation1Rate = value;
    }

    /**
     * Gets the value of the taxation1Amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxation1Amount() {
        return taxation1Amount;
    }

    /**
     * Sets the value of the taxation1Amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxation1Amount(BigDecimal value) {
        this.taxation1Amount = value;
    }

    /**
     * Gets the value of the taxation2Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxation2Rate() {
        return taxation2Rate;
    }

    /**
     * Sets the value of the taxation2Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxation2Rate(BigDecimal value) {
        this.taxation2Rate = value;
    }

    /**
     * Gets the value of the taxation2Amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxation2Amount() {
        return taxation2Amount;
    }

    /**
     * Sets the value of the taxation2Amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxation2Amount(BigDecimal value) {
        this.taxation2Amount = value;
    }

    /**
     * Gets the value of the taxation3Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxation3Rate() {
        return taxation3Rate;
    }

    /**
     * Sets the value of the taxation3Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxation3Rate(BigDecimal value) {
        this.taxation3Rate = value;
    }

    /**
     * Gets the value of the taxation3Amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxation3Amount() {
        return taxation3Amount;
    }

    /**
     * Sets the value of the taxation3Amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxation3Amount(BigDecimal value) {
        this.taxation3Amount = value;
    }

    /**
     * Gets the value of the taxation4Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxation4Rate() {
        return taxation4Rate;
    }

    /**
     * Sets the value of the taxation4Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxation4Rate(BigDecimal value) {
        this.taxation4Rate = value;
    }

    /**
     * Gets the value of the taxation4Amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxation4Amount() {
        return taxation4Amount;
    }

    /**
     * Sets the value of the taxation4Amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxation4Amount(BigDecimal value) {
        this.taxation4Amount = value;
    }

    /**
     * Gets the value of the taxation5Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxation5Rate() {
        return taxation5Rate;
    }

    /**
     * Sets the value of the taxation5Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxation5Rate(BigDecimal value) {
        this.taxation5Rate = value;
    }

    /**
     * Gets the value of the taxation5Amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxation5Amount() {
        return taxation5Amount;
    }

    /**
     * Sets the value of the taxation5Amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxation5Amount(BigDecimal value) {
        this.taxation5Amount = value;
    }

    /**
     * Gets the value of the taxation6Rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxation6Rate() {
        return taxation6Rate;
    }

    /**
     * Sets the value of the taxation6Rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxation6Rate(BigDecimal value) {
        this.taxation6Rate = value;
    }

    /**
     * Gets the value of the taxation6Amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxation6Amount() {
        return taxation6Amount;
    }

    /**
     * Sets the value of the taxation6Amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxation6Amount(BigDecimal value) {
        this.taxation6Amount = value;
    }

    /**
     * Gets the value of the otherTaxesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherTaxesAmount() {
        return otherTaxesAmount;
    }

    /**
     * Sets the value of the otherTaxesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherTaxesAmount(BigDecimal value) {
        this.otherTaxesAmount = value;
    }

    /**
     * Gets the value of the totalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTax() {
        return totalTax;
    }

    /**
     * Sets the value of the totalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTax(BigDecimal value) {
        this.totalTax = value;
    }

    /**
     * Gets the value of the finalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinalAmount() {
        return finalAmount;
    }

    /**
     * Sets the value of the finalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinalAmount(BigDecimal value) {
        this.finalAmount = value;
    }

}
