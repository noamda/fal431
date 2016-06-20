package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "splitterCredentialsStatus")
@XmlEnum
public enum SplitterCredentialsStatus {
    OK,
    NONE,
    UNDECIDED,
    UNKNOWN;

    private SplitterCredentialsStatus() {
    }

    public static SplitterCredentialsStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


