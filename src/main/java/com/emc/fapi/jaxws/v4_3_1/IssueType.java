package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "issueType")
@XmlEnum
public enum IssueType {
    ISCSI_SOFTWARE_ADAPTER,
    SPLITTER_CONNECTIVITY,
    PING_SPLITTER,
    VRPA_VNICS_CONFIGURATION,
    MULTI_BROADCAST_DOMAINS,
    RPA_ISCSI_IPS,
    UNKNOWN;

    private IssueType() {
    }

    public static IssueType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


