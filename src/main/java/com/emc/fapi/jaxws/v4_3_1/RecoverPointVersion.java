package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecoverPointVersion", propOrder = {"version", "versionInformation"})
public class RecoverPointVersion {
    protected String version;
    protected RecoverPointVersionInformation versionInformation;

    public RecoverPointVersion() {
    }

    public RecoverPointVersion(String version, RecoverPointVersionInformation versionInformation) {
        this.version = version;
        this.versionInformation = versionInformation;
    }


    public String getVersion() {
        return this.version;
    }


    public void setVersion(String value) {
        this.version = value;
    }


    public RecoverPointVersionInformation getVersionInformation() {
        return this.versionInformation;
    }


    public void setVersionInformation(RecoverPointVersionInformation value) {
        this.versionInformation = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RecoverPointVersion)) {
            return false;
        }
        RecoverPointVersion otherObj = (RecoverPointVersion) obj;

        return (this.version != null ? this.version.equals(otherObj.version) : this.version == otherObj.version) && (this.versionInformation != null ? this.versionInformation.equals(otherObj.versionInformation) : this.versionInformation == otherObj.versionInformation);
    }


    public int hashCode() {
        return (this.version != null ? this.version.hashCode() : 0) ^ (this.versionInformation != null ? this.versionInformation.hashCode() : 0);
    }


    public String toString() {
        return "RecoverPointVersion [version=" + this.version + ", " + "versionInformation=" + this.versionInformation + "]";
    }
}


