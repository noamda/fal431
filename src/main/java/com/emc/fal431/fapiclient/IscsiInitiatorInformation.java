
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iscsiInitiatorInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iscsiInitiatorInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{}initiatorInformation">
 *       &lt;sequence>
 *         &lt;element name="iqn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iscsiInitiatorInformation", propOrder = {
    "iqn"
})
public class IscsiInitiatorInformation
    extends InitiatorInformation
{

    protected String iqn;

    /**
     * Gets the value of the iqn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIqn() {
        return iqn;
    }

    /**
     * Sets the value of the iqn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIqn(String value) {
        this.iqn = value;
    }

}
