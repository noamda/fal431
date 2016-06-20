package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "systemSecurityLevel")
@XmlEnum
public enum SystemSecurityLevel {
    LOW,
    HIGH,
    UNKNOWN;

    private SystemSecurityLevel() {
    }

    public static SystemSecurityLevel fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


