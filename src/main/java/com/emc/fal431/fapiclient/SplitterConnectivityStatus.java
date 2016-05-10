
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for splitterConnectivityStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="splitterConnectivityStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{}clusterEntityConnectivityStatus">
 *       &lt;sequence>
 *         &lt;element ref="{}splitterUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "splitterConnectivityStatus", propOrder = {
    "splitterUID"
})
public class SplitterConnectivityStatus
    extends ClusterEntityConnectivityStatus
{

    protected SplitterUID splitterUID;

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
