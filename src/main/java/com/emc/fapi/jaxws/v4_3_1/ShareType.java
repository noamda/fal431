package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "shareType")
@XmlEnum
public enum ShareType {
    NFS23,
    NFS4,
    CIFS,
    UNKNOWN;

    private ShareType() {
    }

    public static ShareType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


