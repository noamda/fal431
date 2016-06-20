package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "capability")
@XmlEnum
public enum Capability {
    SYNC_REPLICATION,
    VOLUMES_GREATER_THAN_TWO_TERA_BYTES,
    VIRTUAL_ACCESS,
    VIRTUAL_ACCESS_WITH_ROLL,
    READ_ONLY_ON_REPLICA,
    FAKE_VOLUME_SIZE,
    VOLUME_RESIZE,
    UNMAP_VOLUME_COMMAND,
    UNKNOWN;

    private Capability() {
    }

    public static Capability fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


