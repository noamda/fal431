package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VnxServer", propOrder = {"vnxUID", "username", "authenticationType", "certificateConfigured", "endPoints"})
public class VnxServer {
    @XmlElement(nillable = true)
    protected VnxUID vnxUID;
    protected String username;
    @XmlElement(nillable = true)
    protected AuthenticationType authenticationType;
    protected boolean certificateConfigured;
    @XmlElement(nillable = true)
    protected List<VnxEndPoint> endPoints;

    public VnxServer() {
    }

    public VnxServer(VnxUID vnxUID, String username, AuthenticationType authenticationType, boolean certificateConfigured, List<VnxEndPoint> endPoints) {
        this.vnxUID = vnxUID;
        this.username = username;
        this.authenticationType = authenticationType;
        this.certificateConfigured = certificateConfigured;
        this.endPoints = endPoints;
    }


    public VnxUID getVnxUID() {
        return this.vnxUID;
    }


    public void setVnxUID(VnxUID value) {
        this.vnxUID = value;
    }


    public String getUsername() {
        return this.username;
    }


    public void setUsername(String value) {
        this.username = value;
    }


    public AuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }


    public void setAuthenticationType(AuthenticationType value) {
        this.authenticationType = value;
    }


    public boolean isCertificateConfigured() {
        return this.certificateConfigured;
    }


    public void setCertificateConfigured(boolean value) {
        this.certificateConfigured = value;
    }


    public List<VnxEndPoint> getEndPoints() {
        if (this.endPoints == null) {
            this.endPoints = new ArrayList();
        }
        return this.endPoints;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VnxServer)) {
            return false;
        }
        VnxServer otherObj = (VnxServer) obj;

        return (this.vnxUID != null ? this.vnxUID.equals(otherObj.vnxUID) : this.vnxUID == otherObj.vnxUID) && (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username) && (this.authenticationType != null ? this.authenticationType.equals(otherObj.authenticationType) : this.authenticationType == otherObj.authenticationType) && (this.certificateConfigured == otherObj.certificateConfigured) && (this.endPoints != null ? this.endPoints.equals(otherObj.endPoints) : this.endPoints == otherObj.endPoints);
    }


    public int hashCode() {
        return (this.vnxUID != null ? this.vnxUID.hashCode() : 0) ^ (this.username != null ? this.username.hashCode() : 0) ^ (this.authenticationType != null ? this.authenticationType.hashCode() : 0) ^ (this.certificateConfigured ? 1 : 0) ^ (this.endPoints != null ? this.endPoints.hashCode() : 0);
    }


    public String toString() {
        return "VnxServer [vnxUID=" + this.vnxUID + ", " + "username=" + this.username + ", " + "authenticationType=" + this.authenticationType + ", " + "certificateConfigured=" + this.certificateConfigured + ", " + "endPoints=" + this.endPoints + "]";
    }
}


