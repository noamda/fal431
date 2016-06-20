package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "splitterType")
@XmlEnum
public enum SplitterType {
    CLARIION,
    SYMMETRIX,
    VPLEX_ARRAY,
    VPLEX_DIRECTOR,
    VNX2E,
    VNX2E_SP,
    ESX_CLUSTER,
    ESX,
    IO_FILTER,
    IO_FILTER_CLUSTER,
    SYMMETRIX_ARRAY,
    SYMMETRIX_DIRECTOR,
    SCALE_IO,
    UNKNOWN;

    private SplitterType() {
    }

    public static SplitterType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


