package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "rpaStatus")
@XmlEnum
public enum RpaStatus {
    OK,
    DOWN,
    REMOVED_FOR_MAINTENANCE,
    UNKNOWN;

    private RpaStatus() {
    }

    public static RpaStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


