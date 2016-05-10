
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fullRecoverPointSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fullRecoverPointSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}accountSettings" minOccurs="0"/>
 *         &lt;element name="globalPolicy" type="{}systemGlobalPolicy" minOccurs="0"/>
 *         &lt;element name="groupsSetsSettings" type="{}consistencyGroupSetSettings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupsSettings" type="{}consistencyGroupSettings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}managementSettings" minOccurs="0"/>
 *         &lt;element name="settingsConflict" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="splittersSettings" type="{}clusterSplittersSettings" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}systemSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fullRecoverPointSettings", propOrder = {
    "accountSettings",
    "globalPolicy",
    "groupsSetsSettings",
    "groupsSettings",
    "managementSettings",
    "settingsConflict",
    "splittersSettings",
    "systemSettings"
})
public class FullRecoverPointSettings {

    protected AccountSettings accountSettings;
    protected SystemGlobalPolicy globalPolicy;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupSetSettings> groupsSetsSettings;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupSettings> groupsSettings;
    protected ManagementSettings managementSettings;
    protected boolean settingsConflict;
    @XmlElement(nillable = true)
    protected List<ClusterSplittersSettings> splittersSettings;
    protected SystemSettings systemSettings;

    /**
     * Gets the value of the accountSettings property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSettings }
     *     
     */
    public AccountSettings getAccountSettings() {
        return accountSettings;
    }

    /**
     * Sets the value of the accountSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSettings }
     *     
     */
    public void setAccountSettings(AccountSettings value) {
        this.accountSettings = value;
    }

    /**
     * Gets the value of the globalPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link SystemGlobalPolicy }
     *     
     */
    public SystemGlobalPolicy getGlobalPolicy() {
        return globalPolicy;
    }

    /**
     * Sets the value of the globalPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemGlobalPolicy }
     *     
     */
    public void setGlobalPolicy(SystemGlobalPolicy value) {
        this.globalPolicy = value;
    }

    /**
     * Gets the value of the groupsSetsSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupsSetsSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupsSetsSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupSetSettings }
     * 
     * 
     */
    public List<ConsistencyGroupSetSettings> getGroupsSetsSettings() {
        if (groupsSetsSettings == null) {
            groupsSetsSettings = new ArrayList<ConsistencyGroupSetSettings>();
        }
        return this.groupsSetsSettings;
    }

    /**
     * Gets the value of the groupsSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupsSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupsSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupSettings }
     * 
     * 
     */
    public List<ConsistencyGroupSettings> getGroupsSettings() {
        if (groupsSettings == null) {
            groupsSettings = new ArrayList<ConsistencyGroupSettings>();
        }
        return this.groupsSettings;
    }

    /**
     * Gets the value of the managementSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementSettings }
     *     
     */
    public ManagementSettings getManagementSettings() {
        return managementSettings;
    }

    /**
     * Sets the value of the managementSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementSettings }
     *     
     */
    public void setManagementSettings(ManagementSettings value) {
        this.managementSettings = value;
    }

    /**
     * Gets the value of the settingsConflict property.
     * 
     */
    public boolean isSettingsConflict() {
        return settingsConflict;
    }

    /**
     * Sets the value of the settingsConflict property.
     * 
     */
    public void setSettingsConflict(boolean value) {
        this.settingsConflict = value;
    }

    /**
     * Gets the value of the splittersSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splittersSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplittersSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterSplittersSettings }
     * 
     * 
     */
    public List<ClusterSplittersSettings> getSplittersSettings() {
        if (splittersSettings == null) {
            splittersSettings = new ArrayList<ClusterSplittersSettings>();
        }
        return this.splittersSettings;
    }

    /**
     * Gets the value of the systemSettings property.
     * 
     * @return
     *     possible object is
     *     {@link SystemSettings }
     *     
     */
    public SystemSettings getSystemSettings() {
        return systemSettings;
    }

    /**
     * Sets the value of the systemSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemSettings }
     *     
     */
    public void setSystemSettings(SystemSettings value) {
        this.systemSettings = value;
    }

}
