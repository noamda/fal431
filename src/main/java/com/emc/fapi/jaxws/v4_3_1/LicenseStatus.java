package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "licenseStatus")
@XmlEnum
public enum LicenseStatus {
    ACTIVE,
    EXPIRED,
    INACTIVE,
    UNKNOWN;

    private LicenseStatus() {
    }

    public static LicenseStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


