package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "connectionStatus")
@XmlEnum
public enum ConnectionStatus {
    SUCCESS,
    PASSWORD_EXPIRED,
    TOO_MANY_CONNECTIONS,
    NO_PERMISSION,
    ERROR;

    private ConnectionStatus() {
    }

    public static ConnectionStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


