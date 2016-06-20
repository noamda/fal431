package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateEnableLatestImageAccess", propOrder = {"groupCopy", "mode", "scenario"})
public class ValidateEnableLatestImageAccess {
    protected ConsistencyGroupCopyUID groupCopy;
    protected ImageAccessMode mode;
    protected ImageAccessScenario scenario;

    public ValidateEnableLatestImageAccess() {
    }

    public ValidateEnableLatestImageAccess(ConsistencyGroupCopyUID groupCopy, ImageAccessMode mode, ImageAccessScenario scenario) {
        this.groupCopy = groupCopy;
        this.mode = mode;
        this.scenario = scenario;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public ImageAccessMode getMode() {
        return this.mode;
    }


    public void setMode(ImageAccessMode value) {
        this.mode = value;
    }


    public ImageAccessScenario getScenario() {
        return this.scenario;
    }


    public void setScenario(ImageAccessScenario value) {
        this.scenario = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateEnableLatestImageAccess)) {
            return false;
        }
        ValidateEnableLatestImageAccess otherObj = (ValidateEnableLatestImageAccess) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.mode != null ? this.mode.equals(otherObj.mode) : this.mode == otherObj.mode) && (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.mode != null ? this.mode.hashCode() : 0) ^ (this.scenario != null ? this.scenario.hashCode() : 0);
    }


    public String toString() {
        return "ValidateEnableLatestImageAccess [groupCopy=" + this.groupCopy + ", " + "mode=" + this.mode + ", " + "scenario=" + this.scenario + "]";
    }
}


