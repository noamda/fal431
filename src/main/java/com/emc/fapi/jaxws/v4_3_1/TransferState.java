package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "transferState")
@XmlEnum
public enum TransferState {
    ACTIVE,
    ERROR,
    INIT,
    PAUSED,
    DISABLED,
    OTHER;

    private TransferState() {
    }

    public static TransferState fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


