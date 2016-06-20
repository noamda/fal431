package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removePassiveConsistencyGroupLinkParams", propOrder = {"firstCopy", "secondCopy"})
public class RemovePassiveConsistencyGroupLinkParams {
    protected GlobalCopyUID firstCopy;
    protected GlobalCopyUID secondCopy;

    public RemovePassiveConsistencyGroupLinkParams() {
    }

    public RemovePassiveConsistencyGroupLinkParams(GlobalCopyUID firstCopy, GlobalCopyUID secondCopy) {
        this.firstCopy = firstCopy;
        this.secondCopy = secondCopy;
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
        if (!(obj instanceof RemovePassiveConsistencyGroupLinkParams)) {
            return false;
        }
        RemovePassiveConsistencyGroupLinkParams otherObj = (RemovePassiveConsistencyGroupLinkParams) obj;

        return (this.firstCopy != null ? this.firstCopy.equals(otherObj.firstCopy) : this.firstCopy == otherObj.firstCopy) && (this.secondCopy != null ? this.secondCopy.equals(otherObj.secondCopy) : this.secondCopy == otherObj.secondCopy);
    }


    public int hashCode() {
        return (this.firstCopy != null ? this.firstCopy.hashCode() : 0) ^ (this.secondCopy != null ? this.secondCopy.hashCode() : 0);
    }


    public String toString() {
        return "RemovePassiveConsistencyGroupLinkParams [firstCopy=" + this.firstCopy + ", " + "secondCopy=" + this.secondCopy + "]";
    }
}


