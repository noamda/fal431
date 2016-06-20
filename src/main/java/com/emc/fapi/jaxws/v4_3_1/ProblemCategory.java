package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "problemCategory")
@XmlEnum
public enum ProblemCategory {
    SPLITTER,
    DEVICE,
    RPA,
    LINK,
    SYSTEM,
    CONSISTENCY_GROUP,
    UNKNOWN;

    private ProblemCategory() {
    }

    public static ProblemCategory fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


