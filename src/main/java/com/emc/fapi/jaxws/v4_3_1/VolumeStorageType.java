package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "volumeStorageType")
@XmlEnum
public enum VolumeStorageType {
    VNX_OR_CLARIION,
    SYMMETRIX,
    VPLEX,
    XTREME_IO,
    OTHER,
    VIRTUAL,
    UNKNOWN;

    private VolumeStorageType() {
    }

    public static VolumeStorageType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


