package com.emc.fal431.wrappers;

import com.emc.fal431.commons.VMReplicationSetParam;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "vmReplicationSetParamSet",
    propOrder = {"innerSet"}
)
public class VmReplicationSetParamSet {
    @XmlElement(
        nillable = true
    )
    protected List<VMReplicationSetParam> innerSet;

    public VmReplicationSetParamSet() {
    }

    public VmReplicationSetParamSet(List<VMReplicationSetParam> innerSet) {
        this.innerSet = innerSet;
    }

    public List<VMReplicationSetParam> getInnerSet() {
        if(this.innerSet == null) {
            this.innerSet = new ArrayList();
        }

        return this.innerSet;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof VmReplicationSetParamSet)) {
            return false;
        } else {
            VmReplicationSetParamSet otherObj = (VmReplicationSetParamSet)obj;
            return this.innerSet != null?this.innerSet.equals(otherObj.innerSet):this.innerSet == otherObj.innerSet;
        }
    }

    public int hashCode() {
        return this.innerSet != null?this.innerSet.hashCode():0;
    }

    public String toString() {
        return "VmReplicationSetParamSet [innerSet=" + this.innerSet + "]";
    }
}
