
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vCenterServersViewSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vCenterServersViewSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vcenterServersFiltersEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vCenterServersViewSettings", propOrder = {
    "vcenterServersFiltersEnabled"
})
public class VCenterServersViewSettings {

    protected boolean vcenterServersFiltersEnabled;

    /**
     * Gets the value of the vcenterServersFiltersEnabled property.
     * 
     */
    public boolean isVcenterServersFiltersEnabled() {
        return vcenterServersFiltersEnabled;
    }

    /**
     * Sets the value of the vcenterServersFiltersEnabled property.
     * 
     */
    public void setVcenterServersFiltersEnabled(boolean value) {
        this.vcenterServersFiltersEnabled = value;
    }

}
