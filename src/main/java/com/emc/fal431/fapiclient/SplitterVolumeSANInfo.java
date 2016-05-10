
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for splitterVolumeSANInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="splitterVolumeSANInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{}splitterVolume">
 *       &lt;sequence>
 *         &lt;element name="sanInfo" type="{}volumeSANInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "splitterVolumeSANInfo", propOrder = {
    "sanInfo"
})
public class SplitterVolumeSANInfo
    extends SplitterVolume
{

    protected VolumeSANInfo sanInfo;

    /**
     * Gets the value of the sanInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeSANInfo }
     *     
     */
    public VolumeSANInfo getSanInfo() {
        return sanInfo;
    }

    /**
     * Sets the value of the sanInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeSANInfo }
     *     
     */
    public void setSanInfo(VolumeSANInfo value) {
        this.sanInfo = value;
    }

}
