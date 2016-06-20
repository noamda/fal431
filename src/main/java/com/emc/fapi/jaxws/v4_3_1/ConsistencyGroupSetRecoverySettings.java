package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupSetRecoverySettings", propOrder = {"clusterUID", "imageAccessScenario"})
public class ConsistencyGroupSetRecoverySettings {
    @XmlElement(required = true, nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected ImageAccessScenario imageAccessScenario;

    public ConsistencyGroupSetRecoverySettings() {
    }

    public ConsistencyGroupSetRecoverySettings(ClusterUID clusterUID, ImageAccessScenario imageAccessScenario) {
        this.clusterUID = clusterUID;
        this.imageAccessScenario = imageAccessScenario;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public ImageAccessScenario getImageAccessScenario() {
        return this.imageAccessScenario;
    }


    public void setImageAccessScenario(ImageAccessScenario value) {
        this.imageAccessScenario = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupSetRecoverySettings)) {
            return false;
        }
        ConsistencyGroupSetRecoverySettings otherObj = (ConsistencyGroupSetRecoverySettings) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.imageAccessScenario != null ? this.imageAccessScenario.equals(otherObj.imageAccessScenario) : this.imageAccessScenario == otherObj.imageAccessScenario);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.imageAccessScenario != null ? this.imageAccessScenario.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupSetRecoverySettings [clusterUID=" + this.clusterUID + ", " + "imageAccessScenario=" + this.imageAccessScenario + "]";
    }
}


