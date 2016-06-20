package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "replicationMode")
@XmlEnum
public enum ReplicationMode {
    UNKNOWN,
    NA,
    SNAPSHOT,
    ASYNCHRONOUS,
    PING_PONG;

    private ReplicationMode() {
    }

    public static ReplicationMode fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


