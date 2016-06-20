package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyslogSettings", propOrder = {"enabled", "facility", "sendEventFilters", "clustersHosts"})
public class SyslogSettings {
    protected boolean enabled;
    @XmlElement(required = true)
    protected SyslogFacility facility;
    @XmlElement(nillable = true)
    protected List<SystemEventLogsFilterUID> sendEventFilters;
    @XmlElement(nillable = true)
    protected List<ClusterSyslogHost> clustersHosts;

    public SyslogSettings() {
    }

    public SyslogSettings(boolean enabled, SyslogFacility facility, List<SystemEventLogsFilterUID> sendEventFilters, List<ClusterSyslogHost> clustersHosts) {
        this.enabled = enabled;
        this.facility = facility;
        this.sendEventFilters = sendEventFilters;
        this.clustersHosts = clustersHosts;
    }


    public boolean isEnabled() {
        return this.enabled;
    }


    public void setEnabled(boolean value) {
        this.enabled = value;
    }


    public SyslogFacility getFacility() {
        return this.facility;
    }


    public void setFacility(SyslogFacility value) {
        this.facility = value;
    }


    public List<SystemEventLogsFilterUID> getSendEventFilters() {
        if (this.sendEventFilters == null) {
            this.sendEventFilters = new ArrayList();
        }
        return this.sendEventFilters;
    }


    public List<ClusterSyslogHost> getClustersHosts() {
        if (this.clustersHosts == null) {
            this.clustersHosts = new ArrayList();
        }
        return this.clustersHosts;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SyslogSettings)) {
            return false;
        }
        SyslogSettings otherObj = (SyslogSettings) obj;

        return (this.enabled == otherObj.enabled) && (this.facility != null ? this.facility.equals(otherObj.facility) : this.facility == otherObj.facility) && (this.sendEventFilters != null ? this.sendEventFilters.equals(otherObj.sendEventFilters) : this.sendEventFilters == otherObj.sendEventFilters) && (this.clustersHosts != null ? this.clustersHosts.equals(otherObj.clustersHosts) : this.clustersHosts == otherObj.clustersHosts);
    }


    public int hashCode() {
        return (this.enabled ? 1 : 0) ^ (this.facility != null ? this.facility.hashCode() : 0) ^ (this.sendEventFilters != null ? this.sendEventFilters.hashCode() : 0) ^ (this.clustersHosts != null ? this.clustersHosts.hashCode() : 0);
    }


    public String toString() {
        return "SyslogSettings [enabled=" + this.enabled + ", " + "facility=" + this.facility + ", " + "sendEventFilters=" + this.sendEventFilters + ", " + "clustersHosts=" + this.clustersHosts + "]";
    }
}


