
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for emailFilterData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="emailFilterData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}alertType" minOccurs="0"/>
 *         &lt;element name="sendEventFilterID" type="{}systemEventLogsFilterUID" minOccurs="0"/>
 *         &lt;element name="targetAddressesList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emailFilterData", propOrder = {
    "alertType",
    "sendEventFilterID",
    "targetAddressesList"
})
public class EmailFilterData {

    protected AlertType alertType;
    protected SystemEventLogsFilterUID sendEventFilterID;
    @XmlElement(nillable = true)
    protected List<String> targetAddressesList;

    /**
     * Gets the value of the alertType property.
     * 
     * @return
     *     possible object is
     *     {@link AlertType }
     *     
     */
    public AlertType getAlertType() {
        return alertType;
    }

    /**
     * Sets the value of the alertType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertType }
     *     
     */
    public void setAlertType(AlertType value) {
        this.alertType = value;
    }

    /**
     * Gets the value of the sendEventFilterID property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventLogsFilterUID }
     *     
     */
    public SystemEventLogsFilterUID getSendEventFilterID() {
        return sendEventFilterID;
    }

    /**
     * Sets the value of the sendEventFilterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventLogsFilterUID }
     *     
     */
    public void setSendEventFilterID(SystemEventLogsFilterUID value) {
        this.sendEventFilterID = value;
    }

    /**
     * Gets the value of the targetAddressesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetAddressesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetAddressesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTargetAddressesList() {
        if (targetAddressesList == null) {
            targetAddressesList = new ArrayList<String>();
        }
        return this.targetAddressesList;
    }

}
