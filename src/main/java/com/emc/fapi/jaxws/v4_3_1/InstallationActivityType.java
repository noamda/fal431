package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "installationActivityType")
@XmlEnum
public enum InstallationActivityType {
    NEW_INSTALL,
    SOFTWARE_UPGRADE,
    HARDWARE_UPGRADE,
    RE_INSTALL,
    GENERAL_UPDATE,
    UNKNOWN;

    private InstallationActivityType() {
    }

    public static InstallationActivityType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


