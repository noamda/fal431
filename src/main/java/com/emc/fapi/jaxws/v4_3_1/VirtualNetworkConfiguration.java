package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNetworkConfiguration", propOrder = {"name", "networkUID"})
public class VirtualNetworkConfiguration {
    protected String name;
    protected VirtualNetworkUID networkUID;

    public VirtualNetworkConfiguration() {
    }

    public VirtualNetworkConfiguration(String name, VirtualNetworkUID networkUID) {
        this.name = name;
        this.networkUID = networkUID;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public VirtualNetworkUID getNetworkUID() {
        return this.networkUID;
    }


    public void setNetworkUID(VirtualNetworkUID value) {
        this.networkUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualNetworkConfiguration)) {
            return false;
        }
        VirtualNetworkConfiguration otherObj = (VirtualNetworkConfiguration) obj;

        return (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.networkUID != null ? this.networkUID.equals(otherObj.networkUID) : this.networkUID == otherObj.networkUID);
    }


    public int hashCode() {
        return (this.name != null ? this.name.hashCode() : 0) ^ (this.networkUID != null ? this.networkUID.hashCode() : 0);
    }


    public String toString() {
        return "VirtualNetworkConfiguration [name=" + this.name + ", " + "networkUID=" + this.networkUID + "]";
    }
}


