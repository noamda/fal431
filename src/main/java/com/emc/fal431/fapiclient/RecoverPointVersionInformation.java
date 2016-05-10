
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recoverPointVersionInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recoverPointVersionInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buildDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotFix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="major" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="patch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="servicePack" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recoverPointVersionInformation", propOrder = {
    "buildDescription",
    "hotFix",
    "major",
    "minor",
    "patch",
    "servicePack"
})
public class RecoverPointVersionInformation {

    protected String buildDescription;
    protected String hotFix;
    protected int major;
    protected int minor;
    protected Integer patch;
    protected Integer servicePack;

    /**
     * Gets the value of the buildDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildDescription() {
        return buildDescription;
    }

    /**
     * Sets the value of the buildDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildDescription(String value) {
        this.buildDescription = value;
    }

    /**
     * Gets the value of the hotFix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotFix() {
        return hotFix;
    }

    /**
     * Sets the value of the hotFix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotFix(String value) {
        this.hotFix = value;
    }

    /**
     * Gets the value of the major property.
     * 
     */
    public int getMajor() {
        return major;
    }

    /**
     * Sets the value of the major property.
     * 
     */
    public void setMajor(int value) {
        this.major = value;
    }

    /**
     * Gets the value of the minor property.
     * 
     */
    public int getMinor() {
        return minor;
    }

    /**
     * Sets the value of the minor property.
     * 
     */
    public void setMinor(int value) {
        this.minor = value;
    }

    /**
     * Gets the value of the patch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPatch() {
        return patch;
    }

    /**
     * Sets the value of the patch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPatch(Integer value) {
        this.patch = value;
    }

    /**
     * Gets the value of the servicePack property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServicePack() {
        return servicePack;
    }

    /**
     * Sets the value of the servicePack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServicePack(Integer value) {
        this.servicePack = value;
    }

}
