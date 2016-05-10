
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupCopySettingsParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupCopySettingsParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="copyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="copyPolicy" type="{}consistencyGroupCopyPolicy" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="groupCopy" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *         &lt;element name="groupLinksSettings" type="{}consistencyGroupLinkSettings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productionCopy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="transferEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupCopySettingsParam", propOrder = {
    "copyName",
    "copyPolicy",
    "enabled",
    "groupCopy",
    "groupLinksSettings",
    "productionCopy",
    "transferEnabled"
})
public class ConsistencyGroupCopySettingsParam {

    protected String copyName;
    protected ConsistencyGroupCopyPolicy copyPolicy;
    protected boolean enabled;
    protected ConsistencyGroupCopyUID groupCopy;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupLinkSettings> groupLinksSettings;
    protected boolean productionCopy;
    protected boolean transferEnabled;

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
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the groupCopy property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public ConsistencyGroupCopyUID getGroupCopy() {
        return groupCopy;
    }

    /**
     * Sets the value of the groupCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }

    /**
     * Gets the value of the groupLinksSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupLinksSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupLinksSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupLinkSettings }
     * 
     * 
     */
    public List<ConsistencyGroupLinkSettings> getGroupLinksSettings() {
        if (groupLinksSettings == null) {
            groupLinksSettings = new ArrayList<ConsistencyGroupLinkSettings>();
        }
        return this.groupLinksSettings;
    }

    /**
     * Gets the value of the productionCopy property.
     * 
     */
    public boolean isProductionCopy() {
        return productionCopy;
    }

    /**
     * Sets the value of the productionCopy property.
     * 
     */
    public void setProductionCopy(boolean value) {
        this.productionCopy = value;
    }

    /**
     * Gets the value of the transferEnabled property.
     * 
     */
    public boolean isTransferEnabled() {
        return transferEnabled;
    }

    /**
     * Sets the value of the transferEnabled property.
     * 
     */
    public void setTransferEnabled(boolean value) {
        this.transferEnabled = value;
    }

}
