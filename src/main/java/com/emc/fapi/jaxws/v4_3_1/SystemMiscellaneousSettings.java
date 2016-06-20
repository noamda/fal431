package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemMiscellaneousSettings", propOrder = {"useAutomaticSplitterInfoCollection", "securityLevel", "rpasMultipathMonitoring"})
public class SystemMiscellaneousSettings {
    protected boolean useAutomaticSplitterInfoCollection;
    @XmlElement(required = true)
    protected SystemSecurityLevel securityLevel;
    @XmlElement(required = true)
    protected List<ClusterRPAMultipathMonitoring> rpasMultipathMonitoring;

    public SystemMiscellaneousSettings() {
    }

    public SystemMiscellaneousSettings(boolean useAutomaticSplitterInfoCollection, SystemSecurityLevel securityLevel, List<ClusterRPAMultipathMonitoring> rpasMultipathMonitoring) {
        this.useAutomaticSplitterInfoCollection = useAutomaticSplitterInfoCollection;
        this.securityLevel = securityLevel;
        this.rpasMultipathMonitoring = rpasMultipathMonitoring;
    }


    public boolean isUseAutomaticSplitterInfoCollection() {
        return this.useAutomaticSplitterInfoCollection;
    }


    public void setUseAutomaticSplitterInfoCollection(boolean value) {
        this.useAutomaticSplitterInfoCollection = value;
    }


    public SystemSecurityLevel getSecurityLevel() {
        return this.securityLevel;
    }


    public void setSecurityLevel(SystemSecurityLevel value) {
        this.securityLevel = value;
    }


    public List<ClusterRPAMultipathMonitoring> getRpasMultipathMonitoring() {
        if (this.rpasMultipathMonitoring == null) {
            this.rpasMultipathMonitoring = new ArrayList();
        }
        return this.rpasMultipathMonitoring;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SystemMiscellaneousSettings)) {
            return false;
        }
        SystemMiscellaneousSettings otherObj = (SystemMiscellaneousSettings) obj;

        return (this.useAutomaticSplitterInfoCollection == otherObj.useAutomaticSplitterInfoCollection) && (this.securityLevel != null ? this.securityLevel.equals(otherObj.securityLevel) : this.securityLevel == otherObj.securityLevel) && (this.rpasMultipathMonitoring != null ? this.rpasMultipathMonitoring.equals(otherObj.rpasMultipathMonitoring) : this.rpasMultipathMonitoring == otherObj.rpasMultipathMonitoring);
    }


    public int hashCode() {
        return (this.useAutomaticSplitterInfoCollection ? 1 : 0) ^ (this.securityLevel != null ? this.securityLevel.hashCode() : 0) ^ (this.rpasMultipathMonitoring != null ? this.rpasMultipathMonitoring.hashCode() : 0);
    }


    public String toString() {
        return "SystemMiscellaneousSettings [useAutomaticSplitterInfoCollection=" + this.useAutomaticSplitterInfoCollection + ", " + "securityLevel=" + this.securityLevel + ", " + "rpasMultipathMonitoring=" + this.rpasMultipathMonitoring + "]";
    }
}


