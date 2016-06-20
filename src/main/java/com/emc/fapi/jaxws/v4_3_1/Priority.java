package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "priority")
@XmlEnum
public enum Priority {
    IDLE,
    LOW,
    NORMAL,
    HIGH,
    CRITICAL,
    UNKNOWN;

    private Priority() {
    }

    public static Priority fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


