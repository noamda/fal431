package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableLatestImageAccessParams", propOrder = {"mode", "scenario"})
public class EnableLatestImageAccessParams {
    protected ImageAccessMode mode;
    protected ImageAccessScenario scenario;

    public EnableLatestImageAccessParams() {
    }

    public EnableLatestImageAccessParams(ImageAccessMode mode, ImageAccessScenario scenario) {
        this.mode = mode;
        this.scenario = scenario;
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
        if (!(obj instanceof EnableLatestImageAccessParams)) {
            return false;
        }
        EnableLatestImageAccessParams otherObj = (EnableLatestImageAccessParams) obj;

        return (this.mode != null ? this.mode.equals(otherObj.mode) : this.mode == otherObj.mode) && (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario);
    }


    public int hashCode() {
        return (this.mode != null ? this.mode.hashCode() : 0) ^ (this.scenario != null ? this.scenario.hashCode() : 0);
    }


    public String toString() {
        return "EnableLatestImageAccessParams [mode=" + this.mode + ", " + "scenario=" + this.scenario + "]";
    }
}


