
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consistencyGroupCopyStatistics" type="{}consistencyGroupCopyStatistics" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="consistencyGroupLinkStatistics" type="{}consistencyGroupLinkStatistics" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}consistencyGroupUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupStatistics", propOrder = {
    "consistencyGroupCopyStatistics",
    "consistencyGroupLinkStatistics",
    "consistencyGroupUID"
})
public class ConsistencyGroupStatistics {

    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyStatistics> consistencyGroupCopyStatistics;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupLinkStatistics> consistencyGroupLinkStatistics;
    protected ConsistencyGroupUID consistencyGroupUID;

    /**
     * Gets the value of the consistencyGroupCopyStatistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consistencyGroupCopyStatistics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsistencyGroupCopyStatistics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupCopyStatistics }
     * 
     * 
     */
    public List<ConsistencyGroupCopyStatistics> getConsistencyGroupCopyStatistics() {
        if (consistencyGroupCopyStatistics == null) {
            consistencyGroupCopyStatistics = new ArrayList<ConsistencyGroupCopyStatistics>();
        }
        return this.consistencyGroupCopyStatistics;
    }

    /**
     * Gets the value of the consistencyGroupLinkStatistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consistencyGroupLinkStatistics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsistencyGroupLinkStatistics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupLinkStatistics }
     * 
     * 
     */
    public List<ConsistencyGroupLinkStatistics> getConsistencyGroupLinkStatistics() {
        if (consistencyGroupLinkStatistics == null) {
            consistencyGroupLinkStatistics = new ArrayList<ConsistencyGroupLinkStatistics>();
        }
        return this.consistencyGroupLinkStatistics;
    }

    /**
     * Gets the value of the consistencyGroupUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupUID }
     *     
     */
    public ConsistencyGroupUID getConsistencyGroupUID() {
        return consistencyGroupUID;
    }

    /**
     * Sets the value of the consistencyGroupUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupUID }
     *     
     */
    public void setConsistencyGroupUID(ConsistencyGroupUID value) {
        this.consistencyGroupUID = value;
    }

}
