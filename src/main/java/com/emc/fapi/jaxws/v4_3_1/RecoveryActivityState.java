package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "recoveryActivityState")
@XmlEnum
public enum RecoveryActivityState {
    RECOVER_PRODUCTION,
    FAILOVER,
    DIRECT_ACCESS,
    LOGGED_ACCESS,
    VIRTUAL_ACCESS,
    ENABLING_LOGGED_ACCESS,
    ENABLING_VIRTUAL_ACCESS,
    VIRTUAL_ACCESS_ROLLING_IMAGE,
    LOGGED_ACCESS_ROLL_COMPLETE,
    VIRTUAL_ACCESS_CANNOT_ROLL_IMAGE,
    NO_ACCESS_SPACE_FULL,
    NO_ACCESS_UNDOING_WRITES,
    UNKNOWN;

    private RecoveryActivityState() {
    }

    public static RecoveryActivityState fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


