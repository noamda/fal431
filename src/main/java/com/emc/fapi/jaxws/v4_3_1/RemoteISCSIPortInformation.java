package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("RemoteISCSIPortInformation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteISCSIPortInformation", propOrder = {"ipInformation"})
public class RemoteISCSIPortInformation
        extends ISCSIPortInformation {
    @XmlElement(nillable = true)
    protected IPInformation ipInformation;

    public RemoteISCSIPortInformation() {
    }

    public RemoteISCSIPortInformation(IPInformation ipInformation) {
        this.ipInformation = ipInformation;
    }


    public IPInformation getIpInformation() {
        return this.ipInformation;
    }


    public void setIpInformation(IPInformation value) {
        this.ipInformation = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RemoteISCSIPortInformation)) {
            return false;
        }
        RemoteISCSIPortInformation otherObj = (RemoteISCSIPortInformation) obj;

        return (super.equals(obj)) && (this.ipInformation != null ? this.ipInformation.equals(otherObj.ipInformation) : this.ipInformation == otherObj.ipInformation);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.ipInformation != null ? this.ipInformation.hashCode() : 0);
    }


    public String toString() {
        return "RemoteISCSIPortInformation [super=" + super.toString() + ", " + "ipInformation=" + this.ipInformation + "]";
    }
}


