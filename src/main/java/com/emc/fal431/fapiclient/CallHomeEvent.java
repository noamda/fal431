
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callHomeEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callHomeEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disabledUntil" type="{}recoverPointTimeStamp" minOccurs="0"/>
 *         &lt;element name="id" type="{}callHomeEventUID" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="script" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemDefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callHomeEvent", propOrder = {
    "description",
    "disabledUntil",
    "id",
    "name",
    "script",
    "systemDefined"
})
public class CallHomeEvent {

    protected String description;
    protected RecoverPointTimeStamp disabledUntil;
    protected CallHomeEventUID id;
    protected String name;
    protected String script;
    protected boolean systemDefined;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the disabledUntil property.
     * 
     * @return
     *     possible object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public RecoverPointTimeStamp getDisabledUntil() {
        return disabledUntil;
    }

    /**
     * Sets the value of the disabledUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoverPointTimeStamp }
     *     
     */
    public void setDisabledUntil(RecoverPointTimeStamp value) {
        this.disabledUntil = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link CallHomeEventUID }
     *     
     */
    public CallHomeEventUID getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallHomeEventUID }
     *     
     */
    public void setId(CallHomeEventUID value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScript(String value) {
        this.script = value;
    }

    /**
     * Gets the value of the systemDefined property.
     * 
     */
    public boolean isSystemDefined() {
        return systemDefined;
    }

    /**
     * Sets the value of the systemDefined property.
     * 
     */
    public void setSystemDefined(boolean value) {
        this.systemDefined = value;
    }

}
