package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportStepUID", propOrder = {"id"})
public class ReportStepUID {
    protected short id;

    public ReportStepUID() {
    }

    public ReportStepUID(short id) {
        this.id = id;
    }


    public short getId() {
        return this.id;
    }


    public void setId(short value) {
        this.id = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ReportStepUID)) {
            return false;
        }
        ReportStepUID otherObj = (ReportStepUID) obj;

        return this.id == otherObj.id;
    }


    public int hashCode() {
        return this.id;
    }


    public String toString() {
        return "ReportStepUID [id=" + this.id + "]";
    }
}


