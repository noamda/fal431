package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "specificImageAccessType")
@XmlEnum
public enum SpecificImageAccessType {
    NEXT,
    PREVIOUS,
    UNKNOWN;

    private SpecificImageAccessType() {
    }

    public static SpecificImageAccessType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


