package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsxClusterConnectivity", propOrder = {"esxClusterUID", "status"})
public class EsxClusterConnectivity {
    @XmlElement(nillable = true)
    protected EsxClusterUID esxClusterUID;
    protected EsxClusterConnectivityStatus status;

    public EsxClusterConnectivity() {
    }

    public EsxClusterConnectivity(EsxClusterUID esxClusterUID, EsxClusterConnectivityStatus status) {
        this.esxClusterUID = esxClusterUID;
        this.status = status;
    }


    public EsxClusterUID getEsxClusterUID() {
        return this.esxClusterUID;
    }


    public void setEsxClusterUID(EsxClusterUID value) {
        this.esxClusterUID = value;
    }


    public EsxClusterConnectivityStatus getStatus() {
        return this.status;
    }


    public void setStatus(EsxClusterConnectivityStatus value) {
        this.status = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EsxClusterConnectivity)) {
            return false;
        }
        EsxClusterConnectivity otherObj = (EsxClusterConnectivity) obj;

        return (this.esxClusterUID != null ? this.esxClusterUID.equals(otherObj.esxClusterUID) : this.esxClusterUID == otherObj.esxClusterUID) && (this.status != null ? this.status.equals(otherObj.status) : this.status == otherObj.status);
    }


    public int hashCode() {
        return (this.esxClusterUID != null ? this.esxClusterUID.hashCode() : 0) ^ (this.status != null ? this.status.hashCode() : 0);
    }


    public String toString() {
        return "EsxClusterConnectivity [esxClusterUID=" + this.esxClusterUID + ", " + "status=" + this.status + "]";
    }
}


