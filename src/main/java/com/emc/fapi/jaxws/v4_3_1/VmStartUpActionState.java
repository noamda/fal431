package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmStartUpActionState", propOrder = {"vmActionUID", "vmStartUpStep"})
public class VmStartUpActionState {
    protected VmStartUpActionUID vmActionUID;
    protected BaseVmStartUpAction vmStartUpStep;

    public VmStartUpActionState() {
    }

    public VmStartUpActionState(VmStartUpActionUID vmActionUID, BaseVmStartUpAction vmStartUpStep) {
        this.vmActionUID = vmActionUID;
        this.vmStartUpStep = vmStartUpStep;
    }


    public VmStartUpActionUID getVmActionUID() {
        return this.vmActionUID;
    }


    public void setVmActionUID(VmStartUpActionUID value) {
        this.vmActionUID = value;
    }


    public BaseVmStartUpAction getVmStartUpStep() {
        return this.vmStartUpStep;
    }


    public void setVmStartUpStep(BaseVmStartUpAction value) {
        this.vmStartUpStep = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmStartUpActionState)) {
            return false;
        }
        VmStartUpActionState otherObj = (VmStartUpActionState) obj;

        return (this.vmActionUID != null ? this.vmActionUID.equals(otherObj.vmActionUID) : this.vmActionUID == otherObj.vmActionUID) && (this.vmStartUpStep != null ? this.vmStartUpStep.equals(otherObj.vmStartUpStep) : this.vmStartUpStep == otherObj.vmStartUpStep);
    }


    public int hashCode() {
        return (this.vmActionUID != null ? this.vmActionUID.hashCode() : 0) ^ (this.vmStartUpStep != null ? this.vmStartUpStep.hashCode() : 0);
    }


    public String toString() {
        return "VmStartUpActionState [vmActionUID=" + this.vmActionUID + ", " + "vmStartUpStep=" + this.vmStartUpStep + "]";
    }
}


