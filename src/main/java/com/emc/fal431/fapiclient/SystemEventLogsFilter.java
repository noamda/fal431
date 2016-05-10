
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemEventLogsFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemEventLogsFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{}eventLogsFilter">
 *       &lt;sequence>
 *         &lt;element name="filterUID" type="{}systemEventLogsFilterUID" minOccurs="0"/>
 *         &lt;element name="groupsToExclude" type="{}consistencyGroupUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="topic" type="{}eventLogTopic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemEventLogsFilter", propOrder = {
    "filterUID",
    "groupsToExclude",
    "name",
    "topic"
})
public class SystemEventLogsFilter
    extends EventLogsFilter
{

    protected SystemEventLogsFilterUID filterUID;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupUID> groupsToExclude;
    protected String name;
    protected EventLogTopic topic;

    /**
     * Gets the value of the filterUID property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventLogsFilterUID }
     *     
     */
    public SystemEventLogsFilterUID getFilterUID() {
        return filterUID;
    }

    /**
     * Sets the value of the filterUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventLogsFilterUID }
     *     
     */
    public void setFilterUID(SystemEventLogsFilterUID value) {
        this.filterUID = value;
    }

    /**
     * Gets the value of the groupsToExclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupsToExclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupsToExclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupUID }
     * 
     * 
     */
    public List<ConsistencyGroupUID> getGroupsToExclude() {
        if (groupsToExclude == null) {
            groupsToExclude = new ArrayList<ConsistencyGroupUID>();
        }
        return this.groupsToExclude;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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

}
