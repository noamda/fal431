package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsxClusterConfiguration", propOrder = {"esxClusterUID", "name", "esxsConfiguration", "resourcePoolConfiguration", "abilities"})
public class EsxClusterConfiguration {
    @XmlElement(nillable = true)
    protected EsxClusterUID esxClusterUID;
    protected String name;
    @XmlElement(nillable = true)
    protected List<EsxConfiguration> esxsConfiguration;
    @XmlElement(nillable = true)
    protected ResourcePoolConfiguration resourcePoolConfiguration;
    protected EsxClusterAbilities abilities;

    public EsxClusterConfiguration() {
    }

    public EsxClusterConfiguration(EsxClusterUID esxClusterUID, String name, List<EsxConfiguration> esxsConfiguration, ResourcePoolConfiguration resourcePoolConfiguration, EsxClusterAbilities abilities) {
        this.esxClusterUID = esxClusterUID;
        this.name = name;
        this.esxsConfiguration = esxsConfiguration;
        this.resourcePoolConfiguration = resourcePoolConfiguration;
        this.abilities = abilities;
    }


    public EsxClusterUID getEsxClusterUID() {
        return this.esxClusterUID;
    }


    public void setEsxClusterUID(EsxClusterUID value) {
        this.esxClusterUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public List<EsxConfiguration> getEsxsConfiguration() {
        if (this.esxsConfiguration == null) {
            this.esxsConfiguration = new ArrayList();
        }
        return this.esxsConfiguration;
    }


    public ResourcePoolConfiguration getResourcePoolConfiguration() {
        return this.resourcePoolConfiguration;
    }


    public void setResourcePoolConfiguration(ResourcePoolConfiguration value) {
        this.resourcePoolConfiguration = value;
    }


    public EsxClusterAbilities getAbilities() {
        return this.abilities;
    }


    public void setAbilities(EsxClusterAbilities value) {
        this.abilities = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EsxClusterConfiguration)) {
            return false;
        }
        EsxClusterConfiguration otherObj = (EsxClusterConfiguration) obj;

        return (this.esxClusterUID != null ? this.esxClusterUID.equals(otherObj.esxClusterUID) : this.esxClusterUID == otherObj.esxClusterUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.esxsConfiguration != null ? this.esxsConfiguration.equals(otherObj.esxsConfiguration) : this.esxsConfiguration == otherObj.esxsConfiguration) && (this.resourcePoolConfiguration != null ? this.resourcePoolConfiguration.equals(otherObj.resourcePoolConfiguration) : this.resourcePoolConfiguration == otherObj.resourcePoolConfiguration) && (this.abilities != null ? this.abilities.equals(otherObj.abilities) : this.abilities == otherObj.abilities);
    }


    public int hashCode() {
        return (this.esxClusterUID != null ? this.esxClusterUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.esxsConfiguration != null ? this.esxsConfiguration.hashCode() : 0) ^ (this.resourcePoolConfiguration != null ? this.resourcePoolConfiguration.hashCode() : 0) ^ (this.abilities != null ? this.abilities.hashCode() : 0);
    }


    public String toString() {
        return "EsxClusterConfiguration [esxClusterUID=" + this.esxClusterUID + ", " + "name=" + this.name + ", " + "esxsConfiguration=" + this.esxsConfiguration + ", " + "resourcePoolConfiguration=" + this.resourcePoolConfiguration + ", " + "abilities=" + this.abilities + "]";
    }
}


