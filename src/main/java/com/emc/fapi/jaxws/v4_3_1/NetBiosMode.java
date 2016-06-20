package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "netBiosMode")
@XmlEnum
public enum NetBiosMode {
    DISABLED,
    ENABLED,
    ENABLED_VIA_DHCP,
    UNKNOWN;

    private NetBiosMode() {
    }

    public static NetBiosMode fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


