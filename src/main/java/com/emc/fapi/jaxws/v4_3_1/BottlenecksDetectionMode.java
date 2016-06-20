package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "bottlenecksDetectionMode")
@XmlEnum
public enum BottlenecksDetectionMode {
    SYSTEM_OVERVIEW_AND_BOTTLENECK_ANALYSIS,
    DETECTION_OF_INITIALIZATION_PERIODS,
    DETECTION_OF_HIGH_LOAD_PERIODS,
    GENERAL_DETECTION_INCLUDING_INITIALIZATION_AND_HIGH_LOAD_PERIODS_WITH_PEAK_WRITING_ANALYSIS,
    ADVANCED_AND_DETAILED_GENERAL_DETECTION,
    PEAK_WRITING_ANALYSIS,
    UNKNOWN;

    private BottlenecksDetectionMode() {
    }

    public static BottlenecksDetectionMode fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


