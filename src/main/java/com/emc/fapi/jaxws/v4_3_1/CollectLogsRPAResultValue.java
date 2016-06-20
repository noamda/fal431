package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("CollectLogsRPAResultValue")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectLogsRPAResultValue", propOrder = {"rpa"})
public class CollectLogsRPAResultValue
        extends CollectLogsResultValue {
    protected RpaUID rpa;

    public CollectLogsRPAResultValue() {
    }

    public CollectLogsRPAResultValue(RpaUID rpa) {
        this.rpa = rpa;
    }


    public RpaUID getRpa() {
        return this.rpa;
    }


    public void setRpa(RpaUID value) {
        this.rpa = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CollectLogsRPAResultValue)) {
            return false;
        }
        CollectLogsRPAResultValue otherObj = (CollectLogsRPAResultValue) obj;

        return (super.equals(obj)) && (this.rpa != null ? this.rpa.equals(otherObj.rpa) : this.rpa == otherObj.rpa);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.rpa != null ? this.rpa.hashCode() : 0);
    }


    public String toString() {
        return "CollectLogsRPAResultValue [super=" + super.toString() + ", " + "rpa=" + this.rpa + "]";
    }
}


