package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("RPAConnectivityStatus")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RPAConnectivityStatus", propOrder = {"rpaUID"})
public class RPAConnectivityStatus
        extends ClusterEntityConnectivityStatus {
    @XmlElement(nillable = true)
    protected RpaUID rpaUID;

    public RPAConnectivityStatus() {
    }

    public RPAConnectivityStatus(RpaUID rpaUID) {
        this.rpaUID = rpaUID;
    }


    public RpaUID getRpaUID() {
        return this.rpaUID;
    }


    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RPAConnectivityStatus)) {
            return false;
        }
        RPAConnectivityStatus otherObj = (RPAConnectivityStatus) obj;

        return (super.equals(obj)) && (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.rpaUID != null ? this.rpaUID.hashCode() : 0);
    }


    public String toString() {
        return "RPAConnectivityStatus [super=" + super.toString() + ", " + "rpaUID=" + this.rpaUID + "]";
    }
}


