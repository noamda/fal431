package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "storageAccessState")
@XmlEnum
public enum StorageAccessState {
    DIRECT_ACCESS,
    LOGGED_ACCESS,
    VIRTUAL_ACCESS,
    ENABLING_LOGGED_ACCESS,
    ENABLING_VIRTUAL_ACCESS,
    VIRTUAL_ACCESS_ROLLING_IMAGE,
    LOGGED_ACCESS_ROLL_COMPLETE,
    NO_ACCESS,
    NO_ACCESS_UNDOING_WRITES,
    NO_ACCESS_SPACE_FULL,
    NO_ACCESS_JOURNAL_PRESERVED,
    NO_ACCESS_BFS_GROUP,
    VIRTUAL_ACCESS_CANNOT_ROLL_IMAGE,
    UNKNOWN;

    private StorageAccessState() {
    }

    public static StorageAccessState fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


