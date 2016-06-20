package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ClariionVolumesContext")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClariionVolumesContext", propOrder = {"cluster"})
public class ClariionVolumesContext
        extends FunctionalAPIContext {
    protected ClusterUID cluster;

    public ClariionVolumesContext() {
    }

    public ClariionVolumesContext(ClusterUID cluster) {
        this.cluster = cluster;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClariionVolumesContext)) {
            return false;
        }
        ClariionVolumesContext otherObj = (ClariionVolumesContext) obj;

        return (super.equals(obj)) && (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.cluster != null ? this.cluster.hashCode() : 0);
    }


    public String toString() {
        return "ClariionVolumesContext [super=" + super.toString() + ", " + "cluster=" + this.cluster + "]";
    }
}


