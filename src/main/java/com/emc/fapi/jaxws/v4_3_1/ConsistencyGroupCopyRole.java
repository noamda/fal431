package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "consistencyGroupCopyRole")
@XmlEnum
public enum ConsistencyGroupCopyRole {
    ACTIVE,
    TEMPORARY_ACTIVE,
    REPLICA,
    UNKNOWN;

    private ConsistencyGroupCopyRole() {
    }

    public static ConsistencyGroupCopyRole fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


