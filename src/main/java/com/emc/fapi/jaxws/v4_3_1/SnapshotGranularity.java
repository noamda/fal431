package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "snapshotGranularity")
@XmlEnum
public enum SnapshotGranularity {
    DYNAMIC,
    FIXED_PER_SECOND,
    FIXED_PER_WRITE,
    UNKNOWN;

    private SnapshotGranularity() {
    }

    public static SnapshotGranularity fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


