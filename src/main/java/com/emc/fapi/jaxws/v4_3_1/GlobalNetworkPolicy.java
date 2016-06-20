package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalNetworkPolicy", propOrder = {"dnsServers", "dnsSuffixes"})
public class GlobalNetworkPolicy {
    @XmlElement(required = true)
    protected List<String> dnsServers;
    @XmlElement(required = true)
    protected List<String> dnsSuffixes;

    public GlobalNetworkPolicy() {
    }

    public GlobalNetworkPolicy(List<String> dnsServers, List<String> dnsSuffixes) {
        this.dnsServers = dnsServers;
        this.dnsSuffixes = dnsSuffixes;
    }


    public List<String> getDnsServers() {
        if (this.dnsServers == null) {
            this.dnsServers = new ArrayList();
        }
        return this.dnsServers;
    }


    public List<String> getDnsSuffixes() {
        if (this.dnsSuffixes == null) {
            this.dnsSuffixes = new ArrayList();
        }
        return this.dnsSuffixes;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GlobalNetworkPolicy)) {
            return false;
        }
        GlobalNetworkPolicy otherObj = (GlobalNetworkPolicy) obj;

        return (this.dnsServers != null ? this.dnsServers.equals(otherObj.dnsServers) : this.dnsServers == otherObj.dnsServers) && (this.dnsSuffixes != null ? this.dnsSuffixes.equals(otherObj.dnsSuffixes) : this.dnsSuffixes == otherObj.dnsSuffixes);
    }


    public int hashCode() {
        return (this.dnsServers != null ? this.dnsServers.hashCode() : 0) ^ (this.dnsSuffixes != null ? this.dnsSuffixes.hashCode() : 0);
    }


    public String toString() {
        return "GlobalNetworkPolicy [dnsServers=" + this.dnsServers + ", " + "dnsSuffixes=" + this.dnsSuffixes + "]";
    }
}


