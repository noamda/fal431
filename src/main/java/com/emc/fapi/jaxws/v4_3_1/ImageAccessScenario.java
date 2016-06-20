package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "imageAccessScenario")
@XmlEnum
public enum ImageAccessScenario {
    NONE,
    FAILOVER,
    TEMPORARY_FAILOVER,
    RECOVER_PRODUCTION,
    TEST_REPLICA,
    RESUME_PRODUCTION,
    UNKNOWN;

    private ImageAccessScenario() {
    }

    public static ImageAccessScenario fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


