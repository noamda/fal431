package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "installationPerformingResource")
@XmlEnum
public enum InstallationPerformingResource {
    CUSTOMER,
    EMC_EMPLOYEE,
    EMC_PARTNER,
    UNKNOWN;

    private InstallationPerformingResource() {
    }

    public static InstallationPerformingResource fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


