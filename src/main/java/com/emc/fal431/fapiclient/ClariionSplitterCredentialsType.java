
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clariionSplitterCredentialsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="clariionSplitterCredentialsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Password"/>
 *     &lt;enumeration value="SecureFiles"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clariionSplitterCredentialsType")
@XmlEnum
public enum ClariionSplitterCredentialsType {

    @XmlEnumValue("Password")
    PASSWORD("Password"),
    @XmlEnumValue("SecureFiles")
    SECURE_FILES("SecureFiles"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ClariionSplitterCredentialsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClariionSplitterCredentialsType fromValue(String v) {
        for (ClariionSplitterCredentialsType c: ClariionSplitterCredentialsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
