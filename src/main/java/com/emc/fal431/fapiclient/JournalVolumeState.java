
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for journalVolumeState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="journalVolumeState">
 *   &lt;complexContent>
 *     &lt;extension base="{}volumeState">
 *       &lt;sequence>
 *         &lt;element name="groupCopyUID" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "journalVolumeState", propOrder = {
    "groupCopyUID"
})
public class JournalVolumeState
    extends VolumeState
{

    protected ConsistencyGroupCopyUID groupCopyUID;

    /**
     * Gets the value of the groupCopyUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public ConsistencyGroupCopyUID getGroupCopyUID() {
        return groupCopyUID;
    }

    /**
     * Sets the value of the groupCopyUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public void setGroupCopyUID(ConsistencyGroupCopyUID value) {
        this.groupCopyUID = value;
    }

}
