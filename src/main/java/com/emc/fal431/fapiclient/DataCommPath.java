
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataCommPath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataCommPath">
 *   &lt;complexContent>
 *     &lt;extension base="{}path">
 *       &lt;sequence>
 *         &lt;element name="splitterUid" type="{}splitterUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataCommPath", propOrder = {
    "splitterUid"
})
public class DataCommPath
    extends Path
{

    protected SplitterUID splitterUid;

    /**
     * Gets the value of the splitterUid property.
     * 
     * @return
     *     possible object is
     *     {@link SplitterUID }
     *     
     */
    public SplitterUID getSplitterUid() {
        return splitterUid;
    }

    /**
     * Sets the value of the splitterUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitterUID }
     *     
     */
    public void setSplitterUid(SplitterUID value) {
        this.splitterUid = value;
    }

}
