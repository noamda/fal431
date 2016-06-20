package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "reportStepType")
@XmlEnum
public enum ReportStepType {
    VM_POWER_ON,
    VM_POWER_OFF,
    PREPARE_STORAGE,
    PREPARE_REPLICA,
    PREPARE_SOURCE,
    PREPARE_REPLICATION,
    PAUSE_TRANSFER,
    VM_STARTUP_SEQUENCE,
    VM_STARTUP_SCRIPT,
    VM_STARTUP_PROMPT,
    POWER_ON_VMS,
    POWER_OFF_VMS,
    UNKNOWN;

    private ReportStepType() {
    }

    public static ReportStepType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


