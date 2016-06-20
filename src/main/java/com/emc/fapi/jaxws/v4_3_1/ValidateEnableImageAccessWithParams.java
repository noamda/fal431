package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateEnableImageAccessWithParams", propOrder = {"groupCopy", "params", "scenario"})
public class ValidateEnableImageAccessWithParams {
    protected ConsistencyGroupCopyUID groupCopy;
    protected ImageAccessParameters params;
    protected ImageAccessScenario scenario;

    public ValidateEnableImageAccessWithParams() {
    }

    public ValidateEnableImageAccessWithParams(ConsistencyGroupCopyUID groupCopy, ImageAccessParameters params, ImageAccessScenario scenario) {
        this.groupCopy = groupCopy;
        this.params = params;
        this.scenario = scenario;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public ImageAccessParameters getParams() {
        return this.params;
    }


    public void setParams(ImageAccessParameters value) {
        this.params = value;
    }


    public ImageAccessScenario getScenario() {
        return this.scenario;
    }


    public void setScenario(ImageAccessScenario value) {
        this.scenario = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateEnableImageAccessWithParams)) {
            return false;
        }
        ValidateEnableImageAccessWithParams otherObj = (ValidateEnableImageAccessWithParams) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.params != null ? this.params.equals(otherObj.params) : this.params == otherObj.params) && (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.params != null ? this.params.hashCode() : 0) ^ (this.scenario != null ? this.scenario.hashCode() : 0);
    }


    public String toString() {
        return "ValidateEnableImageAccessWithParams [groupCopy=" + this.groupCopy + ", " + "params=" + this.params + ", " + "scenario=" + this.scenario + "]";
    }
}


