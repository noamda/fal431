package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restHostConnectivityStatus", propOrder = {"restEnum"})
public class RestHostConnectivityStatus {
    protected HostConnectivityStatus restEnum;

    public RestHostConnectivityStatus() {
    }

    public RestHostConnectivityStatus(HostConnectivityStatus restEnum) {
        this.restEnum = restEnum;
    }


    public HostConnectivityStatus getRestEnum() {
        return this.restEnum;
    }


    public void setRestEnum(HostConnectivityStatus value) {
        this.restEnum = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RestHostConnectivityStatus)) {
            return false;
        }
        RestHostConnectivityStatus otherObj = (RestHostConnectivityStatus) obj;

        return this.restEnum == otherObj.restEnum ? true : this.restEnum != null ? this.restEnum.equals(otherObj.restEnum) : false;
    }


    public int hashCode() {
        return this.restEnum != null ? this.restEnum.hashCode() : 0;
    }


    public String toString() {
        return "RestHostConnectivityStatus [restEnum=" + this.restEnum + "]";
    }
}


