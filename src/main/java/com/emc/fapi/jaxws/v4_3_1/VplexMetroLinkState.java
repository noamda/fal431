package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "vplexMetroLinkState")
@XmlEnum
public enum VplexMetroLinkState {
    CONNECTED,
    FRACTURED,
    UNKNOWN;

    private VplexMetroLinkState() {
    }

    public static VplexMetroLinkState fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


