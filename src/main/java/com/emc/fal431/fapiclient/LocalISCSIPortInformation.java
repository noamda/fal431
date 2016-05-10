
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for localISCSIPortInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="localISCSIPortInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{}iscsiPortInformation">
 *       &lt;sequence>
 *         &lt;element ref="{}nicInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localISCSIPortInformation", propOrder = {
    "nicInformation"
})
public class LocalISCSIPortInformation
    extends IscsiPortInformation
{

    protected NicInformation nicInformation;

    /**
     * Gets the value of the nicInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NicInformation }
     *     
     */
    public NicInformation getNicInformation() {
        return nicInformation;
    }

    /**
     * Sets the value of the nicInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NicInformation }
     *     
     */
    public void setNicInformation(NicInformation value) {
        this.nicInformation = value;
    }

}
