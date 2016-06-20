package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "eventLogTopic")
@XmlEnum
public enum EventLogTopic {
    ALL,
    MANAGEMENT,
    CLUSTER,
    RPA,
    CONSISTENCY_GROUP,
    SPLITTER,
    UNKNOWN;

    private EventLogTopic() {
    }

    public static EventLogTopic fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


