package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VcConnectionParams")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VcConnectionParams", propOrder = {"port"})
public class VcConnectionParams
        extends BaseConnectionParams {
    protected int port;

    public VcConnectionParams() {
    }

    public VcConnectionParams(int port) {
        this.port = port;
    }


    public int getPort() {
        return this.port;
    }


    public void setPort(int value) {
        this.port = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VcConnectionParams)) {
            return false;
        }
        VcConnectionParams otherObj = (VcConnectionParams) obj;

        return (super.equals(obj)) && (this.port == otherObj.port);
    }


    public int hashCode() {
        return super.hashCode() ^ this.port;
    }


    public String toString() {
        return "VcConnectionParams [super=" + super.toString() + ", " + "port=" + this.port + "]";
    }
}


