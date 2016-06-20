package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeVmsFromCG", propOrder = {"vms", "cgUID"})
public class RemoveVmsFromCG {
    protected List<VmUID> vms;
    protected ConsistencyGroupUID cgUID;

    public RemoveVmsFromCG() {
    }

    public RemoveVmsFromCG(List<VmUID> vms, ConsistencyGroupUID cgUID) {
        this.vms = vms;
        this.cgUID = cgUID;
    }


    public List<VmUID> getVms() {
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
        if (!(obj instanceof RemoveVmsFromCG)) {
            return false;
        }
        RemoveVmsFromCG otherObj = (RemoveVmsFromCG) obj;

        return (this.vms != null ? this.vms.equals(otherObj.vms) : this.vms == otherObj.vms) && (this.cgUID != null ? this.cgUID.equals(otherObj.cgUID) : this.cgUID == otherObj.cgUID);
    }


    public int hashCode() {
        return (this.vms != null ? this.vms.hashCode() : 0) ^ (this.cgUID != null ? this.cgUID.hashCode() : 0);
    }


    public String toString() {
        return "RemoveVmsFromCG [vms=" + this.vms + ", " + "cgUID=" + this.cgUID + "]";
    }
}


