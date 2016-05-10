
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ldapAdvancedSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ldapAdvancedSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchTimeLimitInSeconds" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ldapAdvancedSettings", propOrder = {
    "searchTimeLimitInSeconds"
})
public class LdapAdvancedSettings {

    protected long searchTimeLimitInSeconds;

    /**
     * Gets the value of the searchTimeLimitInSeconds property.
     * 
     */
    public long getSearchTimeLimitInSeconds() {
        return searchTimeLimitInSeconds;
    }

    /**
     * Sets the value of the searchTimeLimitInSeconds property.
     * 
     */
    public void setSearchTimeLimitInSeconds(long value) {
        this.searchTimeLimitInSeconds = value;
    }

}
