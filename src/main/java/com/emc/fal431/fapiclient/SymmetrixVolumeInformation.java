
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for symmetrixVolumeInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="symmetrixVolumeInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{}volumeInformation">
 *       &lt;sequence>
 *         &lt;element name="tagged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "symmetrixVolumeInformation", propOrder = {
    "tagged"
})
public class SymmetrixVolumeInformation
    extends VolumeInformation
{

    protected boolean tagged;

    /**
     * Gets the value of the tagged property.
     * 
     */
    public boolean isTagged() {
        return tagged;
    }

    /**
     * Sets the value of the tagged property.
     * 
     */
    public void setTagged(boolean value) {
        this.tagged = value;
    }

}
