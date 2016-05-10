
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for protectionWindowsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protectionWindowsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentProtectionWindow" type="{}protectionWindowInfo" minOccurs="0"/>
 *         &lt;element name="predictedProtectionWindow" type="{}protectionWindowInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protectionWindowsInfo", propOrder = {
    "currentProtectionWindow",
    "predictedProtectionWindow"
})
public class ProtectionWindowsInfo {

    protected ProtectionWindowInfo currentProtectionWindow;
    protected ProtectionWindowInfo predictedProtectionWindow;

    /**
     * Gets the value of the currentProtectionWindow property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionWindowInfo }
     *     
     */
    public ProtectionWindowInfo getCurrentProtectionWindow() {
        return currentProtectionWindow;
    }

    /**
     * Sets the value of the currentProtectionWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionWindowInfo }
     *     
     */
    public void setCurrentProtectionWindow(ProtectionWindowInfo value) {
        this.currentProtectionWindow = value;
    }

    /**
     * Gets the value of the predictedProtectionWindow property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionWindowInfo }
     *     
     */
    public ProtectionWindowInfo getPredictedProtectionWindow() {
        return predictedProtectionWindow;
    }

    /**
     * Sets the value of the predictedProtectionWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionWindowInfo }
     *     
     */
    public void setPredictedProtectionWindow(ProtectionWindowInfo value) {
        this.predictedProtectionWindow = value;
    }

}
