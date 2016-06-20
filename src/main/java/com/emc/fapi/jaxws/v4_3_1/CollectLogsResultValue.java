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
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = CollectLogsRPAResultValue.class, name = "CollectLogsRPAResultValue"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = CollectLogsSplitterResultValue.class, name = "CollectLogsSplitterResultValue")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectLogsResultValue", propOrder = {"message", "success"})
@XmlSeeAlso({CollectLogsRPAResultValue.class, CollectLogsSplitterResultValue.class})
public class CollectLogsResultValue {
    protected String message;
    protected boolean success;

    public CollectLogsResultValue() {
    }

    public CollectLogsResultValue(String message, boolean success) {
        this.message = message;
        this.success = success;
    }


    public String getMessage() {
        return this.message;
    }


    public void setMessage(String value) {
        this.message = value;
    }


    public boolean isSuccess() {
        return this.success;
    }


    public void setSuccess(boolean value) {
        this.success = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CollectLogsResultValue)) {
            return false;
        }
        CollectLogsResultValue otherObj = (CollectLogsResultValue) obj;

        return (this.message != null ? this.message.equals(otherObj.message) : this.message == otherObj.message) && (this.success == otherObj.success);
    }


    public int hashCode() {
        return (this.message != null ? this.message.hashCode() : 0) ^ (this.success ? 1 : 0);
    }


    public String toString() {
        return "CollectLogsResultValue [message=" + this.message + ", " + "success=" + this.success + "]";
    }
}


