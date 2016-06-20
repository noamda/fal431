package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "arrayResourcePoolType")
@XmlEnum
public enum ArrayResourcePoolType {
    STORAGE_POOL,
    RAID_GROUP,
    VC_DATASTORE,
    UNKNOWN;

    private ArrayResourcePoolType() {
    }

    public static ArrayResourcePoolType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


