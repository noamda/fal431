package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@JsonTypeName("VCArrayState")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCArrayState", propOrder = {"vwcPluginVersion", "esxClustersConnectivity"})
public class VCArrayState
        extends ArrayState {
    protected String vwcPluginVersion;
    @XmlElement(nillable = true)
    protected List<EsxClusterConnectivity> esxClustersConnectivity;

    public VCArrayState() {
    }

    public VCArrayState(String vwcPluginVersion, List<EsxClusterConnectivity> esxClustersConnectivity) {
        this.vwcPluginVersion = vwcPluginVersion;
        this.esxClustersConnectivity = esxClustersConnectivity;
    }


    public String getVwcPluginVersion() {
        return this.vwcPluginVersion;
    }


    public void setVwcPluginVersion(String value) {
        this.vwcPluginVersion = value;
    }


    public List<EsxClusterConnectivity> getEsxClustersConnectivity() {
        if (this.esxClustersConnectivity == null) {
            this.esxClustersConnectivity = new ArrayList();
        }
        return this.esxClustersConnectivity;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VCArrayState)) {
            return false;
        }
        VCArrayState otherObj = (VCArrayState) obj;

        return (super.equals(obj)) && (this.vwcPluginVersion != null ? this.vwcPluginVersion.equals(otherObj.vwcPluginVersion) : this.vwcPluginVersion == otherObj.vwcPluginVersion) && (this.esxClustersConnectivity != null ? this.esxClustersConnectivity.equals(otherObj.esxClustersConnectivity) : this.esxClustersConnectivity == otherObj.esxClustersConnectivity);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.vwcPluginVersion != null ? this.vwcPluginVersion.hashCode() : 0) ^ (this.esxClustersConnectivity != null ? this.esxClustersConnectivity.hashCode() : 0);
    }


    public String toString() {
        return "VCArrayState [super=" + super.toString() + ", " + "vwcPluginVersion=" + this.vwcPluginVersion + ", " + "esxClustersConnectivity=" + this.esxClustersConnectivity + "]";
    }
}


