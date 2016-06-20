package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "clariionCredentialsType")
@XmlEnum
public enum ClariionCredentialsType {
    PASSWORD,
    SECURE_FILES,
    VNX2E,
    UNKNOWN;

    private ClariionCredentialsType() {
    }

    public static ClariionCredentialsType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


