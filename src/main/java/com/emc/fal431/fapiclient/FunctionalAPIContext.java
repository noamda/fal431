
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for functionalAPIContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="functionalAPIContext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="globalContext" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "functionalAPIContext", propOrder = {
    "globalContext"
})
@XmlSeeAlso({
    VCenterServerViewContext.class,
    FullRecoverPointSettingsContext.class,
    ClusterSANVolumesContext.class,
    FullRecoverPointStateContext.class,
    ClariionVolumesContext.class,
    SystemStatusContext.class,
    FullRecoverPointContext.class
})
public abstract class FunctionalAPIContext {

    protected long globalContext;

    /**
     * Gets the value of the globalContext property.
     * 
     */
    public long getGlobalContext() {
        return globalContext;
    }

    /**
     * Sets the value of the globalContext property.
     * 
     */
    public void setGlobalContext(long value) {
        this.globalContext = value;
    }

}
