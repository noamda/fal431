package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "interfaceType")
@XmlEnum
public enum InterfaceType {
    WAN,
    LAN,
    UNKNOWN;

    private InterfaceType() {
    }

    public static InterfaceType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


