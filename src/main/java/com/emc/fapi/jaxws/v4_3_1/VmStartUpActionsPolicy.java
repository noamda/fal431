package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmStartUpActionsPolicy", propOrder = {"prePowerUpActions", "postPowerUpActions"})
public class VmStartUpActionsPolicy {
    @XmlElement(required = true)
    protected List<BaseVmStartUpAction> prePowerUpActions;
    @XmlElement(required = true)
    protected List<BaseVmStartUpAction> postPowerUpActions;

    public VmStartUpActionsPolicy() {
    }

    public VmStartUpActionsPolicy(List<BaseVmStartUpAction> prePowerUpActions, List<BaseVmStartUpAction> postPowerUpActions) {
        this.prePowerUpActions = prePowerUpActions;
        this.postPowerUpActions = postPowerUpActions;
    }


    public List<BaseVmStartUpAction> getPrePowerUpActions() {
        if (this.prePowerUpActions == null) {
            this.prePowerUpActions = new ArrayList();
        }
        return this.prePowerUpActions;
    }


    public List<BaseVmStartUpAction> getPostPowerUpActions() {
        if (this.postPowerUpActions == null) {
            this.postPowerUpActions = new ArrayList();
        }
        return this.postPowerUpActions;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmStartUpActionsPolicy)) {
            return false;
        }
        VmStartUpActionsPolicy otherObj = (VmStartUpActionsPolicy) obj;

        return (this.prePowerUpActions != null ? this.prePowerUpActions.equals(otherObj.prePowerUpActions) : this.prePowerUpActions == otherObj.prePowerUpActions) && (this.postPowerUpActions != null ? this.postPowerUpActions.equals(otherObj.postPowerUpActions) : this.postPowerUpActions == otherObj.postPowerUpActions);
    }


    public int hashCode() {
        return (this.prePowerUpActions != null ? this.prePowerUpActions.hashCode() : 0) ^ (this.postPowerUpActions != null ? this.postPowerUpActions.hashCode() : 0);
    }


    public String toString() {
        return "VmStartUpActionsPolicy [prePowerUpActions=" + this.prePowerUpActions + ", " + "postPowerUpActions=" + this.postPowerUpActions + "]";
    }
}


