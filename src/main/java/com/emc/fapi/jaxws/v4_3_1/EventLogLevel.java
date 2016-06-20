package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "eventLogLevel")
@XmlEnum
public enum EventLogLevel {
    INFO,
    WARNING,
    TRANSIENT_WARNING,
    CLEARED_WARNING,
    ERROR,
    TRANSIENT_ERROR,
    CLEARED_ERROR,
    CRITICAL,
    UNKNOWN;

    private EventLogLevel() {
    }

    public static EventLogLevel fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


