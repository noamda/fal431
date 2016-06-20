package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMonitoredParametersStatusResponse", propOrder = {"_return"})
public class GetMonitoredParametersStatusResponse {
    @XmlElement(name = "return")
    protected MonitoredParametersStatus _return;

    public GetMonitoredParametersStatusResponse() {
    }

    public GetMonitoredParametersStatusResponse(MonitoredParametersStatus _return) {
        this._return = _return;
    }


    public MonitoredParametersStatus getReturn() {
        return this._return;
    }


    public void setReturn(MonitoredParametersStatus value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetMonitoredParametersStatusResponse)) {
            return false;
        }
        GetMonitoredParametersStatusResponse otherObj = (GetMonitoredParametersStatusResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetMonitoredParametersStatusResponse [_return=" + this._return + "]";
    }
}


