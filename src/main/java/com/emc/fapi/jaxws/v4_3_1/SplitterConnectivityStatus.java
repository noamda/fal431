package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("SplitterConnectivityStatus")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitterConnectivityStatus", propOrder = {"splitterUID"})
public class SplitterConnectivityStatus
        extends ClusterEntityConnectivityStatus {
    @XmlElement(nillable = true)
    protected SplitterUID splitterUID;

    public SplitterConnectivityStatus() {
    }

    public SplitterConnectivityStatus(SplitterUID splitterUID) {
        this.splitterUID = splitterUID;
    }


    public SplitterUID getSplitterUID() {
        return this.splitterUID;
    }


    public void setSplitterUID(SplitterUID value) {
        this.splitterUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SplitterConnectivityStatus)) {
            return false;
        }
        SplitterConnectivityStatus otherObj = (SplitterConnectivityStatus) obj;

        return (super.equals(obj)) && (this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : this.splitterUID == otherObj.splitterUID);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.splitterUID != null ? this.splitterUID.hashCode() : 0);
    }


    public String toString() {
        return "SplitterConnectivityStatus [super=" + super.toString() + ", " + "splitterUID=" + this.splitterUID + "]";
    }
}


