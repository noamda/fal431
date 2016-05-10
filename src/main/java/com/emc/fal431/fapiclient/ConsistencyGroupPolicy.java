
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canTransferOnNonPreferredRPA" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="distributedGroup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hostsDelayExpiryTimeoutInSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="managementSettings" type="{}consistencyGroupManagementSettings" minOccurs="0"/>
 *         &lt;element name="primaryRPANumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{}priority" minOccurs="0"/>
 *         &lt;element name="readOnlyInReplicaVolumes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="reservationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="secondaryRPAsNumbers" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupPolicy", propOrder = {
    "canTransferOnNonPreferredRPA",
    "distributedGroup",
    "hostsDelayExpiryTimeoutInSeconds",
    "managementSettings",
    "primaryRPANumber",
    "priority",
    "readOnlyInReplicaVolumes",
    "reservationSupported",
    "secondaryRPAsNumbers"
})
public class ConsistencyGroupPolicy {

    protected boolean canTransferOnNonPreferredRPA;
    protected boolean distributedGroup;
    protected Integer hostsDelayExpiryTimeoutInSeconds;
    protected ConsistencyGroupManagementSettings managementSettings;
    protected int primaryRPANumber;
    protected Priority priority;
    protected boolean readOnlyInReplicaVolumes;
    protected boolean reservationSupported;
    @XmlElement(nillable = true)
    protected List<Integer> secondaryRPAsNumbers;

    /**
     * Gets the value of the canTransferOnNonPreferredRPA property.
     * 
     */
    public boolean isCanTransferOnNonPreferredRPA() {
        return canTransferOnNonPreferredRPA;
    }

    /**
     * Sets the value of the canTransferOnNonPreferredRPA property.
     * 
     */
    public void setCanTransferOnNonPreferredRPA(boolean value) {
        this.canTransferOnNonPreferredRPA = value;
    }

    /**
     * Gets the value of the distributedGroup property.
     * 
     */
    public boolean isDistributedGroup() {
        return distributedGroup;
    }

    /**
     * Sets the value of the distributedGroup property.
     * 
     */
    public void setDistributedGroup(boolean value) {
        this.distributedGroup = value;
    }

    /**
     * Gets the value of the hostsDelayExpiryTimeoutInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHostsDelayExpiryTimeoutInSeconds() {
        return hostsDelayExpiryTimeoutInSeconds;
    }

    /**
     * Sets the value of the hostsDelayExpiryTimeoutInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHostsDelayExpiryTimeoutInSeconds(Integer value) {
        this.hostsDelayExpiryTimeoutInSeconds = value;
    }

    /**
     * Gets the value of the managementSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupManagementSettings }
     *     
     */
    public ConsistencyGroupManagementSettings getManagementSettings() {
        return managementSettings;
    }

    /**
     * Sets the value of the managementSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupManagementSettings }
     *     
     */
    public void setManagementSettings(ConsistencyGroupManagementSettings value) {
        this.managementSettings = value;
    }

    /**
     * Gets the value of the primaryRPANumber property.
     * 
     */
    public int getPrimaryRPANumber() {
        return primaryRPANumber;
    }

    /**
     * Sets the value of the primaryRPANumber property.
     * 
     */
    public void setPrimaryRPANumber(int value) {
        this.primaryRPANumber = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setPriority(Priority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the readOnlyInReplicaVolumes property.
     * 
     */
    public boolean isReadOnlyInReplicaVolumes() {
        return readOnlyInReplicaVolumes;
    }

    /**
     * Sets the value of the readOnlyInReplicaVolumes property.
     * 
     */
    public void setReadOnlyInReplicaVolumes(boolean value) {
        this.readOnlyInReplicaVolumes = value;
    }

    /**
     * Gets the value of the reservationSupported property.
     * 
     */
    public boolean isReservationSupported() {
        return reservationSupported;
    }

    /**
     * Sets the value of the reservationSupported property.
     * 
     */
    public void setReservationSupported(boolean value) {
        this.reservationSupported = value;
    }

    /**
     * Gets the value of the secondaryRPAsNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryRPAsNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryRPAsNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSecondaryRPAsNumbers() {
        if (secondaryRPAsNumbers == null) {
            secondaryRPAsNumbers = new ArrayList<Integer>();
        }
        return this.secondaryRPAsNumbers;
    }

}
