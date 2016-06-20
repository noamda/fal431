package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ISCSIPath.class, name = "ISCSIPath"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = FiberChannelPath.class, name = "FiberChannelPath"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = DataCommPath.class, name = "DataCommPath")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Path", propOrder = {"rpaUID"})
@XmlSeeAlso({DataCommPath.class, FiberChannelPath.class, ISCSIPath.class})
public abstract class Path {
    @XmlElement(nillable = true)
    protected RpaUID rpaUID;

    public Path() {
    }

    public Path(RpaUID rpaUID) {
        this.rpaUID = rpaUID;
    }


    public RpaUID getRpaUID() {
        return this.rpaUID;
    }


    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof Path)) {
            return false;
        }
        Path otherObj = (Path) obj;

        return this.rpaUID == otherObj.rpaUID ? true : this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : false;
    }


    public int hashCode() {
        return this.rpaUID != null ? this.rpaUID.hashCode() : 0;
    }


    public String toString() {
        return "Path [rpaUID=" + this.rpaUID + "]";
    }
}


