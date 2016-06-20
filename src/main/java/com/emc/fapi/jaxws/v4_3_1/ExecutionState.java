package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "executionState")
@XmlEnum
public enum ExecutionState {
    UNKNOWN,
    RUNNING,
    FINISHED,
    ABORTED,
    UNKNOWN_TRANSACTION;

    private ExecutionState() {
    }

    public static ExecutionState fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


