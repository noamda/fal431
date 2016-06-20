package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "protectionWindowStatus")
@XmlEnum
public enum ProtectionWindowStatus {
    SUFFICIENT,
    INSUFFICIENT,
    EXTENDING,
    UNKNOWN;

    private ProtectionWindowStatus() {
    }

    public static ProtectionWindowStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


