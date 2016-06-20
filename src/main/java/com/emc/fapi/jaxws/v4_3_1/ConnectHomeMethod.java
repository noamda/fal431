package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "connectHomeMethod")
@XmlEnum
public enum ConnectHomeMethod {
    CONNECT_HOME_ESRS,
    CONNECT_HOME_EMAIL,
    CONNECT_HOME_NOT_ALLOWED,
    CONNECT_HOME_FTPS,
    UNKNOWN;

    private ConnectHomeMethod() {
    }

    public static ConnectHomeMethod fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


