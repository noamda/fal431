
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iscsiPath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iscsiPath">
 *   &lt;complexContent>
 *     &lt;extension base="{}path">
 *       &lt;sequence>
 *         &lt;element name="localIpInformation" type="{}ipInformation" minOccurs="0"/>
 *         &lt;element name="localIqn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remoteIpInformation" type="{}ipInformation" minOccurs="0"/>
 *         &lt;element name="remoteIqn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remotePort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iscsiPath", propOrder = {
    "localIpInformation",
    "localIqn",
    "remoteIpInformation",
    "remoteIqn",
    "remotePort"
})
public class IscsiPath
    extends Path
{

    protected IpInformation localIpInformation;
    protected String localIqn;
    protected IpInformation remoteIpInformation;
    protected String remoteIqn;
    protected Integer remotePort;

    /**
     * Gets the value of the localIpInformation property.
     * 
     * @return
     *     possible object is
     *     {@link IpInformation }
     *     
     */
    public IpInformation getLocalIpInformation() {
        return localIpInformation;
    }

    /**
     * Sets the value of the localIpInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpInformation }
     *     
     */
    public void setLocalIpInformation(IpInformation value) {
        this.localIpInformation = value;
    }

    /**
     * Gets the value of the localIqn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalIqn() {
        return localIqn;
    }

    /**
     * Sets the value of the localIqn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalIqn(String value) {
        this.localIqn = value;
    }

    /**
     * Gets the value of the remoteIpInformation property.
     * 
     * @return
     *     possible object is
     *     {@link IpInformation }
     *     
     */
    public IpInformation getRemoteIpInformation() {
        return remoteIpInformation;
    }

    /**
     * Sets the value of the remoteIpInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpInformation }
     *     
     */
    public void setRemoteIpInformation(IpInformation value) {
        this.remoteIpInformation = value;
    }

    /**
     * Gets the value of the remoteIqn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteIqn() {
        return remoteIqn;
    }

    /**
     * Sets the value of the remoteIqn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteIqn(String value) {
        this.remoteIqn = value;
    }

    /**
     * Gets the value of the remotePort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemotePort() {
        return remotePort;
    }

    /**
     * Sets the value of the remotePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemotePort(Integer value) {
        this.remotePort = value;
    }

}
