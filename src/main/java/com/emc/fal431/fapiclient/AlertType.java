
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alertType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="alertType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Immediate"/>
 *     &lt;enumeration value="Daily"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "alertType")
@XmlEnum
public enum AlertType {

    @XmlEnumValue("Immediate")
    IMMEDIATE("Immediate"),
    @XmlEnumValue("Daily")
    DAILY("Daily"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    AlertType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertType fromValue(String v) {
        for (AlertType c: AlertType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
