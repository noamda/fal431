
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ldapProtocolType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ldapProtocolType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LDAP"/>
 *     &lt;enumeration value="LDAPs"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ldapProtocolType")
@XmlEnum
public enum LdapProtocolType {

    LDAP("LDAP"),
    @XmlEnumValue("LDAPs")
    LDA_PS("LDAPs"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    LdapProtocolType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LdapProtocolType fromValue(String v) {
        for (LdapProtocolType c: LdapProtocolType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
