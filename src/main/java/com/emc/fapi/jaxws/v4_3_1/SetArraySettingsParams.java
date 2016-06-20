package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetArraySettingsParams", propOrder = {"arrayUID", "name", "arrayConfiguration"})
public class SetArraySettingsParams {
    @XmlElement(required = true, nillable = true)
    protected ArrayUID arrayUID;
    @XmlElement(required = true)
    protected String name;
    protected ConfigurationParams arrayConfiguration;

    public SetArraySettingsParams() {
    }

    public SetArraySettingsParams(ArrayUID arrayUID, String name, ConfigurationParams arrayConfiguration) {
        this.arrayUID = arrayUID;
        this.name = name;
        this.arrayConfiguration = arrayConfiguration;
    }


    public ArrayUID getArrayUID() {
        return this.arrayUID;
    }


    public void setArrayUID(ArrayUID value) {
        this.arrayUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public ConfigurationParams getArrayConfiguration() {
        return this.arrayConfiguration;
    }


    public void setArrayConfiguration(ConfigurationParams value) {
        this.arrayConfiguration = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetArraySettingsParams)) {
            return false;
        }
        SetArraySettingsParams otherObj = (SetArraySettingsParams) obj;

        return (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.arrayConfiguration != null ? this.arrayConfiguration.equals(otherObj.arrayConfiguration) : this.arrayConfiguration == otherObj.arrayConfiguration);
    }


    public int hashCode() {
        return (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.arrayConfiguration != null ? this.arrayConfiguration.hashCode() : 0);
    }


    public String toString() {
        return "SetArraySettingsParams [arrayUID=" + this.arrayUID + ", " + "name=" + this.name + ", " + "arrayConfiguration=" + this.arrayConfiguration + "]";
    }
}


