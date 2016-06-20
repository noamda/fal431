package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VmStartUpPrompt")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmStartUpPrompt", propOrder = {"message"})
public class VmStartUpPrompt
        extends BaseVmStartUpAction {
    @XmlElement(required = true)
    protected String message;

    public VmStartUpPrompt() {
    }

    public VmStartUpPrompt(String message) {
        this.message = message;
    }


    public String getMessage() {
        return this.message;
    }


    public void setMessage(String value) {
        this.message = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmStartUpPrompt)) {
            return false;
        }
        VmStartUpPrompt otherObj = (VmStartUpPrompt) obj;

        return (super.equals(obj)) && (this.message != null ? this.message.equals(otherObj.message) : this.message == otherObj.message);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.message != null ? this.message.hashCode() : 0);
    }


    public String toString() {
        return "VmStartUpPrompt [super=" + super.toString() + ", " + "message=" + this.message + "]";
    }
}


