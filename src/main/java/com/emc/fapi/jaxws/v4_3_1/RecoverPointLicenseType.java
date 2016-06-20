package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "recoverPointLicenseType")
@XmlEnum
public enum RecoverPointLicenseType {
    SE,
    EX,
    CL,
    VE,
    VC,
    UNKNOWN;

    private RecoverPointLicenseType() {
    }

    public static RecoverPointLicenseType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


