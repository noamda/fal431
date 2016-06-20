package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VmStartUpPrompt.class, name = "VmStartUpPrompt"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VmStartUpScript.class, name = "VmStartUpScript")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseVmStartUpAction", propOrder = {"title", "timeoutSecs"})
@XmlSeeAlso({VmStartUpPrompt.class, VmStartUpScript.class})
public abstract class BaseVmStartUpAction {
    @XmlElement(required = true)
    protected String title;
    protected int timeoutSecs;

    public BaseVmStartUpAction() {
    }

    public BaseVmStartUpAction(String title, int timeoutSecs) {
        this.title = title;
        this.timeoutSecs = timeoutSecs;
    }


    public String getTitle() {
        return this.title;
    }


    public void setTitle(String value) {
        this.title = value;
    }


    public int getTimeoutSecs() {
        return this.timeoutSecs;
    }


    public void setTimeoutSecs(int value) {
        this.timeoutSecs = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof BaseVmStartUpAction)) {
            return false;
        }
        BaseVmStartUpAction otherObj = (BaseVmStartUpAction) obj;

        return (this.title != null ? this.title.equals(otherObj.title) : this.title == otherObj.title) && (this.timeoutSecs == otherObj.timeoutSecs);
    }


    public int hashCode() {
        return (this.title != null ? this.title.hashCode() : 0) ^ this.timeoutSecs;
    }


    public String toString() {
        return "BaseVmStartUpAction [title=" + this.title + ", " + "timeoutSecs=" + this.timeoutSecs + "]";
    }
}


