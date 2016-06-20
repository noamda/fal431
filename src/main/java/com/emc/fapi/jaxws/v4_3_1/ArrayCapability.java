package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "arrayCapability")
@XmlEnum
public enum ArrayCapability {
    DISCOVERY,
    DEVICE_MANAGEMENT,
    INITIATOR_MANAGEMENT,
    CONSISTENT_SNAPSHOT,
    EXTENDED_DEVICE_MANAGEMENT,
    FAKE_SIZE,
    JOURNAL_VOLUME_PROVISIONING,
    USER_VOLUME_PROVISIONING,
    RESOURCE_POOL_REGISTRATION,
    UNKNOWN;

    private ArrayCapability() {
    }

    public static ArrayCapability fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


