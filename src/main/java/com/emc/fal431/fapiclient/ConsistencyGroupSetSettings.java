
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupSetSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupSetSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookmarkFrequencyInMicroSeconds" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="groupsUIDs" type="{}consistencyGroupUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="setUID" type="{}consistencyGroupSetUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupSetSettings", propOrder = {
    "bookmarkFrequencyInMicroSeconds",
    "groupsUIDs",
    "name",
    "setUID"
})
public class ConsistencyGroupSetSettings {

    protected long bookmarkFrequencyInMicroSeconds;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupUID> groupsUIDs;
    protected String name;
    protected ConsistencyGroupSetUID setUID;

    /**
     * Gets the value of the bookmarkFrequencyInMicroSeconds property.
     * 
     */
    public long getBookmarkFrequencyInMicroSeconds() {
        return bookmarkFrequencyInMicroSeconds;
    }

    /**
     * Sets the value of the bookmarkFrequencyInMicroSeconds property.
     * 
     */
    public void setBookmarkFrequencyInMicroSeconds(long value) {
        this.bookmarkFrequencyInMicroSeconds = value;
    }

    /**
     * Gets the value of the groupsUIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupsUIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupsUIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupUID }
     * 
     * 
     */
    public List<ConsistencyGroupUID> getGroupsUIDs() {
        if (groupsUIDs == null) {
            groupsUIDs = new ArrayList<ConsistencyGroupUID>();
        }
        return this.groupsUIDs;
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
     * Gets the value of the setUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupSetUID }
     *     
     */
    public ConsistencyGroupSetUID getSetUID() {
        return setUID;
    }

    /**
     * Sets the value of the setUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupSetUID }
     *     
     */
    public void setSetUID(ConsistencyGroupSetUID value) {
        this.setUID = value;
    }

}
