package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalISCSIPortsConfiguration", propOrder = {"portsInformation"})
public class LocalISCSIPortsConfiguration {
    @XmlElement(nillable = true)
    protected List<LocalISCSIPortInformation> portsInformation;

    public LocalISCSIPortsConfiguration() {
    }

    public LocalISCSIPortsConfiguration(List<LocalISCSIPortInformation> portsInformation) {
        this.portsInformation = portsInformation;
    }


    public List<LocalISCSIPortInformation> getPortsInformation() {
        if (this.portsInformation == null) {
            this.portsInformation = new ArrayList();
        }
        return this.portsInformation;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof LocalISCSIPortsConfiguration)) {
            return false;
        }
        LocalISCSIPortsConfiguration otherObj = (LocalISCSIPortsConfiguration) obj;

        return this.portsInformation == otherObj.portsInformation ? true : this.portsInformation != null ? this.portsInformation.equals(otherObj.portsInformation) : false;
    }


    public int hashCode() {
        return this.portsInformation != null ? this.portsInformation.hashCode() : 0;
    }


    public String toString() {
        return "LocalISCSIPortsConfiguration [portsInformation=" + this.portsInformation + "]";
    }
}


