package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VCenterServerLunFilter")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCenterServerLunFilter", propOrder = {"lunID"})
public class VCenterServerLunFilter
        extends VCenterServerFilter {
    @XmlElement(required = true)
    protected DeviceUID lunID;

    public VCenterServerLunFilter() {
    }

    public VCenterServerLunFilter(DeviceUID lunID) {
        this.lunID = lunID;
    }


    public DeviceUID getLunID() {
        return this.lunID;
    }


    public void setLunID(DeviceUID value) {
        this.lunID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VCenterServerLunFilter)) {
            return false;
        }
        VCenterServerLunFilter otherObj = (VCenterServerLunFilter) obj;

        return (super.equals(obj)) && (this.lunID != null ? this.lunID.equals(otherObj.lunID) : this.lunID == otherObj.lunID);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.lunID != null ? this.lunID.hashCode() : 0);
    }


    public String toString() {
        return "VCenterServerLunFilter [super=" + super.toString() + ", " + "lunID=" + this.lunID + "]";
    }
}


