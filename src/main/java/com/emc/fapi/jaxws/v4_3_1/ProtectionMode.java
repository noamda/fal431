package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "protectionMode")
@XmlEnum
public enum ProtectionMode {
    ASYNCHRONOUS,
    SYNCHRONOUS,
    UNKNOWN;

    private ProtectionMode() {
    }

    public static ProtectionMode fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


