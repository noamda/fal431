
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for problemDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="problemDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{}problemCategory" minOccurs="0"/>
 *         &lt;element name="cluster" type="{}clusterUID" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="problemID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="relevantCopies" type="{}consistencyGroupCopyUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relevantDevices" type="{}deviceUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relevantGlobalLinks" type="{}globalLinkUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relevantRPAs" type="{}rpaUID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relevantSplitter" type="{}splitterUID" minOccurs="0"/>
 *         &lt;element name="relevantSplitterVolumesInformation" type="{}splitterVolumeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="severity" type="{}problemSeverity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "problemDescription", propOrder = {
    "category",
    "cluster",
    "description",
    "problemID",
    "relevantCopies",
    "relevantDevices",
    "relevantGlobalLinks",
    "relevantRPAs",
    "relevantSplitter",
    "relevantSplitterVolumesInformation",
    "severity"
})
public class ProblemDescription {

    protected ProblemCategory category;
    protected ClusterUID cluster;
    protected String description;
    protected int problemID;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupCopyUID> relevantCopies;
    @XmlElement(nillable = true)
    protected List<DeviceUID> relevantDevices;
    @XmlElement(nillable = true)
    protected List<GlobalLinkUID> relevantGlobalLinks;
    @XmlElement(nillable = true)
    protected List<RpaUID> relevantRPAs;
    protected SplitterUID relevantSplitter;
    @XmlElement(nillable = true)
    protected List<SplitterVolumeInfo> relevantSplitterVolumesInformation;
    protected ProblemSeverity severity;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemCategory }
     *     
     */
    public ProblemCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemCategory }
     *     
     */
    public void setCategory(ProblemCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the cluster property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterUID }
     *     
     */
    public ClusterUID getCluster() {
        return cluster;
    }

    /**
     * Sets the value of the cluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterUID }
     *     
     */
    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the problemID property.
     * 
     */
    public int getProblemID() {
        return problemID;
    }

    /**
     * Sets the value of the problemID property.
     * 
     */
    public void setProblemID(int value) {
        this.problemID = value;
    }

    /**
     * Gets the value of the relevantCopies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relevantCopies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelevantCopies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupCopyUID }
     * 
     * 
     */
    public List<ConsistencyGroupCopyUID> getRelevantCopies() {
        if (relevantCopies == null) {
            relevantCopies = new ArrayList<ConsistencyGroupCopyUID>();
        }
        return this.relevantCopies;
    }

    /**
     * Gets the value of the relevantDevices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relevantDevices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelevantDevices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceUID }
     * 
     * 
     */
    public List<DeviceUID> getRelevantDevices() {
        if (relevantDevices == null) {
            relevantDevices = new ArrayList<DeviceUID>();
        }
        return this.relevantDevices;
    }

    /**
     * Gets the value of the relevantGlobalLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relevantGlobalLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelevantGlobalLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalLinkUID }
     * 
     * 
     */
    public List<GlobalLinkUID> getRelevantGlobalLinks() {
        if (relevantGlobalLinks == null) {
            relevantGlobalLinks = new ArrayList<GlobalLinkUID>();
        }
        return this.relevantGlobalLinks;
    }

    /**
     * Gets the value of the relevantRPAs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relevantRPAs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelevantRPAs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RpaUID }
     * 
     * 
     */
    public List<RpaUID> getRelevantRPAs() {
        if (relevantRPAs == null) {
            relevantRPAs = new ArrayList<RpaUID>();
        }
        return this.relevantRPAs;
    }

    /**
     * Gets the value of the relevantSplitter property.
     * 
     * @return
     *     possible object is
     *     {@link SplitterUID }
     *     
     */
    public SplitterUID getRelevantSplitter() {
        return relevantSplitter;
    }

    /**
     * Sets the value of the relevantSplitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitterUID }
     *     
     */
    public void setRelevantSplitter(SplitterUID value) {
        this.relevantSplitter = value;
    }

    /**
     * Gets the value of the relevantSplitterVolumesInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relevantSplitterVolumesInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelevantSplitterVolumesInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitterVolumeInfo }
     * 
     * 
     */
    public List<SplitterVolumeInfo> getRelevantSplitterVolumesInformation() {
        if (relevantSplitterVolumesInformation == null) {
            relevantSplitterVolumesInformation = new ArrayList<SplitterVolumeInfo>();
        }
        return this.relevantSplitterVolumesInformation;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemSeverity }
     *     
     */
    public ProblemSeverity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemSeverity }
     *     
     */
    public void setSeverity(ProblemSeverity value) {
        this.severity = value;
    }

}
