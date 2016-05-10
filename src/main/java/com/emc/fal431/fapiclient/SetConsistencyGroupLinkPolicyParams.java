
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setConsistencyGroupLinkPolicyParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setConsistencyGroupLinkPolicyParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstCopy" type="{}globalCopyUID" minOccurs="0"/>
 *         &lt;element name="policy" type="{}consistencyGroupLinkPolicy" minOccurs="0"/>
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
@XmlType(name = "setConsistencyGroupLinkPolicyParams", propOrder = {
    "firstCopy",
    "policy",
    "secondCopy"
})
public class SetConsistencyGroupLinkPolicyParams {

    protected GlobalCopyUID firstCopy;
    protected ConsistencyGroupLinkPolicy policy;
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
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupLinkPolicy }
     *     
     */
    public ConsistencyGroupLinkPolicy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupLinkPolicy }
     *     
     */
    public void setPolicy(ConsistencyGroupLinkPolicy value) {
        this.policy = value;
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
