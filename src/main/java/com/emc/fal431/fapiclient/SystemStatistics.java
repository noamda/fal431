
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clusterStatistics" type="{}clusterStatistics" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="consistencyGroupStatistics" type="{}consistencyGroupStatistics" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rpaStatistics" type="{}rpaStatistics" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemStatistics", propOrder = {
    "clusterStatistics",
    "consistencyGroupStatistics",
    "rpaStatistics"
})
public class SystemStatistics {

    @XmlElement(nillable = true)
    protected List<ClusterStatistics> clusterStatistics;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupStatistics> consistencyGroupStatistics;
    @XmlElement(nillable = true)
    protected List<RpaStatistics> rpaStatistics;

    /**
     * Gets the value of the clusterStatistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clusterStatistics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClusterStatistics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterStatistics }
     * 
     * 
     */
    public List<ClusterStatistics> getClusterStatistics() {
        if (clusterStatistics == null) {
            clusterStatistics = new ArrayList<ClusterStatistics>();
        }
        return this.clusterStatistics;
    }

    /**
     * Gets the value of the consistencyGroupStatistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consistencyGroupStatistics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsistencyGroupStatistics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupStatistics }
     * 
     * 
     */
    public List<ConsistencyGroupStatistics> getConsistencyGroupStatistics() {
        if (consistencyGroupStatistics == null) {
            consistencyGroupStatistics = new ArrayList<ConsistencyGroupStatistics>();
        }
        return this.consistencyGroupStatistics;
    }

    /**
     * Gets the value of the rpaStatistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rpaStatistics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpaStatistics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RpaStatistics }
     * 
     * 
     */
    public List<RpaStatistics> getRpaStatistics() {
        if (rpaStatistics == null) {
            rpaStatistics = new ArrayList<RpaStatistics>();
        }
        return this.rpaStatistics;
    }

}
