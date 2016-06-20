package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArrayManagementProviderState", propOrder = {"ampUID"})
public class GetArrayManagementProviderState {
    protected ArrayManagementProviderUID ampUID;

    public GetArrayManagementProviderState() {
    }

    public GetArrayManagementProviderState(ArrayManagementProviderUID ampUID) {
        this.ampUID = ampUID;
    }


    public ArrayManagementProviderUID getAmpUID() {
        return this.ampUID;
    }


    public void setAmpUID(ArrayManagementProviderUID value) {
        this.ampUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetArrayManagementProviderState)) {
            return false;
        }
        GetArrayManagementProviderState otherObj = (GetArrayManagementProviderState) obj;

        return this.ampUID == otherObj.ampUID ? true : this.ampUID != null ? this.ampUID.equals(otherObj.ampUID) : false;
    }


    public int hashCode() {
        return this.ampUID != null ? this.ampUID.hashCode() : 0;
    }


    public String toString() {
        return "GetArrayManagementProviderState [ampUID=" + this.ampUID + "]";
    }
}


