package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "configParamType")
@XmlEnum
public enum ConfigParamType {
    IP,
    STRING,
    PASSWORD,
    INTEGER,
    UNKNOWN;

    private ConfigParamType() {
    }

    public static ConfigParamType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


