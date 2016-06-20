package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VmStartUpScript")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmStartUpScript", propOrder = {"numOfRetries", "command"})
public class VmStartUpScript
        extends BaseVmStartUpAction {
    protected int numOfRetries;
    @XmlElement(required = true)
    protected String command;

    public VmStartUpScript() {
    }

    public VmStartUpScript(int numOfRetries, String command) {
        this.numOfRetries = numOfRetries;
        this.command = command;
    }


    public int getNumOfRetries() {
        return this.numOfRetries;
    }


    public void setNumOfRetries(int value) {
        this.numOfRetries = value;
    }


    public String getCommand() {
        return this.command;
    }


    public void setCommand(String value) {
        this.command = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmStartUpScript)) {
            return false;
        }
        VmStartUpScript otherObj = (VmStartUpScript) obj;

        return (super.equals(obj)) && (this.numOfRetries == otherObj.numOfRetries) && (this.command != null ? this.command.equals(otherObj.command) : this.command == otherObj.command);
    }


    public int hashCode() {
        return super.hashCode() ^ this.numOfRetries ^ (this.command != null ? this.command.hashCode() : 0);
    }


    public String toString() {
        return "VmStartUpScript [super=" + super.toString() + ", " + "numOfRetries=" + this.numOfRetries + ", " + "command=" + this.command + "]";
    }
}


