
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemMiscellaneousSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemMiscellaneousSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rpasMultipathMonitoring" type="{}clusterRPAMultipathMonitoring" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="securityLevel" type="{}systemSecurityLevel" minOccurs="0"/>
 *         &lt;element name="useAutomaticSplitterInfoCollection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemMiscellaneousSettings", propOrder = {
    "rpasMultipathMonitoring",
    "securityLevel",
    "useAutomaticSplitterInfoCollection"
})
public class SystemMiscellaneousSettings {

    @XmlElement(nillable = true)
    protected List<ClusterRPAMultipathMonitoring> rpasMultipathMonitoring;
    protected SystemSecurityLevel securityLevel;
    protected boolean useAutomaticSplitterInfoCollection;

    /**
     * Gets the value of the rpasMultipathMonitoring property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rpasMultipathMonitoring property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpasMultipathMonitoring().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterRPAMultipathMonitoring }
     * 
     * 
     */
    public List<ClusterRPAMultipathMonitoring> getRpasMultipathMonitoring() {
        if (rpasMultipathMonitoring == null) {
            rpasMultipathMonitoring = new ArrayList<ClusterRPAMultipathMonitoring>();
        }
        return this.rpasMultipathMonitoring;
    }

    /**
     * Gets the value of the securityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SystemSecurityLevel }
     *     
     */
    public SystemSecurityLevel getSecurityLevel() {
        return securityLevel;
    }

    /**
     * Sets the value of the securityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemSecurityLevel }
     *     
     */
    public void setSecurityLevel(SystemSecurityLevel value) {
        this.securityLevel = value;
    }

    /**
     * Gets the value of the useAutomaticSplitterInfoCollection property.
     * 
     */
    public boolean isUseAutomaticSplitterInfoCollection() {
        return useAutomaticSplitterInfoCollection;
    }

    /**
     * Sets the value of the useAutomaticSplitterInfoCollection property.
     * 
     */
    public void setUseAutomaticSplitterInfoCollection(boolean value) {
        this.useAutomaticSplitterInfoCollection = value;
    }

}
