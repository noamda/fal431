package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "arrayManagementProviderType")
@XmlEnum
public enum ArrayManagementProviderType {
    NAVISECCLI,
    XTREMIO,
    VC,
    VPLEX,
    SMIS,
    SCALEIO,
    UNKNOWN;

    private ArrayManagementProviderType() {
    }

    public static ArrayManagementProviderType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


