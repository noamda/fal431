package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "reportStatus")
@XmlEnum
public enum ReportStatus {
    IN_PROGRESS,
    COMPLETED,
    COMPLETED_WITH_FAILURES,
    ABORTED,
    INITIALIZING,
    UNKNOWN;

    private ReportStatus() {
    }

    public static ReportStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


