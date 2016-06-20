package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "vCenterServerFilterType")
@XmlEnum
public enum VCenterServerFilterType {
    ESX,
    VM,
    LUN,
    UNKNOWN;

    private VCenterServerFilterType() {
    }

    public static VCenterServerFilterType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


