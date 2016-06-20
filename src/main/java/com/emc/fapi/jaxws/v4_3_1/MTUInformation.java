package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MTUInformation", propOrder = {"networkInterface", "mtu"})
public class MTUInformation {
    @XmlElement(nillable = true)
    protected NetworkInterface networkInterface;
    protected int mtu;

    public MTUInformation() {
    }

    public MTUInformation(NetworkInterface networkInterface, int mtu) {
        this.networkInterface = networkInterface;
        this.mtu = mtu;
    }


    public NetworkInterface getNetworkInterface() {
        return this.networkInterface;
    }


    public void setNetworkInterface(NetworkInterface value) {
        this.networkInterface = value;
    }


    public int getMtu() {
        return this.mtu;
    }


    public void setMtu(int value) {
        this.mtu = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof MTUInformation)) {
            return false;
        }
        MTUInformation otherObj = (MTUInformation) obj;

        return (this.networkInterface != null ? this.networkInterface.equals(otherObj.networkInterface) : this.networkInterface == otherObj.networkInterface) && (this.mtu == otherObj.mtu);
    }


    public int hashCode() {
        return (this.networkInterface != null ? this.networkInterface.hashCode() : 0) ^ this.mtu;
    }


    public String toString() {
        return "MTUInformation [networkInterface=" + this.networkInterface + ", " + "mtu=" + this.mtu + "]";
    }
}


