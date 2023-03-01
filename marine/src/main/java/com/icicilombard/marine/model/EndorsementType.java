//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.01 at 08:39:48 AM IST 
//


package com.icicilombard.marine.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndorsementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EndorsementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PREMIUMBEARING"/>
 *     &lt;enumeration value="NONPREMIUMBEARING"/>
 *     &lt;enumeration value="TRIPDURATION"/>
 *     &lt;enumeration value="TRIP_DURATION"/>
 *     &lt;enumeration value="PRO-RATA"/>
 *     &lt;enumeration value="SHORT-TERM"/>
 *     &lt;enumeration value="REDUCTION_IN_POLICY_PERIOD"/>
 *     &lt;enumeration value="NILENDORSEMENT"/>
 *     &lt;enumeration value="NONNILENDORSEMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EndorsementType")
@XmlEnum
public enum EndorsementType {

    PREMIUMBEARING("PREMIUMBEARING"),
    NONPREMIUMBEARING("NONPREMIUMBEARING"),
    TRIPDURATION("TRIPDURATION"),
    TRIP_DURATION("TRIP_DURATION"),
    @XmlEnumValue("PRO-RATA")
    PRO_RATA("PRO-RATA"),
    @XmlEnumValue("SHORT-TERM")
    SHORT_TERM("SHORT-TERM"),
    REDUCTION_IN_POLICY_PERIOD("REDUCTION_IN_POLICY_PERIOD"),
    NILENDORSEMENT("NILENDORSEMENT"),
    NONNILENDORSEMENT("NONNILENDORSEMENT");
    private final String value;

    EndorsementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndorsementType fromValue(String v) {
        for (EndorsementType c: EndorsementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}