package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "reportType")
@XmlEnum
public enum ReportType {
    ENABLE_IMAGE_ACCESS,
    DISABLE_IMAGE_ACCESS,
    ACCESS_ANOTHER_IMAGE,
    FAILOVER,
    RECOVER_PRODUCTION,
    RESUME_PRODUCTION,
    TEST_AND_PROMOTE,
    UNKNOWN;

    private ReportType() {
    }

    public static ReportType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


