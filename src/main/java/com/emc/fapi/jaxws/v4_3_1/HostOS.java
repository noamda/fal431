package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "hostOS")
@XmlEnum
public enum HostOS {
    AIX,
    HPUX,
    LINUX_2_4,
    LINUX_2_6,
    SOLARIS,
    VMWARE_ESX,
    VMWARE_ESX_WINDOWS,
    WINDOWS,
    OTHER_MIXED,
    UNKNOWN;

    private HostOS() {
    }

    public static HostOS fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


