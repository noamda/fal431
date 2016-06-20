package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "vCenterServerConnectionStatus")
@XmlEnum
public enum VCenterServerConnectionStatus {
    CONNECTED,
    AUTHENTICATION_FAILURE,
    IP_UNREACHABLE,
    UNSUPPORTED_VERSION,
    INVALID_PORT,
    INVALID_PORT_OR_CERTIFICATE,
    UNKNOWN_ERROR,
    UNKNOWN;

    private VCenterServerConnectionStatus() {
    }

    public static VCenterServerConnectionStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


