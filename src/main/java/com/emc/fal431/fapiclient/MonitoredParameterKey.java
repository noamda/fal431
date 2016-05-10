
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monitoredParameterKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="monitoredParameterKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}clusterUID" minOccurs="0"/>
 *         &lt;element ref="{}consistencyGroupCopyUID" minOccurs="0"/>
 *         &lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="globalLink" type="{}globalLinkUID" minOccurs="0"/>
 *         &lt;element name="parameterType" type="{}monitoredParameterType" minOccurs="0"/>
 *         &lt;element ref="{}rpaUID" minOccurs="0"/>
 *         &lt;element ref="{}splitterUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monitoredParameterKey", propOrder = {
    "clusterUID",
    "consistencyGroupCopyUID",
    "context",
    "globalLink",
    "parameterType",
    "rpaUID",
    "splitterUID"
})
public class MonitoredParameterKey {

    protected ClusterUID clusterUID;
    protected ConsistencyGroupCopyUID consistencyGroupCopyUID;
    protected String context;
    protected GlobalLinkUID globalLink;
    protected MonitoredParameterType parameterType;
    protected RpaUID rpaUID;
    protected SplitterUID splitterUID;

    /**
     * Gets the value of the clusterUID property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterUID }
     *     
     */
    public ClusterUID getClusterUID() {
        return clusterUID;
    }

    /**
     * Sets the value of the clusterUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterUID }
     *     
     */
    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }

    /**
     * Gets the value of the consistencyGroupCopyUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public ConsistencyGroupCopyUID getConsistencyGroupCopyUID() {
        return consistencyGroupCopyUID;
    }

    /**
     * Sets the value of the consistencyGroupCopyUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public void setConsistencyGroupCopyUID(ConsistencyGroupCopyUID value) {
        this.consistencyGroupCopyUID = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets the value of the globalLink property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalLinkUID }
     *     
     */
    public GlobalLinkUID getGlobalLink() {
        return globalLink;
    }

    /**
     * Sets the value of the globalLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalLinkUID }
     *     
     */
    public void setGlobalLink(GlobalLinkUID value) {
        this.globalLink = value;
    }

    /**
     * Gets the value of the parameterType property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoredParameterType }
     *     
     */
    public MonitoredParameterType getParameterType() {
        return parameterType;
    }

    /**
     * Sets the value of the parameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoredParameterType }
     *     
     */
    public void setParameterType(MonitoredParameterType value) {
        this.parameterType = value;
    }

    /**
     * Gets the value of the rpaUID property.
     * 
     * @return
     *     possible object is
     *     {@link RpaUID }
     *     
     */
    public RpaUID getRpaUID() {
        return rpaUID;
    }

    /**
     * Sets the value of the rpaUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpaUID }
     *     
     */
    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }

    /**
     * Gets the value of the splitterUID property.
     * 
     * @return
     *     possible object is
     *     {@link SplitterUID }
     *     
     */
    public SplitterUID getSplitterUID() {
        return splitterUID;
    }

    /**
     * Sets the value of the splitterUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitterUID }
     *     
     */
    public void setSplitterUID(SplitterUID value) {
        this.splitterUID = value;
    }

}
