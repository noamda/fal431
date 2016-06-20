package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("LocalISCSIPortInformation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalISCSIPortInformation", propOrder = {"nicInformation"})
public class LocalISCSIPortInformation
        extends ISCSIPortInformation {
    @XmlElement(nillable = true)
    protected NICInformation nicInformation;

    public LocalISCSIPortInformation() {
    }

    public LocalISCSIPortInformation(NICInformation nicInformation) {
        this.nicInformation = nicInformation;
    }


    public NICInformation getNicInformation() {
        return this.nicInformation;
    }


    public void setNicInformation(NICInformation value) {
        this.nicInformation = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof LocalISCSIPortInformation)) {
            return false;
        }
        LocalISCSIPortInformation otherObj = (LocalISCSIPortInformation) obj;

        return (super.equals(obj)) && (this.nicInformation != null ? this.nicInformation.equals(otherObj.nicInformation) : this.nicInformation == otherObj.nicInformation);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.nicInformation != null ? this.nicInformation.hashCode() : 0);
    }


    public String toString() {
        return "LocalISCSIPortInformation [super=" + super.toString() + ", " + "nicInformation=" + this.nicInformation + "]";
    }
}


