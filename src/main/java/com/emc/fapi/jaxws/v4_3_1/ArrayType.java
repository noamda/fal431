package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "arrayType")
@XmlEnum
public enum ArrayType {
    VNX,
    VNXE,
    SYMMETRIX,
    CX,
    VPLEX,
    VC,
    XTREMEIO,
    SCALEIO,
    UNKNOWN;

    private ArrayType() {
    }

    public static ArrayType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


