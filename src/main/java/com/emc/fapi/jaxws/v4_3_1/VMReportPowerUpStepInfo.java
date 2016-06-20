package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMReportPowerUpStepInfo", propOrder = {"vmStartUpActionUID", "title"})
public class VMReportPowerUpStepInfo {
    @XmlElement(nillable = true)
    protected VmStartUpActionUID vmStartUpActionUID;
    protected String title;

    public VMReportPowerUpStepInfo() {
    }

    public VMReportPowerUpStepInfo(VmStartUpActionUID vmStartUpActionUID, String title) {
        this.vmStartUpActionUID = vmStartUpActionUID;
        this.title = title;
    }


    public VmStartUpActionUID getVmStartUpActionUID() {
        return this.vmStartUpActionUID;
    }


    public void setVmStartUpActionUID(VmStartUpActionUID value) {
        this.vmStartUpActionUID = value;
    }


    public String getTitle() {
        return this.title;
    }


    public void setTitle(String value) {
        this.title = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VMReportPowerUpStepInfo)) {
            return false;
        }
        VMReportPowerUpStepInfo otherObj = (VMReportPowerUpStepInfo) obj;

        return (this.vmStartUpActionUID != null ? this.vmStartUpActionUID.equals(otherObj.vmStartUpActionUID) : this.vmStartUpActionUID == otherObj.vmStartUpActionUID) && (this.title != null ? this.title.equals(otherObj.title) : this.title == otherObj.title);
    }


    public int hashCode() {
        return (this.vmStartUpActionUID != null ? this.vmStartUpActionUID.hashCode() : 0) ^ (this.title != null ? this.title.hashCode() : 0);
    }


    public String toString() {
        return "VMReportPowerUpStepInfo [vmStartUpActionUID=" + this.vmStartUpActionUID + ", " + "title=" + this.title + "]";
    }
}


