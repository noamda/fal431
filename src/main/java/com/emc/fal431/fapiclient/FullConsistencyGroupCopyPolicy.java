
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fullConsistencyGroupCopyPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fullConsistencyGroupCopyPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="copyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="copyPolicy" type="{}consistencyGroupCopyPolicy" minOccurs="0"/>
 *         &lt;element name="copyUID" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fullConsistencyGroupCopyPolicy", propOrder = {
    "copyName",
    "copyPolicy",
    "copyUID"
})
public class FullConsistencyGroupCopyPolicy {

    protected String copyName;
    protected ConsistencyGroupCopyPolicy copyPolicy;
    protected ConsistencyGroupCopyUID copyUID;

    /**
     * Gets the value of the copyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyName() {
        return copyName;
    }

    /**
     * Sets the value of the copyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyName(String value) {
        this.copyName = value;
    }

    /**
     * Gets the value of the copyPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyPolicy }
     *     
     */
    public ConsistencyGroupCopyPolicy getCopyPolicy() {
        return copyPolicy;
    }

    /**
     * Sets the value of the copyPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyPolicy }
     *     
     */
    public void setCopyPolicy(ConsistencyGroupCopyPolicy value) {
        this.copyPolicy = value;
    }

    /**
     * Gets the value of the copyUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public ConsistencyGroupCopyUID getCopyUID() {
        return copyUID;
    }

    /**
     * Sets the value of the copyUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public void setCopyUID(ConsistencyGroupCopyUID value) {
        this.copyUID = value;
    }

}
