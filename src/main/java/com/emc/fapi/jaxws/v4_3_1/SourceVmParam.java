package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("SourceVmParam")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceVmParam", propOrder = {"clusterUID"})
public class SourceVmParam
        extends ExistingVMParam {
    @XmlElement(required = true, nillable = true)
    protected ClusterUID clusterUID;

    public SourceVmParam() {
    }

    public SourceVmParam(ClusterUID clusterUID) {
        this.clusterUID = clusterUID;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SourceVmParam)) {
            return false;
        }
        SourceVmParam otherObj = (SourceVmParam) obj;

        return (super.equals(obj)) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0);
    }


    public String toString() {
        return "SourceVmParam [super=" + super.toString() + ", " + "clusterUID=" + this.clusterUID + "]";
    }
}


