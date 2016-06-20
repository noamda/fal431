package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "problemSeverity")
@XmlEnum
public enum ProblemSeverity {
    ERROR,
    CRITICAL,
    WARNING,
    UNKNOWN,
    OK;

    private ProblemSeverity() {
    }

    public static ProblemSeverity fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


