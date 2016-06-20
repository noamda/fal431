package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClusterSANVolumesContextResponse", propOrder = {"_return"})
public class GetClusterSANVolumesContextResponse {
    @XmlElement(name = "return")
    protected ClusterSANVolumesContext _return;

    public GetClusterSANVolumesContextResponse() {
    }

    public GetClusterSANVolumesContextResponse(ClusterSANVolumesContext _return) {
        this._return = _return;
    }


    public ClusterSANVolumesContext getReturn() {
        return this._return;
    }


    public void setReturn(ClusterSANVolumesContext value) {
        this._return = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetClusterSANVolumesContextResponse)) {
            return false;
        }
        GetClusterSANVolumesContextResponse otherObj = (GetClusterSANVolumesContextResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetClusterSANVolumesContextResponse [_return=" + this._return + "]";
    }
}


