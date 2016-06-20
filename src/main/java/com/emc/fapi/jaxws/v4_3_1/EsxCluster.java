package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsxCluster", propOrder = {"esxClusterUID", "name", "virtualCenterUID"})
public class EsxCluster {
    @XmlElement(nillable = true)
    protected EsxClusterUID esxClusterUID;
    protected String name;
    @XmlElement(nillable = true)
    protected VirtualCenterUID virtualCenterUID;

    public EsxCluster() {
    }

    public EsxCluster(EsxClusterUID esxClusterUID, String name, VirtualCenterUID virtualCenterUID) {
        this.esxClusterUID = esxClusterUID;
        this.name = name;
        this.virtualCenterUID = virtualCenterUID;
    }


    public EsxClusterUID getEsxClusterUID() {
        return this.esxClusterUID;
    }


    public void setEsxClusterUID(EsxClusterUID value) {
        this.esxClusterUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public VirtualCenterUID getVirtualCenterUID() {
        return this.virtualCenterUID;
    }


    public void setVirtualCenterUID(VirtualCenterUID value) {
        this.virtualCenterUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EsxCluster)) {
            return false;
        }
        EsxCluster otherObj = (EsxCluster) obj;

        return (this.esxClusterUID != null ? this.esxClusterUID.equals(otherObj.esxClusterUID) : this.esxClusterUID == otherObj.esxClusterUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.virtualCenterUID != null ? this.virtualCenterUID.equals(otherObj.virtualCenterUID) : this.virtualCenterUID == otherObj.virtualCenterUID);
    }


    public int hashCode() {
        return (this.esxClusterUID != null ? this.esxClusterUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.virtualCenterUID != null ? this.virtualCenterUID.hashCode() : 0);
    }


    public String toString() {
        return "EsxCluster [esxClusterUID=" + this.esxClusterUID + ", " + "name=" + this.name + ", " + "virtualCenterUID=" + this.virtualCenterUID + "]";
    }
}


