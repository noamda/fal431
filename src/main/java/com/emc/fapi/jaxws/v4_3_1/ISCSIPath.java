package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ISCSIPath")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISCSIPath", propOrder = {"remoteIqn", "remoteIpInformation", "remotePort", "localIqn", "localIpInformation"})
public class ISCSIPath
        extends Path {
    protected String remoteIqn;
    protected IPInformation remoteIpInformation;
    protected Integer remotePort;
    protected String localIqn;
    protected IPInformation localIpInformation;

    public ISCSIPath() {
    }

    public ISCSIPath(String remoteIqn, IPInformation remoteIpInformation, Integer remotePort, String localIqn, IPInformation localIpInformation) {
        this.remoteIqn = remoteIqn;
        this.remoteIpInformation = remoteIpInformation;
        this.remotePort = remotePort;
        this.localIqn = localIqn;
        this.localIpInformation = localIpInformation;
    }


    public String getRemoteIqn() {
        return this.remoteIqn;
    }


    public void setRemoteIqn(String value) {
        this.remoteIqn = value;
    }


    public IPInformation getRemoteIpInformation() {
        return this.remoteIpInformation;
    }


    public void setRemoteIpInformation(IPInformation value) {
        this.remoteIpInformation = value;
    }


    public Integer getRemotePort() {
        return this.remotePort;
    }


    public void setRemotePort(Integer value) {
        this.remotePort = value;
    }


    public String getLocalIqn() {
        return this.localIqn;
    }


    public void setLocalIqn(String value) {
        this.localIqn = value;
    }


    public IPInformation getLocalIpInformation() {
        return this.localIpInformation;
    }


    public void setLocalIpInformation(IPInformation value) {
        this.localIpInformation = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ISCSIPath)) {
            return false;
        }
        ISCSIPath otherObj = (ISCSIPath) obj;

        return (super.equals(obj)) && (this.remoteIqn != null ? this.remoteIqn.equals(otherObj.remoteIqn) : this.remoteIqn == otherObj.remoteIqn) && (this.remoteIpInformation != null ? this.remoteIpInformation.equals(otherObj.remoteIpInformation) : this.remoteIpInformation == otherObj.remoteIpInformation) && (this.remotePort != null ? this.remotePort.equals(otherObj.remotePort) : this.remotePort == otherObj.remotePort) && (this.localIqn != null ? this.localIqn.equals(otherObj.localIqn) : this.localIqn == otherObj.localIqn) && (this.localIpInformation != null ? this.localIpInformation.equals(otherObj.localIpInformation) : this.localIpInformation == otherObj.localIpInformation);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.remoteIqn != null ? this.remoteIqn.hashCode() : 0) ^ (this.remoteIpInformation != null ? this.remoteIpInformation.hashCode() : 0) ^ (this.remotePort != null ? this.remotePort.hashCode() : 0) ^ (this.localIqn != null ? this.localIqn.hashCode() : 0) ^ (this.localIpInformation != null ? this.localIpInformation.hashCode() : 0);
    }


    public String toString() {
        return "ISCSIPath [super=" + super.toString() + ", " + "remoteIqn=" + this.remoteIqn + ", " + "remoteIpInformation=" + this.remoteIpInformation + ", " + "remotePort=" + this.remotePort + ", " + "localIqn=" + this.localIqn + ", " + "localIpInformation=" + this.localIpInformation + "]";
    }
}


