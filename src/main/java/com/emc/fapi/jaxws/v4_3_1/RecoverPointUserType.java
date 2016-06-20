package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "recoverPointUserType")
@XmlEnum
public enum RecoverPointUserType {
    LOCAL_USER,
    LDAP_USER,
    LDAP_GROUP,
    UNKNOWN;

    private RecoverPointUserType() {
    }

    public static RecoverPointUserType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


