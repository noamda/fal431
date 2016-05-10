
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for snmpSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="snmpSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="secureTransportsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sendEventFilters" type="{}systemEventLogsFilterUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shouldSendEventTraps" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="snmpCommunity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traps" type="{}snmpTrapDestination" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="users" type="{}snmpUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "snmpSettings", propOrder = {
    "agentEnabled",
    "secureTransportsOnly",
    "sendEventFilters",
    "shouldSendEventTraps",
    "snmpCommunity",
    "traps",
    "users"
})
public class SnmpSettings {

    protected boolean agentEnabled;
    protected boolean secureTransportsOnly;
    @XmlElement(nillable = true)
    protected List<SystemEventLogsFilterUID> sendEventFilters;
    protected boolean shouldSendEventTraps;
    protected String snmpCommunity;
    @XmlElement(nillable = true)
    protected List<SnmpTrapDestination> traps;
    @XmlElement(nillable = true)
    protected List<SnmpUser> users;

    /**
     * Gets the value of the agentEnabled property.
     * 
     */
    public boolean isAgentEnabled() {
        return agentEnabled;
    }

    /**
     * Sets the value of the agentEnabled property.
     * 
     */
    public void setAgentEnabled(boolean value) {
        this.agentEnabled = value;
    }

    /**
     * Gets the value of the secureTransportsOnly property.
     * 
     */
    public boolean isSecureTransportsOnly() {
        return secureTransportsOnly;
    }

    /**
     * Sets the value of the secureTransportsOnly property.
     * 
     */
    public void setSecureTransportsOnly(boolean value) {
        this.secureTransportsOnly = value;
    }

    /**
     * Gets the value of the sendEventFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sendEventFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSendEventFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemEventLogsFilterUID }
     * 
     * 
     */
    public List<SystemEventLogsFilterUID> getSendEventFilters() {
        if (sendEventFilters == null) {
            sendEventFilters = new ArrayList<SystemEventLogsFilterUID>();
        }
        return this.sendEventFilters;
    }

    /**
     * Gets the value of the shouldSendEventTraps property.
     * 
     */
    public boolean isShouldSendEventTraps() {
        return shouldSendEventTraps;
    }

    /**
     * Sets the value of the shouldSendEventTraps property.
     * 
     */
    public void setShouldSendEventTraps(boolean value) {
        this.shouldSendEventTraps = value;
    }

    /**
     * Gets the value of the snmpCommunity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpCommunity() {
        return snmpCommunity;
    }

    /**
     * Sets the value of the snmpCommunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpCommunity(String value) {
        this.snmpCommunity = value;
    }

    /**
     * Gets the value of the traps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SnmpTrapDestination }
     * 
     * 
     */
    public List<SnmpTrapDestination> getTraps() {
        if (traps == null) {
            traps = new ArrayList<SnmpTrapDestination>();
        }
        return this.traps;
    }

    /**
     * Gets the value of the users property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the users property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SnmpUser }
     * 
     * 
     */
    public List<SnmpUser> getUsers() {
        if (users == null) {
            users = new ArrayList<SnmpUser>();
        }
        return this.users;
    }

}
