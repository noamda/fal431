package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ldapProtocolType")
@XmlEnum
public enum LdapProtocolType {
    LDAP,
    LDAPS,
    UNKNOWN;

    private LdapProtocolType() {
    }

    public static LdapProtocolType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


