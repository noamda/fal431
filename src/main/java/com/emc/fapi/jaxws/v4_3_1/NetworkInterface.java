package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "networkInterface")
@XmlEnum
public enum NetworkInterface {
    WAN,
    LAN,
    ISCSI1,
    ISCSI2,
    UNKNOWN;

    private NetworkInterface() {
    }

    public static NetworkInterface fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


