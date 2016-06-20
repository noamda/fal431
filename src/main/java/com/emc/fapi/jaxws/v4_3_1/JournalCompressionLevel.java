package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "journalCompressionLevel")
@XmlEnum
public enum JournalCompressionLevel {
    NONE,
    MEDIUM,
    HIGH,
    UNKNOWN;

    private JournalCompressionLevel() {
    }

    public static JournalCompressionLevel fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


