package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullConsistencyGroupCopyPolicy", propOrder = {"copyUID", "copyName", "copyPolicy"})
public class FullConsistencyGroupCopyPolicy {
    @XmlElement(required = true)
    protected ConsistencyGroupCopyUID copyUID;
    @XmlElement(required = true)
    protected String copyName;
    @XmlElement(required = true)
    protected ConsistencyGroupCopyPolicy copyPolicy;

    public FullConsistencyGroupCopyPolicy() {
    }

    public FullConsistencyGroupCopyPolicy(ConsistencyGroupCopyUID copyUID, String copyName, ConsistencyGroupCopyPolicy copyPolicy) {
        this.copyUID = copyUID;
        this.copyName = copyName;
        this.copyPolicy = copyPolicy;
    }


    public ConsistencyGroupCopyUID getCopyUID() {
        return this.copyUID;
    }


    public void setCopyUID(ConsistencyGroupCopyUID value) {
        this.copyUID = value;
    }


    public String getCopyName() {
        return this.copyName;
    }


    public void setCopyName(String value) {
        this.copyName = value;
    }


    public ConsistencyGroupCopyPolicy getCopyPolicy() {
        return this.copyPolicy;
    }


    public void setCopyPolicy(ConsistencyGroupCopyPolicy value) {
        this.copyPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FullConsistencyGroupCopyPolicy)) {
            return false;
        }
        FullConsistencyGroupCopyPolicy otherObj = (FullConsistencyGroupCopyPolicy) obj;

        return (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.copyName != null ? this.copyName.equals(otherObj.copyName) : this.copyName == otherObj.copyName) && (this.copyPolicy != null ? this.copyPolicy.equals(otherObj.copyPolicy) : this.copyPolicy == otherObj.copyPolicy);
    }


    public int hashCode() {
        return (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.copyName != null ? this.copyName.hashCode() : 0) ^ (this.copyPolicy != null ? this.copyPolicy.hashCode() : 0);
    }


    public String toString() {
        return "FullConsistencyGroupCopyPolicy [copyUID=" + this.copyUID + ", " + "copyName=" + this.copyName + ", " + "copyPolicy=" + this.copyPolicy + "]";
    }
}


