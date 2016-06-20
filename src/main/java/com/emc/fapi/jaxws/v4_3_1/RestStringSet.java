package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restStringSet", propOrder = {"stringSet"})
public class RestStringSet {
    @XmlElement(nillable = true)
    protected List<String> stringSet;

    public RestStringSet() {
    }

    public RestStringSet(List<String> stringSet) {
        this.stringSet = stringSet;
    }


    public List<String> getStringSet() {
        if (this.stringSet == null) {
            this.stringSet = new ArrayList();
        }
        return this.stringSet;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RestStringSet)) {
            return false;
        }
        RestStringSet otherObj = (RestStringSet) obj;

        return this.stringSet == otherObj.stringSet ? true : this.stringSet != null ? this.stringSet.equals(otherObj.stringSet) : false;
    }


    public int hashCode() {
        return this.stringSet != null ? this.stringSet.hashCode() : 0;
    }


    public String toString() {
        return "RestStringSet [stringSet=" + this.stringSet + "]";
    }
}


