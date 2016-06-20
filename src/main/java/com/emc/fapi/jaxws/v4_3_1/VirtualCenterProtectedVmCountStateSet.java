package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "virtualCenterProtectedVmCountStateSet", propOrder = {"innerSet"})
public class VirtualCenterProtectedVmCountStateSet {
    @XmlElement(nillable = true)
    protected List<VirtualCenterProtectedVmCountState> innerSet;

    public VirtualCenterProtectedVmCountStateSet() {
    }

    public VirtualCenterProtectedVmCountStateSet(List<VirtualCenterProtectedVmCountState> innerSet) {
        this.innerSet = innerSet;
    }


    public List<VirtualCenterProtectedVmCountState> getInnerSet() {
        if (this.innerSet == null) {
            this.innerSet = new ArrayList();
        }
        return this.innerSet;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualCenterProtectedVmCountStateSet)) {
            return false;
        }
        VirtualCenterProtectedVmCountStateSet otherObj = (VirtualCenterProtectedVmCountStateSet) obj;

        return this.innerSet == otherObj.innerSet ? true : this.innerSet != null ? this.innerSet.equals(otherObj.innerSet) : false;
    }


    public int hashCode() {
        return this.innerSet != null ? this.innerSet.hashCode() : 0;
    }


    public String toString() {
        return "VirtualCenterProtectedVmCountStateSet [innerSet=" + this.innerSet + "]";
    }
}


