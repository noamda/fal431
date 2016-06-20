package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "replicationSetType")
@XmlEnum
public enum ReplicationSetType {
    BLOCK,
    FILE_SYSTEM,
    VDM,
    UNKNOWN;

    private ReplicationSetType() {
    }

    public static ReplicationSetType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


