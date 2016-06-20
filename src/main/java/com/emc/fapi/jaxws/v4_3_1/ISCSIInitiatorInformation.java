package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ISCSIInitiatorInformation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISCSIInitiatorInformation", propOrder = {"iqn"})
public class ISCSIInitiatorInformation
        extends InitiatorInformation {
    protected String iqn;

    public ISCSIInitiatorInformation() {
    }

    public ISCSIInitiatorInformation(String iqn) {
        this.iqn = iqn;
    }


    public String getIqn() {
        return this.iqn;
    }


    public void setIqn(String value) {
        this.iqn = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ISCSIInitiatorInformation)) {
            return false;
        }
        ISCSIInitiatorInformation otherObj = (ISCSIInitiatorInformation) obj;

        return (super.equals(obj)) && (this.iqn != null ? this.iqn.equals(otherObj.iqn) : this.iqn == otherObj.iqn);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.iqn != null ? this.iqn.hashCode() : 0);
    }


    public String toString() {
        return "ISCSIInitiatorInformation [super=" + super.toString() + ", " + "iqn=" + this.iqn + "]";
    }
}


