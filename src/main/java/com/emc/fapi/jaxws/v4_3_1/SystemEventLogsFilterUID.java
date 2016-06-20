package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemEventLogsFilterUID", propOrder = {"id"})
public class SystemEventLogsFilterUID {
    protected long id;

    public SystemEventLogsFilterUID() {
    }

    public SystemEventLogsFilterUID(long id) {
        this.id = id;
    }


    public long getId() {
        return this.id;
    }


    public void setId(long value) {
        this.id = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SystemEventLogsFilterUID)) {
            return false;
        }
        SystemEventLogsFilterUID otherObj = (SystemEventLogsFilterUID) obj;

        return this.id == otherObj.id;
    }


    public int hashCode() {
        return (int) this.id;
    }


    public String toString() {
        return "SystemEventLogsFilterUID [id=" + this.id + "]";
    }
}


