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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Messages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Messages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="error" type="{http://marine.icicilombard.com}Message" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="decline" type="{http://marine.icicilombard.com}Message" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="conditionalApprove" type="{http://marine.icicilombard.com}Message" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="info" type="{http://marine.icicilombard.com}Message" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Messages", propOrder = {
    "error",
    "decline",
    "conditionalApprove",
    "info"
})
public class Messages
    implements Serializable
{

    private final static long serialVersionUID = -6026937020915831338L;
    protected com.icicilombard.marine.model.Message[] error;
    protected com.icicilombard.marine.model.Message[] decline;
    protected com.icicilombard.marine.model.Message[] conditionalApprove;
    protected com.icicilombard.marine.model.Message[] info;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link com.icicilombard.marine.model.Message }
     *     
     */
    public com.icicilombard.marine.model.Message[] getError() {
        if (this.error == null) {
            return new com.icicilombard.marine.model.Message[ 0 ] ;
        }
        com.icicilombard.marine.model.Message[] retVal = new com.icicilombard.marine.model.Message[this.error.length] ;
        System.arraycopy(this.error, 0, retVal, 0, this.error.length);
        return (retVal);
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link com.icicilombard.marine.model.Message }
     *     
     */
    public com.icicilombard.marine.model.Message getError(int idx) {
        if (this.error == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.error[idx];
    }

    public int getErrorLength() {
        if (this.error == null) {
            return  0;
        }
        return this.error.length;
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link com.icicilombard.marine.model.Message }
     *     
     */
    public void setError(com.icicilombard.marine.model.Message[] values) {
        int len = values.length;
        this.error = ((com.icicilombard.marine.model.Message[]) new com.icicilombard.marine.model.Message[len] );
        for (int i = 0; (i<len); i ++) {
            this.error[i] = values[i];
        }
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link com.icicilombard.marine.model.Message }
     *     
     */
    public com.icicilombard.marine.model.Message setError(int idx, com.icicilombard.marine.model.Message value) {
        return this.error[idx] = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link com.icicilombard.marine.model.Message }
     *     
     */
    public com.icicilombard.marine.model.Message[] getDecline() {
        if (this.decline == null) {
            return new com.icicilombard.marine.model.Message[ 0 ] ;
        }
        com.icicilombard.marine.model.Message[] retVal = new com.icicilombard.marine.model.Message[this.decline.length] ;
        System.arraycopy(this.decline, 0, retVal, 0, this.decline.length);
        return (retVal);
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link com.icicilombard.marine.model.Message }
     *     
     */
    public com.icicilombard.marine.model.Message getDecline(int idx) {
        if (this.decline == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.decline[idx];
    }

    public int getDeclineLength() {
        if (this.decline == null) {
            return  0;
        }
        return this.decline.length;
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link com.icicilombard.marine.model.Message }
     *     
     */
    public void setDecline(com.icicilombard.marine.model.Message[] values) {
        int len = values.length;
        this.decline = ((com.icicilombard.marine.model.Message[]) new com.icicilombard.marine.model.Message[len] );
        for (int i = 0; (i<len); i ++) {
            this.decline[i] = values[i];
        }
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link com.icicilombard.marine.model.Message }
     *     
     */
    public com.icicilombard.marine.model.Message setDecline(int idx, com.icicilombard.marine.model.Message value) {
        return this.decline[idx] = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link com.icicilombard.marine.model.Message }
     *     
     */
    public com.icicilombard.marine.model.Message[] getConditionalApprove() {
        if (this.conditionalApprove == null) {
            return new com.icicilombard.marine.model.Message[ 0 ] ;
        }
        com.icicilombard.marine.model.Message[] retVal = new com.icicilombard.marine.model.Message[this.conditionalApprove.length] ;
        System.arraycopy(this.conditionalApprove, 0, retVal, 0, this.conditionalApprove.length);
        return (retVal);
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link com.icicilombard.marine.model.Message }
     *     
     */
    public com.icicilombard.marine.model.Message getConditionalApprove(int idx) {
        if (this.conditionalApprove == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.conditionalApprove[idx];
    }

    public int getConditionalApproveLength() {
        if (this.conditionalApprove == null) {
            return  0;
        }
        return this.conditionalApprove.length;
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link com.icicilombard.marine.model.Message }
     *     
     */
    public void setConditionalApprove(com.icicilombard.marine.model.Message[] values) {
        int len = values.length;
        this.conditionalApprove = ((com.icicilombard.marine.model.Message[]) new com.icicilombard.marine.model.Message[len] );
        for (int i = 0; (i<len); i ++) {
            this.conditionalApprove[i] = values[i];
        }
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link com.icicilombard.marine.model.Message }
     *     
     */
    public com.icicilombard.marine.model.Message setConditionalApprove(int idx, com.icicilombard.marine.model.Message value) {
        return this.conditionalApprove[idx] = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link com.icicilombard.marine.model.Message }
     *     
     */
    public com.icicilombard.marine.model.Message[] getInfo() {
        if (this.info == null) {
            return new com.icicilombard.marine.model.Message[ 0 ] ;
        }
        com.icicilombard.marine.model.Message[] retVal = new com.icicilombard.marine.model.Message[this.info.length] ;
        System.arraycopy(this.info, 0, retVal, 0, this.info.length);
        return (retVal);
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link com.icicilombard.marine.model.Message }
     *     
     */
    public com.icicilombard.marine.model.Message getInfo(int idx) {
        if (this.info == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.info[idx];
    }

    public int getInfoLength() {
        if (this.info == null) {
            return  0;
        }
        return this.info.length;
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link com.icicilombard.marine.model.Message }
     *     
     */
    public void setInfo(com.icicilombard.marine.model.Message[] values) {
        int len = values.length;
        this.info = ((com.icicilombard.marine.model.Message[]) new com.icicilombard.marine.model.Message[len] );
        for (int i = 0; (i<len); i ++) {
            this.info[i] = values[i];
        }
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link com.icicilombard.marine.model.Message }
     *     
     */
    public com.icicilombard.marine.model.Message setInfo(int idx, com.icicilombard.marine.model.Message value) {
        return this.info[idx] = value;
    }

}
