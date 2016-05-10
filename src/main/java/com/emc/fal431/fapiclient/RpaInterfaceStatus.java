
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rpaInterfaceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rpaInterfaceStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interfaceStatus" type="{}generalStatus" minOccurs="0"/>
 *         &lt;element ref="{}interfaceType" minOccurs="0"/>
 *         &lt;element name="otherRPAsIPV4ConnectivityStatus" type="{}rpaConnectivityStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherRPAsIPV6ConnectivityStatus" type="{}rpaConnectivityStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rpaInterfaceStatus", propOrder = {
    "interfaceStatus",
    "interfaceType",
    "otherRPAsIPV4ConnectivityStatus",
    "otherRPAsIPV6ConnectivityStatus"
})
public class RpaInterfaceStatus {

    protected GeneralStatus interfaceStatus;
    protected InterfaceType interfaceType;
    @XmlElement(nillable = true)
    protected List<RpaConnectivityStatus> otherRPAsIPV4ConnectivityStatus;
    @XmlElement(nillable = true)
    protected List<RpaConnectivityStatus> otherRPAsIPV6ConnectivityStatus;

    /**
     * Gets the value of the interfaceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralStatus }
     *     
     */
    public GeneralStatus getInterfaceStatus() {
        return interfaceStatus;
    }

    /**
     * Sets the value of the interfaceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralStatus }
     *     
     */
    public void setInterfaceStatus(GeneralStatus value) {
        this.interfaceStatus = value;
    }

    /**
     * Gets the value of the interfaceType property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceType }
     *     
     */
    public InterfaceType getInterfaceType() {
        return interfaceType;
    }

    /**
     * Sets the value of the interfaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceType }
     *     
     */
    public void setInterfaceType(InterfaceType value) {
        this.interfaceType = value;
    }

    /**
     * Gets the value of the otherRPAsIPV4ConnectivityStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherRPAsIPV4ConnectivityStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherRPAsIPV4ConnectivityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RpaConnectivityStatus }
     * 
     * 
     */
    public List<RpaConnectivityStatus> getOtherRPAsIPV4ConnectivityStatus() {
        if (otherRPAsIPV4ConnectivityStatus == null) {
            otherRPAsIPV4ConnectivityStatus = new ArrayList<RpaConnectivityStatus>();
        }
        return this.otherRPAsIPV4ConnectivityStatus;
    }

    /**
     * Gets the value of the otherRPAsIPV6ConnectivityStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherRPAsIPV6ConnectivityStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherRPAsIPV6ConnectivityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RpaConnectivityStatus }
     * 
     * 
     */
    public List<RpaConnectivityStatus> getOtherRPAsIPV6ConnectivityStatus() {
        if (otherRPAsIPV6ConnectivityStatus == null) {
            otherRPAsIPV6ConnectivityStatus = new ArrayList<RpaConnectivityStatus>();
        }
        return this.otherRPAsIPV6ConnectivityStatus;
    }

}
