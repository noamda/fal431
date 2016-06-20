package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RPAConfiguration", propOrder = {"rpaUID", "nicsInformation", "spoofedPorts", "localISCSIPortsConfiguration", "ntpServersIPs"})
public class RPAConfiguration {
    @XmlElement(nillable = true)
    protected RpaUID rpaUID;
    @XmlElement(nillable = true)
    protected List<NICInformation> nicsInformation;
    @XmlElement(nillable = true)
    protected List<RPAPortInformation> spoofedPorts;
    @XmlElement(nillable = true)
    protected LocalISCSIPortsConfiguration localISCSIPortsConfiguration;
    @XmlElement(nillable = true)
    protected List<String> ntpServersIPs;

    public RPAConfiguration() {
    }

    public RPAConfiguration(RpaUID rpaUID, List<NICInformation> nicsInformation, List<RPAPortInformation> spoofedPorts, LocalISCSIPortsConfiguration localISCSIPortsConfiguration, List<String> ntpServersIPs) {
        this.rpaUID = rpaUID;
        this.nicsInformation = nicsInformation;
        this.spoofedPorts = spoofedPorts;
        this.localISCSIPortsConfiguration = localISCSIPortsConfiguration;
        this.ntpServersIPs = ntpServersIPs;
    }


    public RpaUID getRpaUID() {
        return this.rpaUID;
    }


    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }


    public List<NICInformation> getNicsInformation() {
        if (this.nicsInformation == null) {
            this.nicsInformation = new ArrayList();
        }
        return this.nicsInformation;
    }


    public List<RPAPortInformation> getSpoofedPorts() {
        if (this.spoofedPorts == null) {
            this.spoofedPorts = new ArrayList();
        }
        return this.spoofedPorts;
    }


    public LocalISCSIPortsConfiguration getLocalISCSIPortsConfiguration() {
        return this.localISCSIPortsConfiguration;
    }


    public void setLocalISCSIPortsConfiguration(LocalISCSIPortsConfiguration value) {
        this.localISCSIPortsConfiguration = value;
    }


    public List<String> getNtpServersIPs() {
        if (this.ntpServersIPs == null) {
            this.ntpServersIPs = new ArrayList();
        }
        return this.ntpServersIPs;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RPAConfiguration)) {
            return false;
        }
        RPAConfiguration otherObj = (RPAConfiguration) obj;

        return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.nicsInformation != null ? this.nicsInformation.equals(otherObj.nicsInformation) : this.nicsInformation == otherObj.nicsInformation) && (this.spoofedPorts != null ? this.spoofedPorts.equals(otherObj.spoofedPorts) : this.spoofedPorts == otherObj.spoofedPorts) && (this.localISCSIPortsConfiguration != null ? this.localISCSIPortsConfiguration.equals(otherObj.localISCSIPortsConfiguration) : this.localISCSIPortsConfiguration == otherObj.localISCSIPortsConfiguration) && (this.ntpServersIPs != null ? this.ntpServersIPs.equals(otherObj.ntpServersIPs) : this.ntpServersIPs == otherObj.ntpServersIPs);
    }


    public int hashCode() {
        return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ (this.nicsInformation != null ? this.nicsInformation.hashCode() : 0) ^ (this.spoofedPorts != null ? this.spoofedPorts.hashCode() : 0) ^ (this.localISCSIPortsConfiguration != null ? this.localISCSIPortsConfiguration.hashCode() : 0) ^ (this.ntpServersIPs != null ? this.ntpServersIPs.hashCode() : 0);
    }


    public String toString() {
        return "RPAConfiguration [rpaUID=" + this.rpaUID + ", " + "nicsInformation=" + this.nicsInformation + ", " + "spoofedPorts=" + this.spoofedPorts + ", " + "localISCSIPortsConfiguration=" + this.localISCSIPortsConfiguration + ", " + "ntpServersIPs=" + this.ntpServersIPs + "]";
    }
}


