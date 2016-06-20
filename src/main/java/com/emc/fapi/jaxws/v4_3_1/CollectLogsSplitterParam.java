package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = CollectLogsSplitterParamWithCredentials.class, name = "CollectLogsSplitterParamWithCredentials")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectLogsSplitterParam", propOrder = {"splitterUID"})
@XmlSeeAlso({CollectLogsSplitterParamWithCredentials.class})
public class CollectLogsSplitterParam {
    @XmlElement(required = true, nillable = true)
    protected SplitterUID splitterUID;

    public CollectLogsSplitterParam() {
    }

    public CollectLogsSplitterParam(SplitterUID splitterUID) {
        this.splitterUID = splitterUID;
    }


    public SplitterUID getSplitterUID() {
        return this.splitterUID;
    }


    public void setSplitterUID(SplitterUID value) {
        this.splitterUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CollectLogsSplitterParam)) {
            return false;
        }
        CollectLogsSplitterParam otherObj = (CollectLogsSplitterParam) obj;

        return this.splitterUID == otherObj.splitterUID ? true : this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : false;
    }


    public int hashCode() {
        return this.splitterUID != null ? this.splitterUID.hashCode() : 0;
    }


    public String toString() {
        return "CollectLogsSplitterParam [splitterUID=" + this.splitterUID + "]";
    }
}


