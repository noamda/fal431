
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemAlertsSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemAlertsSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emailFilters" type="{}emailFilterData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sendDailyInfoToEMCSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="senderEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemAlertsSettings", propOrder = {
    "emailFilters",
    "enabled",
    "sendDailyInfoToEMCSupport",
    "senderEmailAddress"
})
public class SystemAlertsSettings {

    @XmlElement(nillable = true)
    protected List<EmailFilterData> emailFilters;
    protected boolean enabled;
    protected boolean sendDailyInfoToEMCSupport;
    protected String senderEmailAddress;

    /**
     * Gets the value of the emailFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailFilterData }
     * 
     * 
     */
    public List<EmailFilterData> getEmailFilters() {
        if (emailFilters == null) {
            emailFilters = new ArrayList<EmailFilterData>();
        }
        return this.emailFilters;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the sendDailyInfoToEMCSupport property.
     * 
     */
    public boolean isSendDailyInfoToEMCSupport() {
        return sendDailyInfoToEMCSupport;
    }

    /**
     * Sets the value of the sendDailyInfoToEMCSupport property.
     * 
     */
    public void setSendDailyInfoToEMCSupport(boolean value) {
        this.sendDailyInfoToEMCSupport = value;
    }

    /**
     * Gets the value of the senderEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderEmailAddress() {
        return senderEmailAddress;
    }

    /**
     * Sets the value of the senderEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderEmailAddress(String value) {
        this.senderEmailAddress = value;
    }

}
