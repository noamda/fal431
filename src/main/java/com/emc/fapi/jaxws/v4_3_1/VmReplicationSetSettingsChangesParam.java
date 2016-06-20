package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmReplicationSetSettingsChangesParam", propOrder = {"vmReplicationSetUID", "vmReplicationChanges"})
public class VmReplicationSetSettingsChangesParam {
    @XmlElement(required = true, nillable = true)
    protected VmReplicationSetUID vmReplicationSetUID;
    @XmlElement(required = true)
    protected List<VmReplicationSettingsChangesParam> vmReplicationChanges;

    public VmReplicationSetSettingsChangesParam() {
    }

    public VmReplicationSetSettingsChangesParam(VmReplicationSetUID vmReplicationSetUID, List<VmReplicationSettingsChangesParam> vmReplicationChanges) {
        this.vmReplicationSetUID = vmReplicationSetUID;
        this.vmReplicationChanges = vmReplicationChanges;
    }


    public VmReplicationSetUID getVmReplicationSetUID() {
        return this.vmReplicationSetUID;
    }


    public void setVmReplicationSetUID(VmReplicationSetUID value) {
        this.vmReplicationSetUID = value;
    }


    public List<VmReplicationSettingsChangesParam> getVmReplicationChanges() {
        if (this.vmReplicationChanges == null) {
            this.vmReplicationChanges = new ArrayList();
        }
        return this.vmReplicationChanges;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmReplicationSetSettingsChangesParam)) {
            return false;
        }
        VmReplicationSetSettingsChangesParam otherObj = (VmReplicationSetSettingsChangesParam) obj;

        return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.equals(otherObj.vmReplicationSetUID) : this.vmReplicationSetUID == otherObj.vmReplicationSetUID) && (this.vmReplicationChanges != null ? this.vmReplicationChanges.equals(otherObj.vmReplicationChanges) : this.vmReplicationChanges == otherObj.vmReplicationChanges);
    }


    public int hashCode() {
        return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.hashCode() : 0) ^ (this.vmReplicationChanges != null ? this.vmReplicationChanges.hashCode() : 0);
    }


    public String toString() {
        return "VmReplicationSetSettingsChangesParam [vmReplicationSetUID=" + this.vmReplicationSetUID + ", " + "vmReplicationChanges=" + this.vmReplicationChanges + "]";
    }
}


