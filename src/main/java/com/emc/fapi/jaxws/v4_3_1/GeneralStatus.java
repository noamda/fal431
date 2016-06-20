package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "generalStatus")
@XmlEnum
public enum GeneralStatus {
    OK,
    ERROR,
    UNKNOWN,
    WARNING;

    private GeneralStatus() {
    }

    public static GeneralStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


