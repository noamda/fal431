package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMPersistentReportInfo", propOrder = {"vmReportPowerUpStepInfoSet", "vmReportStepInfoSet"})
public class VMPersistentReportInfo {
    @XmlElement(nillable = true)
    protected List<VMReportPowerUpStepInfo> vmReportPowerUpStepInfoSet;
    @XmlElement(nillable = true)
    protected List<VMReportStepInfo> vmReportStepInfoSet;

    public VMPersistentReportInfo() {
    }

    public VMPersistentReportInfo(List<VMReportPowerUpStepInfo> vmReportPowerUpStepInfoSet, List<VMReportStepInfo> vmReportStepInfoSet) {
        this.vmReportPowerUpStepInfoSet = vmReportPowerUpStepInfoSet;
        this.vmReportStepInfoSet = vmReportStepInfoSet;
    }


    public List<VMReportPowerUpStepInfo> getVmReportPowerUpStepInfoSet() {
        if (this.vmReportPowerUpStepInfoSet == null) {
            this.vmReportPowerUpStepInfoSet = new ArrayList();
        }
        return this.vmReportPowerUpStepInfoSet;
    }


    public List<VMReportStepInfo> getVmReportStepInfoSet() {
        if (this.vmReportStepInfoSet == null) {
            this.vmReportStepInfoSet = new ArrayList();
        }
        return this.vmReportStepInfoSet;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VMPersistentReportInfo)) {
            return false;
        }
        VMPersistentReportInfo otherObj = (VMPersistentReportInfo) obj;

        return (this.vmReportPowerUpStepInfoSet != null ? this.vmReportPowerUpStepInfoSet.equals(otherObj.vmReportPowerUpStepInfoSet) : this.vmReportPowerUpStepInfoSet == otherObj.vmReportPowerUpStepInfoSet) && (this.vmReportStepInfoSet != null ? this.vmReportStepInfoSet.equals(otherObj.vmReportStepInfoSet) : this.vmReportStepInfoSet == otherObj.vmReportStepInfoSet);
    }


    public int hashCode() {
        return (this.vmReportPowerUpStepInfoSet != null ? this.vmReportPowerUpStepInfoSet.hashCode() : 0) ^ (this.vmReportStepInfoSet != null ? this.vmReportStepInfoSet.hashCode() : 0);
    }


    public String toString() {
        return "VMPersistentReportInfo [vmReportPowerUpStepInfoSet=" + this.vmReportPowerUpStepInfoSet + ", " + "vmReportStepInfoSet=" + this.vmReportStepInfoSet + "]";
    }
}


