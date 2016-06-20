package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterUID", propOrder = {"id"})
public class ClusterUID {
    protected long id;

    public ClusterUID() {
    }

    public ClusterUID(long id) {
        this.id = id;
    }


    public long getId() {
        return this.id;
    }


    public void setId(long value) {
        this.id = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterUID)) {
            return false;
        }
        ClusterUID otherObj = (ClusterUID) obj;

        return this.id == otherObj.id;
    }


    public int hashCode() {
        return (int) this.id;
    }


    public String toString() {
        return "ClusterUID [id=" + this.id + "]";
    }
}


