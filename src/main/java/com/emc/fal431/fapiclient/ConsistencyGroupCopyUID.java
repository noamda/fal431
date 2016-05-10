
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupCopyUID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupCopyUID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}globalCopyUID" minOccurs="0"/>
 *         &lt;element name="groupUID" type="{}consistencyGroupUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupCopyUID", propOrder = {
    "globalCopyUID",
    "groupUID"
})
public class ConsistencyGroupCopyUID {

    protected GlobalCopyUID globalCopyUID;
    protected ConsistencyGroupUID groupUID;

    /**
     * Gets the value of the globalCopyUID property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalCopyUID }
     *     
     */
    public GlobalCopyUID getGlobalCopyUID() {
        return globalCopyUID;
    }

    /**
     * Sets the value of the globalCopyUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalCopyUID }
     *     
     */
    public void setGlobalCopyUID(GlobalCopyUID value) {
        this.globalCopyUID = value;
    }

    /**
     * Gets the value of the groupUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupUID }
     *     
     */
    public ConsistencyGroupUID getGroupUID() {
        return groupUID;
    }

    /**
     * Sets the value of the groupUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupUID }
     *     
     */
    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }

}
