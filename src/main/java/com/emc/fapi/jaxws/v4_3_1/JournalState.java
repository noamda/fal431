package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "journalState")
@XmlEnum
public enum JournalState {
    DISTRIBUTING,
    ENABLING_LOGGED_ACCESS,
    ENABLING_VIRTUAL_ACCESS,
    SNAPSHOT_ACCESS,
    ERROR_ACCESSING_VIRTUAL_IMAGE,
    ERROR_ACCESSING_PHYSICAL_IMAGE,
    LOCKING,
    LOCKED,
    LONG_RESYNC,
    RECOVERING,
    INACCESSIBLE,
    UNKNOWN;

    private JournalState() {
    }

    public static JournalState fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


