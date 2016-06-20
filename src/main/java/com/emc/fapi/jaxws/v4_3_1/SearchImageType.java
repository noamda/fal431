package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "searchImageType")
@XmlEnum
public enum SearchImageType {
    ALL,
    ALL_BOOKMARKS,
    SYSTEM_BOOKMARKS,
    USER_BOOKMARKS,
    UNKNOWN;

    private SearchImageType() {
    }

    public static SearchImageType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


