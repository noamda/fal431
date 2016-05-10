
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clusterSplittersState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clusterSplittersState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}clusterUID" minOccurs="0"/>
 *         &lt;element name="splittersState" type="{}splitterState" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clusterSplittersState", propOrder = {
    "clusterUID",
    "splittersState"
})
public class ClusterSplittersState {

    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<SplitterState> splittersState;

    /**
     * Gets the value of the clusterUID property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterUID }
     *     
     */
    public ClusterUID getClusterUID() {
        return clusterUID;
    }

    /**
     * Sets the value of the clusterUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterUID }
     *     
     */
    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }

    /**
     * Gets the value of the splittersState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splittersState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplittersState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitterState }
     * 
     * 
     */
    public List<SplitterState> getSplittersState() {
        if (splittersState == null) {
            splittersState = new ArrayList<SplitterState>();
        }
        return this.splittersState;
    }

}
