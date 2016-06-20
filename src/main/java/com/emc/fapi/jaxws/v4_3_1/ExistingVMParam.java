package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.*;


@JsonTypeName("ExistingVMParam")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = SourceVmParam.class, name = "SourceVmParam")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExistingVMParam", propOrder = {"vmUID"})
@XmlSeeAlso({SourceVmParam.class})
public class ExistingVMParam
        extends VMParam {
    @XmlElement(required = true, nillable = true)
    protected VmUID vmUID;

    public ExistingVMParam() {
    }

    public ExistingVMParam(VmUID vmUID) {
        this.vmUID = vmUID;
    }


    public VmUID getVmUID() {
        return this.vmUID;
    }


    public void setVmUID(VmUID value) {
        this.vmUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ExistingVMParam)) {
            return false;
        }
        ExistingVMParam otherObj = (ExistingVMParam) obj;

        return (super.equals(obj)) && (this.vmUID != null ? this.vmUID.equals(otherObj.vmUID) : this.vmUID == otherObj.vmUID);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.vmUID != null ? this.vmUID.hashCode() : 0);
    }


    public String toString() {
        return "ExistingVMParam [super=" + super.toString() + ", " + "vmUID=" + this.vmUID + "]";
    }
}


