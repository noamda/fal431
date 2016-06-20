package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dismissVmStartUpPrompts", propOrder = {"groupCopy", "actionUIDs"})
public class DismissVmStartUpPrompts {
    protected ConsistencyGroupCopyUID groupCopy;
    protected List<VmStartUpActionUID> actionUIDs;

    public DismissVmStartUpPrompts() {
    }

    public DismissVmStartUpPrompts(ConsistencyGroupCopyUID groupCopy, List<VmStartUpActionUID> actionUIDs) {
        this.groupCopy = groupCopy;
        this.actionUIDs = actionUIDs;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public List<VmStartUpActionUID> getActionUIDs() {
        if (this.actionUIDs == null) {
            this.actionUIDs = new ArrayList();
        }
        return this.actionUIDs;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DismissVmStartUpPrompts)) {
            return false;
        }
        DismissVmStartUpPrompts otherObj = (DismissVmStartUpPrompts) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.actionUIDs != null ? this.actionUIDs.equals(otherObj.actionUIDs) : this.actionUIDs == otherObj.actionUIDs);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.actionUIDs != null ? this.actionUIDs.hashCode() : 0);
    }


    public String toString() {
        return "DismissVmStartUpPrompts [groupCopy=" + this.groupCopy + ", " + "actionUIDs=" + this.actionUIDs + "]";
    }
}


