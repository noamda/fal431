package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "eventLogScope")
@XmlEnum
public enum EventLogScope {
    ROOT_CAUSE,
    NORMAL,
    ADVANCED,
    UNKNOWN;

    private EventLogScope() {
    }

    public static EventLogScope fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


