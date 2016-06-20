package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "reportStepStatus")
@XmlEnum
public enum ReportStepStatus {
    IN_PROGRESS,
    COMPLETED,
    SKIPPED,
    FAILED,
    FAILED_TIMEOUT,
    COMPLETED_WITH_FAILURES,
    UNKNOWN,
    COMPLETED_FUTURE_USE_1,
    NOTCOMPLETED_FUTURE_USE_2;

    private ReportStepStatus() {
    }

    public static ReportStepStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


