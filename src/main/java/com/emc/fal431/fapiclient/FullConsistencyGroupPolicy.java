
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fullConsistencyGroupPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fullConsistencyGroupPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="copiesPolicies" type="{}fullConsistencyGroupCopyPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupPolicy" type="{}consistencyGroupPolicy" minOccurs="0"/>
 *         &lt;element name="groupUID" type="{}consistencyGroupUID" minOccurs="0"/>
 *         &lt;element name="linksPolicies" type="{}fullConsistencyGroupLinkPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productionCopy" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fullConsistencyGroupPolicy", propOrder = {
    "copiesPolicies",
    "groupName",
    "groupPolicy",
    "groupUID",
    "linksPolicies",
    "productionCopy"
})
public class FullConsistencyGroupPolicy {

    @XmlElement(nillable = true)
    protected List<FullConsistencyGroupCopyPolicy> copiesPolicies;
    protected String groupName;
    protected ConsistencyGroupPolicy groupPolicy;
    protected ConsistencyGroupUID groupUID;
    @XmlElement(nillable = true)
    protected List<FullConsistencyGroupLinkPolicy> linksPolicies;
    protected ConsistencyGroupCopyUID productionCopy;

    /**
     * Gets the value of the copiesPolicies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copiesPolicies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopiesPolicies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullConsistencyGroupCopyPolicy }
     * 
     * 
     */
    public List<FullConsistencyGroupCopyPolicy> getCopiesPolicies() {
        if (copiesPolicies == null) {
            copiesPolicies = new ArrayList<FullConsistencyGroupCopyPolicy>();
        }
        return this.copiesPolicies;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the groupPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupPolicy }
     *     
     */
    public ConsistencyGroupPolicy getGroupPolicy() {
        return groupPolicy;
    }

    /**
     * Sets the value of the groupPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupPolicy }
     *     
     */
    public void setGroupPolicy(ConsistencyGroupPolicy value) {
        this.groupPolicy = value;
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
     * Gets the value of the linksPolicies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linksPolicies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinksPolicies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullConsistencyGroupLinkPolicy }
     * 
     * 
     */
    public List<FullConsistencyGroupLinkPolicy> getLinksPolicies() {
        if (linksPolicies == null) {
            linksPolicies = new ArrayList<FullConsistencyGroupLinkPolicy>();
        }
        return this.linksPolicies;
    }

    /**
     * Gets the value of the productionCopy property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public ConsistencyGroupCopyUID getProductionCopy() {
        return productionCopy;
    }

    /**
     * Sets the value of the productionCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public void setProductionCopy(ConsistencyGroupCopyUID value) {
        this.productionCopy = value;
    }

}
