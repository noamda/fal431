package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "authenticationType")
@XmlEnum
public enum AuthenticationType {
    GLOBAL,
    LOCAL,
    LDAP,
    UNKNOWN;

    private AuthenticationType() {
    }

    public static AuthenticationType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


