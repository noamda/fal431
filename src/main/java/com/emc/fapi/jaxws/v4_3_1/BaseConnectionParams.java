package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ScaleIoConnectionParams.class, name = "ScaleIoConnectionParams"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VcConnectionParams.class, name = "VcConnectionParams"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ClariionConnectionParams.class, name = "ClariionConnectionParams")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseConnectionParams", propOrder = {"mgmtIP"})
@XmlSeeAlso({ClariionConnectionParams.class, ScaleIoConnectionParams.class, VcConnectionParams.class})
public class BaseConnectionParams {
    @XmlElement(required = true)
    protected IPInformation mgmtIP;

    public BaseConnectionParams() {
    }

    public BaseConnectionParams(IPInformation mgmtIP) {
        this.mgmtIP = mgmtIP;
    }


    public IPInformation getMgmtIP() {
        return this.mgmtIP;
    }


    public void setMgmtIP(IPInformation value) {
        this.mgmtIP = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof BaseConnectionParams)) {
            return false;
        }
        BaseConnectionParams otherObj = (BaseConnectionParams) obj;

        return this.mgmtIP == otherObj.mgmtIP ? true : this.mgmtIP != null ? this.mgmtIP.equals(otherObj.mgmtIP) : false;
    }


    public int hashCode() {
        return this.mgmtIP != null ? this.mgmtIP.hashCode() : 0;
    }


    public String toString() {
        return "BaseConnectionParams [mgmtIP=" + this.mgmtIP + "]";
    }
}


