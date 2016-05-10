
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monitoredParameterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="monitoredParameterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NumberOfGroups"/>
 *     &lt;enumeration value="NumberOfTransferringGroups"/>
 *     &lt;enumeration value="NumberOfReplicatingSets"/>
 *     &lt;enumeration value="NumberOfSplittingHosts"/>
 *     &lt;enumeration value="NumberOfClariionHosts"/>
 *     &lt;enumeration value="DaysLicenseLeft"/>
 *     &lt;enumeration value="LocalReplicatedArray"/>
 *     &lt;enumeration value="RemoteReplicatedArray"/>
 *     &lt;enumeration value="LocalReplicatedCluster"/>
 *     &lt;enumeration value="RemoteReplicatedCluster"/>
 *     &lt;enumeration value="NumberOfGridGroups"/>
 *     &lt;enumeration value="LagTransaction"/>
 *     &lt;enumeration value="LagTime"/>
 *     &lt;enumeration value="LagData"/>
 *     &lt;enumeration value="PauseJournalTSPUsage"/>
 *     &lt;enumeration value="PauseVirtualMemoryUsage"/>
 *     &lt;enumeration value="NumberOfSplitterClusters"/>
 *     &lt;enumeration value="TotalNumberOfSplitterLUNs"/>
 *     &lt;enumeration value="SymmetrixProtectedVolumes"/>
 *     &lt;enumeration value="NumberOfVplexHosts"/>
 *     &lt;enumeration value="NumberOfVplexDirectors"/>
 *     &lt;enumeration value="NumberOfSymmetrixHosts"/>
 *     &lt;enumeration value="SymmetrixSessions"/>
 *     &lt;enumeration value="NumberOfWLPS"/>
 *     &lt;enumeration value="NumberOfGUIDS"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "monitoredParameterType")
@XmlEnum
public enum MonitoredParameterType {

    @XmlEnumValue("NumberOfGroups")
    NUMBER_OF_GROUPS("NumberOfGroups"),
    @XmlEnumValue("NumberOfTransferringGroups")
    NUMBER_OF_TRANSFERRING_GROUPS("NumberOfTransferringGroups"),
    @XmlEnumValue("NumberOfReplicatingSets")
    NUMBER_OF_REPLICATING_SETS("NumberOfReplicatingSets"),
    @XmlEnumValue("NumberOfSplittingHosts")
    NUMBER_OF_SPLITTING_HOSTS("NumberOfSplittingHosts"),
    @XmlEnumValue("NumberOfClariionHosts")
    NUMBER_OF_CLARIION_HOSTS("NumberOfClariionHosts"),
    @XmlEnumValue("DaysLicenseLeft")
    DAYS_LICENSE_LEFT("DaysLicenseLeft"),
    @XmlEnumValue("LocalReplicatedArray")
    LOCAL_REPLICATED_ARRAY("LocalReplicatedArray"),
    @XmlEnumValue("RemoteReplicatedArray")
    REMOTE_REPLICATED_ARRAY("RemoteReplicatedArray"),
    @XmlEnumValue("LocalReplicatedCluster")
    LOCAL_REPLICATED_CLUSTER("LocalReplicatedCluster"),
    @XmlEnumValue("RemoteReplicatedCluster")
    REMOTE_REPLICATED_CLUSTER("RemoteReplicatedCluster"),
    @XmlEnumValue("NumberOfGridGroups")
    NUMBER_OF_GRID_GROUPS("NumberOfGridGroups"),
    @XmlEnumValue("LagTransaction")
    LAG_TRANSACTION("LagTransaction"),
    @XmlEnumValue("LagTime")
    LAG_TIME("LagTime"),
    @XmlEnumValue("LagData")
    LAG_DATA("LagData"),
    @XmlEnumValue("PauseJournalTSPUsage")
    PAUSE_JOURNAL_TSP_USAGE("PauseJournalTSPUsage"),
    @XmlEnumValue("PauseVirtualMemoryUsage")
    PAUSE_VIRTUAL_MEMORY_USAGE("PauseVirtualMemoryUsage"),
    @XmlEnumValue("NumberOfSplitterClusters")
    NUMBER_OF_SPLITTER_CLUSTERS("NumberOfSplitterClusters"),
    @XmlEnumValue("TotalNumberOfSplitterLUNs")
    TOTAL_NUMBER_OF_SPLITTER_LU_NS("TotalNumberOfSplitterLUNs"),
    @XmlEnumValue("SymmetrixProtectedVolumes")
    SYMMETRIX_PROTECTED_VOLUMES("SymmetrixProtectedVolumes"),
    @XmlEnumValue("NumberOfVplexHosts")
    NUMBER_OF_VPLEX_HOSTS("NumberOfVplexHosts"),
    @XmlEnumValue("NumberOfVplexDirectors")
    NUMBER_OF_VPLEX_DIRECTORS("NumberOfVplexDirectors"),
    @XmlEnumValue("NumberOfSymmetrixHosts")
    NUMBER_OF_SYMMETRIX_HOSTS("NumberOfSymmetrixHosts"),
    @XmlEnumValue("SymmetrixSessions")
    SYMMETRIX_SESSIONS("SymmetrixSessions"),
    @XmlEnumValue("NumberOfWLPS")
    NUMBER_OF_WLPS("NumberOfWLPS"),
    @XmlEnumValue("NumberOfGUIDS")
    NUMBER_OF_GUIDS("NumberOfGUIDS"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    MonitoredParameterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonitoredParameterType fromValue(String v) {
        for (MonitoredParameterType c: MonitoredParameterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
