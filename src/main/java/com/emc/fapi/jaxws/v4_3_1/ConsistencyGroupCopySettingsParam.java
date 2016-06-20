package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopySettingsParam", propOrder = {"groupCopy", "groupLinksSettings", "transferEnabled", "productionCopy", "copyPolicy", "copyName", "enabled"})
public class ConsistencyGroupCopySettingsParam {
    @XmlElement(required = true)
    protected ConsistencyGroupCopyUID groupCopy;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupLinkSettings> groupLinksSettings;
    protected boolean transferEnabled;
    protected boolean productionCopy;
    protected ConsistencyGroupCopyPolicy copyPolicy;
    @XmlElement(required = true)
    protected String copyName;
    protected boolean enabled;

    public ConsistencyGroupCopySettingsParam() {
    }

    public ConsistencyGroupCopySettingsParam(ConsistencyGroupCopyUID groupCopy, List<ConsistencyGroupLinkSettings> groupLinksSettings, boolean transferEnabled, boolean productionCopy, ConsistencyGroupCopyPolicy copyPolicy, String copyName, boolean enabled) {
        this.groupCopy = groupCopy;
        this.groupLinksSettings = groupLinksSettings;
        this.transferEnabled = transferEnabled;
        this.productionCopy = productionCopy;
        this.copyPolicy = copyPolicy;
        this.copyName = copyName;
        this.enabled = enabled;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public List<ConsistencyGroupLinkSettings> getGroupLinksSettings() {
        if (this.groupLinksSettings == null) {
            this.groupLinksSettings = new ArrayList();
        }
        return this.groupLinksSettings;
    }


    public boolean isTransferEnabled() {
        return this.transferEnabled;
    }


    public void setTransferEnabled(boolean value) {
        this.transferEnabled = value;
    }


    public boolean isProductionCopy() {
        return this.productionCopy;
    }


    public void setProductionCopy(boolean value) {
        this.productionCopy = value;
    }


    public ConsistencyGroupCopyPolicy getCopyPolicy() {
        return this.copyPolicy;
    }


    public void setCopyPolicy(ConsistencyGroupCopyPolicy value) {
        this.copyPolicy = value;
    }


    public String getCopyName() {
        return this.copyName;
    }


    public void setCopyName(String value) {
        this.copyName = value;
    }


    public boolean isEnabled() {
        return this.enabled;
    }


    public void setEnabled(boolean value) {
        this.enabled = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopySettingsParam)) {
            return false;
        }
        ConsistencyGroupCopySettingsParam otherObj = (ConsistencyGroupCopySettingsParam) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.groupLinksSettings != null ? this.groupLinksSettings.equals(otherObj.groupLinksSettings) : this.groupLinksSettings == otherObj.groupLinksSettings) && (this.transferEnabled == otherObj.transferEnabled) && (this.productionCopy == otherObj.productionCopy) && (this.copyPolicy != null ? this.copyPolicy.equals(otherObj.copyPolicy) : this.copyPolicy == otherObj.copyPolicy) && (this.copyName != null ? this.copyName.equals(otherObj.copyName) : this.copyName == otherObj.copyName) && (this.enabled == otherObj.enabled);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.groupLinksSettings != null ? this.groupLinksSettings.hashCode() : 0) ^ (this.transferEnabled ? 1 : 0) ^ (this.productionCopy ? 1 : 0) ^ (this.copyPolicy != null ? this.copyPolicy.hashCode() : 0) ^ (this.copyName != null ? this.copyName.hashCode() : 0) ^ (this.enabled ? 1 : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopySettingsParam [groupCopy=" + this.groupCopy + ", " + "groupLinksSettings=" + this.groupLinksSettings + ", " + "transferEnabled=" + this.transferEnabled + ", " + "productionCopy=" + this.productionCopy + ", " + "copyPolicy=" + this.copyPolicy + ", " + "copyName=" + this.copyName + ", " + "enabled=" + this.enabled + "]";
    }
}


