
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupCopyRoleInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupCopyRoleInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="role" type="{}consistencyGroupCopyRole" minOccurs="0"/>
 *         &lt;element name="sourceCopyUID" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupCopyRoleInfo", propOrder = {
    "role",
    "sourceCopyUID"
})
public class ConsistencyGroupCopyRoleInfo {

    protected ConsistencyGroupCopyRole role;
    protected ConsistencyGroupCopyUID sourceCopyUID;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyRole }
     *     
     */
    public ConsistencyGroupCopyRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyRole }
     *     
     */
    public void setRole(ConsistencyGroupCopyRole value) {
        this.role = value;
    }

    /**
     * Gets the value of the sourceCopyUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public ConsistencyGroupCopyUID getSourceCopyUID() {
        return sourceCopyUID;
    }

    /**
     * Sets the value of the sourceCopyUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public void setSourceCopyUID(ConsistencyGroupCopyUID value) {
        this.sourceCopyUID = value;
    }

}
