package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayConnectivityInfo", propOrder = {"details", "status"})
public class ArrayConnectivityInfo {
    protected String details;
    protected ArrayConnectivityStatus status;

    public ArrayConnectivityInfo() {
    }

    public ArrayConnectivityInfo(String details, ArrayConnectivityStatus status) {
        this.details = details;
        this.status = status;
    }


    public String getDetails() {
        return this.details;
    }


    public void setDetails(String value) {
        this.details = value;
    }


    public ArrayConnectivityStatus getStatus() {
        return this.status;
    }


    public void setStatus(ArrayConnectivityStatus value) {
        this.status = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayConnectivityInfo)) {
            return false;
        }
        ArrayConnectivityInfo otherObj = (ArrayConnectivityInfo) obj;

        return (this.details != null ? this.details.equals(otherObj.details) : this.details == otherObj.details) && (this.status != null ? this.status.equals(otherObj.status) : this.status == otherObj.status);
    }


    public int hashCode() {
        return (this.details != null ? this.details.hashCode() : 0) ^ (this.status != null ? this.status.hashCode() : 0);
    }


    public String toString() {
        return "ArrayConnectivityInfo [details=" + this.details + ", " + "status=" + this.status + "]";
    }
}


