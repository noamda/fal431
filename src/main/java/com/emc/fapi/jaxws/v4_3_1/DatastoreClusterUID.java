package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreClusterUID", propOrder = {"uuid"})
public class DatastoreClusterUID {
    @XmlElement(required = true)
    protected String uuid;

    public DatastoreClusterUID() {
    }

    public DatastoreClusterUID(String uuid) {
        this.uuid = uuid;
    }


    public String getUuid() {
        return this.uuid;
    }


    public void setUuid(String value) {
        this.uuid = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DatastoreClusterUID)) {
            return false;
        }
        DatastoreClusterUID otherObj = (DatastoreClusterUID) obj;

        return this.uuid == otherObj.uuid ? true : this.uuid != null ? this.uuid.equals(otherObj.uuid) : false;
    }


    public int hashCode() {
        return this.uuid != null ? this.uuid.hashCode() : 0;
    }


    public String toString() {
        return "DatastoreClusterUID [uuid=" + this.uuid + "]";
    }
}


