package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "splitterStatus")
@XmlEnum
public enum SplitterStatus {
    OK,
    DOWN,
    UNSUPPORTED_VERSION,
    UNCONTROLLABLE,
    WARNING,
    UNKNOWN;

    private SplitterStatus() {
    }

    public static SplitterStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


