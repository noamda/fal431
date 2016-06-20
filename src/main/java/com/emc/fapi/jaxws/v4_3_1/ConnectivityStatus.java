package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "connectivityStatus")
@XmlEnum
public enum ConnectivityStatus {
    STATUS_OK,
    AUTHENTICATION_FAILURE,
    IP_NOT_REACHABLE,
    INVALID_PORT,
    UNKNOWN_ERROR,
    UNKNOWN;

    private ConnectivityStatus() {
    }

    public static ConnectivityStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


