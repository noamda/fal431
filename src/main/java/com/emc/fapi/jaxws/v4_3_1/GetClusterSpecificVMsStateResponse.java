package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClusterSpecificVMsStateResponse", propOrder = {"_return"})
public class GetClusterSpecificVMsStateResponse {
    @XmlElement(name = "return")
    protected List<VmState> _return;

    public GetClusterSpecificVMsStateResponse() {
    }

    public GetClusterSpecificVMsStateResponse(List<VmState> _return) {
        this._return = _return;
    }


    public List<VmState> getReturn() {
        if (this._return == null) {
            this._return = new ArrayList();
        }
        return this._return;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetClusterSpecificVMsStateResponse)) {
            return false;
        }
        GetClusterSpecificVMsStateResponse otherObj = (GetClusterSpecificVMsStateResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetClusterSpecificVMsStateResponse [_return=" + this._return + "]";
    }
}


