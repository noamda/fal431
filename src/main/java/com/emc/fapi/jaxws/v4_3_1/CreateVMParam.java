package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("CreateVMParam")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateVMParam", propOrder = {"targetVirtualCenterUID", "targetResourcePlacementParam", "targetDatastoreUID"})
public class CreateVMParam
        extends VMParam {
    @XmlElement(required = true)
    protected VirtualCenterUID targetVirtualCenterUID;
    @XmlElement(required = true)
    protected CreateTargetVMResourcePlacementParam targetResourcePlacementParam;
    @XmlElement(required = true)
    protected DatastoreUID targetDatastoreUID;

    public CreateVMParam() {
    }

    public CreateVMParam(VirtualCenterUID targetVirtualCenterUID, CreateTargetVMResourcePlacementParam targetResourcePlacementParam, DatastoreUID targetDatastoreUID) {
        this.targetVirtualCenterUID = targetVirtualCenterUID;
        this.targetResourcePlacementParam = targetResourcePlacementParam;
        this.targetDatastoreUID = targetDatastoreUID;
    }


    public VirtualCenterUID getTargetVirtualCenterUID() {
        return this.targetVirtualCenterUID;
    }


    public void setTargetVirtualCenterUID(VirtualCenterUID value) {
        this.targetVirtualCenterUID = value;
    }


    public CreateTargetVMResourcePlacementParam getTargetResourcePlacementParam() {
        return this.targetResourcePlacementParam;
    }


    public void setTargetResourcePlacementParam(CreateTargetVMResourcePlacementParam value) {
        this.targetResourcePlacementParam = value;
    }


    public DatastoreUID getTargetDatastoreUID() {
        return this.targetDatastoreUID;
    }


    public void setTargetDatastoreUID(DatastoreUID value) {
        this.targetDatastoreUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CreateVMParam)) {
            return false;
        }
        CreateVMParam otherObj = (CreateVMParam) obj;

        return (super.equals(obj)) && (this.targetVirtualCenterUID != null ? this.targetVirtualCenterUID.equals(otherObj.targetVirtualCenterUID) : this.targetVirtualCenterUID == otherObj.targetVirtualCenterUID) && (this.targetResourcePlacementParam != null ? this.targetResourcePlacementParam.equals(otherObj.targetResourcePlacementParam) : this.targetResourcePlacementParam == otherObj.targetResourcePlacementParam) && (this.targetDatastoreUID != null ? this.targetDatastoreUID.equals(otherObj.targetDatastoreUID) : this.targetDatastoreUID == otherObj.targetDatastoreUID);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.targetVirtualCenterUID != null ? this.targetVirtualCenterUID.hashCode() : 0) ^ (this.targetResourcePlacementParam != null ? this.targetResourcePlacementParam.hashCode() : 0) ^ (this.targetDatastoreUID != null ? this.targetDatastoreUID.hashCode() : 0);
    }


    public String toString() {
        return "CreateVMParam [super=" + super.toString() + ", " + "targetVirtualCenterUID=" + this.targetVirtualCenterUID + ", " + "targetResourcePlacementParam=" + this.targetResourcePlacementParam + ", " + "targetDatastoreUID=" + this.targetDatastoreUID + "]";
    }
}


