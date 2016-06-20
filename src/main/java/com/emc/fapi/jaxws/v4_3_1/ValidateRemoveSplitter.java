package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateRemoveSplitter", propOrder = {"splitter"})
public class ValidateRemoveSplitter {
    protected SplitterUID splitter;

    public ValidateRemoveSplitter() {
    }

    public ValidateRemoveSplitter(SplitterUID splitter) {
        this.splitter = splitter;
    }


    public SplitterUID getSplitter() {
        return this.splitter;
    }


    public void setSplitter(SplitterUID value) {
        this.splitter = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateRemoveSplitter)) {
            return false;
        }
        ValidateRemoveSplitter otherObj = (ValidateRemoveSplitter) obj;

        return this.splitter == otherObj.splitter ? true : this.splitter != null ? this.splitter.equals(otherObj.splitter) : false;
    }


    public int hashCode() {
        return this.splitter != null ? this.splitter.hashCode() : 0;
    }


    public String toString() {
        return "ValidateRemoveSplitter [splitter=" + this.splitter + "]";
    }
}


