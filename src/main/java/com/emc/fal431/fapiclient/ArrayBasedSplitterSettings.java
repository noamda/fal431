
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayBasedSplitterSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayBasedSplitterSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{}splitterSettings">
 *       &lt;sequence>
 *         &lt;element name="autoRegisterRPAsInitiators" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayBasedSplitterSettings", propOrder = {
    "autoRegisterRPAsInitiators"
})
@XmlSeeAlso({
    VplexArraySplitterSettings.class,
    SymmetrixSplitterSettings.class,
    NeoSplitterSettings.class,
    ClariionSplitterSettings.class
})
public abstract class ArrayBasedSplitterSettings
    extends SplitterSettings
{

    protected boolean autoRegisterRPAsInitiators;

    /**
     * Gets the value of the autoRegisterRPAsInitiators property.
     * 
     */
    public boolean isAutoRegisterRPAsInitiators() {
        return autoRegisterRPAsInitiators;
    }

    /**
     * Sets the value of the autoRegisterRPAsInitiators property.
     * 
     */
    public void setAutoRegisterRPAsInitiators(boolean value) {
        this.autoRegisterRPAsInitiators = value;
    }

}
