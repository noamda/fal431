package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "snapshotConsolidationType")
@XmlEnum
public enum SnapshotConsolidationType {
    NO_CONSOLIDATION,
    MANUAL,
    DAILY,
    WEEKLY,
    MONTHLY,
    UNKNOWN;

    private SnapshotConsolidationType() {
    }

    public static SnapshotConsolidationType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


