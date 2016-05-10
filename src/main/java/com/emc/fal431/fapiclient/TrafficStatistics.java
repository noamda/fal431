
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trafficStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trafficStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationIncomingWrites" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="applicationThroughputStatistics" type="{}inOutThroughputStatistics" minOccurs="0"/>
 *         &lt;element name="connectionsCompressionRatio" type="{}connectionCompressionRatio" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="initThroughputStatistics" type="{}inOutThroughputStatistics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trafficStatistics", propOrder = {
    "applicationIncomingWrites",
    "applicationThroughputStatistics",
    "connectionsCompressionRatio",
    "initThroughputStatistics"
})
public class TrafficStatistics {

    protected long applicationIncomingWrites;
    protected InOutThroughputStatistics applicationThroughputStatistics;
    @XmlElement(nillable = true)
    protected List<ConnectionCompressionRatio> connectionsCompressionRatio;
    protected InOutThroughputStatistics initThroughputStatistics;

    /**
     * Gets the value of the applicationIncomingWrites property.
     * 
     */
    public long getApplicationIncomingWrites() {
        return applicationIncomingWrites;
    }

    /**
     * Sets the value of the applicationIncomingWrites property.
     * 
     */
    public void setApplicationIncomingWrites(long value) {
        this.applicationIncomingWrites = value;
    }

    /**
     * Gets the value of the applicationThroughputStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link InOutThroughputStatistics }
     *     
     */
    public InOutThroughputStatistics getApplicationThroughputStatistics() {
        return applicationThroughputStatistics;
    }

    /**
     * Sets the value of the applicationThroughputStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link InOutThroughputStatistics }
     *     
     */
    public void setApplicationThroughputStatistics(InOutThroughputStatistics value) {
        this.applicationThroughputStatistics = value;
    }

    /**
     * Gets the value of the connectionsCompressionRatio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionsCompressionRatio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionsCompressionRatio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionCompressionRatio }
     * 
     * 
     */
    public List<ConnectionCompressionRatio> getConnectionsCompressionRatio() {
        if (connectionsCompressionRatio == null) {
            connectionsCompressionRatio = new ArrayList<ConnectionCompressionRatio>();
        }
        return this.connectionsCompressionRatio;
    }

    /**
     * Gets the value of the initThroughputStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link InOutThroughputStatistics }
     *     
     */
    public InOutThroughputStatistics getInitThroughputStatistics() {
        return initThroughputStatistics;
    }

    /**
     * Sets the value of the initThroughputStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link InOutThroughputStatistics }
     *     
     */
    public void setInitThroughputStatistics(InOutThroughputStatistics value) {
        this.initThroughputStatistics = value;
    }

}
