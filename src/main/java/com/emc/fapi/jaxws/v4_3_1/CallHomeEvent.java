package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallHomeEvent", propOrder = {"id", "name", "description", "systemDefined", "disabledUntil", "script"})
public class CallHomeEvent {
    @XmlElement(required = true)
    protected CallHomeEventUID id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    protected boolean systemDefined;
    protected RecoverPointTimeStamp disabledUntil;
    @XmlElement(required = true)
    protected String script;

    public CallHomeEvent() {
    }

    public CallHomeEvent(CallHomeEventUID id, String name, String description, boolean systemDefined, RecoverPointTimeStamp disabledUntil, String script) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.systemDefined = systemDefined;
        this.disabledUntil = disabledUntil;
        this.script = script;
    }


    public CallHomeEventUID getId() {
        return this.id;
    }


    public void setId(CallHomeEventUID value) {
        this.id = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public String getDescription() {
        return this.description;
    }


    public void setDescription(String value) {
        this.description = value;
    }


    public boolean isSystemDefined() {
        return this.systemDefined;
    }


    public void setSystemDefined(boolean value) {
        this.systemDefined = value;
    }


    public RecoverPointTimeStamp getDisabledUntil() {
        return this.disabledUntil;
    }


    public void setDisabledUntil(RecoverPointTimeStamp value) {
        this.disabledUntil = value;
    }


    public String getScript() {
        return this.script;
    }


    public void setScript(String value) {
        this.script = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CallHomeEvent)) {
            return false;
        }
        CallHomeEvent otherObj = (CallHomeEvent) obj;

        return (this.id != null ? this.id.equals(otherObj.id) : this.id == otherObj.id) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.description != null ? this.description.equals(otherObj.description) : this.description == otherObj.description) && (this.systemDefined == otherObj.systemDefined) && (this.disabledUntil != null ? this.disabledUntil.equals(otherObj.disabledUntil) : this.disabledUntil == otherObj.disabledUntil) && (this.script != null ? this.script.equals(otherObj.script) : this.script == otherObj.script);
    }


    public int hashCode() {
        return (this.id != null ? this.id.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.description != null ? this.description.hashCode() : 0) ^ (this.systemDefined ? 1 : 0) ^ (this.disabledUntil != null ? this.disabledUntil.hashCode() : 0) ^ (this.script != null ? this.script.hashCode() : 0);
    }


    public String toString() {
        return "CallHomeEvent [id=" + this.id + ", " + "name=" + this.name + ", " + "description=" + this.description + ", " + "systemDefined=" + this.systemDefined + ", " + "disabledUntil=" + this.disabledUntil + ", " + "script=" + this.script + "]";
    }
}


