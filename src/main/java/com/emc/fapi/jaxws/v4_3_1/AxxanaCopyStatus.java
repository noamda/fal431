package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "axxanaCopyStatus")
@XmlEnum
public enum AxxanaCopyStatus {
    OK,
    DISABLED,
    INITIALIZING,
    DOWN,
    EXCEEDING_LAG_POLICY,
    FAILED_TO_CREATE,
    MEMORY_PROBLEM,
    UNKNOWN;

    private AxxanaCopyStatus() {
    }

    public static AxxanaCopyStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


