package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addSplitter", propOrder = {"splitterInfo"})
public class AddSplitter {
    @XmlElement(nillable = true)
    protected SplitterInfo splitterInfo;

    public AddSplitter() {
    }

    public AddSplitter(SplitterInfo splitterInfo) {
        this.splitterInfo = splitterInfo;
    }


    public SplitterInfo getSplitterInfo() {
        return this.splitterInfo;
    }


    public void setSplitterInfo(SplitterInfo value) {
        this.splitterInfo = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddSplitter)) {
            return false;
        }
        AddSplitter otherObj = (AddSplitter) obj;

        return this.splitterInfo == otherObj.splitterInfo ? true : this.splitterInfo != null ? this.splitterInfo.equals(otherObj.splitterInfo) : false;
    }


    public int hashCode() {
        return this.splitterInfo != null ? this.splitterInfo.hashCode() : 0;
    }


    public String toString() {
        return "AddSplitter [splitterInfo=" + this.splitterInfo + "]";
    }
}


