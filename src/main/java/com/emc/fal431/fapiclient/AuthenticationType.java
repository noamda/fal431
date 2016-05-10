
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authenticationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="authenticationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Global"/>
 *     &lt;enumeration value="Local"/>
 *     &lt;enumeration value="LDAP"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "authenticationType")
@XmlEnum
public enum AuthenticationType {

    @XmlEnumValue("Global")
    GLOBAL("Global"),
    @XmlEnumValue("Local")
    LOCAL("Local"),
    LDAP("LDAP"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    AuthenticationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthenticationType fromValue(String v) {
        for (AuthenticationType c: AuthenticationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
