package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "finishRPAMaintenance", propOrder = {"rpa"})
public class FinishRPAMaintenance {
    protected RpaUID rpa;

    public FinishRPAMaintenance() {
    }

    public FinishRPAMaintenance(RpaUID rpa) {
        this.rpa = rpa;
    }


    public RpaUID getRpa() {
        return this.rpa;
    }


    public void setRpa(RpaUID value) {
        this.rpa = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FinishRPAMaintenance)) {
            return false;
        }
        FinishRPAMaintenance otherObj = (FinishRPAMaintenance) obj;

        return this.rpa == otherObj.rpa ? true : this.rpa != null ? this.rpa.equals(otherObj.rpa) : false;
    }


    public int hashCode() {
        return this.rpa != null ? this.rpa.hashCode() : 0;
    }


    public String toString() {
        return "FinishRPAMaintenance [rpa=" + this.rpa + "]";
    }
}


