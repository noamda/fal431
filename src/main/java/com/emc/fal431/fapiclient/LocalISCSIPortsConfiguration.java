
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for localISCSIPortsConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="localISCSIPortsConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="portsInformation" type="{}localISCSIPortInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localISCSIPortsConfiguration", propOrder = {
    "portsInformation"
})
public class LocalISCSIPortsConfiguration {

    @XmlElement(nillable = true)
    protected List<LocalISCSIPortInformation> portsInformation;

    /**
     * Gets the value of the portsInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portsInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortsInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalISCSIPortInformation }
     * 
     * 
     */
    public List<LocalISCSIPortInformation> getPortsInformation() {
        if (portsInformation == null) {
            portsInformation = new ArrayList<LocalISCSIPortInformation>();
        }
        return this.portsInformation;
    }

}
