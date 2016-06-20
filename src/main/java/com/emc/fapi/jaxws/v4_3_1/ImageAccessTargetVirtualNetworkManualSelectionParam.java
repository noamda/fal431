package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ImageAccessTargetVirtualNetworkManualSelectionParam")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageAccessTargetVirtualNetworkManualSelectionParam", propOrder = {"networkUID"})
public class ImageAccessTargetVirtualNetworkManualSelectionParam
        extends ImageAccessTargetVirtualNetworkParam {
    @XmlElement(required = true)
    protected VirtualNetworkUID networkUID;

    public ImageAccessTargetVirtualNetworkManualSelectionParam() {
    }

    public ImageAccessTargetVirtualNetworkManualSelectionParam(VirtualNetworkUID networkUID) {
        this.networkUID = networkUID;
    }


    public VirtualNetworkUID getNetworkUID() {
        return this.networkUID;
    }


    public void setNetworkUID(VirtualNetworkUID value) {
        this.networkUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ImageAccessTargetVirtualNetworkManualSelectionParam)) {
            return false;
        }
        ImageAccessTargetVirtualNetworkManualSelectionParam otherObj = (ImageAccessTargetVirtualNetworkManualSelectionParam) obj;

        return (super.equals(obj)) && (this.networkUID != null ? this.networkUID.equals(otherObj.networkUID) : this.networkUID == otherObj.networkUID);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.networkUID != null ? this.networkUID.hashCode() : 0);
    }


    public String toString() {
        return "ImageAccessTargetVirtualNetworkManualSelectionParam [super=" + super.toString() + ", " + "networkUID=" + this.networkUID + "]";
    }
}


