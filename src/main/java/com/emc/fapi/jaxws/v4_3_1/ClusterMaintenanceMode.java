package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "clusterMaintenanceMode")
@XmlEnum
public enum ClusterMaintenanceMode {
    NONE,
    MINOR_UPGRADE,
    MAJOR_UPGRADE,
    HW_REPLACEMENT,
    CLUSTER_UPGRADE,
    REPOSITORY_CHANGE,
    RPSE_CONVERSION,
    SYSTEM_MODIFICATION,
    USER_INITIATED_MAINTENANCE_MODE,
    CLUSTER_CONNECTION,
    UNKNOWN;

    private ClusterMaintenanceMode() {
    }

    public static ClusterMaintenanceMode fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}


