
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clusterMaintenanceMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="clusterMaintenanceMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="MinorUpgrade"/>
 *     &lt;enumeration value="MajorUpgrade"/>
 *     &lt;enumeration value="HWReplacement"/>
 *     &lt;enumeration value="ClusterUpgrade"/>
 *     &lt;enumeration value="RepositoryChange"/>
 *     &lt;enumeration value="RPSEConversion"/>
 *     &lt;enumeration value="SystemModification"/>
 *     &lt;enumeration value="UserInitiatedMaintenanceMode"/>
 *     &lt;enumeration value="ClusterConnection"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clusterMaintenanceMode")
@XmlEnum
public enum ClusterMaintenanceMode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("MinorUpgrade")
    MINOR_UPGRADE("MinorUpgrade"),
    @XmlEnumValue("MajorUpgrade")
    MAJOR_UPGRADE("MajorUpgrade"),
    @XmlEnumValue("HWReplacement")
    HW_REPLACEMENT("HWReplacement"),
    @XmlEnumValue("ClusterUpgrade")
    CLUSTER_UPGRADE("ClusterUpgrade"),
    @XmlEnumValue("RepositoryChange")
    REPOSITORY_CHANGE("RepositoryChange"),
    @XmlEnumValue("RPSEConversion")
    RPSE_CONVERSION("RPSEConversion"),
    @XmlEnumValue("SystemModification")
    SYSTEM_MODIFICATION("SystemModification"),
    @XmlEnumValue("UserInitiatedMaintenanceMode")
    USER_INITIATED_MAINTENANCE_MODE("UserInitiatedMaintenanceMode"),
    @XmlEnumValue("ClusterConnection")
    CLUSTER_CONNECTION("ClusterConnection"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ClusterMaintenanceMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClusterMaintenanceMode fromValue(String v) {
        for (ClusterMaintenanceMode c: ClusterMaintenanceMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
