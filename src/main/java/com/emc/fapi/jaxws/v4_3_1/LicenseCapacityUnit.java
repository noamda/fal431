package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "licenseCapacityUnit")
@XmlEnum
public enum LicenseCapacityUnit {
    TERA_BYTE,
    BYTE,
    BRICKS,
    VM,
    UNKNOWN;

    private LicenseCapacityUnit() {
    }

    public static LicenseCapacityUnit fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


