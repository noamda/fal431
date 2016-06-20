package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "quantityType")
@XmlEnum
public enum QuantityType {
    MICROSECONDS,
    MILLISECONDS,
    SECONDS,
    MINUTES,
    HOURS,
    DAYS,
    BYTES,
    KB,
    MB,
    GB,
    TB,
    WRITES,
    UNKNOWN;

    private QuantityType() {
    }

    public static QuantityType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


