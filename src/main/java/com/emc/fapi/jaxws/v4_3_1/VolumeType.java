package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "volumeType")
@XmlEnum
public enum VolumeType {
    USER,
    JOURNAL,
    REPOSITORY,
    UNKNOWN;

    private VolumeType() {
    }

    public static VolumeType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


