
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemVersionState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemVersionState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clustersVersionState" type="{}clusterVersionState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supportedFeatures" type="{}features" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemVersionState", propOrder = {
    "clustersVersionState",
    "supportedFeatures"
})
public class SystemVersionState {

    @XmlElement(nillable = true)
    protected List<ClusterVersionState> clustersVersionState;
    protected Features supportedFeatures;

    /**
     * Gets the value of the clustersVersionState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clustersVersionState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClustersVersionState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterVersionState }
     * 
     * 
     */
    public List<ClusterVersionState> getClustersVersionState() {
        if (clustersVersionState == null) {
            clustersVersionState = new ArrayList<ClusterVersionState>();
        }
        return this.clustersVersionState;
    }

    /**
     * Gets the value of the supportedFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link Features }
     *     
     */
    public Features getSupportedFeatures() {
        return supportedFeatures;
    }

    /**
     * Sets the value of the supportedFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Features }
     *     
     */
    public void setSupportedFeatures(Features value) {
        this.supportedFeatures = value;
    }

}
