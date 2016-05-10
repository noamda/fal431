
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for protectionMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="protectionMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Asynchronous"/>
 *     &lt;enumeration value="Synchronous"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "protectionMode")
@XmlEnum
public enum ProtectionMode {

    @XmlEnumValue("Asynchronous")
    ASYNCHRONOUS("Asynchronous"),
    @XmlEnumValue("Synchronous")
    SYNCHRONOUS("Synchronous"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ProtectionMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtectionMode fromValue(String v) {
        for (ProtectionMode c: ProtectionMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
