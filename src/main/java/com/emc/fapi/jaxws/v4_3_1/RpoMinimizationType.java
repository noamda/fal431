package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "rpoMinimizationType")
@XmlEnum
public enum RpoMinimizationType {
    MINIMIZE_LAG,
    MINIMIZE_BANDWIDTH,
    IRRELEVANT,
    UNKNOWN;

    private RpoMinimizationType() {
    }

    public static RpoMinimizationType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


