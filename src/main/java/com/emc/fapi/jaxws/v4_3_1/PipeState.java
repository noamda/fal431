package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "pipeState")
@XmlEnum
public enum PipeState {
    INITIALIZING,
    ACTIVE,
    STAND_BY,
    FLUSHING_BUFFER,
    FLUSHING_REMOTE_BUFFER_TO_JOURNAL,
    READY_TO_REPLICATE,
    FLUSHED,
    PAUSED,
    PAUSED_BY_SYSTEM,
    ERROR,
    IN_HIGH_LOAD,
    SNAP_SHIPPING,
    SNAP_IDLE,
    UNKNOWN;

    private PipeState() {
    }

    public static PipeState fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


