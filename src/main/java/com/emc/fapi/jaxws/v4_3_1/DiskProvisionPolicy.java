package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "diskProvisionPolicy")
@XmlEnum
public enum DiskProvisionPolicy {
    SAME_AS_SOURCE,
    AS_THICK,
    AS_THIN;

    private DiskProvisionPolicy() {
    }

    public static DiskProvisionPolicy fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


