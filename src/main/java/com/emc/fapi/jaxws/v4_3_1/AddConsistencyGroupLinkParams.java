package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addConsistencyGroupLinkParams", propOrder = {"firstCopy", "policy", "secondCopy"})
public class AddConsistencyGroupLinkParams {
    protected GlobalCopyUID firstCopy;
    protected ConsistencyGroupLinkPolicy policy;
    protected GlobalCopyUID secondCopy;

    public AddConsistencyGroupLinkParams() {
    }

    public AddConsistencyGroupLinkParams(GlobalCopyUID firstCopy, ConsistencyGroupLinkPolicy policy, GlobalCopyUID secondCopy) {
        this.firstCopy = firstCopy;
        this.policy = policy;
        this.secondCopy = secondCopy;
    }


    public GlobalCopyUID getFirstCopy() {
        return this.firstCopy;
    }


    public void setFirstCopy(GlobalCopyUID value) {
        this.firstCopy = value;
    }


    public ConsistencyGroupLinkPolicy getPolicy() {
        return this.policy;
    }


    public void setPolicy(ConsistencyGroupLinkPolicy value) {
        this.policy = value;
    }


    public GlobalCopyUID getSecondCopy() {
        return this.secondCopy;
    }


    public void setSecondCopy(GlobalCopyUID value) {
        this.secondCopy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddConsistencyGroupLinkParams)) {
            return false;
        }
        AddConsistencyGroupLinkParams otherObj = (AddConsistencyGroupLinkParams) obj;

        return (this.firstCopy != null ? this.firstCopy.equals(otherObj.firstCopy) : this.firstCopy == otherObj.firstCopy) && (this.policy != null ? this.policy.equals(otherObj.policy) : this.policy == otherObj.policy) && (this.secondCopy != null ? this.secondCopy.equals(otherObj.secondCopy) : this.secondCopy == otherObj.secondCopy);
    }


    public int hashCode() {
        return (this.firstCopy != null ? this.firstCopy.hashCode() : 0) ^ (this.policy != null ? this.policy.hashCode() : 0) ^ (this.secondCopy != null ? this.secondCopy.hashCode() : 0);
    }


    public String toString() {
        return "AddConsistencyGroupLinkParams [firstCopy=" + this.firstCopy + ", " + "policy=" + this.policy + ", " + "secondCopy=" + this.secondCopy + "]";
    }
}


