package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "alertType")
@XmlEnum
public enum AlertType {
    IMMEDIATE,
    DAILY,
    UNKNOWN;

    private AlertType() {
    }

    public static AlertType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


