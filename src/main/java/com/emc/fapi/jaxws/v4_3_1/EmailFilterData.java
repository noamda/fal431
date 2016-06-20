package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailFilterData", propOrder = {"targetAddressesList", "sendEventFilterID", "alertType"})
public class EmailFilterData {
    @XmlElement(required = true)
    protected List<String> targetAddressesList;
    @XmlElement(required = true)
    protected SystemEventLogsFilterUID sendEventFilterID;
    @XmlElement(required = true, nillable = true)
    protected AlertType alertType;

    public EmailFilterData() {
    }

    public EmailFilterData(List<String> targetAddressesList, SystemEventLogsFilterUID sendEventFilterID, AlertType alertType) {
        this.targetAddressesList = targetAddressesList;
        this.sendEventFilterID = sendEventFilterID;
        this.alertType = alertType;
    }


    public List<String> getTargetAddressesList() {
        if (this.targetAddressesList == null) {
            this.targetAddressesList = new ArrayList();
        }
        return this.targetAddressesList;
    }


    public SystemEventLogsFilterUID getSendEventFilterID() {
        return this.sendEventFilterID;
    }


    public void setSendEventFilterID(SystemEventLogsFilterUID value) {
        this.sendEventFilterID = value;
    }


    public AlertType getAlertType() {
        return this.alertType;
    }


    public void setAlertType(AlertType value) {
        this.alertType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EmailFilterData)) {
            return false;
        }
        EmailFilterData otherObj = (EmailFilterData) obj;

        return (this.targetAddressesList != null ? this.targetAddressesList.equals(otherObj.targetAddressesList) : this.targetAddressesList == otherObj.targetAddressesList) && (this.sendEventFilterID != null ? this.sendEventFilterID.equals(otherObj.sendEventFilterID) : this.sendEventFilterID == otherObj.sendEventFilterID) && (this.alertType != null ? this.alertType.equals(otherObj.alertType) : this.alertType == otherObj.alertType);
    }


    public int hashCode() {
        return (this.targetAddressesList != null ? this.targetAddressesList.hashCode() : 0) ^ (this.sendEventFilterID != null ? this.sendEventFilterID.hashCode() : 0) ^ (this.alertType != null ? this.alertType.hashCode() : 0);
    }


    public String toString() {
        return "EmailFilterData [targetAddressesList=" + this.targetAddressesList + ", " + "sendEventFilterID=" + this.sendEventFilterID + ", " + "alertType=" + this.alertType + "]";
    }
}


