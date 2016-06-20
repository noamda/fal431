package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collectLogs", propOrder = {"params"})
public class CollectLogs {
    protected CollectLogsParams params;

    public CollectLogs() {
    }

    public CollectLogs(CollectLogsParams params) {
        this.params = params;
    }


    public CollectLogsParams getParams() {
        return this.params;
    }


    public void setParams(CollectLogsParams value) {
        this.params = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CollectLogs)) {
            return false;
        }
        CollectLogs otherObj = (CollectLogs) obj;

        return this.params == otherObj.params ? true : this.params != null ? this.params.equals(otherObj.params) : false;
    }


    public int hashCode() {
        return this.params != null ? this.params.hashCode() : 0;
    }


    public String toString() {
        return "CollectLogs [params=" + this.params + "]";
    }
}


