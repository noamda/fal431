package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemReportSettings", propOrder = {"esrsGatewayAddress", "includeSystemAlerts", "includeSystemReports", "senderEmail", "transferMethod", "usingCompression", "usingEncryption"})
public class SystemReportSettings {
    protected String esrsGatewayAddress;
    protected boolean includeSystemAlerts;
    protected boolean includeSystemReports;
    protected String senderEmail;
    protected SystemReportTransferMethod transferMethod;
    protected boolean usingCompression;
    protected boolean usingEncryption;

    public SystemReportSettings() {
    }

    public SystemReportSettings(String esrsGatewayAddress, boolean includeSystemAlerts, boolean includeSystemReports, String senderEmail, SystemReportTransferMethod transferMethod, boolean usingCompression, boolean usingEncryption) {
        this.esrsGatewayAddress = esrsGatewayAddress;
        this.includeSystemAlerts = includeSystemAlerts;
        this.includeSystemReports = includeSystemReports;
        this.senderEmail = senderEmail;
        this.transferMethod = transferMethod;
        this.usingCompression = usingCompression;
        this.usingEncryption = usingEncryption;
    }


    public String getEsrsGatewayAddress() {
        return this.esrsGatewayAddress;
    }


    public void setEsrsGatewayAddress(String value) {
        this.esrsGatewayAddress = value;
    }


    public boolean isIncludeSystemAlerts() {
        return this.includeSystemAlerts;
    }


    public void setIncludeSystemAlerts(boolean value) {
        this.includeSystemAlerts = value;
    }


    public boolean isIncludeSystemReports() {
        return this.includeSystemReports;
    }


    public void setIncludeSystemReports(boolean value) {
        this.includeSystemReports = value;
    }


    public String getSenderEmail() {
        return this.senderEmail;
    }


    public void setSenderEmail(String value) {
        this.senderEmail = value;
    }


    public SystemReportTransferMethod getTransferMethod() {
        return this.transferMethod;
    }


    public void setTransferMethod(SystemReportTransferMethod value) {
        this.transferMethod = value;
    }


    public boolean isUsingCompression() {
        return this.usingCompression;
    }


    public void setUsingCompression(boolean value) {
        this.usingCompression = value;
    }


    public boolean isUsingEncryption() {
        return this.usingEncryption;
    }


    public void setUsingEncryption(boolean value) {
        this.usingEncryption = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SystemReportSettings)) {
            return false;
        }
        SystemReportSettings otherObj = (SystemReportSettings) obj;

        return (this.esrsGatewayAddress != null ? this.esrsGatewayAddress.equals(otherObj.esrsGatewayAddress) : this.esrsGatewayAddress == otherObj.esrsGatewayAddress) && (this.includeSystemAlerts == otherObj.includeSystemAlerts) && (this.includeSystemReports == otherObj.includeSystemReports) && (this.senderEmail != null ? this.senderEmail.equals(otherObj.senderEmail) : this.senderEmail == otherObj.senderEmail) && (this.transferMethod != null ? this.transferMethod.equals(otherObj.transferMethod) : this.transferMethod == otherObj.transferMethod) && (this.usingCompression == otherObj.usingCompression) && (this.usingEncryption == otherObj.usingEncryption);
    }


    public int hashCode() {
        return (this.esrsGatewayAddress != null ? this.esrsGatewayAddress.hashCode() : 0) ^ (this.includeSystemAlerts ? 1 : 0) ^ (this.includeSystemReports ? 1 : 0) ^ (this.senderEmail != null ? this.senderEmail.hashCode() : 0) ^ (this.transferMethod != null ? this.transferMethod.hashCode() : 0) ^ (this.usingCompression ? 1 : 0) ^ (this.usingEncryption ? 1 : 0);
    }


    public String toString() {
        return "SystemReportSettings [esrsGatewayAddress=" + this.esrsGatewayAddress + ", " + "includeSystemAlerts=" + this.includeSystemAlerts + ", " + "includeSystemReports=" + this.includeSystemReports + ", " + "senderEmail=" + this.senderEmail + ", " + "transferMethod=" + this.transferMethod + ", " + "usingCompression=" + this.usingCompression + ", " + "usingEncryption=" + this.usingEncryption + "]";
    }
}


