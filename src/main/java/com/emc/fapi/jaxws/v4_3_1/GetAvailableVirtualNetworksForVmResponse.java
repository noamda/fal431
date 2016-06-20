package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableVirtualNetworksForVmResponse", propOrder = {"_return"})
public class GetAvailableVirtualNetworksForVmResponse {
    @XmlElement(name = "return")
    protected List<VirtualNetworkConfiguration> _return;

    public GetAvailableVirtualNetworksForVmResponse() {
    }

    public GetAvailableVirtualNetworksForVmResponse(List<VirtualNetworkConfiguration> _return) {
        this._return = _return;
    }


    public List<VirtualNetworkConfiguration> getReturn() {
        if (this._return == null) {
            this._return = new ArrayList();
        }
        return this._return;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAvailableVirtualNetworksForVmResponse)) {
            return false;
        }
        GetAvailableVirtualNetworksForVmResponse otherObj = (GetAvailableVirtualNetworksForVmResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetAvailableVirtualNetworksForVmResponse [_return=" + this._return + "]";
    }
}


