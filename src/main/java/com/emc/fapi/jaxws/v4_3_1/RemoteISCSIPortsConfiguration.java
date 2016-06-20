package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteISCSIPortsConfiguration", propOrder = {"name", "portsInformation"})
public class RemoteISCSIPortsConfiguration {
    protected String name;
    @XmlElement(nillable = true)
    protected List<RemoteISCSIPortInformation> portsInformation;

    public RemoteISCSIPortsConfiguration() {
    }

    public RemoteISCSIPortsConfiguration(String name, List<RemoteISCSIPortInformation> portsInformation) {
        this.name = name;
        this.portsInformation = portsInformation;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public List<RemoteISCSIPortInformation> getPortsInformation() {
        if (this.portsInformation == null) {
            this.portsInformation = new ArrayList();
        }
        return this.portsInformation;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RemoteISCSIPortsConfiguration)) {
            return false;
        }
        RemoteISCSIPortsConfiguration otherObj = (RemoteISCSIPortsConfiguration) obj;

        return (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.portsInformation != null ? this.portsInformation.equals(otherObj.portsInformation) : this.portsInformation == otherObj.portsInformation);
    }


    public int hashCode() {
        return (this.name != null ? this.name.hashCode() : 0) ^ (this.portsInformation != null ? this.portsInformation.hashCode() : 0);
    }


    public String toString() {
        return "RemoteISCSIPortsConfiguration [name=" + this.name + ", " + "portsInformation=" + this.portsInformation + "]";
    }
}


