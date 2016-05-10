
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fullRecoverPointSettingsContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fullRecoverPointSettingsContext">
 *   &lt;complexContent>
 *     &lt;extension base="{}functionalAPIContext">
 *       &lt;sequence>
 *         &lt;element name="settingsConflictContext" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fullRecoverPointSettingsContext", propOrder = {
    "settingsConflictContext"
})
public class FullRecoverPointSettingsContext
    extends FunctionalAPIContext
{

    protected long settingsConflictContext;

    /**
     * Gets the value of the settingsConflictContext property.
     * 
     */
    public long getSettingsConflictContext() {
        return settingsConflictContext;
    }

    /**
     * Sets the value of the settingsConflictContext property.
     * 
     */
    public void setSettingsConflictContext(long value) {
        this.settingsConflictContext = value;
    }

}
