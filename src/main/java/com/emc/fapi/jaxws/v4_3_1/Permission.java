package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "permission")
@XmlEnum
public enum Permission {
    ARRAY_MANAGEMENT,
    BOX_MANAGEMENT,
    FAILOVER,
    GROUP,
    TRANSFER,
    TARGET_IMAGE,
    SE,
    SECURITY,
    SPLITTER,
    SYSTEM,
    UPGRADE,
    MONITOR,
    WEB_DOWNLOAD,
    UNKNOWN;

    private Permission() {
    }

    public static Permission fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


