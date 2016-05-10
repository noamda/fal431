
package com.emc.fal431.fapiclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fullRecoverPointState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fullRecoverPointState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}accountState" minOccurs="0"/>
 *         &lt;element name="clustersPhoenixClustersState" type="{}phoenixClusterState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupsState" type="{}consistencyGroupState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupsVolumesState" type="{}consistencyGroupVolumesState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="internalConfigParamsConflict" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="linksState" type="{}globalLinkState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}monitoredParametersStatus" minOccurs="0"/>
 *         &lt;element name="repositoriesState" type="{}repositoryVolumeState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rpasState" type="{}clusterRPAsState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="splittersState" type="{}clusterSplittersState" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}systemVersionState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fullRecoverPointState", propOrder = {
    "accountState",
    "clustersPhoenixClustersState",
    "groupsState",
    "groupsVolumesState",
    "internalConfigParamsConflict",
    "linksState",
    "monitoredParametersStatus",
    "repositoriesState",
    "rpasState",
    "splittersState",
    "systemVersionState"
})
public class FullRecoverPointState {

    protected AccountState accountState;
    @XmlElement(nillable = true)
    protected List<PhoenixClusterState> clustersPhoenixClustersState;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupState> groupsState;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupVolumesState> groupsVolumesState;
    protected boolean internalConfigParamsConflict;
    @XmlElement(nillable = true)
    protected List<GlobalLinkState> linksState;
    protected MonitoredParametersStatus monitoredParametersStatus;
    @XmlElement(nillable = true)
    protected List<RepositoryVolumeState> repositoriesState;
    @XmlElement(nillable = true)
    protected List<ClusterRPAsState> rpasState;
    @XmlElement(nillable = true)
    protected List<ClusterSplittersState> splittersState;
    protected SystemVersionState systemVersionState;

    /**
     * Gets the value of the accountState property.
     * 
     * @return
     *     possible object is
     *     {@link AccountState }
     *     
     */
    public AccountState getAccountState() {
        return accountState;
    }

    /**
     * Sets the value of the accountState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountState }
     *     
     */
    public void setAccountState(AccountState value) {
        this.accountState = value;
    }

    /**
     * Gets the value of the clustersPhoenixClustersState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clustersPhoenixClustersState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClustersPhoenixClustersState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoenixClusterState }
     * 
     * 
     */
    public List<PhoenixClusterState> getClustersPhoenixClustersState() {
        if (clustersPhoenixClustersState == null) {
            clustersPhoenixClustersState = new ArrayList<PhoenixClusterState>();
        }
        return this.clustersPhoenixClustersState;
    }

    /**
     * Gets the value of the groupsState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupsState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupsState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupState }
     * 
     * 
     */
    public List<ConsistencyGroupState> getGroupsState() {
        if (groupsState == null) {
            groupsState = new ArrayList<ConsistencyGroupState>();
        }
        return this.groupsState;
    }

    /**
     * Gets the value of the groupsVolumesState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupsVolumesState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupsVolumesState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsistencyGroupVolumesState }
     * 
     * 
     */
    public List<ConsistencyGroupVolumesState> getGroupsVolumesState() {
        if (groupsVolumesState == null) {
            groupsVolumesState = new ArrayList<ConsistencyGroupVolumesState>();
        }
        return this.groupsVolumesState;
    }

    /**
     * Gets the value of the internalConfigParamsConflict property.
     * 
     */
    public boolean isInternalConfigParamsConflict() {
        return internalConfigParamsConflict;
    }

    /**
     * Sets the value of the internalConfigParamsConflict property.
     * 
     */
    public void setInternalConfigParamsConflict(boolean value) {
        this.internalConfigParamsConflict = value;
    }

    /**
     * Gets the value of the linksState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linksState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinksState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalLinkState }
     * 
     * 
     */
    public List<GlobalLinkState> getLinksState() {
        if (linksState == null) {
            linksState = new ArrayList<GlobalLinkState>();
        }
        return this.linksState;
    }

    /**
     * Gets the value of the monitoredParametersStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoredParametersStatus }
     *     
     */
    public MonitoredParametersStatus getMonitoredParametersStatus() {
        return monitoredParametersStatus;
    }

    /**
     * Sets the value of the monitoredParametersStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoredParametersStatus }
     *     
     */
    public void setMonitoredParametersStatus(MonitoredParametersStatus value) {
        this.monitoredParametersStatus = value;
    }

    /**
     * Gets the value of the repositoriesState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repositoriesState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepositoriesState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepositoryVolumeState }
     * 
     * 
     */
    public List<RepositoryVolumeState> getRepositoriesState() {
        if (repositoriesState == null) {
            repositoriesState = new ArrayList<RepositoryVolumeState>();
        }
        return this.repositoriesState;
    }

    /**
     * Gets the value of the rpasState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rpasState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpasState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClusterRPAsState }
     * 
     * 
     */
    public List<ClusterRPAsState> getRpasState() {
        if (rpasState == null) {
            rpasState = new ArrayList<ClusterRPAsState>();
        }
        return this.rpasState;
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
     * {@link ClusterSplittersState }
     * 
     * 
     */
    public List<ClusterSplittersState> getSplittersState() {
        if (splittersState == null) {
            splittersState = new ArrayList<ClusterSplittersState>();
        }
        return this.splittersState;
    }

    /**
     * Gets the value of the systemVersionState property.
     * 
     * @return
     *     possible object is
     *     {@link SystemVersionState }
     *     
     */
    public SystemVersionState getSystemVersionState() {
        return systemVersionState;
    }

    /**
     * Sets the value of the systemVersionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemVersionState }
     *     
     */
    public void setSystemVersionState(SystemVersionState value) {
        this.systemVersionState = value;
    }

}
