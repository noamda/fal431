
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rpaPortInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rpaPortInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nodeWWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portIndex" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="portWWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rpaPortInformation", propOrder = {
    "nodeWWN",
    "portIndex",
    "portWWN"
})
public class RpaPortInformation {

    protected String nodeWWN;
    protected long portIndex;
    protected String portWWN;

    /**
     * Gets the value of the nodeWWN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeWWN() {
        return nodeWWN;
    }

    /**
     * Sets the value of the nodeWWN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeWWN(String value) {
        this.nodeWWN = value;
    }

    /**
     * Gets the value of the portIndex property.
     * 
     */
    public long getPortIndex() {
        return portIndex;
    }

    /**
     * Sets the value of the portIndex property.
     * 
     */
    public void setPortIndex(long value) {
        this.portIndex = value;
    }

    /**
     * Gets the value of the portWWN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortWWN() {
        return portWWN;
    }

    /**
     * Sets the value of the portWWN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortWWN(String value) {
        this.portWWN = value;
    }

}
