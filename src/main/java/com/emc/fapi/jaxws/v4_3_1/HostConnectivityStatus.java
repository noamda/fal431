package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "hostConnectivityStatus")
@XmlEnum
public enum HostConnectivityStatus {
    SUCCESS,
    AUTHENTICATION_FAILED,
    NO_CONNECTION,
    COMMAND_TIMED_OUT,
    UNKNOWN;

    private HostConnectivityStatus() {
    }

    public static HostConnectivityStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


