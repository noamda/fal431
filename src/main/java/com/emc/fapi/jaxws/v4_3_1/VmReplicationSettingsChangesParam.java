package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmReplicationSettingsChangesParam", propOrder = {"copyUID", "vmParam"})
public class VmReplicationSettingsChangesParam {
    @XmlElement(required = true)
    protected ConsistencyGroupCopyUID copyUID;
    @XmlElement(required = true, nillable = true)
    protected VMParam vmParam;

    public VmReplicationSettingsChangesParam() {
    }

    public VmReplicationSettingsChangesParam(ConsistencyGroupCopyUID copyUID, VMParam vmParam) {
        this.copyUID = copyUID;
        this.vmParam = vmParam;
    }


    public ConsistencyGroupCopyUID getCopyUID() {
        return this.copyUID;
    }


    public void setCopyUID(ConsistencyGroupCopyUID value) {
        this.copyUID = value;
    }


    public VMParam getVmParam() {
        return this.vmParam;
    }


    public void setVmParam(VMParam value) {
        this.vmParam = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmReplicationSettingsChangesParam)) {
            return false;
        }
        VmReplicationSettingsChangesParam otherObj = (VmReplicationSettingsChangesParam) obj;

        return (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.vmParam != null ? this.vmParam.equals(otherObj.vmParam) : this.vmParam == otherObj.vmParam);
    }


    public int hashCode() {
        return (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.vmParam != null ? this.vmParam.hashCode() : 0);
    }


    public String toString() {
        return "VmReplicationSettingsChangesParam [copyUID=" + this.copyUID + ", " + "vmParam=" + this.vmParam + "]";
    }
}


