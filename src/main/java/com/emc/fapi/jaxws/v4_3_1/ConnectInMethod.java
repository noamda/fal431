package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "connectInMethod")
@XmlEnum
public enum ConnectInMethod {
    CONNECT_IN_ESRS,
    CONNECT_IN_WEBEX,
    CONNECT_IN_NOT_ALLOWED,
    UNKNOWN;

    private ConnectInMethod() {
    }

    public static ConnectInMethod fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


