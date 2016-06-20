package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataMoverView", propOrder = {"ipAddresses", "name"})
public class DataMoverView {
    @XmlElement(nillable = true)
    protected List<String> ipAddresses;
    protected String name;

    public DataMoverView() {
    }

    public DataMoverView(List<String> ipAddresses, String name) {
        this.ipAddresses = ipAddresses;
        this.name = name;
    }


    public List<String> getIpAddresses() {
        if (this.ipAddresses == null) {
            this.ipAddresses = new ArrayList();
        }
        return this.ipAddresses;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DataMoverView)) {
            return false;
        }
        DataMoverView otherObj = (DataMoverView) obj;

        return (this.ipAddresses != null ? this.ipAddresses.equals(otherObj.ipAddresses) : this.ipAddresses == otherObj.ipAddresses) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name);
    }


    public int hashCode() {
        return (this.ipAddresses != null ? this.ipAddresses.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0);
    }


    public String toString() {
        return "DataMoverView [ipAddresses=" + this.ipAddresses + ", " + "name=" + this.name + "]";
    }
}


