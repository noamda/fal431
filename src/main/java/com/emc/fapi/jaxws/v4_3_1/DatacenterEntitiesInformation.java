package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatacenterEntitiesInformation", propOrder = {"dcUID", "vmEntitiesInformation"})
public class DatacenterEntitiesInformation {
    @XmlElement(nillable = true)
    protected DatacenterUID dcUID;
    @XmlElement(nillable = true)
    protected List<VMEntitiesInformation> vmEntitiesInformation;

    public DatacenterEntitiesInformation() {
    }

    public DatacenterEntitiesInformation(DatacenterUID dcUID, List<VMEntitiesInformation> vmEntitiesInformation) {
        this.dcUID = dcUID;
        this.vmEntitiesInformation = vmEntitiesInformation;
    }


    public DatacenterUID getDcUID() {
        return this.dcUID;
    }


    public void setDcUID(DatacenterUID value) {
        this.dcUID = value;
    }


    public List<VMEntitiesInformation> getVmEntitiesInformation() {
        if (this.vmEntitiesInformation == null) {
            this.vmEntitiesInformation = new ArrayList();
        }
        return this.vmEntitiesInformation;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DatacenterEntitiesInformation)) {
            return false;
        }
        DatacenterEntitiesInformation otherObj = (DatacenterEntitiesInformation) obj;

        return (this.dcUID != null ? this.dcUID.equals(otherObj.dcUID) : this.dcUID == otherObj.dcUID) && (this.vmEntitiesInformation != null ? this.vmEntitiesInformation.equals(otherObj.vmEntitiesInformation) : this.vmEntitiesInformation == otherObj.vmEntitiesInformation);
    }


    public int hashCode() {
        return (this.dcUID != null ? this.dcUID.hashCode() : 0) ^ (this.vmEntitiesInformation != null ? this.vmEntitiesInformation.hashCode() : 0);
    }


    public String toString() {
        return "DatacenterEntitiesInformation [dcUID=" + this.dcUID + ", " + "vmEntitiesInformation=" + this.vmEntitiesInformation + "]";
    }
}


