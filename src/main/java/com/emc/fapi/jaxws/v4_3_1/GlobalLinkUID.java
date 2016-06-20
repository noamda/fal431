package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalLinkUID", propOrder = {"firstCluster", "secondCluster"})
public class GlobalLinkUID {
    @XmlElement(required = true)
    protected ClusterUID firstCluster;
    @XmlElement(required = true)
    protected ClusterUID secondCluster;

    public GlobalLinkUID() {
    }

    public GlobalLinkUID(ClusterUID firstCluster, ClusterUID secondCluster) {
        this.firstCluster = firstCluster;
        this.secondCluster = secondCluster;
    }


    public ClusterUID getFirstCluster() {
        return this.firstCluster;
    }


    public void setFirstCluster(ClusterUID value) {
        this.firstCluster = value;
    }


    public ClusterUID getSecondCluster() {
        return this.secondCluster;
    }


    public void setSecondCluster(ClusterUID value) {
        this.secondCluster = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GlobalLinkUID)) {
            return false;
        }
        GlobalLinkUID otherObj = (GlobalLinkUID) obj;

        return (this.firstCluster != null ? this.firstCluster.equals(otherObj.firstCluster) : this.firstCluster == otherObj.firstCluster) && (this.secondCluster != null ? this.secondCluster.equals(otherObj.secondCluster) : this.secondCluster == otherObj.secondCluster);
    }


    public int hashCode() {
        return (this.firstCluster != null ? this.firstCluster.hashCode() : 0) ^ (this.secondCluster != null ? this.secondCluster.hashCode() : 0);
    }


    public String toString() {
        return "GlobalLinkUID [firstCluster=" + this.firstCluster + ", " + "secondCluster=" + this.secondCluster + "]";
    }
}


