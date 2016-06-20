package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RPOPolicy", propOrder = {"maximumAllowedLag", "allowRegulation", "minimizationType"})
public class RPOPolicy {
    protected Quantity maximumAllowedLag;
    protected boolean allowRegulation;
    @XmlElement(required = true)
    protected RpoMinimizationType minimizationType;

    public RPOPolicy() {
    }

    public RPOPolicy(Quantity maximumAllowedLag, boolean allowRegulation, RpoMinimizationType minimizationType) {
        this.maximumAllowedLag = maximumAllowedLag;
        this.allowRegulation = allowRegulation;
        this.minimizationType = minimizationType;
    }


    public Quantity getMaximumAllowedLag() {
        return this.maximumAllowedLag;
    }


    public void setMaximumAllowedLag(Quantity value) {
        this.maximumAllowedLag = value;
    }


    public boolean isAllowRegulation() {
        return this.allowRegulation;
    }


    public void setAllowRegulation(boolean value) {
        this.allowRegulation = value;
    }


    public RpoMinimizationType getMinimizationType() {
        return this.minimizationType;
    }


    public void setMinimizationType(RpoMinimizationType value) {
        this.minimizationType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RPOPolicy)) {
            return false;
        }
        RPOPolicy otherObj = (RPOPolicy) obj;

        return (this.maximumAllowedLag != null ? this.maximumAllowedLag.equals(otherObj.maximumAllowedLag) : this.maximumAllowedLag == otherObj.maximumAllowedLag) && (this.allowRegulation == otherObj.allowRegulation) && (this.minimizationType != null ? this.minimizationType.equals(otherObj.minimizationType) : this.minimizationType == otherObj.minimizationType);
    }


    public int hashCode() {
        return (this.maximumAllowedLag != null ? this.maximumAllowedLag.hashCode() : 0) ^ (this.allowRegulation ? 1 : 0) ^ (this.minimizationType != null ? this.minimizationType.hashCode() : 0);
    }


    public String toString() {
        return "RPOPolicy [maximumAllowedLag=" + this.maximumAllowedLag + ", " + "allowRegulation=" + this.allowRegulation + ", " + "minimizationType=" + this.minimizationType + "]";
    }
}


