package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "vmProtectionStatus")
@XmlEnum
public enum VmProtectionStatus {
    NOT_PROTECTED,
    PARTIALLY_PROTECTED,
    FULLY_PROTECTED,
    NO_LUNS,
    UNKNOWN;

    private VmProtectionStatus() {
    }

    public static VmProtectionStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


