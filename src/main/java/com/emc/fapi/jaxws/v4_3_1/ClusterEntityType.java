package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "clusterEntityType")
@XmlEnum
public enum ClusterEntityType {
    RPA,
    SPLITTER,
    VOLUME,
    UNKNOWN;

    private ClusterEntityType() {
    }

    public static ClusterEntityType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


