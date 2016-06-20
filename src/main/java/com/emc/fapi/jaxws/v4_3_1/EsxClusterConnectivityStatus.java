package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "EsxClusterConnectivityStatus")
@XmlEnum
public enum EsxClusterConnectivityStatus {
    OK,
    ERROR,
    REGISTERING,
    UNKNOWN;

    private EsxClusterConnectivityStatus() {
    }

    public static EsxClusterConnectivityStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


