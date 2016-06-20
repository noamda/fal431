package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "rpSupportedArrayCapability")
@XmlEnum
public enum RpSupportedArrayCapability {
    JVOL_AUTO_PROVISIONING,
    UVOL_AUTO_PROVISIONING,
    SNAPSHOT_SHIPPING,
    UNKNOWN;

    private RpSupportedArrayCapability() {
    }

    public static RpSupportedArrayCapability fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


