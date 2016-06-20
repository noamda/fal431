package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "connectionType")
@XmlEnum
public enum ConnectionType {
    FIBER_CHANNEL,
    IP,
    NO_CONNECTION,
    UNKNOWN;

    private ConnectionType() {
    }

    public static ConnectionType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


