
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consistencyGroupLinkState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consistencyGroupLinkState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupLinkUID" type="{}consistencyGroupLinkUID" minOccurs="0"/>
 *         &lt;element name="inSyncMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{}pipeState" minOccurs="0"/>
 *         &lt;element name="stateUnknown" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="transferErrorReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consistencyGroupLinkState", propOrder = {
    "groupLinkUID",
    "inSyncMode",
    "pipeState",
    "stateUnknown",
    "transferErrorReason"
})
public class ConsistencyGroupLinkState {

    protected ConsistencyGroupLinkUID groupLinkUID;
    protected boolean inSyncMode;
    protected PipeState pipeState;
    protected boolean stateUnknown;
    protected String transferErrorReason;

    /**
     * Gets the value of the groupLinkUID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsistencyGroupLinkUID }
     *     
     */
    public ConsistencyGroupLinkUID getGroupLinkUID() {
        return groupLinkUID;
    }

    /**
     * Sets the value of the groupLinkUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsistencyGroupLinkUID }
     *     
     */
    public void setGroupLinkUID(ConsistencyGroupLinkUID value) {
        this.groupLinkUID = value;
    }

    /**
     * Gets the value of the inSyncMode property.
     * 
     */
    public boolean isInSyncMode() {
        return inSyncMode;
    }

    /**
     * Sets the value of the inSyncMode property.
     * 
     */
    public void setInSyncMode(boolean value) {
        this.inSyncMode = value;
    }

    /**
     * Gets the value of the pipeState property.
     * 
     * @return
     *     possible object is
     *     {@link PipeState }
     *     
     */
    public PipeState getPipeState() {
        return pipeState;
    }

    /**
     * Sets the value of the pipeState property.
     * 
     * @param value
     *     allowed object is
     *     {@link PipeState }
     *     
     */
    public void setPipeState(PipeState value) {
        this.pipeState = value;
    }

    /**
     * Gets the value of the stateUnknown property.
     * 
     */
    public boolean isStateUnknown() {
        return stateUnknown;
    }

    /**
     * Sets the value of the stateUnknown property.
     * 
     */
    public void setStateUnknown(boolean value) {
        this.stateUnknown = value;
    }

    /**
     * Gets the value of the transferErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferErrorReason() {
        return transferErrorReason;
    }

    /**
     * Sets the value of the transferErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferErrorReason(String value) {
        this.transferErrorReason = value;
    }

}
