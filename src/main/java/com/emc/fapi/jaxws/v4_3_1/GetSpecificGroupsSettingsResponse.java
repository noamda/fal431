package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSpecificGroupsSettingsResponse", propOrder = {"_return"})
public class GetSpecificGroupsSettingsResponse {
    @XmlElement(name = "return")
    protected List<ConsistencyGroupSettings> _return;

    public GetSpecificGroupsSettingsResponse() {
    }

    public GetSpecificGroupsSettingsResponse(List<ConsistencyGroupSettings> _return) {
        this._return = _return;
    }


    public List<ConsistencyGroupSettings> getReturn() {
        if (this._return == null) {
            this._return = new ArrayList();
        }
        return this._return;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSpecificGroupsSettingsResponse)) {
            return false;
        }
        GetSpecificGroupsSettingsResponse otherObj = (GetSpecificGroupsSettingsResponse) obj;

        return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
    }


    public int hashCode() {
        return this._return != null ? this._return.hashCode() : 0;
    }


    public String toString() {
        return "GetSpecificGroupsSettingsResponse [_return=" + this._return + "]";
    }
}


