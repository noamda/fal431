package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "vplexVolumeLocality")
@XmlEnum
public enum VplexVolumeLocality {
    LOCAL,
    METRO_DR1,
    GEO,
    REMOTE_EXPORTED,
    UNKNOWN;

    private VplexVolumeLocality() {
    }

    public static VplexVolumeLocality fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


