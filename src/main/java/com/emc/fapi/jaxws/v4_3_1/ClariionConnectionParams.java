package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ClariionConnectionParams")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClariionConnectionParams", propOrder = {"spbIP"})
public class ClariionConnectionParams
        extends BaseConnectionParams {
    protected IPInformation spbIP;

    public ClariionConnectionParams() {
    }

    public ClariionConnectionParams(IPInformation spbIP) {
        this.spbIP = spbIP;
    }


    public IPInformation getSpbIP() {
        return this.spbIP;
    }


    public void setSpbIP(IPInformation value) {
        this.spbIP = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClariionConnectionParams)) {
            return false;
        }
        ClariionConnectionParams otherObj = (ClariionConnectionParams) obj;

        return (super.equals(obj)) && (this.spbIP != null ? this.spbIP.equals(otherObj.spbIP) : this.spbIP == otherObj.spbIP);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.spbIP != null ? this.spbIP.hashCode() : 0);
    }


    public String toString() {
        return "ClariionConnectionParams [super=" + super.toString() + ", " + "spbIP=" + this.spbIP + "]";
    }
}


