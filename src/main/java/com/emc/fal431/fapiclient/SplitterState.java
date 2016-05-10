
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for splitterState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="splitterState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfAttachedRPAClusters" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="osAndVersionInfo" type="{}splitterOSAndVersionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rpasConnectivityStatus" type="{}rpaConnectivityStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rpasPaths" type="{}path" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="splitterCapabilities" type="{}capability" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}splitterStatus" minOccurs="0"/>
 *         &lt;element ref="{}splitterUID" minOccurs="0"/>
 *         &lt;element name="volumesAccessState" type="{}attachedUserVolumeAccessState" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "splitterState", propOrder = {
    "numberOfAttachedRPAClusters",
    "osAndVersionInfo",
    "rpasConnectivityStatus",
    "rpasPaths",
    "splitterCapabilities",
    "splitterStatus",
    "splitterUID",
    "volumesAccessState"
})
@XmlSeeAlso({
    SymmetrixSplitterState.class,
    AggregatedSplitterState.class,
    VplexArraySplitterState.class
})
public class SplitterState {

    protected int numberOfAttachedRPAClusters;
    @XmlElement(nillable = true)
    protected List<SplitterOSAndVersionInfo> osAndVersionInfo;
    @XmlElement(nillable = true)
    protected List<RpaConnectivityStatus> rpasConnectivityStatus;
    @XmlElement(nillable = true)
    protected List<Path> rpasPaths;
    @XmlElement(nillable = true)
    protected List<Capability> splitterCapabilities;
    protected SplitterStatus splitterStatus;
    protected SplitterUID splitterUID;
    @XmlElement(nillable = true)
    protected List<AttachedUserVolumeAccessState> volumesAccessState;

    /**
     * Gets the value of the numberOfAttachedRPAClusters property.
     * 
     */
    public int getNumberOfAttachedRPAClusters() {
        return numberOfAttachedRPAClusters;
    }

    /**
     * Sets the value of the numberOfAttachedRPAClusters property.
     * 
     */
    public void setNumberOfAttachedRPAClusters(int value) {
        this.numberOfAttachedRPAClusters = value;
    }

    /**
     * Gets the value of the osAndVersionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the osAndVersionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOsAndVersionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitterOSAndVersionInfo }
     * 
     * 
     */
    public List<SplitterOSAndVersionInfo> getOsAndVersionInfo() {
        if (osAndVersionInfo == null) {
            osAndVersionInfo = new ArrayList<SplitterOSAndVersionInfo>();
        }
        return this.osAndVersionInfo;
    }

    /**
     * Gets the value of the rpasConnectivityStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rpasConnectivityStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpasConnectivityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RpaConnectivityStatus }
     * 
     * 
     */
    public List<RpaConnectivityStatus> getRpasConnectivityStatus() {
        if (rpasConnectivityStatus == null) {
            rpasConnectivityStatus = new ArrayList<RpaConnectivityStatus>();
        }
        return this.rpasConnectivityStatus;
    }

    /**
     * Gets the value of the rpasPaths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rpasPaths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpasPaths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Path }
     * 
     * 
     */
    public List<Path> getRpasPaths() {
        if (rpasPaths == null) {
            rpasPaths = new ArrayList<Path>();
        }
        return this.rpasPaths;
    }

    /**
     * Gets the value of the splitterCapabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitterCapabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitterCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Capability }
     * 
     * 
     */
    public List<Capability> getSplitterCapabilities() {
        if (splitterCapabilities == null) {
            splitterCapabilities = new ArrayList<Capability>();
        }
        return this.splitterCapabilities;
    }

    /**
     * Gets the value of the splitterStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SplitterStatus }
     *     
     */
    public SplitterStatus getSplitterStatus() {
        return splitterStatus;
    }

    /**
     * Sets the value of the splitterStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitterStatus }
     *     
     */
    public void setSplitterStatus(SplitterStatus value) {
        this.splitterStatus = value;
    }

    /**
     * Gets the value of the splitterUID property.
     * 
     * @return
     *     possible object is
     *     {@link SplitterUID }
     *     
     */
    public SplitterUID getSplitterUID() {
        return splitterUID;
    }

    /**
     * Sets the value of the splitterUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitterUID }
     *     
     */
    public void setSplitterUID(SplitterUID value) {
        this.splitterUID = value;
    }

    /**
     * Gets the value of the volumesAccessState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volumesAccessState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVolumesAccessState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachedUserVolumeAccessState }
     * 
     * 
     */
    public List<AttachedUserVolumeAccessState> getVolumesAccessState() {
        if (volumesAccessState == null) {
            volumesAccessState = new ArrayList<AttachedUserVolumeAccessState>();
        }
        return this.volumesAccessState;
    }

}
