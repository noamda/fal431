package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "rpaType")
@XmlEnum
public enum RpaType {
    PHYSICAL,
    VIRTUAL,
    UNKNOWN;

    private RpaType() {
    }

    public static RpaType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


