package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LDAPSettings", propOrder = {"enabled", "protocol", "primaryServer", "secondaryServer", "baseDistinguishedName", "distinguishedNameSearch", "binding", "advancedSettings"})
public class LDAPSettings {
    protected boolean enabled;
    @XmlElement(required = true)
    protected LDAPProtocol protocol;
    protected LDAPServer primaryServer;
    protected LDAPServer secondaryServer;
    @XmlElement(required = true)
    protected String baseDistinguishedName;
    @XmlElement(required = true)
    protected String distinguishedNameSearch;
    @XmlElement(required = true)
    protected LDAPBinding binding;
    @XmlElement(required = true)
    protected LDAPAdvancedSettings advancedSettings;

    public LDAPSettings() {
    }

    public LDAPSettings(boolean enabled, LDAPProtocol protocol, LDAPServer primaryServer, LDAPServer secondaryServer, String baseDistinguishedName, String distinguishedNameSearch, LDAPBinding binding, LDAPAdvancedSettings advancedSettings) {
        this.enabled = enabled;
        this.protocol = protocol;
        this.primaryServer = primaryServer;
        this.secondaryServer = secondaryServer;
        this.baseDistinguishedName = baseDistinguishedName;
        this.distinguishedNameSearch = distinguishedNameSearch;
        this.binding = binding;
        this.advancedSettings = advancedSettings;
    }


    public boolean isEnabled() {
        return this.enabled;
    }


    public void setEnabled(boolean value) {
        this.enabled = value;
    }


    public LDAPProtocol getProtocol() {
        return this.protocol;
    }


    public void setProtocol(LDAPProtocol value) {
        this.protocol = value;
    }


    public LDAPServer getPrimaryServer() {
        return this.primaryServer;
    }


    public void setPrimaryServer(LDAPServer value) {
        this.primaryServer = value;
    }


    public LDAPServer getSecondaryServer() {
        return this.secondaryServer;
    }


    public void setSecondaryServer(LDAPServer value) {
        this.secondaryServer = value;
    }


    public String getBaseDistinguishedName() {
        return this.baseDistinguishedName;
    }


    public void setBaseDistinguishedName(String value) {
        this.baseDistinguishedName = value;
    }


    public String getDistinguishedNameSearch() {
        return this.distinguishedNameSearch;
    }


    public void setDistinguishedNameSearch(String value) {
        this.distinguishedNameSearch = value;
    }


    public LDAPBinding getBinding() {
        return this.binding;
    }


    public void setBinding(LDAPBinding value) {
        this.binding = value;
    }


    public LDAPAdvancedSettings getAdvancedSettings() {
        return this.advancedSettings;
    }


    public void setAdvancedSettings(LDAPAdvancedSettings value) {
        this.advancedSettings = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof LDAPSettings)) {
            return false;
        }
        LDAPSettings otherObj = (LDAPSettings) obj;

        return (this.enabled == otherObj.enabled) && (this.protocol != null ? this.protocol.equals(otherObj.protocol) : this.protocol == otherObj.protocol) && (this.primaryServer != null ? this.primaryServer.equals(otherObj.primaryServer) : this.primaryServer == otherObj.primaryServer) && (this.secondaryServer != null ? this.secondaryServer.equals(otherObj.secondaryServer) : this.secondaryServer == otherObj.secondaryServer) && (this.baseDistinguishedName != null ? this.baseDistinguishedName.equals(otherObj.baseDistinguishedName) : this.baseDistinguishedName == otherObj.baseDistinguishedName) && (this.distinguishedNameSearch != null ? this.distinguishedNameSearch.equals(otherObj.distinguishedNameSearch) : this.distinguishedNameSearch == otherObj.distinguishedNameSearch) && (this.binding != null ? this.binding.equals(otherObj.binding) : this.binding == otherObj.binding) && (this.advancedSettings != null ? this.advancedSettings.equals(otherObj.advancedSettings) : this.advancedSettings == otherObj.advancedSettings);
    }


    public int hashCode() {
        return (this.enabled ? 1 : 0) ^ (this.protocol != null ? this.protocol.hashCode() : 0) ^ (this.primaryServer != null ? this.primaryServer.hashCode() : 0) ^ (this.secondaryServer != null ? this.secondaryServer.hashCode() : 0) ^ (this.baseDistinguishedName != null ? this.baseDistinguishedName.hashCode() : 0) ^ (this.distinguishedNameSearch != null ? this.distinguishedNameSearch.hashCode() : 0) ^ (this.binding != null ? this.binding.hashCode() : 0) ^ (this.advancedSettings != null ? this.advancedSettings.hashCode() : 0);
    }


    public String toString() {
        return "LDAPSettings [enabled=" + this.enabled + ", " + "protocol=" + this.protocol + ", " + "primaryServer=" + this.primaryServer + ", " + "secondaryServer=" + this.secondaryServer + ", " + "baseDistinguishedName=" + this.baseDistinguishedName + ", " + "distinguishedNameSearch=" + this.distinguishedNameSearch + ", " + "binding=" + this.binding + ", " + "advancedSettings=" + this.advancedSettings + "]";
    }
}


