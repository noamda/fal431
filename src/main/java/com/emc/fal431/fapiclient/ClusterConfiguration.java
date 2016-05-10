
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clusterConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clusterConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cluster" type="{}clusterUID" minOccurs="0"/>
 *         &lt;element name="clusterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dnsIPs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gateways" type="{}gatewayInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="initiatorOnlyMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="internalClusterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="managementIPs" type="{}ipInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numberOfExposedLUNs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfInitiatorIQNs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfVirtualPorts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{}productType" minOccurs="0"/>
 *         &lt;element name="remoteClustersConnectionInformation" type="{}remoteClusterConnectionInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remoteISCSITargetsPortsConfiguration" type="{}remoteISCSIPortsConfiguration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rpasConfiguration" type="{}rpaConfiguration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clusterConfiguration", propOrder = {
    "cluster",
    "clusterName",
    "dnsIPs",
    "domain",
    "gateways",
    "initiatorOnlyMode",
    "internalClusterName",
    "managementIPs",
    "numberOfExposedLUNs",
    "numberOfInitiatorIQNs",
    "numberOfVirtualPorts",
    "productType",
    "remoteClustersConnectionInformation",
    "remoteISCSITargetsPortsConfiguration",
    "rpasConfiguration",
    "timeZone"
})
public class ClusterConfiguration {

    protected ClusterUID cluster;
    protected String clusterName;
    @XmlElement(nillable = true)
    protected List<String> dnsIPs;
    protected String domain;
    @XmlElement(nillable = true)
    protected List<GatewayInformation> gateways;
    protected boolean initiatorOnlyMode;
    protected String internalClusterName;
    @XmlElement(nillable = true)
    protected List<IpInformation> managementIPs;
    protected int numberOfExposedLUNs;
    protected int numberOfInitiatorIQNs;
    protected int numberOfVirtualPorts;
    protected ProductType productType;
    @XmlElement(nillable = true)
    protected List<RemoteClusterConnectionInformation> remoteClustersConnectionInformation;
    @XmlElement(nillable = true)
    protected List<RemoteISCSIPortsConfiguration> remoteISCSITargetsPortsConfiguration;
    @XmlElement(nillable = true)
    protected List<RpaConfiguration> rpasConfiguration;
    protected String timeZone;

    /**
     * Gets the value of the cluster property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterUID }
     *     
     */
    public ClusterUID getCluster() {
        return cluster;
    }

    /**
     * Sets the value of the cluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterUID }
     *     
     */
    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }

    /**
     * Gets the value of the clusterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * Sets the value of the clusterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterName(String value) {
        this.clusterName = value;
    }

    /**
     * Gets the value of the dnsIPs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dnsIPs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDnsIPs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDnsIPs() {
        if (dnsIPs == null) {
            dnsIPs = new ArrayList<String>();
        }
        return this.dnsIPs;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the gateways property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gateways property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGateways().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GatewayInformation }
     * 
     * 
     */
    public List<GatewayInformation> getGateways() {
        if (gateways == null) {
            gateways = new ArrayList<GatewayInformation>();
        }
        return this.gateways;
    }

    /**
     * Gets the value of the initiatorOnlyMode property.
     * 
     */
    public boolean isInitiatorOnlyMode() {
        return initiatorOnlyMode;
    }

    /**
     * Sets the value of the initiatorOnlyMode property.
     * 
     */
    public void setInitiatorOnlyMode(boolean value) {
        this.initiatorOnlyMode = value;
    }

    /**
     * Gets the value of the internalClusterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalClusterName() {
        return internalClusterName;
    }

    /**
     * Sets the value of the internalClusterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalClusterName(String value) {
        this.internalClusterName = value;
    }

    /**
     * Gets the value of the managementIPs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managementIPs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagementIPs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IpInformation }
     * 
     * 
     */
    public List<IpInformation> getManagementIPs() {
        if (managementIPs == null) {
            managementIPs = new ArrayList<IpInformation>();
        }
        return this.managementIPs;
    }

    /**
     * Gets the value of the numberOfExposedLUNs property.
     * 
     */
    public int getNumberOfExposedLUNs() {
        return numberOfExposedLUNs;
    }

    /**
     * Sets the value of the numberOfExposedLUNs property.
     * 
     */
    public void setNumberOfExposedLUNs(int value) {
        this.numberOfExposedLUNs = value;
    }

    /**
     * Gets the value of the numberOfInitiatorIQNs property.
     * 
     */
    public int getNumberOfInitiatorIQNs() {
        return numberOfInitiatorIQNs;
    }

    /**
     * Sets the value of the numberOfInitiatorIQNs property.
     * 
     */
    public void setNumberOfInitiatorIQNs(int value) {
        this.numberOfInitiatorIQNs = value;
    }

    /**
     * Gets the value of the numberOfVirtualPorts property.
     * 
     */
    public int getNumberOfVirtualPorts() {
        return numberOfVirtualPorts;
    }

    /**
     * Sets the value of the numberOfVirtualPorts property.
     * 
     */
    public void setNumberOfVirtualPorts(int value) {
        this.numberOfVirtualPorts = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProductType(ProductType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the remoteClustersConnectionInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteClustersConnectionInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteClustersConnectionInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemoteClusterConnectionInformation }
     * 
     * 
     */
    public List<RemoteClusterConnectionInformation> getRemoteClustersConnectionInformation() {
        if (remoteClustersConnectionInformation == null) {
            remoteClustersConnectionInformation = new ArrayList<RemoteClusterConnectionInformation>();
        }
        return this.remoteClustersConnectionInformation;
    }

    /**
     * Gets the value of the remoteISCSITargetsPortsConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteISCSITargetsPortsConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteISCSITargetsPortsConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemoteISCSIPortsConfiguration }
     * 
     * 
     */
    public List<RemoteISCSIPortsConfiguration> getRemoteISCSITargetsPortsConfiguration() {
        if (remoteISCSITargetsPortsConfiguration == null) {
            remoteISCSITargetsPortsConfiguration = new ArrayList<RemoteISCSIPortsConfiguration>();
        }
        return this.remoteISCSITargetsPortsConfiguration;
    }

    /**
     * Gets the value of the rpasConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rpasConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpasConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RpaConfiguration }
     * 
     * 
     */
    public List<RpaConfiguration> getRpasConfiguration() {
        if (rpasConfiguration == null) {
            rpasConfiguration = new ArrayList<RpaConfiguration>();
        }
        return this.rpasConfiguration;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

}
