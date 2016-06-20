package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableImageAccessWithParams", propOrder = {"groupCopy", "params", "scenario"})
public class EnableImageAccessWithParams {
    protected ConsistencyGroupCopyUID groupCopy;
    protected ImageAccessParameters params;
    protected ImageAccessScenario scenario;

    public EnableImageAccessWithParams() {
    }

    public EnableImageAccessWithParams(ConsistencyGroupCopyUID groupCopy, ImageAccessParameters params, ImageAccessScenario scenario) {
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
        if (!(obj instanceof EnableImageAccessWithParams)) {
            return false;
        }
        EnableImageAccessWithParams otherObj = (EnableImageAccessWithParams) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.params != null ? this.params.equals(otherObj.params) : this.params == otherObj.params) && (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.params != null ? this.params.hashCode() : 0) ^ (this.scenario != null ? this.scenario.hashCode() : 0);
    }


    public String toString() {
        return "EnableImageAccessWithParams [groupCopy=" + this.groupCopy + ", " + "params=" + this.params + ", " + "scenario=" + this.scenario + "]";
    }
}


