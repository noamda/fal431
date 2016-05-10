
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remoteISCSIPortInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remoteISCSIPortInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{}iscsiPortInformation">
 *       &lt;sequence>
 *         &lt;element ref="{}ipInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remoteISCSIPortInformation", propOrder = {
    "ipInformation"
})
public class RemoteISCSIPortInformation
    extends IscsiPortInformation
{

    protected IpInformation ipInformation;

    /**
     * Gets the value of the ipInformation property.
     * 
     * @return
     *     possible object is
     *     {@link IpInformation }
     *     
     */
    public IpInformation getIpInformation() {
        return ipInformation;
    }

    /**
     * Sets the value of the ipInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpInformation }
     *     
     */
    public void setIpInformation(IpInformation value) {
        this.ipInformation = value;
    }

}
