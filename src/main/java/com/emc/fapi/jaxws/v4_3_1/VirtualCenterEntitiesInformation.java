package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualCenterEntitiesInformation", propOrder = {"virtualCenterUID", "name", "dcEntitiesInformation"})
public class VirtualCenterEntitiesInformation {
    @XmlElement(nillable = true)
    protected VirtualCenterUID virtualCenterUID;
    protected String name;
    @XmlElement(nillable = true)
    protected List<DatacenterEntitiesInformation> dcEntitiesInformation;

    public VirtualCenterEntitiesInformation() {
    }

    public VirtualCenterEntitiesInformation(VirtualCenterUID virtualCenterUID, String name, List<DatacenterEntitiesInformation> dcEntitiesInformation) {
        this.virtualCenterUID = virtualCenterUID;
        this.name = name;
        this.dcEntitiesInformation = dcEntitiesInformation;
    }


    public VirtualCenterUID getVirtualCenterUID() {
        return this.virtualCenterUID;
    }


    public void setVirtualCenterUID(VirtualCenterUID value) {
        this.virtualCenterUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public List<DatacenterEntitiesInformation> getDcEntitiesInformation() {
        if (this.dcEntitiesInformation == null) {
            this.dcEntitiesInformation = new ArrayList();
        }
        return this.dcEntitiesInformation;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualCenterEntitiesInformation)) {
            return false;
        }
        VirtualCenterEntitiesInformation otherObj = (VirtualCenterEntitiesInformation) obj;

        return (this.virtualCenterUID != null ? this.virtualCenterUID.equals(otherObj.virtualCenterUID) : this.virtualCenterUID == otherObj.virtualCenterUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.dcEntitiesInformation != null ? this.dcEntitiesInformation.equals(otherObj.dcEntitiesInformation) : this.dcEntitiesInformation == otherObj.dcEntitiesInformation);
    }


    public int hashCode() {
        return (this.virtualCenterUID != null ? this.virtualCenterUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.dcEntitiesInformation != null ? this.dcEntitiesInformation.hashCode() : 0);
    }


    public String toString() {
        return "VirtualCenterEntitiesInformation [virtualCenterUID=" + this.virtualCenterUID + ", " + "name=" + this.name + ", " + "dcEntitiesInformation=" + this.dcEntitiesInformation + "]";
    }
}


