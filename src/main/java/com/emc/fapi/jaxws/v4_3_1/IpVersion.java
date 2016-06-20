package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ipVersion")
@XmlEnum
public enum IpVersion {
    IPV4,
    IPV6,
    UNKNOWN;

    private IpVersion() {
    }

    public static IpVersion fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


