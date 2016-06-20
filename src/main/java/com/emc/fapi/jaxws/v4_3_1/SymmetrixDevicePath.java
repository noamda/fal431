package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymmetrixDevicePath", propOrder = {"device", "lun", "port", "wwn"})
public class SymmetrixDevicePath {
    protected String device;
    protected long lun;
    protected int port;
    @XmlElement(name = "WWN")
    protected long wwn;

    public SymmetrixDevicePath() {
    }

    public SymmetrixDevicePath(String device, long lun, int port, long wwn) {
        this.device = device;
        this.lun = lun;
        this.port = port;
        this.wwn = wwn;
    }


    public String getDevice() {
        return this.device;
    }


    public void setDevice(String value) {
        this.device = value;
    }


    public long getLun() {
        return this.lun;
    }


    public void setLun(long value) {
        this.lun = value;
    }


    public int getPort() {
        return this.port;
    }


    public void setPort(int value) {
        this.port = value;
    }


    public long getWWN() {
        return this.wwn;
    }


    public void setWWN(long value) {
        this.wwn = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SymmetrixDevicePath)) {
            return false;
        }
        SymmetrixDevicePath otherObj = (SymmetrixDevicePath) obj;

        return (this.device != null ? this.device.equals(otherObj.device) : this.device == otherObj.device) && (this.lun == otherObj.lun) && (this.port == otherObj.port) && (this.wwn == otherObj.wwn);
    }


    public int hashCode() {
        return (this.device != null ? this.device.hashCode() : 0) ^ (int) this.lun ^ this.port ^ (int) this.wwn;
    }


    public String toString() {
        return "SymmetrixDevicePath [device=" + this.device + ", " + "lun=" + this.lun + ", " + "port=" + this.port + ", " + "wwn=" + this.wwn + "]";
    }
}


