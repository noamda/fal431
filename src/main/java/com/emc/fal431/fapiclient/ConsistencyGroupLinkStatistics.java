
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupLinkStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupLinkStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="initStatistics" type="{}consistencyGroupLinkInitStatistics" minOccurs="0"/>
 *         &lt;element name="linkUID" type="{}consistencyGroupLinkUID" minOccurs="0"/>
 *         &lt;element name="pipeStatistics" type="{}consistencyGroupLinkPipeStatistics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupLinkStatistics", propOrder = {
    "initStatistics",
    "linkUID",
    "pipeStatistics"
})
public class ConsistencyGroupLinkStatistics {

    protected ConsistencyGroupLinkInitStatistics initStatistics;
    protected ConsistencyGroupLinkUID linkUID;
    protected ConsistencyGroupLinkPipeStatistics pipeStatistics;

    /**
     * Gets the value of the initStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupLinkInitStatistics }
     *     
     */
    public ConsistencyGroupLinkInitStatistics getInitStatistics() {
        return initStatistics;
    }

    /**
     * Sets the value of the initStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupLinkInitStatistics }
     *     
     */
    public void setInitStatistics(ConsistencyGroupLinkInitStatistics value) {
        this.initStatistics = value;
    }

    /**
     * Gets the value of the linkUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupLinkUID }
     *     
     */
    public ConsistencyGroupLinkUID getLinkUID() {
        return linkUID;
    }

    /**
     * Sets the value of the linkUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupLinkUID }
     *     
     */
    public void setLinkUID(ConsistencyGroupLinkUID value) {
        this.linkUID = value;
    }

    /**
     * Gets the value of the pipeStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupLinkPipeStatistics }
     *     
     */
    public ConsistencyGroupLinkPipeStatistics getPipeStatistics() {
        return pipeStatistics;
    }

    /**
     * Sets the value of the pipeStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupLinkPipeStatistics }
     *     
     */
    public void setPipeStatistics(ConsistencyGroupLinkPipeStatistics value) {
        this.pipeStatistics = value;
    }

}
