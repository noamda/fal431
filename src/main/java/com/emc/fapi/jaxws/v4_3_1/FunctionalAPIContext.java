package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VCenterServerViewContext.class, name = "VCenterServerViewContext"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ClusterSANVolumesContext.class, name = "ClusterSANVolumesContext"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = FullRecoverPointSettingsContext.class, name = "FullRecoverPointSettingsContext"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ClariionVolumesContext.class, name = "ClariionVolumesContext"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = SystemStatusContext.class, name = "SystemStatusContext"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = FullRecoverPointContext.class, name = "FullRecoverPointContext"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = FullRecoverPointStateContext.class, name = "FullRecoverPointStateContext"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ClusterFileSystemViewContext.class, name = "ClusterFileSystemViewContext")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionalAPIContext", propOrder = {"globalContext"})
@XmlSeeAlso({VCenterServerViewContext.class, FullRecoverPointSettingsContext.class, FullRecoverPointStateContext.class, ClusterSANVolumesContext.class, FullRecoverPointContext.class, ClariionVolumesContext.class, ClusterFileSystemViewContext.class, SystemStatusContext.class})
public abstract class FunctionalAPIContext {
    protected long globalContext;

    public FunctionalAPIContext() {
    }

    public FunctionalAPIContext(long globalContext) {
        this.globalContext = globalContext;
    }


    public long getGlobalContext() {
        return this.globalContext;
    }


    public void setGlobalContext(long value) {
        this.globalContext = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FunctionalAPIContext)) {
            return false;
        }
        FunctionalAPIContext otherObj = (FunctionalAPIContext) obj;

        return this.globalContext == otherObj.globalContext;
    }


    public int hashCode() {
        return (int) this.globalContext;
    }


    public String toString() {
        return "FunctionalAPIContext [globalContext=" + this.globalContext + "]";
    }
}


