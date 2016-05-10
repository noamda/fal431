
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for syslogSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="syslogSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clustersHosts" type="{}clusterSyslogHost" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="facility" type="{}syslogFacility" minOccurs="0"/>
 *         &lt;element name="sendEventFilters" type="{}systemEventLogsFilterUID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syslogSettings", propOrder = {
    "clustersHosts",
    "enabled",
    "facility",
    "sendEventFilters"
})
public class SyslogSettings {

    @XmlElement(nillable = true)
    protected List<ClusterSyslogHost> clustersHosts;
    protected boolean enabled;
    protected SyslogFacility facility;
    @XmlElement(nillable = true)
    protected List<SystemEventLogsFilterUID> sendEventFilters;

    /**
     * Gets the value of the clustersHosts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clustersHosts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClustersHosts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterSyslogHost }
     * 
     * 
     */
    public List<ClusterSyslogHost> getClustersHosts() {
        if (clustersHosts == null) {
            clustersHosts = new ArrayList<ClusterSyslogHost>();
        }
        return this.clustersHosts;
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
     * Gets the value of the facility property.
     * 
     * @return
     *     possible object is
     *     {@link SyslogFacility }
     *     
     */
    public SyslogFacility getFacility() {
        return facility;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyslogFacility }
     *     
     */
    public void setFacility(SyslogFacility value) {
        this.facility = value;
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

}
