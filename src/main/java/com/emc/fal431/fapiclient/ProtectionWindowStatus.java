
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for protectionWindowStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="protectionWindowStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sufficient"/>
 *     &lt;enumeration value="Insufficient"/>
 *     &lt;enumeration value="Extending"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "protectionWindowStatus")
@XmlEnum
public enum ProtectionWindowStatus {

    @XmlEnumValue("Sufficient")
    SUFFICIENT("Sufficient"),
    @XmlEnumValue("Insufficient")
    INSUFFICIENT("Insufficient"),
    @XmlEnumValue("Extending")
    EXTENDING("Extending"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ProtectionWindowStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtectionWindowStatus fromValue(String v) {
        for (ProtectionWindowStatus c: ProtectionWindowStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
