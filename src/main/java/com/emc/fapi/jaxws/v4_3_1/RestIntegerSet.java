package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restIntegerSet", propOrder = {"integerSet"})
public class RestIntegerSet {
    @XmlElement(nillable = true)
    protected List<Integer> integerSet;

    public RestIntegerSet() {
    }

    public RestIntegerSet(List<Integer> integerSet) {
        this.integerSet = integerSet;
    }


    public List<Integer> getIntegerSet() {
        if (this.integerSet == null) {
            this.integerSet = new ArrayList();
        }
        return this.integerSet;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RestIntegerSet)) {
            return false;
        }
        RestIntegerSet otherObj = (RestIntegerSet) obj;

        return this.integerSet == otherObj.integerSet ? true : this.integerSet != null ? this.integerSet.equals(otherObj.integerSet) : false;
    }


    public int hashCode() {
        return this.integerSet != null ? this.integerSet.hashCode() : 0;
    }


    public String toString() {
        return "RestIntegerSet [integerSet=" + this.integerSet + "]";
    }
}


