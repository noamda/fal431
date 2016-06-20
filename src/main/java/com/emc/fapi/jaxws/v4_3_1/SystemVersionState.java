package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemVersionState", propOrder = {"clustersVersionState", "supportedFeatures"})
public class SystemVersionState {
    @XmlElement(nillable = true)
    protected List<ClusterVersionState> clustersVersionState;
    protected Features supportedFeatures;

    public SystemVersionState() {
    }

    public SystemVersionState(List<ClusterVersionState> clustersVersionState, Features supportedFeatures) {
        this.clustersVersionState = clustersVersionState;
        this.supportedFeatures = supportedFeatures;
    }


    public List<ClusterVersionState> getClustersVersionState() {
        if (this.clustersVersionState == null) {
            this.clustersVersionState = new ArrayList();
        }
        return this.clustersVersionState;
    }


    public Features getSupportedFeatures() {
        return this.supportedFeatures;
    }


    public void setSupportedFeatures(Features value) {
        this.supportedFeatures = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SystemVersionState)) {
            return false;
        }
        SystemVersionState otherObj = (SystemVersionState) obj;

        return (this.clustersVersionState != null ? this.clustersVersionState.equals(otherObj.clustersVersionState) : this.clustersVersionState == otherObj.clustersVersionState) && (this.supportedFeatures != null ? this.supportedFeatures.equals(otherObj.supportedFeatures) : this.supportedFeatures == otherObj.supportedFeatures);
    }


    public int hashCode() {
        return (this.clustersVersionState != null ? this.clustersVersionState.hashCode() : 0) ^ (this.supportedFeatures != null ? this.supportedFeatures.hashCode() : 0);
    }


    public String toString() {
        return "SystemVersionState [clustersVersionState=" + this.clustersVersionState + ", " + "supportedFeatures=" + this.supportedFeatures + "]";
    }
}


