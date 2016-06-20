package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RpSupportedArrayCapabilities", propOrder = {"supportedArrayCapabilities"})
public class RpSupportedArrayCapabilities {
    @XmlElement(nillable = true)
    protected List<RpSupportedArrayCapability> supportedArrayCapabilities;

    public RpSupportedArrayCapabilities() {
    }

    public RpSupportedArrayCapabilities(List<RpSupportedArrayCapability> supportedArrayCapabilities) {
        this.supportedArrayCapabilities = supportedArrayCapabilities;
    }


    public List<RpSupportedArrayCapability> getSupportedArrayCapabilities() {
        if (this.supportedArrayCapabilities == null) {
            this.supportedArrayCapabilities = new ArrayList();
        }
        return this.supportedArrayCapabilities;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RpSupportedArrayCapabilities)) {
            return false;
        }
        RpSupportedArrayCapabilities otherObj = (RpSupportedArrayCapabilities) obj;

        return this.supportedArrayCapabilities == otherObj.supportedArrayCapabilities ? true : this.supportedArrayCapabilities != null ? this.supportedArrayCapabilities.equals(otherObj.supportedArrayCapabilities) : false;
    }


    public int hashCode() {
        return this.supportedArrayCapabilities != null ? this.supportedArrayCapabilities.hashCode() : 0;
    }


    public String toString() {
        return "RpSupportedArrayCapabilities [supportedArrayCapabilities=" + this.supportedArrayCapabilities + "]";
    }
}


