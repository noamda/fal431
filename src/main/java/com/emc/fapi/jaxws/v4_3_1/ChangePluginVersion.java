package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changePluginVersion", propOrder = {"vcuid", "newVersion"})
public class ChangePluginVersion {
    protected VirtualCenterUID vcuid;
    protected String newVersion;

    public ChangePluginVersion() {
    }

    public ChangePluginVersion(VirtualCenterUID vcuid, String newVersion) {
        this.vcuid = vcuid;
        this.newVersion = newVersion;
    }


    public VirtualCenterUID getVcuid() {
        return this.vcuid;
    }


    public void setVcuid(VirtualCenterUID value) {
        this.vcuid = value;
    }


    public String getNewVersion() {
        return this.newVersion;
    }


    public void setNewVersion(String value) {
        this.newVersion = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ChangePluginVersion)) {
            return false;
        }
        ChangePluginVersion otherObj = (ChangePluginVersion) obj;

        return (this.vcuid != null ? this.vcuid.equals(otherObj.vcuid) : this.vcuid == otherObj.vcuid) && (this.newVersion != null ? this.newVersion.equals(otherObj.newVersion) : this.newVersion == otherObj.newVersion);
    }


    public int hashCode() {
        return (this.vcuid != null ? this.vcuid.hashCode() : 0) ^ (this.newVersion != null ? this.newVersion.hashCode() : 0);
    }


    public String toString() {
        return "ChangePluginVersion [vcuid=" + this.vcuid + ", " + "newVersion=" + this.newVersion + "]";
    }
}


