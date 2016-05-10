
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupLinkUID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupLinkUID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstCopy" type="{}globalCopyUID" minOccurs="0"/>
 *         &lt;element name="groupUID" type="{}consistencyGroupUID" minOccurs="0"/>
 *         &lt;element name="secondCopy" type="{}globalCopyUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupLinkUID", propOrder = {
    "firstCopy",
    "groupUID",
    "secondCopy"
})
public class ConsistencyGroupLinkUID {

    protected GlobalCopyUID firstCopy;
    protected ConsistencyGroupUID groupUID;
    protected GlobalCopyUID secondCopy;

    /**
     * Gets the value of the firstCopy property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalCopyUID }
     *     
     */
    public GlobalCopyUID getFirstCopy() {
        return firstCopy;
    }

    /**
     * Sets the value of the firstCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalCopyUID }
     *     
     */
    public void setFirstCopy(GlobalCopyUID value) {
        this.firstCopy = value;
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

    /**
     * Gets the value of the secondCopy property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalCopyUID }
     *     
     */
    public GlobalCopyUID getSecondCopy() {
        return secondCopy;
    }

    /**
     * Sets the value of the secondCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalCopyUID }
     *     
     */
    public void setSecondCopy(GlobalCopyUID value) {
        this.secondCopy = value;
    }

}
