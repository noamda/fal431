package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("CreateTargetVMAutomaticResourcePlacementParam")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTargetVMAutomaticResourcePlacementParam", propOrder = {"targetResourcePoolUID"})
public class CreateTargetVMAutomaticResourcePlacementParam
        extends CreateTargetVMResourcePlacementParam {
    @XmlElement(required = true)
    protected VirtualResourcePoolUUID targetResourcePoolUID;

    public CreateTargetVMAutomaticResourcePlacementParam() {
    }

    public CreateTargetVMAutomaticResourcePlacementParam(VirtualResourcePoolUUID targetResourcePoolUID) {
        this.targetResourcePoolUID = targetResourcePoolUID;
    }


    public VirtualResourcePoolUUID getTargetResourcePoolUID() {
        return this.targetResourcePoolUID;
    }


    public void setTargetResourcePoolUID(VirtualResourcePoolUUID value) {
        this.targetResourcePoolUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CreateTargetVMAutomaticResourcePlacementParam)) {
            return false;
        }
        CreateTargetVMAutomaticResourcePlacementParam otherObj = (CreateTargetVMAutomaticResourcePlacementParam) obj;

        return (super.equals(obj)) && (this.targetResourcePoolUID != null ? this.targetResourcePoolUID.equals(otherObj.targetResourcePoolUID) : this.targetResourcePoolUID == otherObj.targetResourcePoolUID);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.targetResourcePoolUID != null ? this.targetResourcePoolUID.hashCode() : 0);
    }


    public String toString() {
        return "CreateTargetVMAutomaticResourcePlacementParam [super=" + super.toString() + ", " + "targetResourcePoolUID=" + this.targetResourcePoolUID + "]";
    }
}


