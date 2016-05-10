
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vCenterServerLunFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vCenterServerLunFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{}vCenterServerFilter">
 *       &lt;sequence>
 *         &lt;element name="lunID" type="{}deviceUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vCenterServerLunFilter", propOrder = {
    "lunID"
})
public class VCenterServerLunFilter
    extends VCenterServerFilter
{

    protected DeviceUID lunID;

    /**
     * Gets the value of the lunID property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceUID }
     *     
     */
    public DeviceUID getLunID() {
        return lunID;
    }

    /**
     * Sets the value of the lunID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceUID }
     *     
     */
    public void setLunID(DeviceUID value) {
        this.lunID = value;
    }

}
