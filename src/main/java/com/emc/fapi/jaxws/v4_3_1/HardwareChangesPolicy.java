package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "hardwareChangesPolicy")
@XmlEnum
public enum HardwareChangesPolicy {
    DONT_REPLICATE_HW_CHANGES,
    REPLICATE_HW_CHANGES,
    UNKNOWN;

    private HardwareChangesPolicy() {
    }

    public static HardwareChangesPolicy fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


