
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vCenterServerView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vCenterServerView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectionStatus" type="{}vCenterServerConnectionStatus" minOccurs="0"/>
 *         &lt;element name="esxsView" type="{}esxView" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vcServerUID" type="{}vCenterServerUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vCenterServerView", propOrder = {
    "connectionStatus",
    "esxsView",
    "vcServerUID"
})
public class VCenterServerView {

    protected VCenterServerConnectionStatus connectionStatus;
    @XmlElement(nillable = true)
    protected List<EsxView> esxsView;
    protected VCenterServerUID vcServerUID;

    /**
     * Gets the value of the connectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VCenterServerConnectionStatus }
     *     
     */
    public VCenterServerConnectionStatus getConnectionStatus() {
        return connectionStatus;
    }

    /**
     * Sets the value of the connectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VCenterServerConnectionStatus }
     *     
     */
    public void setConnectionStatus(VCenterServerConnectionStatus value) {
        this.connectionStatus = value;
    }

    /**
     * Gets the value of the esxsView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the esxsView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEsxsView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EsxView }
     * 
     * 
     */
    public List<EsxView> getEsxsView() {
        if (esxsView == null) {
            esxsView = new ArrayList<EsxView>();
        }
        return this.esxsView;
    }

    /**
     * Gets the value of the vcServerUID property.
     * 
     * @return
     *     possible object is
     *     {@link VCenterServerUID }
     *     
     */
    public VCenterServerUID getVcServerUID() {
        return vcServerUID;
    }

    /**
     * Sets the value of the vcServerUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link VCenterServerUID }
     *     
     */
    public void setVcServerUID(VCenterServerUID value) {
        this.vcServerUID = value;
    }

}
