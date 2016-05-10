
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recoverPointUserType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="recoverPointUserType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LocalUser"/>
 *     &lt;enumeration value="LDAPUser"/>
 *     &lt;enumeration value="LDAPGroup"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "recoverPointUserType")
@XmlEnum
public enum RecoverPointUserType {

    @XmlEnumValue("LocalUser")
    LOCAL_USER("LocalUser"),
    @XmlEnumValue("LDAPUser")
    LDAP_USER("LDAPUser"),
    @XmlEnumValue("LDAPGroup")
    LDAP_GROUP("LDAPGroup"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    RecoverPointUserType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecoverPointUserType fromValue(String v) {
        for (RecoverPointUserType c: RecoverPointUserType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
