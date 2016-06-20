package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "singleSplitterProcessorName")
@XmlEnum
public enum SingleSplitterProcessorName {
    ESX,
    SP,
    DIRECTOR,
    UNKNOWN;

    private SingleSplitterProcessorName() {
    }

    public static SingleSplitterProcessorName fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


