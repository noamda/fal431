package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "vplexCredentialsType")
@XmlEnum
public enum VplexCredentialsType {
    VPLEX,
    VPLEX_IC,
    UNKNOWN;

    private VplexCredentialsType() {
    }

    public static VplexCredentialsType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


