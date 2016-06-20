package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("CreateTargetVMManualResourcePlacementParam")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTargetVMManualResourcePlacementParam", propOrder = {"targetEsxUID"})
public class CreateTargetVMManualResourcePlacementParam
        extends CreateTargetVMResourcePlacementParam {
    @XmlElement(required = true)
    protected EsxUID targetEsxUID;

    public CreateTargetVMManualResourcePlacementParam() {
    }

    public CreateTargetVMManualResourcePlacementParam(EsxUID targetEsxUID) {
        this.targetEsxUID = targetEsxUID;
    }


    public EsxUID getTargetEsxUID() {
        return this.targetEsxUID;
    }


    public void setTargetEsxUID(EsxUID value) {
        this.targetEsxUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CreateTargetVMManualResourcePlacementParam)) {
            return false;
        }
        CreateTargetVMManualResourcePlacementParam otherObj = (CreateTargetVMManualResourcePlacementParam) obj;

        return (super.equals(obj)) && (this.targetEsxUID != null ? this.targetEsxUID.equals(otherObj.targetEsxUID) : this.targetEsxUID == otherObj.targetEsxUID);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.targetEsxUID != null ? this.targetEsxUID.hashCode() : 0);
    }


    public String toString() {
        return "CreateTargetVMManualResourcePlacementParam [super=" + super.toString() + ", " + "targetEsxUID=" + this.targetEsxUID + "]";
    }
}


