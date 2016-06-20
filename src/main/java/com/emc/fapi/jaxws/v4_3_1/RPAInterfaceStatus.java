package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RPAInterfaceStatus", propOrder = {"interfaceType", "interfaceStatus", "otherRPAsIPV4ConnectivityStatus", "otherRPAsIPV6ConnectivityStatus"})
public class RPAInterfaceStatus {
    @XmlElement(nillable = true)
    protected InterfaceType interfaceType;
    protected GeneralStatus interfaceStatus;
    @XmlElement(nillable = true)
    protected List<RPAConnectivityStatus> otherRPAsIPV4ConnectivityStatus;
    @XmlElement(nillable = true)
    protected List<RPAConnectivityStatus> otherRPAsIPV6ConnectivityStatus;

    public RPAInterfaceStatus() {
    }

    public RPAInterfaceStatus(InterfaceType interfaceType, GeneralStatus interfaceStatus, List<RPAConnectivityStatus> otherRPAsIPV4ConnectivityStatus, List<RPAConnectivityStatus> otherRPAsIPV6ConnectivityStatus) {
        this.interfaceType = interfaceType;
        this.interfaceStatus = interfaceStatus;
        this.otherRPAsIPV4ConnectivityStatus = otherRPAsIPV4ConnectivityStatus;
        this.otherRPAsIPV6ConnectivityStatus = otherRPAsIPV6ConnectivityStatus;
    }


    public InterfaceType getInterfaceType() {
        return this.interfaceType;
    }


    public void setInterfaceType(InterfaceType value) {
        this.interfaceType = value;
    }


    public GeneralStatus getInterfaceStatus() {
        return this.interfaceStatus;
    }


    public void setInterfaceStatus(GeneralStatus value) {
        this.interfaceStatus = value;
    }


    public List<RPAConnectivityStatus> getOtherRPAsIPV4ConnectivityStatus() {
        if (this.otherRPAsIPV4ConnectivityStatus == null) {
            this.otherRPAsIPV4ConnectivityStatus = new ArrayList();
        }
        return this.otherRPAsIPV4ConnectivityStatus;
    }


    public List<RPAConnectivityStatus> getOtherRPAsIPV6ConnectivityStatus() {
        if (this.otherRPAsIPV6ConnectivityStatus == null) {
            this.otherRPAsIPV6ConnectivityStatus = new ArrayList();
        }
        return this.otherRPAsIPV6ConnectivityStatus;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RPAInterfaceStatus)) {
            return false;
        }
        RPAInterfaceStatus otherObj = (RPAInterfaceStatus) obj;

        return (this.interfaceType != null ? this.interfaceType.equals(otherObj.interfaceType) : this.interfaceType == otherObj.interfaceType) && (this.interfaceStatus != null ? this.interfaceStatus.equals(otherObj.interfaceStatus) : this.interfaceStatus == otherObj.interfaceStatus) && (this.otherRPAsIPV4ConnectivityStatus != null ? this.otherRPAsIPV4ConnectivityStatus.equals(otherObj.otherRPAsIPV4ConnectivityStatus) : this.otherRPAsIPV4ConnectivityStatus == otherObj.otherRPAsIPV4ConnectivityStatus) && (this.otherRPAsIPV6ConnectivityStatus != null ? this.otherRPAsIPV6ConnectivityStatus.equals(otherObj.otherRPAsIPV6ConnectivityStatus) : this.otherRPAsIPV6ConnectivityStatus == otherObj.otherRPAsIPV6ConnectivityStatus);
    }


    public int hashCode() {
        return (this.interfaceType != null ? this.interfaceType.hashCode() : 0) ^ (this.interfaceStatus != null ? this.interfaceStatus.hashCode() : 0) ^ (this.otherRPAsIPV4ConnectivityStatus != null ? this.otherRPAsIPV4ConnectivityStatus.hashCode() : 0) ^ (this.otherRPAsIPV6ConnectivityStatus != null ? this.otherRPAsIPV6ConnectivityStatus.hashCode() : 0);
    }


    public String toString() {
        return "RPAInterfaceStatus [interfaceType=" + this.interfaceType + ", " + "interfaceStatus=" + this.interfaceStatus + ", " + "otherRPAsIPV4ConnectivityStatus=" + this.otherRPAsIPV4ConnectivityStatus + ", " + "otherRPAsIPV6ConnectivityStatus=" + this.otherRPAsIPV6ConnectivityStatus + "]";
    }
}


