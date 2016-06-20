package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ImageAccessTargetVirtualNetworkAutomaticCreationParam")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageAccessTargetVirtualNetworkAutomaticCreationParam", propOrder = {"sharedNetwork"})
public class ImageAccessTargetVirtualNetworkAutomaticCreationParam
        extends ImageAccessTargetVirtualNetworkParam {
    protected boolean sharedNetwork;

    public ImageAccessTargetVirtualNetworkAutomaticCreationParam() {
    }

    public ImageAccessTargetVirtualNetworkAutomaticCreationParam(boolean sharedNetwork) {
        this.sharedNetwork = sharedNetwork;
    }


    public boolean isSharedNetwork() {
        return this.sharedNetwork;
    }


    public void setSharedNetwork(boolean value) {
        this.sharedNetwork = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ImageAccessTargetVirtualNetworkAutomaticCreationParam)) {
            return false;
        }
        ImageAccessTargetVirtualNetworkAutomaticCreationParam otherObj = (ImageAccessTargetVirtualNetworkAutomaticCreationParam) obj;

        return (super.equals(obj)) && (this.sharedNetwork == otherObj.sharedNetwork);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.sharedNetwork ? 1 : 0);
    }


    public String toString() {
        return "ImageAccessTargetVirtualNetworkAutomaticCreationParam [super=" + super.toString() + ", " + "sharedNetwork=" + this.sharedNetwork + "]";
    }
}


