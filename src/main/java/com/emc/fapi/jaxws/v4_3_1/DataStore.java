package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataStore", propOrder = {"name", "volumes"})
public class DataStore {
    protected String name;
    @XmlElement(nillable = true)
    protected List<VMVolume> volumes;

    public DataStore() {
    }

    public DataStore(String name, List<VMVolume> volumes) {
        this.name = name;
        this.volumes = volumes;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public List<VMVolume> getVolumes() {
        if (this.volumes == null) {
            this.volumes = new ArrayList();
        }
        return this.volumes;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DataStore)) {
            return false;
        }
        DataStore otherObj = (DataStore) obj;

        return (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.volumes != null ? this.volumes.equals(otherObj.volumes) : this.volumes == otherObj.volumes);
    }


    public int hashCode() {
        return (this.name != null ? this.name.hashCode() : 0) ^ (this.volumes != null ? this.volumes.hashCode() : 0);
    }


    public String toString() {
        return "DataStore [name=" + this.name + ", " + "volumes=" + this.volumes + "]";
    }
}


