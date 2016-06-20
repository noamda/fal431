package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addVmsToCG", propOrder = {"vms", "cgUID"})
public class AddVmsToCG {
    protected List<VMReplicationSetParam> vms;
    protected ConsistencyGroupUID cgUID;

    public AddVmsToCG() {
    }

    public AddVmsToCG(List<VMReplicationSetParam> vms, ConsistencyGroupUID cgUID) {
        this.vms = vms;
        this.cgUID = cgUID;
    }


    public List<VMReplicationSetParam> getVms() {
        if (this.vms == null) {
            this.vms = new ArrayList();
        }
        return this.vms;
    }


    public ConsistencyGroupUID getCgUID() {
        return this.cgUID;
    }


    public void setCgUID(ConsistencyGroupUID value) {
        this.cgUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddVmsToCG)) {
            return false;
        }
        AddVmsToCG otherObj = (AddVmsToCG) obj;

        return (this.vms != null ? this.vms.equals(otherObj.vms) : this.vms == otherObj.vms) && (this.cgUID != null ? this.cgUID.equals(otherObj.cgUID) : this.cgUID == otherObj.cgUID);
    }


    public int hashCode() {
        return (this.vms != null ? this.vms.hashCode() : 0) ^ (this.cgUID != null ? this.cgUID.hashCode() : 0);
    }


    public String toString() {
        return "AddVmsToCG [vms=" + this.vms + ", " + "cgUID=" + this.cgUID + "]";
    }
}


