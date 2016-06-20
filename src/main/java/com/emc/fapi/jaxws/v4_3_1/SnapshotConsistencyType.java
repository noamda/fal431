package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "snapshotConsistencyType")
@XmlEnum
public enum SnapshotConsistencyType {
    CONSISTENCY_UNKNOWN,
    APPLICATION_CONSISTENT,
    UNKNOWN;

    private SnapshotConsistencyType() {
    }

    public static SnapshotConsistencyType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


