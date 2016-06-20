package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsxConfiguration", propOrder = {"esxUID", "name", "version", "nonRelevantVMs"})
public class EsxConfiguration {
    @XmlElement(nillable = true)
    protected EsxUID esxUID;
    protected String name;
    protected String version;
    @XmlElement(nillable = true)
    protected List<VmUID> nonRelevantVMs;

    public EsxConfiguration() {
    }

    public EsxConfiguration(EsxUID esxUID, String name, String version, List<VmUID> nonRelevantVMs) {
        this.esxUID = esxUID;
        this.name = name;
        this.version = version;
        this.nonRelevantVMs = nonRelevantVMs;
    }


    public EsxUID getEsxUID() {
        return this.esxUID;
    }


    public void setEsxUID(EsxUID value) {
        this.esxUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public String getVersion() {
        return this.version;
    }


    public void setVersion(String value) {
        this.version = value;
    }


    public List<VmUID> getNonRelevantVMs() {
        if (this.nonRelevantVMs == null) {
            this.nonRelevantVMs = new ArrayList();
        }
        return this.nonRelevantVMs;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EsxConfiguration)) {
            return false;
        }
        EsxConfiguration otherObj = (EsxConfiguration) obj;

        return (this.esxUID != null ? this.esxUID.equals(otherObj.esxUID) : this.esxUID == otherObj.esxUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.version != null ? this.version.equals(otherObj.version) : this.version == otherObj.version) && (this.nonRelevantVMs != null ? this.nonRelevantVMs.equals(otherObj.nonRelevantVMs) : this.nonRelevantVMs == otherObj.nonRelevantVMs);
    }


    public int hashCode() {
        return (this.esxUID != null ? this.esxUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.version != null ? this.version.hashCode() : 0) ^ (this.nonRelevantVMs != null ? this.nonRelevantVMs.hashCode() : 0);
    }


    public String toString() {
        return "EsxConfiguration [esxUID=" + this.esxUID + ", " + "name=" + this.name + ", " + "version=" + this.version + ", " + "nonRelevantVMs=" + this.nonRelevantVMs + "]";
    }
}


