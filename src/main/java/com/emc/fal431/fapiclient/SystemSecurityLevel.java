
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemSecurityLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="systemSecurityLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Low"/>
 *     &lt;enumeration value="High"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "systemSecurityLevel")
@XmlEnum
public enum SystemSecurityLevel {

    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SystemSecurityLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemSecurityLevel fromValue(String v) {
        for (SystemSecurityLevel c: SystemSecurityLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
