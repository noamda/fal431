package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("DataCommPath")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataCommPath", propOrder = {"splitterUid"})
public class DataCommPath
        extends Path {
    @XmlElement(nillable = true)
    protected SplitterUID splitterUid;

    public DataCommPath() {
    }

    public DataCommPath(SplitterUID splitterUid) {
        this.splitterUid = splitterUid;
    }


    public SplitterUID getSplitterUid() {
        return this.splitterUid;
    }


    public void setSplitterUid(SplitterUID value) {
        this.splitterUid = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DataCommPath)) {
            return false;
        }
        DataCommPath otherObj = (DataCommPath) obj;

        return (super.equals(obj)) && (this.splitterUid != null ? this.splitterUid.equals(otherObj.splitterUid) : this.splitterUid == otherObj.splitterUid);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.splitterUid != null ? this.splitterUid.hashCode() : 0);
    }


    public String toString() {
        return "DataCommPath [super=" + super.toString() + ", " + "splitterUid=" + this.splitterUid + "]";
    }
}


