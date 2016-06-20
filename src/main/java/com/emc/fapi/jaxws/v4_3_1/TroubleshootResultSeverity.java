package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "troubleshootResultSeverity")
@XmlEnum
public enum TroubleshootResultSeverity {
    SUCCESS,
    INFO,
    WARNING,
    ERROR;

    private TroubleshootResultSeverity() {
    }

    public static TroubleshootResultSeverity fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


