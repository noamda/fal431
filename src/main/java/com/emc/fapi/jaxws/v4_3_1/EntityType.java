package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "EntityType")
@XmlEnum
public enum EntityType {
    ESX,
    ESX_CLUSTER;

    private EntityType() {
    }

    public static EntityType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


