package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "arrayConnectivityStatus")
@XmlEnum
public enum ArrayConnectivityStatus {
    OK,
    DEGRADED,
    BAD_CREDENTIALS,
    BAD_CONNECTION_PARAMETERS,
    FAILURE,
    UNKNOWN;

    private ArrayConnectivityStatus() {
    }

    public static ArrayConnectivityStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


