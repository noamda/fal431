package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSplitterAutoRegisterRPAsInitiatorsPolicy", propOrder = {"splitter", "autoRegisterRPAsInitiatorsPolicy"})
public class SetSplitterAutoRegisterRPAsInitiatorsPolicy {
    protected SplitterUID splitter;
    protected boolean autoRegisterRPAsInitiatorsPolicy;

    public SetSplitterAutoRegisterRPAsInitiatorsPolicy() {
    }

    public SetSplitterAutoRegisterRPAsInitiatorsPolicy(SplitterUID splitter, boolean autoRegisterRPAsInitiatorsPolicy) {
        this.splitter = splitter;
        this.autoRegisterRPAsInitiatorsPolicy = autoRegisterRPAsInitiatorsPolicy;
    }


    public SplitterUID getSplitter() {
        return this.splitter;
    }


    public void setSplitter(SplitterUID value) {
        this.splitter = value;
    }


    public boolean isAutoRegisterRPAsInitiatorsPolicy() {
        return this.autoRegisterRPAsInitiatorsPolicy;
    }


    public void setAutoRegisterRPAsInitiatorsPolicy(boolean value) {
        this.autoRegisterRPAsInitiatorsPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetSplitterAutoRegisterRPAsInitiatorsPolicy)) {
            return false;
        }
        SetSplitterAutoRegisterRPAsInitiatorsPolicy otherObj = (SetSplitterAutoRegisterRPAsInitiatorsPolicy) obj;

        return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.autoRegisterRPAsInitiatorsPolicy == otherObj.autoRegisterRPAsInitiatorsPolicy);
    }


    public int hashCode() {
        return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.autoRegisterRPAsInitiatorsPolicy ? 1 : 0);
    }


    public String toString() {
        return "SetSplitterAutoRegisterRPAsInitiatorsPolicy [splitter=" + this.splitter + ", " + "autoRegisterRPAsInitiatorsPolicy=" + this.autoRegisterRPAsInitiatorsPolicy + "]";
    }
}


