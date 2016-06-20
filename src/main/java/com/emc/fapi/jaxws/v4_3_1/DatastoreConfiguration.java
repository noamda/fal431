package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreConfiguration", propOrder = {"datastoreUID", "name", "capacity", "freeSpace", "relevantEsxsUuids"})
public class DatastoreConfiguration {
    @XmlElement(nillable = true)
    protected DatastoreUID datastoreUID;
    protected String name;
    protected long capacity;
    protected long freeSpace;
    @XmlElement(nillable = true)
    protected List<EsxUID> relevantEsxsUuids;

    public DatastoreConfiguration() {
    }

    public DatastoreConfiguration(DatastoreUID datastoreUID, String name, long capacity, long freeSpace, List<EsxUID> relevantEsxsUuids) {
        this.datastoreUID = datastoreUID;
        this.name = name;
        this.capacity = capacity;
        this.freeSpace = freeSpace;
        this.relevantEsxsUuids = relevantEsxsUuids;
    }


    public DatastoreUID getDatastoreUID() {
        return this.datastoreUID;
    }


    public void setDatastoreUID(DatastoreUID value) {
        this.datastoreUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public long getCapacity() {
        return this.capacity;
    }


    public void setCapacity(long value) {
        this.capacity = value;
    }


    public long getFreeSpace() {
        return this.freeSpace;
    }


    public void setFreeSpace(long value) {
        this.freeSpace = value;
    }


    public List<EsxUID> getRelevantEsxsUuids() {
        if (this.relevantEsxsUuids == null) {
            this.relevantEsxsUuids = new ArrayList();
        }
        return this.relevantEsxsUuids;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DatastoreConfiguration)) {
            return false;
        }
        DatastoreConfiguration otherObj = (DatastoreConfiguration) obj;

        return (this.datastoreUID != null ? this.datastoreUID.equals(otherObj.datastoreUID) : this.datastoreUID == otherObj.datastoreUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.capacity == otherObj.capacity) && (this.freeSpace == otherObj.freeSpace) && (this.relevantEsxsUuids != null ? this.relevantEsxsUuids.equals(otherObj.relevantEsxsUuids) : this.relevantEsxsUuids == otherObj.relevantEsxsUuids);
    }


    public int hashCode() {
        return (this.datastoreUID != null ? this.datastoreUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (int) this.capacity ^ (int) this.freeSpace ^ (this.relevantEsxsUuids != null ? this.relevantEsxsUuids.hashCode() : 0);
    }


    public String toString() {
        return "DatastoreConfiguration [datastoreUID=" + this.datastoreUID + ", " + "name=" + this.name + ", " + "capacity=" + this.capacity + ", " + "freeSpace=" + this.freeSpace + ", " + "relevantEsxsUuids=" + this.relevantEsxsUuids + "]";
    }
}


