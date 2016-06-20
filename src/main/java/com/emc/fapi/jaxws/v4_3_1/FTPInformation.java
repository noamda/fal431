package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FTPInformation", propOrder = {"server", "port", "username", "password", "location", "filename"})
public class FTPInformation {
    @XmlElement(required = true)
    protected String server;
    protected int port;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected byte[] password;
    protected String location;
    protected String filename;

    public FTPInformation() {
    }

    public FTPInformation(String server, int port, String username, byte[] password, String location, String filename) {
        this.server = server;
        this.port = port;
        this.username = username;
        this.password = password;
        this.location = location;
        this.filename = filename;
    }


    public String getServer() {
        return this.server;
    }


    public void setServer(String value) {
        this.server = value;
    }


    public int getPort() {
        return this.port;
    }


    public void setPort(int value) {
        this.port = value;
    }


    public String getUsername() {
        return this.username;
    }


    public void setUsername(String value) {
        this.username = value;
    }


    public byte[] getPassword() {
        return this.password;
    }


    public void setPassword(byte[] value) {
        this.password = value;
    }


    public String getLocation() {
        return this.location;
    }


    public void setLocation(String value) {
        this.location = value;
    }


    public String getFilename() {
        return this.filename;
    }


    public void setFilename(String value) {
        this.filename = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof FTPInformation)) {
            return false;
        }
        FTPInformation otherObj = (FTPInformation) obj;

        return (this.server != null ? this.server.equals(otherObj.server) : this.server == otherObj.server) && (this.port == otherObj.port) && (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username) && (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password) && (this.location != null ? this.location.equals(otherObj.location) : this.location == otherObj.location) && (this.filename != null ? this.filename.equals(otherObj.filename) : this.filename == otherObj.filename);
    }


    public int hashCode() {
        return (this.server != null ? this.server.hashCode() : 0) ^ this.port ^ (this.username != null ? this.username.hashCode() : 0) ^ (this.password != null ? this.password.hashCode() : 0) ^ (this.location != null ? this.location.hashCode() : 0) ^ (this.filename != null ? this.filename.hashCode() : 0);
    }


    public String toString() {
        return "FTPInformation [server=" + this.server + ", " + "port=" + this.port + ", " + "username=" + this.username + ", " + "password=" + this.password + ", " + "location=" + this.location + ", " + "filename=" + this.filename + "]";
    }
}


