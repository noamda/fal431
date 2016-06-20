package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemSettings", propOrder = {"clustersSettings", "globalSystemConfiguration", "suppressAutoRegistrationWarning", "trialAllowed"})
public class SystemSettings {
    @XmlElement(nillable = true)
    protected List<ClusterSettings> clustersSettings;
    @XmlElement(nillable = true)
    protected GlobalSystemConfiguration globalSystemConfiguration;
    protected boolean suppressAutoRegistrationWarning;
    protected boolean trialAllowed;

    public SystemSettings() {
    }

    public SystemSettings(List<ClusterSettings> clustersSettings, GlobalSystemConfiguration globalSystemConfiguration, boolean suppressAutoRegistrationWarning, boolean trialAllowed) {
        this.clustersSettings = clustersSettings;
        this.globalSystemConfiguration = globalSystemConfiguration;
        this.suppressAutoRegistrationWarning = suppressAutoRegistrationWarning;
        this.trialAllowed = trialAllowed;
    }


    public List<ClusterSettings> getClustersSettings() {
        if (this.clustersSettings == null) {
            this.clustersSettings = new ArrayList();
        }
        return this.clustersSettings;
    }


    public GlobalSystemConfiguration getGlobalSystemConfiguration() {
        return this.globalSystemConfiguration;
    }


    public void setGlobalSystemConfiguration(GlobalSystemConfiguration value) {
        this.globalSystemConfiguration = value;
    }


    public boolean isSuppressAutoRegistrationWarning() {
        return this.suppressAutoRegistrationWarning;
    }


    public void setSuppressAutoRegistrationWarning(boolean value) {
        this.suppressAutoRegistrationWarning = value;
    }


    public boolean isTrialAllowed() {
        return this.trialAllowed;
    }


    public void setTrialAllowed(boolean value) {
        this.trialAllowed = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SystemSettings)) {
            return false;
        }
        SystemSettings otherObj = (SystemSettings) obj;

        return (this.clustersSettings != null ? this.clustersSettings.equals(otherObj.clustersSettings) : this.clustersSettings == otherObj.clustersSettings) && (this.globalSystemConfiguration != null ? this.globalSystemConfiguration.equals(otherObj.globalSystemConfiguration) : this.globalSystemConfiguration == otherObj.globalSystemConfiguration) && (this.suppressAutoRegistrationWarning == otherObj.suppressAutoRegistrationWarning) && (this.trialAllowed == otherObj.trialAllowed);
    }


    public int hashCode() {
        return (this.clustersSettings != null ? this.clustersSettings.hashCode() : 0) ^ (this.globalSystemConfiguration != null ? this.globalSystemConfiguration.hashCode() : 0) ^ (this.suppressAutoRegistrationWarning ? 1 : 0) ^ (this.trialAllowed ? 1 : 0);
    }


    public String toString() {
        return "SystemSettings [clustersSettings=" + this.clustersSettings + ", " + "globalSystemConfiguration=" + this.globalSystemConfiguration + ", " + "suppressAutoRegistrationWarning=" + this.suppressAutoRegistrationWarning + ", " + "trialAllowed=" + this.trialAllowed + "]";
    }
}


