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
 * <p>Java class for TxnType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TxnType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="NEW_BUSINESS_FROM_EXISTING_CLIENT"/>
 *     &lt;enumeration value="ENDORSEMENT"/>
 *     &lt;enumeration value="RENEWAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TxnType")
@XmlEnum
public enum TxnType {

    NEW,
    NEW_BUSINESS_FROM_EXISTING_CLIENT,
    ENDORSEMENT,
    RENEWAL;

    public String value() {
        return name();
    }

    public static TxnType fromValue(String v) {
        return valueOf(v);
    }

}
