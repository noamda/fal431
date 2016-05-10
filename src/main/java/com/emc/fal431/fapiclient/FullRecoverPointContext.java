
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fullRecoverPointContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fullRecoverPointContext">
 *   &lt;complexContent>
 *     &lt;extension base="{}functionalAPIContext">
 *       &lt;sequence>
 *         &lt;element name="clustersClariionVolumesContexts" type="{}clariionVolumesContext" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="clustersSANVolumesContexts" type="{}clusterSANVolumesContext" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="clustersVCentersServersContexts" type="{}vCenterServerViewContext" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fullSettingsContext" type="{}fullRecoverPointSettingsContext" minOccurs="0"/>
 *         &lt;element name="fullStateContext" type="{}fullRecoverPointStateContext" minOccurs="0"/>
 *         &lt;element ref="{}systemStatusContext" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fullRecoverPointContext", propOrder = {
    "clustersClariionVolumesContexts",
    "clustersSANVolumesContexts",
    "clustersVCentersServersContexts",
    "fullSettingsContext",
    "fullStateContext",
    "systemStatusContext"
})
public class FullRecoverPointContext
    extends FunctionalAPIContext
{

    @XmlElement(nillable = true)
    protected List<ClariionVolumesContext> clustersClariionVolumesContexts;
    @XmlElement(nillable = true)
    protected List<ClusterSANVolumesContext> clustersSANVolumesContexts;
    @XmlElement(nillable = true)
    protected List<VCenterServerViewContext> clustersVCentersServersContexts;
    protected FullRecoverPointSettingsContext fullSettingsContext;
    protected FullRecoverPointStateContext fullStateContext;
    protected SystemStatusContext systemStatusContext;

    /**
     * Gets the value of the clustersClariionVolumesContexts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clustersClariionVolumesContexts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClustersClariionVolumesContexts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClariionVolumesContext }
     * 
     * 
     */
    public List<ClariionVolumesContext> getClustersClariionVolumesContexts() {
        if (clustersClariionVolumesContexts == null) {
            clustersClariionVolumesContexts = new ArrayList<ClariionVolumesContext>();
        }
        return this.clustersClariionVolumesContexts;
    }

    /**
     * Gets the value of the clustersSANVolumesContexts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clustersSANVolumesContexts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClustersSANVolumesContexts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterSANVolumesContext }
     * 
     * 
     */
    public List<ClusterSANVolumesContext> getClustersSANVolumesContexts() {
        if (clustersSANVolumesContexts == null) {
            clustersSANVolumesContexts = new ArrayList<ClusterSANVolumesContext>();
        }
        return this.clustersSANVolumesContexts;
    }

    /**
     * Gets the value of the clustersVCentersServersContexts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clustersVCentersServersContexts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClustersVCentersServersContexts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VCenterServerViewContext }
     * 
     * 
     */
    public List<VCenterServerViewContext> getClustersVCentersServersContexts() {
        if (clustersVCentersServersContexts == null) {
            clustersVCentersServersContexts = new ArrayList<VCenterServerViewContext>();
        }
        return this.clustersVCentersServersContexts;
    }

    /**
     * Gets the value of the fullSettingsContext property.
     * 
     * @return
     *     possible object is
     *     {@link FullRecoverPointSettingsContext }
     *     
     */
    public FullRecoverPointSettingsContext getFullSettingsContext() {
        return fullSettingsContext;
    }

    /**
     * Sets the value of the fullSettingsContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullRecoverPointSettingsContext }
     *     
     */
    public void setFullSettingsContext(FullRecoverPointSettingsContext value) {
        this.fullSettingsContext = value;
    }

    /**
     * Gets the value of the fullStateContext property.
     * 
     * @return
     *     possible object is
     *     {@link FullRecoverPointStateContext }
     *     
     */
    public FullRecoverPointStateContext getFullStateContext() {
        return fullStateContext;
    }

    /**
     * Sets the value of the fullStateContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullRecoverPointStateContext }
     *     
     */
    public void setFullStateContext(FullRecoverPointStateContext value) {
        this.fullStateContext = value;
    }

    /**
     * Gets the value of the systemStatusContext property.
     * 
     * @return
     *     possible object is
     *     {@link SystemStatusContext }
     *     
     */
    public SystemStatusContext getSystemStatusContext() {
        return systemStatusContext;
    }

    /**
     * Sets the value of the systemStatusContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemStatusContext }
     *     
     */
    public void setSystemStatusContext(SystemStatusContext value) {
        this.systemStatusContext = value;
    }

}
