package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "volumeAccessStatus")
@XmlEnum
public enum VolumeAccessStatus {
    OK,
    ERROR,
    RESERVED,
    BAD_SECTOR,
    READ_ONLY,
    NA,
    UNKNOWN;

    private VolumeAccessStatus() {
    }

    public static VolumeAccessStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


