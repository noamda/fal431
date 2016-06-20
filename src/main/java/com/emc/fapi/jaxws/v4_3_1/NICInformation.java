package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NICInformation", propOrder = {"ipInformation", "networkInterface", "networkMask", "autoNegotiationInformation"})
public class NICInformation {
    @XmlElement(nillable = true)
    protected IPInformation ipInformation;
    @XmlElement(nillable = true)
    protected NetworkInterface networkInterface;
    protected String networkMask;
    @XmlElement(nillable = true)
    protected AutoNegotiationInformation autoNegotiationInformation;

    public NICInformation() {
    }

    public NICInformation(IPInformation ipInformation, NetworkInterface networkInterface, String networkMask, AutoNegotiationInformation autoNegotiationInformation) {
        this.ipInformation = ipInformation;
        this.networkInterface = networkInterface;
        this.networkMask = networkMask;
        this.autoNegotiationInformation = autoNegotiationInformation;
    }


    public IPInformation getIpInformation() {
        return this.ipInformation;
    }


    public void setIpInformation(IPInformation value) {
        this.ipInformation = value;
    }


    public NetworkInterface getNetworkInterface() {
        return this.networkInterface;
    }


    public void setNetworkInterface(NetworkInterface value) {
        this.networkInterface = value;
    }


    public String getNetworkMask() {
        return this.networkMask;
    }


    public void setNetworkMask(String value) {
        this.networkMask = value;
    }


    public AutoNegotiationInformation getAutoNegotiationInformation() {
        return this.autoNegotiationInformation;
    }


    public void setAutoNegotiationInformation(AutoNegotiationInformation value) {
        this.autoNegotiationInformation = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof NICInformation)) {
            return false;
        }
        NICInformation otherObj = (NICInformation) obj;

        return (this.ipInformation != null ? this.ipInformation.equals(otherObj.ipInformation) : this.ipInformation == otherObj.ipInformation) && (this.networkInterface != null ? this.networkInterface.equals(otherObj.networkInterface) : this.networkInterface == otherObj.networkInterface) && (this.networkMask != null ? this.networkMask.equals(otherObj.networkMask) : this.networkMask == otherObj.networkMask) && (this.autoNegotiationInformation != null ? this.autoNegotiationInformation.equals(otherObj.autoNegotiationInformation) : this.autoNegotiationInformation == otherObj.autoNegotiationInformation);
    }


    public int hashCode() {
        return (this.ipInformation != null ? this.ipInformation.hashCode() : 0) ^ (this.networkInterface != null ? this.networkInterface.hashCode() : 0) ^ (this.networkMask != null ? this.networkMask.hashCode() : 0) ^ (this.autoNegotiationInformation != null ? this.autoNegotiationInformation.hashCode() : 0);
    }


    public String toString() {
        return "NICInformation [ipInformation=" + this.ipInformation + ", " + "networkInterface=" + this.networkInterface + ", " + "networkMask=" + this.networkMask + ", " + "autoNegotiationInformation=" + this.autoNegotiationInformation + "]";
    }
}


