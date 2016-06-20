package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "phoenixClusterStatus")
@XmlEnum
public enum PhoenixClusterStatus {
    OK,
    DOWN,
    UNKNOWN;

    private PhoenixClusterStatus() {
    }

    public static PhoenixClusterStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


