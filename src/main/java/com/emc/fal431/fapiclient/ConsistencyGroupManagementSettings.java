
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupManagementSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupManagementSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowTestingWhileClustersDisconnected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{}managementMode" minOccurs="0"/>
 *         &lt;element name="recoveryCopy" type="{}consistencyGroupCopyUID" minOccurs="0"/>
 *         &lt;element name="recoveryImage" type="{}snapshot" minOccurs="0"/>
 *         &lt;element name="recoveryImageExpiryDate" type="{}recoverPointTimeStamp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupManagementSettings", propOrder = {
    "allowTestingWhileClustersDisconnected",
    "managementMode",
    "recoveryCopy",
    "recoveryImage",
    "recoveryImageExpiryDate"
})
public class ConsistencyGroupManagementSettings {

    protected boolean allowTestingWhileClustersDisconnected;
    protected ManagementMode managementMode;
    protected ConsistencyGroupCopyUID recoveryCopy;
    protected Snapshot recoveryImage;
    protected RecoverPointTimeStamp recoveryImageExpiryDate;

    /**
     * Gets the value of the allowTestingWhileClustersDisconnected property.
     * 
     */
    public boolean isAllowTestingWhileClustersDisconnected() {
        return allowTestingWhileClustersDisconnected;
    }

    /**
     * Sets the value of the allowTestingWhileClustersDisconnected property.
     * 
     */
    public void setAllowTestingWhileClustersDisconnected(boolean value) {
        this.allowTestingWhileClustersDisconnected = value;
    }

    /**
     * Gets the value of the managementMode property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementMode }
     *     
     */
    public ManagementMode getManagementMode() {
        return managementMode;
    }

    /**
     * Sets the value of the managementMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementMode }
     *     
     */
    public void setManagementMode(ManagementMode value) {
        this.managementMode = value;
    }

    /**
     * Gets the value of the recoveryCopy property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public ConsistencyGroupCopyUID getRecoveryCopy() {
        return recoveryCopy;
    }

    /**
     * Sets the value of the recoveryCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupCopyUID }
     *     
     */
    public void setRecoveryCopy(ConsistencyGroupCopyUID value) {
        this.recoveryCopy = value;
    }

    /**
     * Gets the value of the recoveryImage property.
     * 
     * @return
     *     possible object is
     *     {@link Snapshot }
     *     
     */
    public Snapshot getRecoveryImage() {
        return recoveryImage;
    }

    /**
     * Sets the value of the recoveryImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Snapshot }
     *     
     */
    public void setRecoveryImage(Snapshot value) {
        this.recoveryImage = value;
    }

    /**
     * Gets the value of the recoveryImageExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public RecoverPointTimeStamp getRecoveryImageExpiryDate() {
        return recoveryImageExpiryDate;
    }

    /**
     * Sets the value of the recoveryImageExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public void setRecoveryImageExpiryDate(RecoverPointTimeStamp value) {
        this.recoveryImageExpiryDate = value;
    }

}
