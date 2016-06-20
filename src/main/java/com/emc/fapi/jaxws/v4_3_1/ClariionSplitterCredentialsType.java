package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "clariionSplitterCredentialsType")
@XmlEnum
public enum ClariionSplitterCredentialsType {
    PASSWORD,
    SECURE_FILES,
    UNKNOWN;

    private ClariionSplitterCredentialsType() {
    }

    public static ClariionSplitterCredentialsType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


