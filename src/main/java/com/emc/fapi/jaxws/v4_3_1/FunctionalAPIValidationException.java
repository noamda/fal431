package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("FunctionalAPIValidationException")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionalAPIValidationException", propOrder = {"message"})
public class FunctionalAPIValidationException {
    protected String message;

    public FunctionalAPIValidationException() {
    }

    public FunctionalAPIValidationException(String message) {
        this.message = message;
    }


    public String getMessage() {
        return this.message;
    }


    public void setMessage(String value) {
        this.message = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FunctionalAPIValidationException)) {
            return false;
        }
        FunctionalAPIValidationException otherObj = (FunctionalAPIValidationException) obj;

        return this.message == otherObj.message ? true : this.message != null ? this.message.equals(otherObj.message) : false;
    }


    public int hashCode() {
        return this.message != null ? this.message.hashCode() : 0;
    }


    public String toString() {
        return "FunctionalAPIValidationException [message=" + this.message + "]";
    }
}


