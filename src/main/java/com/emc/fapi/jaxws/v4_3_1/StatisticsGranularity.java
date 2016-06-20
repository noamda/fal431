package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "statisticsGranularity")
@XmlEnum
public enum StatisticsGranularity {
    MINUTES,
    HOURS,
    DAYS,
    UNKNOWN;

    private StatisticsGranularity() {
    }

    public static StatisticsGranularity fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


