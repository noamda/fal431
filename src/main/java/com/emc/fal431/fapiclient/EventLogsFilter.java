
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventLogsFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventLogsFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventsIDs" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="level" type="{}eventLogLevel" minOccurs="0"/>
 *         &lt;element name="scope" type="{}eventLogScope" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventLogsFilter", propOrder = {
    "eventsIDs",
    "level",
    "scope"
})
@XmlSeeAlso({
    SystemEventLogsFilter.class,
    UserEventLogsFilter.class
})
public abstract class EventLogsFilter {

    @XmlElement(nillable = true)
    protected List<Integer> eventsIDs;
    protected EventLogLevel level;
    protected EventLogScope scope;

    /**
     * Gets the value of the eventsIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventsIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventsIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getEventsIDs() {
        if (eventsIDs == null) {
            eventsIDs = new ArrayList<Integer>();
        }
        return this.eventsIDs;
    }

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

}
