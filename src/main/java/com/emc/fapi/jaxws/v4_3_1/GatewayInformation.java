package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GatewayInformation", propOrder = {"destinationNetworkMask", "destinationSubnet", "gatewayIP"})
public class GatewayInformation {
    protected String destinationNetworkMask;
    protected String destinationSubnet;
    protected IPInformation gatewayIP;

    public GatewayInformation() {
    }

    public GatewayInformation(String destinationNetworkMask, String destinationSubnet, IPInformation gatewayIP) {
        this.destinationNetworkMask = destinationNetworkMask;
        this.destinationSubnet = destinationSubnet;
        this.gatewayIP = gatewayIP;
    }


    public String getDestinationNetworkMask() {
        return this.destinationNetworkMask;
    }


    public void setDestinationNetworkMask(String value) {
        this.destinationNetworkMask = value;
    }


    public String getDestinationSubnet() {
        return this.destinationSubnet;
    }


    public void setDestinationSubnet(String value) {
        this.destinationSubnet = value;
    }


    public IPInformation getGatewayIP() {
        return this.gatewayIP;
    }


    public void setGatewayIP(IPInformation value) {
        this.gatewayIP = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GatewayInformation)) {
            return false;
        }
        GatewayInformation otherObj = (GatewayInformation) obj;

        return (this.destinationNetworkMask != null ? this.destinationNetworkMask.equals(otherObj.destinationNetworkMask) : this.destinationNetworkMask == otherObj.destinationNetworkMask) && (this.destinationSubnet != null ? this.destinationSubnet.equals(otherObj.destinationSubnet) : this.destinationSubnet == otherObj.destinationSubnet) && (this.gatewayIP != null ? this.gatewayIP.equals(otherObj.gatewayIP) : this.gatewayIP == otherObj.gatewayIP);
    }


    public int hashCode() {
        return (this.destinationNetworkMask != null ? this.destinationNetworkMask.hashCode() : 0) ^ (this.destinationSubnet != null ? this.destinationSubnet.hashCode() : 0) ^ (this.gatewayIP != null ? this.gatewayIP.hashCode() : 0);
    }


    public String toString() {
        return "GatewayInformation [destinationNetworkMask=" + this.destinationNetworkMask + ", " + "destinationSubnet=" + this.destinationSubnet + ", " + "gatewayIP=" + this.gatewayIP + "]";
    }
}


