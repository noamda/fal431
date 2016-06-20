package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "externalManagement")
@XmlEnum
public enum ExternalManagement {
    NONE,
    RPCE,
    SRM,
    REE,
    UNKNOWN;

    private ExternalManagement() {
    }

    public static ExternalManagement fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


