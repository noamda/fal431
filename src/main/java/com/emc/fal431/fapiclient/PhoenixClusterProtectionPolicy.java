
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phoenixClusterProtectionPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phoenixClusterProtectionPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domino" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="regulate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phoenixClusterProtectionPolicy", propOrder = {
    "domino",
    "regulate"
})
public class PhoenixClusterProtectionPolicy {

    protected boolean domino;
    protected boolean regulate;

    /**
     * Gets the value of the domino property.
     * 
     */
    public boolean isDomino() {
        return domino;
    }

    /**
     * Sets the value of the domino property.
     * 
     */
    public void setDomino(boolean value) {
        this.domino = value;
    }

    /**
     * Gets the value of the regulate property.
     * 
     */
    public boolean isRegulate() {
        return regulate;
    }

    /**
     * Sets the value of the regulate property.
     * 
     */
    public void setRegulate(boolean value) {
        this.regulate = value;
    }

}
