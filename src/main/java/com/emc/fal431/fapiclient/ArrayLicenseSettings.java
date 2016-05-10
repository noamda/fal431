
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayLicenseSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayLicenseSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{}licenseSettings">
 *       &lt;sequence>
 *         &lt;element name="arraySerial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}arrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayLicenseSettings", propOrder = {
    "arraySerial",
    "arrayType"
})
public class ArrayLicenseSettings
    extends LicenseSettings
{

    protected String arraySerial;
    protected ArrayType arrayType;

    /**
     * Gets the value of the arraySerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArraySerial() {
        return arraySerial;
    }

    /**
     * Sets the value of the arraySerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArraySerial(String value) {
        this.arraySerial = value;
    }

    /**
     * Gets the value of the arrayType property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayType }
     *     
     */
    public ArrayType getArrayType() {
        return arrayType;
    }

    /**
     * Sets the value of the arrayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayType }
     *     
     */
    public void setArrayType(ArrayType value) {
        this.arrayType = value;
    }

}
