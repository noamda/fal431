package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "splitVariant")
@XmlEnum
public enum SplitVariant {
    STANDARD,
    TSP,
    REDIRECT,
    UNKNOWN;

    private SplitVariant() {
    }

    public static SplitVariant fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


