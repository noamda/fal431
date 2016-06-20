package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SNMPSettings", propOrder = {"agentEnabled", "shouldSendEventTraps", "sendEventFilters", "traps", "snmpCommunity", "users", "secureTransportsOnly"})
public class SNMPSettings {
    protected boolean agentEnabled;
    protected boolean shouldSendEventTraps;
    @XmlElement(nillable = true)
    protected List<SystemEventLogsFilterUID> sendEventFilters;
    @XmlElement(nillable = true)
    protected List<SNMPTrapDestination> traps;
    @XmlElement(required = true)
    protected String snmpCommunity;
    @XmlElement(nillable = true)
    protected List<SNMPUser> users;
    protected boolean secureTransportsOnly;

    public SNMPSettings() {
    }

    public SNMPSettings(boolean agentEnabled, boolean shouldSendEventTraps, List<SystemEventLogsFilterUID> sendEventFilters, List<SNMPTrapDestination> traps, String snmpCommunity, List<SNMPUser> users, boolean secureTransportsOnly) {
        this.agentEnabled = agentEnabled;
        this.shouldSendEventTraps = shouldSendEventTraps;
        this.sendEventFilters = sendEventFilters;
        this.traps = traps;
        this.snmpCommunity = snmpCommunity;
        this.users = users;
        this.secureTransportsOnly = secureTransportsOnly;
    }


    public boolean isAgentEnabled() {
        return this.agentEnabled;
    }


    public void setAgentEnabled(boolean value) {
        this.agentEnabled = value;
    }


    public boolean isShouldSendEventTraps() {
        return this.shouldSendEventTraps;
    }


    public void setShouldSendEventTraps(boolean value) {
        this.shouldSendEventTraps = value;
    }


    public List<SystemEventLogsFilterUID> getSendEventFilters() {
        if (this.sendEventFilters == null) {
            this.sendEventFilters = new ArrayList();
        }
        return this.sendEventFilters;
    }


    public List<SNMPTrapDestination> getTraps() {
        if (this.traps == null) {
            this.traps = new ArrayList();
        }
        return this.traps;
    }


    public String getSnmpCommunity() {
        return this.snmpCommunity;
    }


    public void setSnmpCommunity(String value) {
        this.snmpCommunity = value;
    }


    public List<SNMPUser> getUsers() {
        if (this.users == null) {
            this.users = new ArrayList();
        }
        return this.users;
    }


    public boolean isSecureTransportsOnly() {
        return this.secureTransportsOnly;
    }


    public void setSecureTransportsOnly(boolean value) {
        this.secureTransportsOnly = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SNMPSettings)) {
            return false;
        }
        SNMPSettings otherObj = (SNMPSettings) obj;

        return (this.agentEnabled == otherObj.agentEnabled) && (this.shouldSendEventTraps == otherObj.shouldSendEventTraps) && (this.sendEventFilters != null ? this.sendEventFilters.equals(otherObj.sendEventFilters) : this.sendEventFilters == otherObj.sendEventFilters) && (this.traps != null ? this.traps.equals(otherObj.traps) : this.traps == otherObj.traps) && (this.snmpCommunity != null ? this.snmpCommunity.equals(otherObj.snmpCommunity) : this.snmpCommunity == otherObj.snmpCommunity) && (this.users != null ? this.users.equals(otherObj.users) : this.users == otherObj.users) && (this.secureTransportsOnly == otherObj.secureTransportsOnly);
    }


    public int hashCode() {
        return (this.agentEnabled ? 1 : 0) ^ (this.shouldSendEventTraps ? 1 : 0) ^ (this.sendEventFilters != null ? this.sendEventFilters.hashCode() : 0) ^ (this.traps != null ? this.traps.hashCode() : 0) ^ (this.snmpCommunity != null ? this.snmpCommunity.hashCode() : 0) ^ (this.users != null ? this.users.hashCode() : 0) ^ (this.secureTransportsOnly ? 1 : 0);
    }


    public String toString() {
        return "SNMPSettings [agentEnabled=" + this.agentEnabled + ", " + "shouldSendEventTraps=" + this.shouldSendEventTraps + ", " + "sendEventFilters=" + this.sendEventFilters + ", " + "traps=" + this.traps + ", " + "snmpCommunity=" + this.snmpCommunity + ", " + "users=" + this.users + ", " + "secureTransportsOnly=" + this.secureTransportsOnly + "]";
    }
}


