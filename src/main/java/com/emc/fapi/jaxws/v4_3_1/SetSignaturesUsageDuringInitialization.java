package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSignaturesUsageDuringInitialization", propOrder = {"groupCopy", "useSignatures"})
public class SetSignaturesUsageDuringInitialization {
    protected ConsistencyGroupCopyUID groupCopy;
    protected boolean useSignatures;

    public SetSignaturesUsageDuringInitialization() {
    }

    public SetSignaturesUsageDuringInitialization(ConsistencyGroupCopyUID groupCopy, boolean useSignatures) {
        this.groupCopy = groupCopy;
        this.useSignatures = useSignatures;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public boolean isUseSignatures() {
        return this.useSignatures;
    }


    public void setUseSignatures(boolean value) {
        this.useSignatures = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetSignaturesUsageDuringInitialization)) {
            return false;
        }
        SetSignaturesUsageDuringInitialization otherObj = (SetSignaturesUsageDuringInitialization) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.useSignatures == otherObj.useSignatures);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.useSignatures ? 1 : 0);
    }


    public String toString() {
        return "SetSignaturesUsageDuringInitialization [groupCopy=" + this.groupCopy + ", " + "useSignatures=" + this.useSignatures + "]";
    }
}


