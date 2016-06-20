package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NicCustomizationPolicy", propOrder = {"adapterId", "dnsDomain", "dnsServers", "primaryWINS", "netBios", "secondaryWINS", "ipV4Policy", "ipV6Policy"})
public class NicCustomizationPolicy {
    protected int adapterId;
    protected String dnsDomain;
    @XmlElement(nillable = true)
    protected List<String> dnsServers;
    protected String primaryWINS;
    @XmlElement(required = true)
    protected NetBiosMode netBios;
    protected String secondaryWINS;
    protected IPv4CustomizationPolicy ipV4Policy;
    protected IPv6CustomizationPolicy ipV6Policy;

    public NicCustomizationPolicy() {
    }

    public NicCustomizationPolicy(int adapterId, String dnsDomain, List<String> dnsServers, String primaryWINS, NetBiosMode netBios, String secondaryWINS, IPv4CustomizationPolicy ipV4Policy, IPv6CustomizationPolicy ipV6Policy) {
        this.adapterId = adapterId;
        this.dnsDomain = dnsDomain;
        this.dnsServers = dnsServers;
        this.primaryWINS = primaryWINS;
        this.netBios = netBios;
        this.secondaryWINS = secondaryWINS;
        this.ipV4Policy = ipV4Policy;
        this.ipV6Policy = ipV6Policy;
    }


    public int getAdapterId() {
        return this.adapterId;
    }


    public void setAdapterId(int value) {
        this.adapterId = value;
    }


    public String getDnsDomain() {
        return this.dnsDomain;
    }


    public void setDnsDomain(String value) {
        this.dnsDomain = value;
    }


    public List<String> getDnsServers() {
        if (this.dnsServers == null) {
            this.dnsServers = new ArrayList();
        }
        return this.dnsServers;
    }


    public String getPrimaryWINS() {
        return this.primaryWINS;
    }


    public void setPrimaryWINS(String value) {
        this.primaryWINS = value;
    }


    public NetBiosMode getNetBios() {
        return this.netBios;
    }


    public void setNetBios(NetBiosMode value) {
        this.netBios = value;
    }


    public String getSecondaryWINS() {
        return this.secondaryWINS;
    }


    public void setSecondaryWINS(String value) {
        this.secondaryWINS = value;
    }


    public IPv4CustomizationPolicy getIpV4Policy() {
        return this.ipV4Policy;
    }


    public void setIpV4Policy(IPv4CustomizationPolicy value) {
        this.ipV4Policy = value;
    }


    public IPv6CustomizationPolicy getIpV6Policy() {
        return this.ipV6Policy;
    }


    public void setIpV6Policy(IPv6CustomizationPolicy value) {
        this.ipV6Policy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof NicCustomizationPolicy)) {
            return false;
        }
        NicCustomizationPolicy otherObj = (NicCustomizationPolicy) obj;

        return (this.adapterId == otherObj.adapterId) && (this.dnsDomain != null ? this.dnsDomain.equals(otherObj.dnsDomain) : this.dnsDomain == otherObj.dnsDomain) && (this.dnsServers != null ? this.dnsServers.equals(otherObj.dnsServers) : this.dnsServers == otherObj.dnsServers) && (this.primaryWINS != null ? this.primaryWINS.equals(otherObj.primaryWINS) : this.primaryWINS == otherObj.primaryWINS) && (this.netBios != null ? this.netBios.equals(otherObj.netBios) : this.netBios == otherObj.netBios) && (this.secondaryWINS != null ? this.secondaryWINS.equals(otherObj.secondaryWINS) : this.secondaryWINS == otherObj.secondaryWINS) && (this.ipV4Policy != null ? this.ipV4Policy.equals(otherObj.ipV4Policy) : this.ipV4Policy == otherObj.ipV4Policy) && (this.ipV6Policy != null ? this.ipV6Policy.equals(otherObj.ipV6Policy) : this.ipV6Policy == otherObj.ipV6Policy);
    }


    public int hashCode() {
        return this.adapterId ^ (this.dnsDomain != null ? this.dnsDomain.hashCode() : 0) ^ (this.dnsServers != null ? this.dnsServers.hashCode() : 0) ^ (this.primaryWINS != null ? this.primaryWINS.hashCode() : 0) ^ (this.netBios != null ? this.netBios.hashCode() : 0) ^ (this.secondaryWINS != null ? this.secondaryWINS.hashCode() : 0) ^ (this.ipV4Policy != null ? this.ipV4Policy.hashCode() : 0) ^ (this.ipV6Policy != null ? this.ipV6Policy.hashCode() : 0);
    }


    public String toString() {
        return "NicCustomizationPolicy [adapterId=" + this.adapterId + ", " + "dnsDomain=" + this.dnsDomain + ", " + "dnsServers=" + this.dnsServers + ", " + "primaryWINS=" + this.primaryWINS + ", " + "netBios=" + this.netBios + ", " + "secondaryWINS=" + this.secondaryWINS + ", " + "ipV4Policy=" + this.ipV4Policy + ", " + "ipV6Policy=" + this.ipV6Policy + "]";
    }
}


