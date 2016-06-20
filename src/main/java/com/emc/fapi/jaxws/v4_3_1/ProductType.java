package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "productType")
@XmlEnum
public enum ProductType {
    CLASSIC,
    RPSE,
    UNKNOWN;

    private ProductType() {
    }

    public static ProductType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


