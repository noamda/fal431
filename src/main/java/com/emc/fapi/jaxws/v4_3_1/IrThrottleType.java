package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "irThrottleType")
@XmlEnum
public enum IrThrottleType {
    LOW,
    HIGH,
    CUSTOM,
    NONE,
    UNKNOWN;

    private IrThrottleType() {
    }

    public static IrThrottleType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


