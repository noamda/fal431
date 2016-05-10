
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rpaView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rpaView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupCopies" type="{}consistencyGroupCopyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="jvolGroupCopies" type="{}consistencyGroupCopyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="peerClusterList" type="{}clusterUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="peerRPAs" type="{}rpaUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}rpaUID" minOccurs="0"/>
 *         &lt;element name="splitters" type="{}splitterInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uvolGroupCopies" type="{}consistencyGroupCopyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="volumes" type="{}deviceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rpaView", propOrder = {
    "groupCopies",
    "jvolGroupCopies",
    "peerClusterList",
    "peerRPAs",
    "rpaUID",
    "splitters",
    "uvolGroupCopies",
    "volumes"
})
public class RpaView {

    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyInfo> groupCopies;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyInfo> jvolGroupCopies;
    @XmlElement(nillable = true)
    protected List<ClusterUID> peerClusterList;
    @XmlElement(nillable = true)
    protected List<RpaUID> peerRPAs;
    protected RpaUID rpaUID;
    @XmlElement(nillable = true)
    protected List<SplitterInfo> splitters;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyInfo> uvolGroupCopies;
    @XmlElement(nillable = true)
    protected List<DeviceInfo> volumes;

    /**
     * Gets the value of the groupCopies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupCopies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupCopies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupCopyInfo }
     * 
     * 
     */
    public List<ConsistencyGroupCopyInfo> getGroupCopies() {
        if (groupCopies == null) {
            groupCopies = new ArrayList<ConsistencyGroupCopyInfo>();
        }
        return this.groupCopies;
    }

    /**
     * Gets the value of the jvolGroupCopies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jvolGroupCopies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJvolGroupCopies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupCopyInfo }
     * 
     * 
     */
    public List<ConsistencyGroupCopyInfo> getJvolGroupCopies() {
        if (jvolGroupCopies == null) {
            jvolGroupCopies = new ArrayList<ConsistencyGroupCopyInfo>();
        }
        return this.jvolGroupCopies;
    }

    /**
     * Gets the value of the peerClusterList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the peerClusterList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeerClusterList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterUID }
     * 
     * 
     */
    public List<ClusterUID> getPeerClusterList() {
        if (peerClusterList == null) {
            peerClusterList = new ArrayList<ClusterUID>();
        }
        return this.peerClusterList;
    }

    /**
     * Gets the value of the peerRPAs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the peerRPAs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeerRPAs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RpaUID }
     * 
     * 
     */
    public List<RpaUID> getPeerRPAs() {
        if (peerRPAs == null) {
            peerRPAs = new ArrayList<RpaUID>();
        }
        return this.peerRPAs;
    }

    /**
     * Gets the value of the rpaUID property.
     * 
     * @return
     *     possible object is
     *     {@link RpaUID }
     *     
     */
    public RpaUID getRpaUID() {
        return rpaUID;
    }

    /**
     * Sets the value of the rpaUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpaUID }
     *     
     */
    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }

    /**
     * Gets the value of the splitters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitterInfo }
     * 
     * 
     */
    public List<SplitterInfo> getSplitters() {
        if (splitters == null) {
            splitters = new ArrayList<SplitterInfo>();
        }
        return this.splitters;
    }

    /**
     * Gets the value of the uvolGroupCopies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uvolGroupCopies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUvolGroupCopies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupCopyInfo }
     * 
     * 
     */
    public List<ConsistencyGroupCopyInfo> getUvolGroupCopies() {
        if (uvolGroupCopies == null) {
            uvolGroupCopies = new ArrayList<ConsistencyGroupCopyInfo>();
        }
        return this.uvolGroupCopies;
    }

    /**
     * Gets the value of the volumes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volumes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVolumes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceInfo }
     * 
     * 
     */
    public List<DeviceInfo> getVolumes() {
        if (volumes == null) {
            volumes = new ArrayList<DeviceInfo>();
        }
        return this.volumes;
    }

}
