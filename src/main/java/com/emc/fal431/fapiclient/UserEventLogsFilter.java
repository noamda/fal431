
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userEventLogsFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userEventLogsFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{}eventLogsFilter">
 *       &lt;sequence>
 *         &lt;element ref="{}textFilter" minOccurs="0"/>
 *         &lt;element ref="{}timeFrame" minOccurs="0"/>
 *         &lt;element name="topics" type="{}eventLogTopic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userEventLogsFilter", propOrder = {
    "textFilter",
    "timeFrame",
    "topics"
})
public class UserEventLogsFilter
    extends EventLogsFilter
{

    protected TextFilter textFilter;
    protected TimeFrame timeFrame;
    @XmlElement(nillable = true)
    protected List<EventLogTopic> topics;

    /**
     * Gets the value of the textFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TextFilter }
     *     
     */
    public TextFilter getTextFilter() {
        return textFilter;
    }

    /**
     * Sets the value of the textFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextFilter }
     *     
     */
    public void setTextFilter(TextFilter value) {
        this.textFilter = value;
    }

    /**
     * Gets the value of the timeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrame }
     *     
     */
    public TimeFrame getTimeFrame() {
        return timeFrame;
    }

    /**
     * Sets the value of the timeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrame }
     *     
     */
    public void setTimeFrame(TimeFrame value) {
        this.timeFrame = value;
    }

    /**
     * Gets the value of the topics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventLogTopic }
     * 
     * 
     */
    public List<EventLogTopic> getTopics() {
        if (topics == null) {
            topics = new ArrayList<EventLogTopic>();
        }
        return this.topics;
    }

}
