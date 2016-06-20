package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@JsonTypeName("VCArraySettings")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCArraySettings", propOrder = {"registeredEsxClusters"})
public class VCArraySettings
        extends ArraySettings {
    @XmlElement(nillable = true)
    protected List<EsxCluster> registeredEsxClusters;

    public VCArraySettings() {
    }

    public VCArraySettings(List<EsxCluster> registeredEsxClusters) {
        this.registeredEsxClusters = registeredEsxClusters;
    }


    public List<EsxCluster> getRegisteredEsxClusters() {
        if (this.registeredEsxClusters == null) {
            this.registeredEsxClusters = new ArrayList();
        }
        return this.registeredEsxClusters;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VCArraySettings)) {
            return false;
        }
        VCArraySettings otherObj = (VCArraySettings) obj;

        return (super.equals(obj)) && (this.registeredEsxClusters != null ? this.registeredEsxClusters.equals(otherObj.registeredEsxClusters) : this.registeredEsxClusters == otherObj.registeredEsxClusters);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.registeredEsxClusters != null ? this.registeredEsxClusters.hashCode() : 0);
    }


    public String toString() {
        return "VCArraySettings [super=" + super.toString() + ", " + "registeredEsxClusters=" + this.registeredEsxClusters + "]";
    }
}


