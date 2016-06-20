package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ArrayBasedSplitterSettings")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ClariionSplitterSettings.class, name = "ClariionSplitterSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = SymmetrixSplitterSettings.class, name = "SymmetrixSplitterSettings")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayBasedSplitterSettings", propOrder = {"autoRegisterRPAsInitiators"})
@XmlSeeAlso({SymmetrixSplitterSettings.class, ClariionSplitterSettings.class})
public abstract class ArrayBasedSplitterSettings
        extends SplitterSettings {
    protected boolean autoRegisterRPAsInitiators;

    public ArrayBasedSplitterSettings() {
    }

    public ArrayBasedSplitterSettings(boolean autoRegisterRPAsInitiators) {
        this.autoRegisterRPAsInitiators = autoRegisterRPAsInitiators;
    }


    public boolean isAutoRegisterRPAsInitiators() {
        return this.autoRegisterRPAsInitiators;
    }


    public void setAutoRegisterRPAsInitiators(boolean value) {
        this.autoRegisterRPAsInitiators = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayBasedSplitterSettings)) {
            return false;
        }
        ArrayBasedSplitterSettings otherObj = (ArrayBasedSplitterSettings) obj;

        return (super.equals(obj)) && (this.autoRegisterRPAsInitiators == otherObj.autoRegisterRPAsInitiators);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.autoRegisterRPAsInitiators ? 1 : 0);
    }


    public String toString() {
        return "ArrayBasedSplitterSettings [super=" + super.toString() + ", " + "autoRegisterRPAsInitiators=" + this.autoRegisterRPAsInitiators + "]";
    }
}


