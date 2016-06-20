package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "virtualVolumeType")
@XmlEnum
public enum VirtualVolumeType {
    VIRTUAL_DISK,
    VIRTUAL_RDM,
    PHYSICAL_RDM,
    UNKNOWN;

    private VirtualVolumeType() {
    }

    public static VirtualVolumeType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


