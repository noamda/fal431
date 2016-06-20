package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayManagementProviderState", propOrder = {"ampUID", "arraysState", "connectivityInfo"})
public class ArrayManagementProviderState {
    protected ArrayManagementProviderUID ampUID;
    @XmlElement(nillable = true)
    protected List<ArrayState> arraysState;
    protected ArrayConnectivityInfo connectivityInfo;

    public ArrayManagementProviderState() {
    }

    public ArrayManagementProviderState(ArrayManagementProviderUID ampUID, List<ArrayState> arraysState, ArrayConnectivityInfo connectivityInfo) {
        this.ampUID = ampUID;
        this.arraysState = arraysState;
        this.connectivityInfo = connectivityInfo;
    }


    public ArrayManagementProviderUID getAmpUID() {
        return this.ampUID;
    }


    public void setAmpUID(ArrayManagementProviderUID value) {
        this.ampUID = value;
    }


    public List<ArrayState> getArraysState() {
        if (this.arraysState == null) {
            this.arraysState = new ArrayList();
        }
        return this.arraysState;
    }


    public ArrayConnectivityInfo getConnectivityInfo() {
        return this.connectivityInfo;
    }


    public void setConnectivityInfo(ArrayConnectivityInfo value) {
        this.connectivityInfo = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayManagementProviderState)) {
            return false;
        }
        ArrayManagementProviderState otherObj = (ArrayManagementProviderState) obj;

        return (this.ampUID != null ? this.ampUID.equals(otherObj.ampUID) : this.ampUID == otherObj.ampUID) && (this.arraysState != null ? this.arraysState.equals(otherObj.arraysState) : this.arraysState == otherObj.arraysState) && (this.connectivityInfo != null ? this.connectivityInfo.equals(otherObj.connectivityInfo) : this.connectivityInfo == otherObj.connectivityInfo);
    }


    public int hashCode() {
        return (this.ampUID != null ? this.ampUID.hashCode() : 0) ^ (this.arraysState != null ? this.arraysState.hashCode() : 0) ^ (this.connectivityInfo != null ? this.connectivityInfo.hashCode() : 0);
    }


    public String toString() {
        return "ArrayManagementProviderState [ampUID=" + this.ampUID + ", " + "arraysState=" + this.arraysState + ", " + "connectivityInfo=" + this.connectivityInfo + "]";
    }
}


