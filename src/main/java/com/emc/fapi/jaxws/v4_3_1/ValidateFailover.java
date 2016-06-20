package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateFailover", propOrder = {"groupCopy", "startTransfer"})
public class ValidateFailover {
    protected ConsistencyGroupCopyUID groupCopy;
    protected boolean startTransfer;

    public ValidateFailover() {
    }

    public ValidateFailover(ConsistencyGroupCopyUID groupCopy, boolean startTransfer) {
        this.groupCopy = groupCopy;
        this.startTransfer = startTransfer;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public boolean isStartTransfer() {
        return this.startTransfer;
    }


    public void setStartTransfer(boolean value) {
        this.startTransfer = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateFailover)) {
            return false;
        }
        ValidateFailover otherObj = (ValidateFailover) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.startTransfer == otherObj.startTransfer);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.startTransfer ? 1 : 0);
    }


    public String toString() {
        return "ValidateFailover [groupCopy=" + this.groupCopy + ", " + "startTransfer=" + this.startTransfer + "]";
    }
}


