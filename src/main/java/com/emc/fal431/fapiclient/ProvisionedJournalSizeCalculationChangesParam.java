
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for provisionedJournalSizeCalculationChangesParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provisionedJournalSizeCalculationChangesParam">
 *   &lt;complexContent>
 *     &lt;extension base="{}provisionedJournalChangesParam">
 *       &lt;sequence>
 *         &lt;element name="incomingDataRatePerSecond" type="{}quantity" minOccurs="0"/>
 *         &lt;element name="requiredProtectionWindow" type="{}quantity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provisionedJournalSizeCalculationChangesParam", propOrder = {
    "incomingDataRatePerSecond",
    "requiredProtectionWindow"
})
public class ProvisionedJournalSizeCalculationChangesParam
    extends ProvisionedJournalChangesParam
{

    protected Quantity incomingDataRatePerSecond;
    protected Quantity requiredProtectionWindow;

    /**
     * Gets the value of the incomingDataRatePerSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getIncomingDataRatePerSecond() {
        return incomingDataRatePerSecond;
    }

    /**
     * Sets the value of the incomingDataRatePerSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setIncomingDataRatePerSecond(Quantity value) {
        this.incomingDataRatePerSecond = value;
    }

    /**
     * Gets the value of the requiredProtectionWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getRequiredProtectionWindow() {
        return requiredProtectionWindow;
    }

    /**
     * Sets the value of the requiredProtectionWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setRequiredProtectionWindow(Quantity value) {
        this.requiredProtectionWindow = value;
    }

}
