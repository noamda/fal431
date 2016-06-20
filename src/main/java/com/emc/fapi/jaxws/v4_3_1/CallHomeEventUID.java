package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallHomeEventUID", propOrder = {"id"})
public class CallHomeEventUID {
    protected long id;

    public CallHomeEventUID() {
    }

    public CallHomeEventUID(long id) {
        this.id = id;
    }


    public long getId() {
        return this.id;
    }


    public void setId(long value) {
        this.id = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CallHomeEventUID)) {
            return false;
        }
        CallHomeEventUID otherObj = (CallHomeEventUID) obj;

        return this.id == otherObj.id;
    }


    public int hashCode() {
        return (int) this.id;
    }


    public String toString() {
        return "CallHomeEventUID [id=" + this.id + "]";
    }
}


