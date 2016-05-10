
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recoverPointVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recoverPointVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionInformation" type="{}recoverPointVersionInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recoverPointVersion", propOrder = {
    "version",
    "versionInformation"
})
public class RecoverPointVersion {

    protected String version;
    protected RecoverPointVersionInformation versionInformation;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the versionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointVersionInformation }
     *     
     */
    public RecoverPointVersionInformation getVersionInformation() {
        return versionInformation;
    }

    /**
     * Sets the value of the versionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointVersionInformation }
     *     
     */
    public void setVersionInformation(RecoverPointVersionInformation value) {
        this.versionInformation = value;
    }

}
