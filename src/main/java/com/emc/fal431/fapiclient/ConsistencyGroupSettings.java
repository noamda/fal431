
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activeLinksSettings" type="{}consistencyGroupLinkSettings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="groupCopiesSettings" type="{}consistencyGroupCopySettings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupUID" type="{}consistencyGroupUID" minOccurs="0"/>
 *         &lt;element name="latestSourceCopyUID" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passiveLinksSettings" type="{}consistencyGroupLinkSettings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="policy" type="{}consistencyGroupPolicy" minOccurs="0"/>
 *         &lt;element name="productionCopyUID" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *         &lt;element name="replicationSetsSettings" type="{}replicationSetSettings" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupSettings", propOrder = {
    "activeLinksSettings",
    "enabled",
    "groupCopiesSettings",
    "groupUID",
    "latestSourceCopyUID",
    "name",
    "passiveLinksSettings",
    "policy",
    "productionCopyUID",
    "replicationSetsSettings"
})
public class ConsistencyGroupSettings {

    @XmlElement(nillable = true)
    protected List<ConsistencyGroupLinkSettings> activeLinksSettings;
    protected boolean enabled;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopySettings> groupCopiesSettings;
    protected ConsistencyGroupUID groupUID;
    protected ConsistencyGroupCopyUID latestSourceCopyUID;
    protected String name;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupLinkSettings> passiveLinksSettings;
    protected ConsistencyGroupPolicy policy;
    protected ConsistencyGroupCopyUID productionCopyUID;
    @XmlElement(nillable = true)
    protected List<ReplicationSetSettings> replicationSetsSettings;

    /**
     * Gets the value of the activeLinksSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeLinksSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveLinksSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupLinkSettings }
     * 
     * 
     */
    public List<ConsistencyGroupLinkSettings> getActiveLinksSettings() {
        if (activeLinksSettings == null) {
            activeLinksSettings = new ArrayList<ConsistencyGroupLinkSettings>();
        }
        return this.activeLinksSettings;
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
     * Gets the value of the groupCopiesSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupCopiesSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupCopiesSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupCopySettings }
     * 
     * 
     */
    public List<ConsistencyGroupCopySettings> getGroupCopiesSettings() {
        if (groupCopiesSettings == null) {
            groupCopiesSettings = new ArrayList<ConsistencyGroupCopySettings>();
        }
        return this.groupCopiesSettings;
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
     * Gets the value of the latestSourceCopyUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public ConsistencyGroupCopyUID getLatestSourceCopyUID() {
        return latestSourceCopyUID;
    }

    /**
     * Sets the value of the latestSourceCopyUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public void setLatestSourceCopyUID(ConsistencyGroupCopyUID value) {
        this.latestSourceCopyUID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the passiveLinksSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passiveLinksSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassiveLinksSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupLinkSettings }
     * 
     * 
     */
    public List<ConsistencyGroupLinkSettings> getPassiveLinksSettings() {
        if (passiveLinksSettings == null) {
            passiveLinksSettings = new ArrayList<ConsistencyGroupLinkSettings>();
        }
        return this.passiveLinksSettings;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupPolicy }
     *     
     */
    public ConsistencyGroupPolicy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupPolicy }
     *     
     */
    public void setPolicy(ConsistencyGroupPolicy value) {
        this.policy = value;
    }

    /**
     * Gets the value of the productionCopyUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public ConsistencyGroupCopyUID getProductionCopyUID() {
        return productionCopyUID;
    }

    /**
     * Sets the value of the productionCopyUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public void setProductionCopyUID(ConsistencyGroupCopyUID value) {
        this.productionCopyUID = value;
    }

    /**
     * Gets the value of the replicationSetsSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replicationSetsSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplicationSetsSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplicationSetSettings }
     * 
     * 
     */
    public List<ReplicationSetSettings> getReplicationSetsSettings() {
        if (replicationSetsSettings == null) {
            replicationSetsSettings = new ArrayList<ReplicationSetSettings>();
        }
        return this.replicationSetsSettings;
    }

}
