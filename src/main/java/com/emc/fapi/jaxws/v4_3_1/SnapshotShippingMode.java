package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "snapshotShippingMode")
@XmlEnum
public enum SnapshotShippingMode {
    HIGHLOAD,
    PERIODICALLY,
    CONTINUOUS,
    UNKNOWN;

    private SnapshotShippingMode() {
    }

    public static SnapshotShippingMode fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


