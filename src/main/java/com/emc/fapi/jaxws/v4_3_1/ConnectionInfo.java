package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionInfo", propOrder = {"message", "status"})
public class ConnectionInfo {
    protected String message;
    protected ConnectionStatus status;

    public ConnectionInfo() {
    }

    public ConnectionInfo(String message, ConnectionStatus status) {
        this.message = message;
        this.status = status;
    }


    public String getMessage() {
        return this.message;
    }


    public void setMessage(String value) {
        this.message = value;
    }


    public ConnectionStatus getStatus() {
        return this.status;
    }


    public void setStatus(ConnectionStatus value) {
        this.status = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionInfo)) {
            return false;
        }
        ConnectionInfo otherObj = (ConnectionInfo) obj;

        return (this.message != null ? this.message.equals(otherObj.message) : this.message == otherObj.message) && (this.status != null ? this.status.equals(otherObj.status) : this.status == otherObj.status);
    }


    public int hashCode() {
        return (this.message != null ? this.message.hashCode() : 0) ^ (this.status != null ? this.status.hashCode() : 0);
    }


    public String toString() {
        return "ConnectionInfo [message=" + this.message + ", " + "status=" + this.status + "]";
    }
}


