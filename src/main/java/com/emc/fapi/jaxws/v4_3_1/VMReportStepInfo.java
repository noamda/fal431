package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMReportStepInfo", propOrder = {"vmUid", "vmName", "priority", "critical"})
public class VMReportStepInfo {
    @XmlElement(nillable = true)
    protected VmUID vmUid;
    protected String vmName;
    protected Integer priority;
    protected Boolean critical;

    public VMReportStepInfo() {
    }

    public VMReportStepInfo(VmUID vmUid, String vmName, Integer priority, Boolean critical) {
        this.vmUid = vmUid;
        this.vmName = vmName;
        this.priority = priority;
        this.critical = critical;
    }


    public VmUID getVmUid() {
        return this.vmUid;
    }


    public void setVmUid(VmUID value) {
        this.vmUid = value;
    }


    public String getVmName() {
        return this.vmName;
    }


    public void setVmName(String value) {
        this.vmName = value;
    }


    public Integer getPriority() {
        return this.priority;
    }


    public void setPriority(Integer value) {
        this.priority = value;
    }


    public Boolean isCritical() {
        return this.critical;
    }


    public void setCritical(Boolean value) {
        this.critical = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VMReportStepInfo)) {
            return false;
        }
        VMReportStepInfo otherObj = (VMReportStepInfo) obj;

        return (this.vmUid != null ? this.vmUid.equals(otherObj.vmUid) : this.vmUid == otherObj.vmUid) && (this.vmName != null ? this.vmName.equals(otherObj.vmName) : this.vmName == otherObj.vmName) && (this.priority != null ? this.priority.equals(otherObj.priority) : this.priority == otherObj.priority) && (this.critical != null ? this.critical.equals(otherObj.critical) : this.critical == otherObj.critical);
    }


    public int hashCode() {
        return (this.vmUid != null ? this.vmUid.hashCode() : 0) ^ (this.vmName != null ? this.vmName.hashCode() : 0) ^ (this.priority != null ? this.priority.hashCode() : 0) ^ (this.critical != null ? this.critical.hashCode() : 0);
    }


    public String toString() {
        return "VMReportStepInfo [vmUid=" + this.vmUid + ", " + "vmName=" + this.vmName + ", " + "priority=" + this.priority + ", " + "critical=" + this.critical + "]";
    }
}


