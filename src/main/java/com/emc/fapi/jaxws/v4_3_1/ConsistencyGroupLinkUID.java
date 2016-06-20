package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupLinkUID", propOrder = {"groupUID", "firstCopy", "secondCopy"})
public class ConsistencyGroupLinkUID {
    @XmlElement(required = true)
    protected ConsistencyGroupUID groupUID;
    @XmlElement(required = true)
    protected GlobalCopyUID firstCopy;
    @XmlElement(required = true)
    protected GlobalCopyUID secondCopy;

    public ConsistencyGroupLinkUID() {
    }

    public ConsistencyGroupLinkUID(ConsistencyGroupUID groupUID, GlobalCopyUID firstCopy, GlobalCopyUID secondCopy) {
        this.groupUID = groupUID;
        this.firstCopy = firstCopy;
        this.secondCopy = secondCopy;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public GlobalCopyUID getFirstCopy() {
        return this.firstCopy;
    }


    public void setFirstCopy(GlobalCopyUID value) {
        this.firstCopy = value;
    }


    public GlobalCopyUID getSecondCopy() {
        return this.secondCopy;
    }


    public void setSecondCopy(GlobalCopyUID value) {
        this.secondCopy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupLinkUID)) {
            return false;
        }
        ConsistencyGroupLinkUID otherObj = (ConsistencyGroupLinkUID) obj;

        return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.firstCopy != null ? this.firstCopy.equals(otherObj.firstCopy) : this.firstCopy == otherObj.firstCopy) && (this.secondCopy != null ? this.secondCopy.equals(otherObj.secondCopy) : this.secondCopy == otherObj.secondCopy);
    }


    public int hashCode() {
        return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.firstCopy != null ? this.firstCopy.hashCode() : 0) ^ (this.secondCopy != null ? this.secondCopy.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupLinkUID [groupUID=" + this.groupUID + ", " + "firstCopy=" + this.firstCopy + ", " + "secondCopy=" + this.secondCopy + "]";
    }
}


