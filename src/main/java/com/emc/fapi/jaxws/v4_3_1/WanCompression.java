package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "wanCompression")
@XmlEnum
public enum WanCompression {
    NONE,
    LOW,
    MEDIUM,
    HIGH,
    UNKNOWN;

    private WanCompression() {
    }

    public static WanCompression fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


