package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayCapabilities", propOrder = {"arrayCapabilities"})
public class ArrayCapabilities {
    @XmlElement(nillable = true)
    protected List<ArrayCapability> arrayCapabilities;

    public ArrayCapabilities() {
    }

    public ArrayCapabilities(List<ArrayCapability> arrayCapabilities) {
        this.arrayCapabilities = arrayCapabilities;
    }


    public List<ArrayCapability> getArrayCapabilities() {
        if (this.arrayCapabilities == null) {
            this.arrayCapabilities = new ArrayList();
        }
        return this.arrayCapabilities;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayCapabilities)) {
            return false;
        }
        ArrayCapabilities otherObj = (ArrayCapabilities) obj;

        return this.arrayCapabilities == otherObj.arrayCapabilities ? true : this.arrayCapabilities != null ? this.arrayCapabilities.equals(otherObj.arrayCapabilities) : false;
    }


    public int hashCode() {
        return this.arrayCapabilities != null ? this.arrayCapabilities.hashCode() : 0;
    }


    public String toString() {
        return "ArrayCapabilities [arrayCapabilities=" + this.arrayCapabilities + "]";
    }
}


