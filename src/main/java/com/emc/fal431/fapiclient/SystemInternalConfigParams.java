
package com.emc.fal431.fapiclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemInternalConfigParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemInternalConfigParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionToSyncLatency" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="allowSettingsChangesDuringMaintenance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="clariionFirstSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clariionSecondSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="controlWriteTimeout" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="daysPerMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="defaultDailyImages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="defaultMonthlyImages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="defaultResumeSyncBelowLatency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="defaultResumeSyncBelowThroughput" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="defaultStartAsyncAboveLatency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="defaultStartAsyncAboveThroughput" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="defaultUnconsolidatedDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="defaultWeeklyImages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="displayCertificateExtensions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dynamicDontMoveToSyncTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="e14ServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enableClariionVirtualWithRoll" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="eventLogsMaxNumberOfEntries" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fcReplication" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="flexFiltersRunIntervalInMinutes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="highestLatencyThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="highestThroughputThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="journalSizeLimitInGB" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="lowestLatencyThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lowestThroughputThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxGridCopiesPerGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxGridGroups" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxGroups" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxPersistentSnapshots" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maximumSplittersPerCluster" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mgmtMaxActivityTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mgmtScaledMaxActivityTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minNumOfVolumesInScaledEnv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minTSPPercentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minUnconsolidatedDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="modelUpdaterFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="monitorSplitterStateLease" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="multipleAppliancesString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peerStateUpdateInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phoenixSystemTM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rootCausesStabilizationTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rpse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rpseSetGroupSettingsTimeForSingleOperation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="simulator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="singleApplianceString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snapshotConsolidationTimeAcceleration" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="snapshotUpdateInterval" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="splitterMonitorRPATimeout" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="syrSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="trackInitInconsistency" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tspMemoryAlmostFullWaterMark" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="usePWLOnWAN" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemInternalConfigParams", propOrder = {
    "additionToSyncLatency",
    "allowSettingsChangesDuringMaintenance",
    "clariionFirstSuffix",
    "clariionSecondSuffix",
    "companyName",
    "controlWriteTimeout",
    "daysPerMonth",
    "defaultDailyImages",
    "defaultMonthlyImages",
    "defaultResumeSyncBelowLatency",
    "defaultResumeSyncBelowThroughput",
    "defaultStartAsyncAboveLatency",
    "defaultStartAsyncAboveThroughput",
    "defaultUnconsolidatedDuration",
    "defaultWeeklyImages",
    "displayCertificateExtensions",
    "dynamicDontMoveToSyncTime",
    "e14ServerName",
    "enableClariionVirtualWithRoll",
    "eventLogsMaxNumberOfEntries",
    "fcReplication",
    "flexFiltersRunIntervalInMinutes",
    "highestLatencyThreshold",
    "highestThroughputThreshold",
    "journalSizeLimitInGB",
    "lowestLatencyThreshold",
    "lowestThroughputThreshold",
    "maxGridCopiesPerGroup",
    "maxGridGroups",
    "maxGroups",
    "maxPersistentSnapshots",
    "maximumSplittersPerCluster",
    "mgmtMaxActivityTime",
    "mgmtScaledMaxActivityTime",
    "minNumOfVolumesInScaledEnv",
    "minTSPPercentage",
    "minUnconsolidatedDuration",
    "modelUpdaterFrequency",
    "monitorSplitterStateLease",
    "multipleAppliancesString",
    "oem",
    "peerStateUpdateInterval",
    "phoenixSystemTM",
    "product",
    "rootCausesStabilizationTime",
    "rpse",
    "rpseSetGroupSettingsTimeForSingleOperation",
    "simulator",
    "singleApplianceString",
    "snapshotConsolidationTimeAcceleration",
    "snapshotUpdateInterval",
    "splitterMonitorRPATimeout",
    "syrSupported",
    "trackInitInconsistency",
    "tspMemoryAlmostFullWaterMark",
    "usePWLOnWAN",
    "version"
})
public class SystemInternalConfigParams {

    protected long additionToSyncLatency;
    protected boolean allowSettingsChangesDuringMaintenance;
    protected String clariionFirstSuffix;
    protected String clariionSecondSuffix;
    protected String companyName;
    protected long controlWriteTimeout;
    protected int daysPerMonth;
    protected int defaultDailyImages;
    protected int defaultMonthlyImages;
    protected int defaultResumeSyncBelowLatency;
    protected int defaultResumeSyncBelowThroughput;
    protected int defaultStartAsyncAboveLatency;
    protected int defaultStartAsyncAboveThroughput;
    protected int defaultUnconsolidatedDuration;
    protected int defaultWeeklyImages;
    protected boolean displayCertificateExtensions;
    protected long dynamicDontMoveToSyncTime;
    protected String e14ServerName;
    protected boolean enableClariionVirtualWithRoll;
    protected long eventLogsMaxNumberOfEntries;
    protected boolean fcReplication;
    protected int flexFiltersRunIntervalInMinutes;
    protected int highestLatencyThreshold;
    protected int highestThroughputThreshold;
    protected long journalSizeLimitInGB;
    protected int lowestLatencyThreshold;
    protected int lowestThroughputThreshold;
    protected int maxGridCopiesPerGroup;
    protected int maxGridGroups;
    protected int maxGroups;
    protected int maxPersistentSnapshots;
    protected int maximumSplittersPerCluster;
    protected int mgmtMaxActivityTime;
    protected int mgmtScaledMaxActivityTime;
    protected int minNumOfVolumesInScaledEnv;
    protected int minTSPPercentage;
    protected int minUnconsolidatedDuration;
    protected int modelUpdaterFrequency;
    protected long monitorSplitterStateLease;
    protected String multipleAppliancesString;
    protected String oem;
    protected int peerStateUpdateInterval;
    protected String phoenixSystemTM;
    protected String product;
    protected int rootCausesStabilizationTime;
    protected boolean rpse;
    protected int rpseSetGroupSettingsTimeForSingleOperation;
    protected boolean simulator;
    protected String singleApplianceString;
    protected long snapshotConsolidationTimeAcceleration;
    protected long snapshotUpdateInterval;
    protected long splitterMonitorRPATimeout;
    protected boolean syrSupported;
    protected boolean trackInitInconsistency;
    protected double tspMemoryAlmostFullWaterMark;
    protected boolean usePWLOnWAN;
    protected String version;

    /**
     * Gets the value of the additionToSyncLatency property.
     * 
     */
    public long getAdditionToSyncLatency() {
        return additionToSyncLatency;
    }

    /**
     * Sets the value of the additionToSyncLatency property.
     * 
     */
    public void setAdditionToSyncLatency(long value) {
        this.additionToSyncLatency = value;
    }

    /**
     * Gets the value of the allowSettingsChangesDuringMaintenance property.
     * 
     */
    public boolean isAllowSettingsChangesDuringMaintenance() {
        return allowSettingsChangesDuringMaintenance;
    }

    /**
     * Sets the value of the allowSettingsChangesDuringMaintenance property.
     * 
     */
    public void setAllowSettingsChangesDuringMaintenance(boolean value) {
        this.allowSettingsChangesDuringMaintenance = value;
    }

    /**
     * Gets the value of the clariionFirstSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClariionFirstSuffix() {
        return clariionFirstSuffix;
    }

    /**
     * Sets the value of the clariionFirstSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClariionFirstSuffix(String value) {
        this.clariionFirstSuffix = value;
    }

    /**
     * Gets the value of the clariionSecondSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClariionSecondSuffix() {
        return clariionSecondSuffix;
    }

    /**
     * Sets the value of the clariionSecondSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClariionSecondSuffix(String value) {
        this.clariionSecondSuffix = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the controlWriteTimeout property.
     * 
     */
    public long getControlWriteTimeout() {
        return controlWriteTimeout;
    }

    /**
     * Sets the value of the controlWriteTimeout property.
     * 
     */
    public void setControlWriteTimeout(long value) {
        this.controlWriteTimeout = value;
    }

    /**
     * Gets the value of the daysPerMonth property.
     * 
     */
    public int getDaysPerMonth() {
        return daysPerMonth;
    }

    /**
     * Sets the value of the daysPerMonth property.
     * 
     */
    public void setDaysPerMonth(int value) {
        this.daysPerMonth = value;
    }

    /**
     * Gets the value of the defaultDailyImages property.
     * 
     */
    public int getDefaultDailyImages() {
        return defaultDailyImages;
    }

    /**
     * Sets the value of the defaultDailyImages property.
     * 
     */
    public void setDefaultDailyImages(int value) {
        this.defaultDailyImages = value;
    }

    /**
     * Gets the value of the defaultMonthlyImages property.
     * 
     */
    public int getDefaultMonthlyImages() {
        return defaultMonthlyImages;
    }

    /**
     * Sets the value of the defaultMonthlyImages property.
     * 
     */
    public void setDefaultMonthlyImages(int value) {
        this.defaultMonthlyImages = value;
    }

    /**
     * Gets the value of the defaultResumeSyncBelowLatency property.
     * 
     */
    public int getDefaultResumeSyncBelowLatency() {
        return defaultResumeSyncBelowLatency;
    }

    /**
     * Sets the value of the defaultResumeSyncBelowLatency property.
     * 
     */
    public void setDefaultResumeSyncBelowLatency(int value) {
        this.defaultResumeSyncBelowLatency = value;
    }

    /**
     * Gets the value of the defaultResumeSyncBelowThroughput property.
     * 
     */
    public int getDefaultResumeSyncBelowThroughput() {
        return defaultResumeSyncBelowThroughput;
    }

    /**
     * Sets the value of the defaultResumeSyncBelowThroughput property.
     * 
     */
    public void setDefaultResumeSyncBelowThroughput(int value) {
        this.defaultResumeSyncBelowThroughput = value;
    }

    /**
     * Gets the value of the defaultStartAsyncAboveLatency property.
     * 
     */
    public int getDefaultStartAsyncAboveLatency() {
        return defaultStartAsyncAboveLatency;
    }

    /**
     * Sets the value of the defaultStartAsyncAboveLatency property.
     * 
     */
    public void setDefaultStartAsyncAboveLatency(int value) {
        this.defaultStartAsyncAboveLatency = value;
    }

    /**
     * Gets the value of the defaultStartAsyncAboveThroughput property.
     * 
     */
    public int getDefaultStartAsyncAboveThroughput() {
        return defaultStartAsyncAboveThroughput;
    }

    /**
     * Sets the value of the defaultStartAsyncAboveThroughput property.
     * 
     */
    public void setDefaultStartAsyncAboveThroughput(int value) {
        this.defaultStartAsyncAboveThroughput = value;
    }

    /**
     * Gets the value of the defaultUnconsolidatedDuration property.
     * 
     */
    public int getDefaultUnconsolidatedDuration() {
        return defaultUnconsolidatedDuration;
    }

    /**
     * Sets the value of the defaultUnconsolidatedDuration property.
     * 
     */
    public void setDefaultUnconsolidatedDuration(int value) {
        this.defaultUnconsolidatedDuration = value;
    }

    /**
     * Gets the value of the defaultWeeklyImages property.
     * 
     */
    public int getDefaultWeeklyImages() {
        return defaultWeeklyImages;
    }

    /**
     * Sets the value of the defaultWeeklyImages property.
     * 
     */
    public void setDefaultWeeklyImages(int value) {
        this.defaultWeeklyImages = value;
    }

    /**
     * Gets the value of the displayCertificateExtensions property.
     * 
     */
    public boolean isDisplayCertificateExtensions() {
        return displayCertificateExtensions;
    }

    /**
     * Sets the value of the displayCertificateExtensions property.
     * 
     */
    public void setDisplayCertificateExtensions(boolean value) {
        this.displayCertificateExtensions = value;
    }

    /**
     * Gets the value of the dynamicDontMoveToSyncTime property.
     * 
     */
    public long getDynamicDontMoveToSyncTime() {
        return dynamicDontMoveToSyncTime;
    }

    /**
     * Sets the value of the dynamicDontMoveToSyncTime property.
     * 
     */
    public void setDynamicDontMoveToSyncTime(long value) {
        this.dynamicDontMoveToSyncTime = value;
    }

    /**
     * Gets the value of the e14ServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getE14ServerName() {
        return e14ServerName;
    }

    /**
     * Sets the value of the e14ServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setE14ServerName(String value) {
        this.e14ServerName = value;
    }

    /**
     * Gets the value of the enableClariionVirtualWithRoll property.
     * 
     */
    public boolean isEnableClariionVirtualWithRoll() {
        return enableClariionVirtualWithRoll;
    }

    /**
     * Sets the value of the enableClariionVirtualWithRoll property.
     * 
     */
    public void setEnableClariionVirtualWithRoll(boolean value) {
        this.enableClariionVirtualWithRoll = value;
    }

    /**
     * Gets the value of the eventLogsMaxNumberOfEntries property.
     * 
     */
    public long getEventLogsMaxNumberOfEntries() {
        return eventLogsMaxNumberOfEntries;
    }

    /**
     * Sets the value of the eventLogsMaxNumberOfEntries property.
     * 
     */
    public void setEventLogsMaxNumberOfEntries(long value) {
        this.eventLogsMaxNumberOfEntries = value;
    }

    /**
     * Gets the value of the fcReplication property.
     * 
     */
    public boolean isFcReplication() {
        return fcReplication;
    }

    /**
     * Sets the value of the fcReplication property.
     * 
     */
    public void setFcReplication(boolean value) {
        this.fcReplication = value;
    }

    /**
     * Gets the value of the flexFiltersRunIntervalInMinutes property.
     * 
     */
    public int getFlexFiltersRunIntervalInMinutes() {
        return flexFiltersRunIntervalInMinutes;
    }

    /**
     * Sets the value of the flexFiltersRunIntervalInMinutes property.
     * 
     */
    public void setFlexFiltersRunIntervalInMinutes(int value) {
        this.flexFiltersRunIntervalInMinutes = value;
    }

    /**
     * Gets the value of the highestLatencyThreshold property.
     * 
     */
    public int getHighestLatencyThreshold() {
        return highestLatencyThreshold;
    }

    /**
     * Sets the value of the highestLatencyThreshold property.
     * 
     */
    public void setHighestLatencyThreshold(int value) {
        this.highestLatencyThreshold = value;
    }

    /**
     * Gets the value of the highestThroughputThreshold property.
     * 
     */
    public int getHighestThroughputThreshold() {
        return highestThroughputThreshold;
    }

    /**
     * Sets the value of the highestThroughputThreshold property.
     * 
     */
    public void setHighestThroughputThreshold(int value) {
        this.highestThroughputThreshold = value;
    }

    /**
     * Gets the value of the journalSizeLimitInGB property.
     * 
     */
    public long getJournalSizeLimitInGB() {
        return journalSizeLimitInGB;
    }

    /**
     * Sets the value of the journalSizeLimitInGB property.
     * 
     */
    public void setJournalSizeLimitInGB(long value) {
        this.journalSizeLimitInGB = value;
    }

    /**
     * Gets the value of the lowestLatencyThreshold property.
     * 
     */
    public int getLowestLatencyThreshold() {
        return lowestLatencyThreshold;
    }

    /**
     * Sets the value of the lowestLatencyThreshold property.
     * 
     */
    public void setLowestLatencyThreshold(int value) {
        this.lowestLatencyThreshold = value;
    }

    /**
     * Gets the value of the lowestThroughputThreshold property.
     * 
     */
    public int getLowestThroughputThreshold() {
        return lowestThroughputThreshold;
    }

    /**
     * Sets the value of the lowestThroughputThreshold property.
     * 
     */
    public void setLowestThroughputThreshold(int value) {
        this.lowestThroughputThreshold = value;
    }

    /**
     * Gets the value of the maxGridCopiesPerGroup property.
     * 
     */
    public int getMaxGridCopiesPerGroup() {
        return maxGridCopiesPerGroup;
    }

    /**
     * Sets the value of the maxGridCopiesPerGroup property.
     * 
     */
    public void setMaxGridCopiesPerGroup(int value) {
        this.maxGridCopiesPerGroup = value;
    }

    /**
     * Gets the value of the maxGridGroups property.
     * 
     */
    public int getMaxGridGroups() {
        return maxGridGroups;
    }

    /**
     * Sets the value of the maxGridGroups property.
     * 
     */
    public void setMaxGridGroups(int value) {
        this.maxGridGroups = value;
    }

    /**
     * Gets the value of the maxGroups property.
     * 
     */
    public int getMaxGroups() {
        return maxGroups;
    }

    /**
     * Sets the value of the maxGroups property.
     * 
     */
    public void setMaxGroups(int value) {
        this.maxGroups = value;
    }

    /**
     * Gets the value of the maxPersistentSnapshots property.
     * 
     */
    public int getMaxPersistentSnapshots() {
        return maxPersistentSnapshots;
    }

    /**
     * Sets the value of the maxPersistentSnapshots property.
     * 
     */
    public void setMaxPersistentSnapshots(int value) {
        this.maxPersistentSnapshots = value;
    }

    /**
     * Gets the value of the maximumSplittersPerCluster property.
     * 
     */
    public int getMaximumSplittersPerCluster() {
        return maximumSplittersPerCluster;
    }

    /**
     * Sets the value of the maximumSplittersPerCluster property.
     * 
     */
    public void setMaximumSplittersPerCluster(int value) {
        this.maximumSplittersPerCluster = value;
    }

    /**
     * Gets the value of the mgmtMaxActivityTime property.
     * 
     */
    public int getMgmtMaxActivityTime() {
        return mgmtMaxActivityTime;
    }

    /**
     * Sets the value of the mgmtMaxActivityTime property.
     * 
     */
    public void setMgmtMaxActivityTime(int value) {
        this.mgmtMaxActivityTime = value;
    }

    /**
     * Gets the value of the mgmtScaledMaxActivityTime property.
     * 
     */
    public int getMgmtScaledMaxActivityTime() {
        return mgmtScaledMaxActivityTime;
    }

    /**
     * Sets the value of the mgmtScaledMaxActivityTime property.
     * 
     */
    public void setMgmtScaledMaxActivityTime(int value) {
        this.mgmtScaledMaxActivityTime = value;
    }

    /**
     * Gets the value of the minNumOfVolumesInScaledEnv property.
     * 
     */
    public int getMinNumOfVolumesInScaledEnv() {
        return minNumOfVolumesInScaledEnv;
    }

    /**
     * Sets the value of the minNumOfVolumesInScaledEnv property.
     * 
     */
    public void setMinNumOfVolumesInScaledEnv(int value) {
        this.minNumOfVolumesInScaledEnv = value;
    }

    /**
     * Gets the value of the minTSPPercentage property.
     * 
     */
    public int getMinTSPPercentage() {
        return minTSPPercentage;
    }

    /**
     * Sets the value of the minTSPPercentage property.
     * 
     */
    public void setMinTSPPercentage(int value) {
        this.minTSPPercentage = value;
    }

    /**
     * Gets the value of the minUnconsolidatedDuration property.
     * 
     */
    public int getMinUnconsolidatedDuration() {
        return minUnconsolidatedDuration;
    }

    /**
     * Sets the value of the minUnconsolidatedDuration property.
     * 
     */
    public void setMinUnconsolidatedDuration(int value) {
        this.minUnconsolidatedDuration = value;
    }

    /**
     * Gets the value of the modelUpdaterFrequency property.
     * 
     */
    public int getModelUpdaterFrequency() {
        return modelUpdaterFrequency;
    }

    /**
     * Sets the value of the modelUpdaterFrequency property.
     * 
     */
    public void setModelUpdaterFrequency(int value) {
        this.modelUpdaterFrequency = value;
    }

    /**
     * Gets the value of the monitorSplitterStateLease property.
     * 
     */
    public long getMonitorSplitterStateLease() {
        return monitorSplitterStateLease;
    }

    /**
     * Sets the value of the monitorSplitterStateLease property.
     * 
     */
    public void setMonitorSplitterStateLease(long value) {
        this.monitorSplitterStateLease = value;
    }

    /**
     * Gets the value of the multipleAppliancesString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleAppliancesString() {
        return multipleAppliancesString;
    }

    /**
     * Sets the value of the multipleAppliancesString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleAppliancesString(String value) {
        this.multipleAppliancesString = value;
    }

    /**
     * Gets the value of the oem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOem() {
        return oem;
    }

    /**
     * Sets the value of the oem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOem(String value) {
        this.oem = value;
    }

    /**
     * Gets the value of the peerStateUpdateInterval property.
     * 
     */
    public int getPeerStateUpdateInterval() {
        return peerStateUpdateInterval;
    }

    /**
     * Sets the value of the peerStateUpdateInterval property.
     * 
     */
    public void setPeerStateUpdateInterval(int value) {
        this.peerStateUpdateInterval = value;
    }

    /**
     * Gets the value of the phoenixSystemTM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoenixSystemTM() {
        return phoenixSystemTM;
    }

    /**
     * Sets the value of the phoenixSystemTM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoenixSystemTM(String value) {
        this.phoenixSystemTM = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the rootCausesStabilizationTime property.
     * 
     */
    public int getRootCausesStabilizationTime() {
        return rootCausesStabilizationTime;
    }

    /**
     * Sets the value of the rootCausesStabilizationTime property.
     * 
     */
    public void setRootCausesStabilizationTime(int value) {
        this.rootCausesStabilizationTime = value;
    }

    /**
     * Gets the value of the rpse property.
     * 
     */
    public boolean isRpse() {
        return rpse;
    }

    /**
     * Sets the value of the rpse property.
     * 
     */
    public void setRpse(boolean value) {
        this.rpse = value;
    }

    /**
     * Gets the value of the rpseSetGroupSettingsTimeForSingleOperation property.
     * 
     */
    public int getRpseSetGroupSettingsTimeForSingleOperation() {
        return rpseSetGroupSettingsTimeForSingleOperation;
    }

    /**
     * Sets the value of the rpseSetGroupSettingsTimeForSingleOperation property.
     * 
     */
    public void setRpseSetGroupSettingsTimeForSingleOperation(int value) {
        this.rpseSetGroupSettingsTimeForSingleOperation = value;
    }

    /**
     * Gets the value of the simulator property.
     * 
     */
    public boolean isSimulator() {
        return simulator;
    }

    /**
     * Sets the value of the simulator property.
     * 
     */
    public void setSimulator(boolean value) {
        this.simulator = value;
    }

    /**
     * Gets the value of the singleApplianceString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleApplianceString() {
        return singleApplianceString;
    }

    /**
     * Sets the value of the singleApplianceString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleApplianceString(String value) {
        this.singleApplianceString = value;
    }

    /**
     * Gets the value of the snapshotConsolidationTimeAcceleration property.
     * 
     */
    public long getSnapshotConsolidationTimeAcceleration() {
        return snapshotConsolidationTimeAcceleration;
    }

    /**
     * Sets the value of the snapshotConsolidationTimeAcceleration property.
     * 
     */
    public void setSnapshotConsolidationTimeAcceleration(long value) {
        this.snapshotConsolidationTimeAcceleration = value;
    }

    /**
     * Gets the value of the snapshotUpdateInterval property.
     * 
     */
    public long getSnapshotUpdateInterval() {
        return snapshotUpdateInterval;
    }

    /**
     * Sets the value of the snapshotUpdateInterval property.
     * 
     */
    public void setSnapshotUpdateInterval(long value) {
        this.snapshotUpdateInterval = value;
    }

    /**
     * Gets the value of the splitterMonitorRPATimeout property.
     * 
     */
    public long getSplitterMonitorRPATimeout() {
        return splitterMonitorRPATimeout;
    }

    /**
     * Sets the value of the splitterMonitorRPATimeout property.
     * 
     */
    public void setSplitterMonitorRPATimeout(long value) {
        this.splitterMonitorRPATimeout = value;
    }

    /**
     * Gets the value of the syrSupported property.
     * 
     */
    public boolean isSyrSupported() {
        return syrSupported;
    }

    /**
     * Sets the value of the syrSupported property.
     * 
     */
    public void setSyrSupported(boolean value) {
        this.syrSupported = value;
    }

    /**
     * Gets the value of the trackInitInconsistency property.
     * 
     */
    public boolean isTrackInitInconsistency() {
        return trackInitInconsistency;
    }

    /**
     * Sets the value of the trackInitInconsistency property.
     * 
     */
    public void setTrackInitInconsistency(boolean value) {
        this.trackInitInconsistency = value;
    }

    /**
     * Gets the value of the tspMemoryAlmostFullWaterMark property.
     * 
     */
    public double getTspMemoryAlmostFullWaterMark() {
        return tspMemoryAlmostFullWaterMark;
    }

    /**
     * Sets the value of the tspMemoryAlmostFullWaterMark property.
     * 
     */
    public void setTspMemoryAlmostFullWaterMark(double value) {
        this.tspMemoryAlmostFullWaterMark = value;
    }

    /**
     * Gets the value of the usePWLOnWAN property.
     * 
     */
    public boolean isUsePWLOnWAN() {
        return usePWLOnWAN;
    }

    /**
     * Sets the value of the usePWLOnWAN property.
     * 
     */
    public void setUsePWLOnWAN(boolean value) {
        this.usePWLOnWAN = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
