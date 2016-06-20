package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreClusterConfiguration", propOrder = {"datastoreClusterUID", "name", "capacity", "freeSpace", "childDatastoresConfiguration"})
public class DatastoreClusterConfiguration {
    @XmlElement(nillable = true)
    protected DatastoreClusterUID datastoreClusterUID;
    protected String name;
    protected long capacity;
    protected long freeSpace;
    @XmlElement(nillable = true)
    protected List<DatastoreConfiguration> childDatastoresConfiguration;

    public DatastoreClusterConfiguration() {
    }

    public DatastoreClusterConfiguration(DatastoreClusterUID datastoreClusterUID, String name, long capacity, long freeSpace, List<DatastoreConfiguration> childDatastoresConfiguration) {
        this.datastoreClusterUID = datastoreClusterUID;
        this.name = name;
        this.capacity = capacity;
        this.freeSpace = freeSpace;
        this.childDatastoresConfiguration = childDatastoresConfiguration;
    }


    public DatastoreClusterUID getDatastoreClusterUID() {
        return this.datastoreClusterUID;
    }


    public void setDatastoreClusterUID(DatastoreClusterUID value) {
        this.datastoreClusterUID = value;
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


    public List<DatastoreConfiguration> getChildDatastoresConfiguration() {
        if (this.childDatastoresConfiguration == null) {
            this.childDatastoresConfiguration = new ArrayList();
        }
        return this.childDatastoresConfiguration;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DatastoreClusterConfiguration)) {
            return false;
        }
        DatastoreClusterConfiguration otherObj = (DatastoreClusterConfiguration) obj;

        return (this.datastoreClusterUID != null ? this.datastoreClusterUID.equals(otherObj.datastoreClusterUID) : this.datastoreClusterUID == otherObj.datastoreClusterUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.capacity == otherObj.capacity) && (this.freeSpace == otherObj.freeSpace) && (this.childDatastoresConfiguration != null ? this.childDatastoresConfiguration.equals(otherObj.childDatastoresConfiguration) : this.childDatastoresConfiguration == otherObj.childDatastoresConfiguration);
    }


    public int hashCode() {
        return (this.datastoreClusterUID != null ? this.datastoreClusterUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (int) this.capacity ^ (int) this.freeSpace ^ (this.childDatastoresConfiguration != null ? this.childDatastoresConfiguration.hashCode() : 0);
    }


    public String toString() {
        return "DatastoreClusterConfiguration [datastoreClusterUID=" + this.datastoreClusterUID + ", " + "name=" + this.name + ", " + "capacity=" + this.capacity + ", " + "freeSpace=" + this.freeSpace + ", " + "childDatastoresConfiguration=" + this.childDatastoresConfiguration + "]";
    }
}


