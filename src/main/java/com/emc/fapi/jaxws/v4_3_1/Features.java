package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Features", propOrder = {"features"})
public class Features {
    @XmlElement(nillable = true)
    protected List<String> features;

    public Features() {
    }

    public Features(List<String> features) {
        this.features = features;
    }


    public List<String> getFeatures() {
        if (this.features == null) {
            this.features = new ArrayList();
        }
        return this.features;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof Features)) {
            return false;
        }
        Features otherObj = (Features) obj;

        return this.features == otherObj.features ? true : this.features != null ? this.features.equals(otherObj.features) : false;
    }


    public int hashCode() {
        return this.features != null ? this.features.hashCode() : 0;
    }


    public String toString() {
        return "Features [features=" + this.features + "]";
    }
}


