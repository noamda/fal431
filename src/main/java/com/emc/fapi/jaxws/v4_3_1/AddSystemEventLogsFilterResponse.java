package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addSystemEventLogsFilterResponse", propOrder = {"_return"})
public class AddSystemEventLogsFilterResponse {
    @XmlElement(name = "return")
    protected SystemEventLogsFilterUID _return;

    public AddSystemEventLogsFilterResponse() {
    }

    public AddSystemEventLogsFilterResponse(SystemEventLogsFilterUID _return) {
        this._return = _return;
    }


    public SystemEventLogsFilterUID getReturn() {
        return this._return;
    }


    public void setReturn(SystemEventLogsFilterUID value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddSystemEventLogsFilterResponse)) {
            return false;
        }
        AddSystemEventLogsFilterResponse otherObj = (AddSystemEventLogsFilterResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "AddSystemEventLogsFilterResponse [_return=" + this._return + "]";
    }
}


