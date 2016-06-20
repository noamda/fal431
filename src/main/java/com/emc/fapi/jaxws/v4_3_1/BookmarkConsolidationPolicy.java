package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "bookmarkConsolidationPolicy")
@XmlEnum
public enum BookmarkConsolidationPolicy {
    ALWAYS_CONSOLIDATE,
    SURVIVE_DAILY,
    SURVIVE_WEEKLY,
    SURVIVE_MONTHLY,
    NEVER_CONSOLIDATE,
    UNKNOWN;

    private BookmarkConsolidationPolicy() {
    }

    public static BookmarkConsolidationPolicy fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


