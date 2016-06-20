package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualInfrastructuresState", propOrder = {"vmsState"})
public class VirtualInfrastructuresState {
    @XmlElement(nillable = true)
    protected List<VmState> vmsState;

    public VirtualInfrastructuresState() {
    }

    public VirtualInfrastructuresState(List<VmState> vmsState) {
        this.vmsState = vmsState;
    }


    public List<VmState> getVmsState() {
        if (this.vmsState == null) {
            this.vmsState = new ArrayList();
        }
        return this.vmsState;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualInfrastructuresState)) {
            return false;
        }
        VirtualInfrastructuresState otherObj = (VirtualInfrastructuresState) obj;

        return this.vmsState == otherObj.vmsState ? true : this.vmsState != null ? this.vmsState.equals(otherObj.vmsState) : false;
    }


    public int hashCode() {
        return this.vmsState != null ? this.vmsState.hashCode() : 0;
    }


    public String toString() {
        return "VirtualInfrastructuresState [vmsState=" + this.vmsState + "]";
    }
}


