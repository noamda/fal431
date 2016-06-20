package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phoenixClusterStateSet", propOrder = {"innerSet"})
public class PhoenixClusterStateSet {
    @XmlElement(nillable = true)
    protected List<PhoenixClusterState> innerSet;

    public PhoenixClusterStateSet() {
    }

    public PhoenixClusterStateSet(List<PhoenixClusterState> innerSet) {
        this.innerSet = innerSet;
    }


    public List<PhoenixClusterState> getInnerSet() {
        if (this.innerSet == null) {
            this.innerSet = new ArrayList();
        }
        return this.innerSet;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof PhoenixClusterStateSet)) {
            return false;
        }
        PhoenixClusterStateSet otherObj = (PhoenixClusterStateSet) obj;

        return this.innerSet == otherObj.innerSet ? true : this.innerSet != null ? this.innerSet.equals(otherObj.innerSet) : false;
    }


    public int hashCode() {
        return this.innerSet != null ? this.innerSet.hashCode() : 0;
    }


    public String toString() {
        return "PhoenixClusterStateSet [innerSet=" + this.innerSet + "]";
    }
}


