//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.01 at 08:39:48 AM IST 
//


package com.icicilombard.marine.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PolicyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="ENDORSEMENT"/>
 *     &lt;enumeration value="CANCELLATION"/>
 *     &lt;enumeration value="RENEWAL"/>
 *     &lt;enumeration value="ROLLOVER"/>
 *     &lt;enumeration value="OMRENEWAL"/>
 *     &lt;enumeration value="OM_RENEWAL"/>
 *     &lt;enumeration value="RENEWALNOTICE"/>
 *     &lt;enumeration value="SPLITRENEWAL"/>
 *     &lt;enumeration value="MERGERENEWAL"/>
 *     &lt;enumeration value="POLICY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PolicyType")
@XmlEnum
public enum PolicyType {

    NEW,
    ENDORSEMENT,
    CANCELLATION,
    RENEWAL,
    ROLLOVER,
    OMRENEWAL,
    OM_RENEWAL,
    RENEWALNOTICE,
    SPLITRENEWAL,
    MERGERENEWAL,
    POLICY;

    public String value() {
        return name();
    }

    public static PolicyType fromValue(String v) {
        return valueOf(v);
    }

}