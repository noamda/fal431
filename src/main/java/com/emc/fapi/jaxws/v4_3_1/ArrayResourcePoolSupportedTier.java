package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "arrayResourcePoolSupportedTier")
@XmlEnum
public enum ArrayResourcePoolSupportedTier {
    FC,
    SSD,
    SATA,
    FAST,
    UNKNOWN;

    private ArrayResourcePoolSupportedTier() {
    }

    public static ArrayResourcePoolSupportedTier fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


