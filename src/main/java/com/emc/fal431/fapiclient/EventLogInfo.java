
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventLogInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventLogInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="level" type="{}eventLogLevel" minOccurs="0"/>
 *         &lt;element name="moreDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scope" type="{}eventLogScope" minOccurs="0"/>
 *         &lt;element name="seSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="topic" type="{}eventLogTopic" minOccurs="0"/>
 *         &lt;element name="userAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventLogInfo", propOrder = {
    "level",
    "moreDetails",
    "scope",
    "seSummary",
    "summary",
    "topic",
    "userAction"
})
public class EventLogInfo {

    protected EventLogLevel level;
    protected String moreDetails;
    protected EventLogScope scope;
    protected String seSummary;
    protected String summary;
    protected EventLogTopic topic;
    protected String userAction;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link EventLogLevel }
     *     
     */
    public EventLogLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventLogLevel }
     *     
     */
    public void setLevel(EventLogLevel value) {
        this.level = value;
    }

    /**
     * Gets the value of the moreDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreDetails() {
        return moreDetails;
    }

    /**
     * Sets the value of the moreDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreDetails(String value) {
        this.moreDetails = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link EventLogScope }
     *     
     */
    public EventLogScope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventLogScope }
     *     
     */
    public void setScope(EventLogScope value) {
        this.scope = value;
    }

    /**
     * Gets the value of the seSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeSummary() {
        return seSummary;
    }

    /**
     * Sets the value of the seSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeSummary(String value) {
        this.seSummary = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the topic property.
     * 
     * @return
     *     possible object is
     *     {@link EventLogTopic }
     *     
     */
    public EventLogTopic getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventLogTopic }
     *     
     */
    public void setTopic(EventLogTopic value) {
        this.topic = value;
    }

    /**
     * Gets the value of the userAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAction() {
        return userAction;
    }

    /**
     * Sets the value of the userAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAction(String value) {
        this.userAction = value;
    }

}
