
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fiberChannelPath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fiberChannelPath">
 *   &lt;complexContent>
 *     &lt;extension base="{}path">
 *       &lt;sequence>
 *         &lt;element name="localNodeWWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localPortWWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remotePortWWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fiberChannelPath", propOrder = {
    "localNodeWWN",
    "localPortWWN",
    "remotePortWWN"
})
public class FiberChannelPath
    extends Path
{

    protected String localNodeWWN;
    protected String localPortWWN;
    protected String remotePortWWN;

    /**
     * Gets the value of the localNodeWWN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalNodeWWN() {
        return localNodeWWN;
    }

    /**
     * Sets the value of the localNodeWWN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalNodeWWN(String value) {
        this.localNodeWWN = value;
    }

    /**
     * Gets the value of the localPortWWN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPortWWN() {
        return localPortWWN;
    }

    /**
     * Sets the value of the localPortWWN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPortWWN(String value) {
        this.localPortWWN = value;
    }

    /**
     * Gets the value of the remotePortWWN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemotePortWWN() {
        return remotePortWWN;
    }

    /**
     * Sets the value of the remotePortWWN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemotePortWWN(String value) {
        this.remotePortWWN = value;
    }

}
