package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "imageAccessMode")
@XmlEnum
public enum ImageAccessMode {
    LOGGED_ACCESS,
    VIRTUAL_ACCESS,
    VIRTUAL_ACCESS_WITH_ROLL,
    UNKNOWN;

    private ImageAccessMode() {
    }

    public static ImageAccessMode fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


