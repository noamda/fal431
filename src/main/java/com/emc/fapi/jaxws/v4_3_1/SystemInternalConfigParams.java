package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemInternalConfigParams", propOrder = {"additionToSyncLatency", "allowSettingsChangesDuringMaintenance", "clariionFirstSuffix", "clariionSecondSuffix", "companyName", "controlWriteTimeout", "daysPerMonth", "defaultDailyImages", "defaultMonthlyImages", "defaultResumeSyncBelowLatency", "defaultResumeSyncBelowThroughput", "defaultSnapshotShippingIntervalInMinutes", "defaultStartAsyncAboveLatency", "defaultStartAsyncAboveThroughput", "defaultUnconsolidatedDuration", "defaultWeeklyImages", "displayCertificateExtensions", "displayTrialVersion", "dynamicDontMoveToSyncTime", "e14ServerName", "enableClariionVirtualWithRoll", "eventLogsMaxNumberOfEntries", "fcReplication", "flexFiltersRunIntervalInMinutes", "highestLatencyThreshold", "highestThroughputThreshold", "journalSizeLimitInGB", "lowestLatencyThreshold", "lowestThroughputThreshold", "maxAllowedSnapshots", "maxDesiredSnapshotsDefaultPercentage", "maxGridCopiesPerGroup", "maxGridGroups", "maxGroups", "maxNumberOfCGsInConsistentGroupSet", "maxNumberOfGroupSets", "maxPersistentSnapshots", "maximumSplittersPerCluster", "mgmtMaxActivityTime", "mgmtScaledMaxActivityTime", "minNumOfVolumesInScaledEnv", "minTSPPercentage", "minUnconsolidatedDuration", "modelUpdaterFrequency", "monitorSplitterStateLease", "multipleAppliancesString", "oem", "peerStateUpdateInterval", "phoenixSystemTM", "product", "rootCausesStabilizationTime", "rpse", "rpseSetGroupSettingsTimeForSingleOperation", "simulator", "singleApplianceString", "snapshotConsolidationTimeAcceleration", "snapshotUpdateInterval", "splitterMonitorRPATimeout", "syrSupported", "trackInitInconsistency", "tspMemoryAlmostFullWaterMark", "usePWLOnWAN", "version"})
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
    protected int defaultSnapshotShippingIntervalInMinutes;
    protected int defaultStartAsyncAboveLatency;
    protected int defaultStartAsyncAboveThroughput;
    protected int defaultUnconsolidatedDuration;
    protected int defaultWeeklyImages;
    protected boolean displayCertificateExtensions;
    protected boolean displayTrialVersion;
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
    protected int maxAllowedSnapshots;
    protected int maxDesiredSnapshotsDefaultPercentage;
    protected int maxGridCopiesPerGroup;
    protected int maxGridGroups;
    protected int maxGroups;
    protected int maxNumberOfCGsInConsistentGroupSet;
    protected int maxNumberOfGroupSets;
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

    public SystemInternalConfigParams() {
    }

    public SystemInternalConfigParams(long additionToSyncLatency, boolean allowSettingsChangesDuringMaintenance, String clariionFirstSuffix, String clariionSecondSuffix, String companyName, long controlWriteTimeout, int daysPerMonth, int defaultDailyImages, int defaultMonthlyImages, int defaultResumeSyncBelowLatency, int defaultResumeSyncBelowThroughput, int defaultSnapshotShippingIntervalInMinutes, int defaultStartAsyncAboveLatency, int defaultStartAsyncAboveThroughput, int defaultUnconsolidatedDuration, int defaultWeeklyImages, boolean displayCertificateExtensions, boolean displayTrialVersion, long dynamicDontMoveToSyncTime, String e14ServerName, boolean enableClariionVirtualWithRoll, long eventLogsMaxNumberOfEntries, boolean fcReplication, int flexFiltersRunIntervalInMinutes, int highestLatencyThreshold, int highestThroughputThreshold, long journalSizeLimitInGB, int lowestLatencyThreshold, int lowestThroughputThreshold, int maxAllowedSnapshots, int maxDesiredSnapshotsDefaultPercentage, int maxGridCopiesPerGroup, int maxGridGroups, int maxGroups, int maxNumberOfCGsInConsistentGroupSet, int maxNumberOfGroupSets, int maxPersistentSnapshots, int maximumSplittersPerCluster, int mgmtMaxActivityTime, int mgmtScaledMaxActivityTime, int minNumOfVolumesInScaledEnv, int minTSPPercentage, int minUnconsolidatedDuration, int modelUpdaterFrequency, long monitorSplitterStateLease, String multipleAppliancesString, String oem, int peerStateUpdateInterval, String phoenixSystemTM, String product, int rootCausesStabilizationTime, boolean rpse, int rpseSetGroupSettingsTimeForSingleOperation, boolean simulator, String singleApplianceString, long snapshotConsolidationTimeAcceleration, long snapshotUpdateInterval, long splitterMonitorRPATimeout, boolean syrSupported, boolean trackInitInconsistency, double tspMemoryAlmostFullWaterMark, boolean usePWLOnWAN, String version) {
        this.additionToSyncLatency = additionToSyncLatency;
        this.allowSettingsChangesDuringMaintenance = allowSettingsChangesDuringMaintenance;
        this.clariionFirstSuffix = clariionFirstSuffix;
        this.clariionSecondSuffix = clariionSecondSuffix;
        this.companyName = companyName;
        this.controlWriteTimeout = controlWriteTimeout;
        this.daysPerMonth = daysPerMonth;
        this.defaultDailyImages = defaultDailyImages;
        this.defaultMonthlyImages = defaultMonthlyImages;
        this.defaultResumeSyncBelowLatency = defaultResumeSyncBelowLatency;
        this.defaultResumeSyncBelowThroughput = defaultResumeSyncBelowThroughput;
        this.defaultSnapshotShippingIntervalInMinutes = defaultSnapshotShippingIntervalInMinutes;
        this.defaultStartAsyncAboveLatency = defaultStartAsyncAboveLatency;
        this.defaultStartAsyncAboveThroughput = defaultStartAsyncAboveThroughput;
        this.defaultUnconsolidatedDuration = defaultUnconsolidatedDuration;
        this.defaultWeeklyImages = defaultWeeklyImages;
        this.displayCertificateExtensions = displayCertificateExtensions;
        this.displayTrialVersion = displayTrialVersion;
        this.dynamicDontMoveToSyncTime = dynamicDontMoveToSyncTime;
        this.e14ServerName = e14ServerName;
        this.enableClariionVirtualWithRoll = enableClariionVirtualWithRoll;
        this.eventLogsMaxNumberOfEntries = eventLogsMaxNumberOfEntries;
        this.fcReplication = fcReplication;
        this.flexFiltersRunIntervalInMinutes = flexFiltersRunIntervalInMinutes;
        this.highestLatencyThreshold = highestLatencyThreshold;
        this.highestThroughputThreshold = highestThroughputThreshold;
        this.journalSizeLimitInGB = journalSizeLimitInGB;
        this.lowestLatencyThreshold = lowestLatencyThreshold;
        this.lowestThroughputThreshold = lowestThroughputThreshold;
        this.maxAllowedSnapshots = maxAllowedSnapshots;
        this.maxDesiredSnapshotsDefaultPercentage = maxDesiredSnapshotsDefaultPercentage;
        this.maxGridCopiesPerGroup = maxGridCopiesPerGroup;
        this.maxGridGroups = maxGridGroups;
        this.maxGroups = maxGroups;
        this.maxNumberOfCGsInConsistentGroupSet = maxNumberOfCGsInConsistentGroupSet;
        this.maxNumberOfGroupSets = maxNumberOfGroupSets;
        this.maxPersistentSnapshots = maxPersistentSnapshots;
        this.maximumSplittersPerCluster = maximumSplittersPerCluster;
        this.mgmtMaxActivityTime = mgmtMaxActivityTime;
        this.mgmtScaledMaxActivityTime = mgmtScaledMaxActivityTime;
        this.minNumOfVolumesInScaledEnv = minNumOfVolumesInScaledEnv;
        this.minTSPPercentage = minTSPPercentage;
        this.minUnconsolidatedDuration = minUnconsolidatedDuration;
        this.modelUpdaterFrequency = modelUpdaterFrequency;
        this.monitorSplitterStateLease = monitorSplitterStateLease;
        this.multipleAppliancesString = multipleAppliancesString;
        this.oem = oem;
        this.peerStateUpdateInterval = peerStateUpdateInterval;
        this.phoenixSystemTM = phoenixSystemTM;
        this.product = product;
        this.rootCausesStabilizationTime = rootCausesStabilizationTime;
        this.rpse = rpse;
        this.rpseSetGroupSettingsTimeForSingleOperation = rpseSetGroupSettingsTimeForSingleOperation;
        this.simulator = simulator;
        this.singleApplianceString = singleApplianceString;
        this.snapshotConsolidationTimeAcceleration = snapshotConsolidationTimeAcceleration;
        this.snapshotUpdateInterval = snapshotUpdateInterval;
        this.splitterMonitorRPATimeout = splitterMonitorRPATimeout;
        this.syrSupported = syrSupported;
        this.trackInitInconsistency = trackInitInconsistency;
        this.tspMemoryAlmostFullWaterMark = tspMemoryAlmostFullWaterMark;
        this.usePWLOnWAN = usePWLOnWAN;
        this.version = version;
    }


    public long getAdditionToSyncLatency() {
        return this.additionToSyncLatency;
    }


    public void setAdditionToSyncLatency(long value) {
        this.additionToSyncLatency = value;
    }


    public boolean isAllowSettingsChangesDuringMaintenance() {
        return this.allowSettingsChangesDuringMaintenance;
    }


    public void setAllowSettingsChangesDuringMaintenance(boolean value) {
        this.allowSettingsChangesDuringMaintenance = value;
    }


    public String getClariionFirstSuffix() {
        return this.clariionFirstSuffix;
    }


    public void setClariionFirstSuffix(String value) {
        this.clariionFirstSuffix = value;
    }


    public String getClariionSecondSuffix() {
        return this.clariionSecondSuffix;
    }


    public void setClariionSecondSuffix(String value) {
        this.clariionSecondSuffix = value;
    }


    public String getCompanyName() {
        return this.companyName;
    }


    public void setCompanyName(String value) {
        this.companyName = value;
    }


    public long getControlWriteTimeout() {
        return this.controlWriteTimeout;
    }


    public void setControlWriteTimeout(long value) {
        this.controlWriteTimeout = value;
    }


    public int getDaysPerMonth() {
        return this.daysPerMonth;
    }


    public void setDaysPerMonth(int value) {
        this.daysPerMonth = value;
    }


    public int getDefaultDailyImages() {
        return this.defaultDailyImages;
    }


    public void setDefaultDailyImages(int value) {
        this.defaultDailyImages = value;
    }


    public int getDefaultMonthlyImages() {
        return this.defaultMonthlyImages;
    }


    public void setDefaultMonthlyImages(int value) {
        this.defaultMonthlyImages = value;
    }


    public int getDefaultResumeSyncBelowLatency() {
        return this.defaultResumeSyncBelowLatency;
    }


    public void setDefaultResumeSyncBelowLatency(int value) {
        this.defaultResumeSyncBelowLatency = value;
    }


    public int getDefaultResumeSyncBelowThroughput() {
        return this.defaultResumeSyncBelowThroughput;
    }


    public void setDefaultResumeSyncBelowThroughput(int value) {
        this.defaultResumeSyncBelowThroughput = value;
    }


    public int getDefaultSnapshotShippingIntervalInMinutes() {
        return this.defaultSnapshotShippingIntervalInMinutes;
    }


    public void setDefaultSnapshotShippingIntervalInMinutes(int value) {
        this.defaultSnapshotShippingIntervalInMinutes = value;
    }


    public int getDefaultStartAsyncAboveLatency() {
        return this.defaultStartAsyncAboveLatency;
    }


    public void setDefaultStartAsyncAboveLatency(int value) {
        this.defaultStartAsyncAboveLatency = value;
    }


    public int getDefaultStartAsyncAboveThroughput() {
        return this.defaultStartAsyncAboveThroughput;
    }


    public void setDefaultStartAsyncAboveThroughput(int value) {
        this.defaultStartAsyncAboveThroughput = value;
    }


    public int getDefaultUnconsolidatedDuration() {
        return this.defaultUnconsolidatedDuration;
    }


    public void setDefaultUnconsolidatedDuration(int value) {
        this.defaultUnconsolidatedDuration = value;
    }


    public int getDefaultWeeklyImages() {
        return this.defaultWeeklyImages;
    }


    public void setDefaultWeeklyImages(int value) {
        this.defaultWeeklyImages = value;
    }


    public boolean isDisplayCertificateExtensions() {
        return this.displayCertificateExtensions;
    }


    public void setDisplayCertificateExtensions(boolean value) {
        this.displayCertificateExtensions = value;
    }


    public boolean isDisplayTrialVersion() {
        return this.displayTrialVersion;
    }


    public void setDisplayTrialVersion(boolean value) {
        this.displayTrialVersion = value;
    }


    public long getDynamicDontMoveToSyncTime() {
        return this.dynamicDontMoveToSyncTime;
    }


    public void setDynamicDontMoveToSyncTime(long value) {
        this.dynamicDontMoveToSyncTime = value;
    }


    public String getE14ServerName() {
        return this.e14ServerName;
    }


    public void setE14ServerName(String value) {
        this.e14ServerName = value;
    }


    public boolean isEnableClariionVirtualWithRoll() {
        return this.enableClariionVirtualWithRoll;
    }


    public void setEnableClariionVirtualWithRoll(boolean value) {
        this.enableClariionVirtualWithRoll = value;
    }


    public long getEventLogsMaxNumberOfEntries() {
        return this.eventLogsMaxNumberOfEntries;
    }


    public void setEventLogsMaxNumberOfEntries(long value) {
        this.eventLogsMaxNumberOfEntries = value;
    }


    public boolean isFcReplication() {
        return this.fcReplication;
    }


    public void setFcReplication(boolean value) {
        this.fcReplication = value;
    }


    public int getFlexFiltersRunIntervalInMinutes() {
        return this.flexFiltersRunIntervalInMinutes;
    }


    public void setFlexFiltersRunIntervalInMinutes(int value) {
        this.flexFiltersRunIntervalInMinutes = value;
    }


    public int getHighestLatencyThreshold() {
        return this.highestLatencyThreshold;
    }


    public void setHighestLatencyThreshold(int value) {
        this.highestLatencyThreshold = value;
    }


    public int getHighestThroughputThreshold() {
        return this.highestThroughputThreshold;
    }


    public void setHighestThroughputThreshold(int value) {
        this.highestThroughputThreshold = value;
    }


    public long getJournalSizeLimitInGB() {
        return this.journalSizeLimitInGB;
    }


    public void setJournalSizeLimitInGB(long value) {
        this.journalSizeLimitInGB = value;
    }


    public int getLowestLatencyThreshold() {
        return this.lowestLatencyThreshold;
    }


    public void setLowestLatencyThreshold(int value) {
        this.lowestLatencyThreshold = value;
    }


    public int getLowestThroughputThreshold() {
        return this.lowestThroughputThreshold;
    }


    public void setLowestThroughputThreshold(int value) {
        this.lowestThroughputThreshold = value;
    }


    public int getMaxAllowedSnapshots() {
        return this.maxAllowedSnapshots;
    }


    public void setMaxAllowedSnapshots(int value) {
        this.maxAllowedSnapshots = value;
    }


    public int getMaxDesiredSnapshotsDefaultPercentage() {
        return this.maxDesiredSnapshotsDefaultPercentage;
    }


    public void setMaxDesiredSnapshotsDefaultPercentage(int value) {
        this.maxDesiredSnapshotsDefaultPercentage = value;
    }


    public int getMaxGridCopiesPerGroup() {
        return this.maxGridCopiesPerGroup;
    }


    public void setMaxGridCopiesPerGroup(int value) {
        this.maxGridCopiesPerGroup = value;
    }


    public int getMaxGridGroups() {
        return this.maxGridGroups;
    }


    public void setMaxGridGroups(int value) {
        this.maxGridGroups = value;
    }


    public int getMaxGroups() {
        return this.maxGroups;
    }


    public void setMaxGroups(int value) {
        this.maxGroups = value;
    }


    public int getMaxNumberOfCGsInConsistentGroupSet() {
        return this.maxNumberOfCGsInConsistentGroupSet;
    }


    public void setMaxNumberOfCGsInConsistentGroupSet(int value) {
        this.maxNumberOfCGsInConsistentGroupSet = value;
    }


    public int getMaxNumberOfGroupSets() {
        return this.maxNumberOfGroupSets;
    }


    public void setMaxNumberOfGroupSets(int value) {
        this.maxNumberOfGroupSets = value;
    }


    public int getMaxPersistentSnapshots() {
        return this.maxPersistentSnapshots;
    }


    public void setMaxPersistentSnapshots(int value) {
        this.maxPersistentSnapshots = value;
    }


    public int getMaximumSplittersPerCluster() {
        return this.maximumSplittersPerCluster;
    }


    public void setMaximumSplittersPerCluster(int value) {
        this.maximumSplittersPerCluster = value;
    }


    public int getMgmtMaxActivityTime() {
        return this.mgmtMaxActivityTime;
    }


    public void setMgmtMaxActivityTime(int value) {
        this.mgmtMaxActivityTime = value;
    }


    public int getMgmtScaledMaxActivityTime() {
        return this.mgmtScaledMaxActivityTime;
    }


    public void setMgmtScaledMaxActivityTime(int value) {
        this.mgmtScaledMaxActivityTime = value;
    }


    public int getMinNumOfVolumesInScaledEnv() {
        return this.minNumOfVolumesInScaledEnv;
    }


    public void setMinNumOfVolumesInScaledEnv(int value) {
        this.minNumOfVolumesInScaledEnv = value;
    }


    public int getMinTSPPercentage() {
        return this.minTSPPercentage;
    }


    public void setMinTSPPercentage(int value) {
        this.minTSPPercentage = value;
    }


    public int getMinUnconsolidatedDuration() {
        return this.minUnconsolidatedDuration;
    }


    public void setMinUnconsolidatedDuration(int value) {
        this.minUnconsolidatedDuration = value;
    }


    public int getModelUpdaterFrequency() {
        return this.modelUpdaterFrequency;
    }


    public void setModelUpdaterFrequency(int value) {
        this.modelUpdaterFrequency = value;
    }


    public long getMonitorSplitterStateLease() {
        return this.monitorSplitterStateLease;
    }


    public void setMonitorSplitterStateLease(long value) {
        this.monitorSplitterStateLease = value;
    }


    public String getMultipleAppliancesString() {
        return this.multipleAppliancesString;
    }


    public void setMultipleAppliancesString(String value) {
        this.multipleAppliancesString = value;
    }


    public String getOem() {
        return this.oem;
    }


    public void setOem(String value) {
        this.oem = value;
    }


    public int getPeerStateUpdateInterval() {
        return this.peerStateUpdateInterval;
    }


    public void setPeerStateUpdateInterval(int value) {
        this.peerStateUpdateInterval = value;
    }


    public String getPhoenixSystemTM() {
        return this.phoenixSystemTM;
    }


    public void setPhoenixSystemTM(String value) {
        this.phoenixSystemTM = value;
    }


    public String getProduct() {
        return this.product;
    }


    public void setProduct(String value) {
        this.product = value;
    }


    public int getRootCausesStabilizationTime() {
        return this.rootCausesStabilizationTime;
    }


    public void setRootCausesStabilizationTime(int value) {
        this.rootCausesStabilizationTime = value;
    }


    public boolean isRpse() {
        return this.rpse;
    }


    public void setRpse(boolean value) {
        this.rpse = value;
    }


    public int getRpseSetGroupSettingsTimeForSingleOperation() {
        return this.rpseSetGroupSettingsTimeForSingleOperation;
    }


    public void setRpseSetGroupSettingsTimeForSingleOperation(int value) {
        this.rpseSetGroupSettingsTimeForSingleOperation = value;
    }


    public boolean isSimulator() {
        return this.simulator;
    }


    public void setSimulator(boolean value) {
        this.simulator = value;
    }


    public String getSingleApplianceString() {
        return this.singleApplianceString;
    }


    public void setSingleApplianceString(String value) {
        this.singleApplianceString = value;
    }


    public long getSnapshotConsolidationTimeAcceleration() {
        return this.snapshotConsolidationTimeAcceleration;
    }


    public void setSnapshotConsolidationTimeAcceleration(long value) {
        this.snapshotConsolidationTimeAcceleration = value;
    }


    public long getSnapshotUpdateInterval() {
        return this.snapshotUpdateInterval;
    }


    public void setSnapshotUpdateInterval(long value) {
        this.snapshotUpdateInterval = value;
    }


    public long getSplitterMonitorRPATimeout() {
        return this.splitterMonitorRPATimeout;
    }


    public void setSplitterMonitorRPATimeout(long value) {
        this.splitterMonitorRPATimeout = value;
    }


    public boolean isSyrSupported() {
        return this.syrSupported;
    }


    public void setSyrSupported(boolean value) {
        this.syrSupported = value;
    }


    public boolean isTrackInitInconsistency() {
        return this.trackInitInconsistency;
    }


    public void setTrackInitInconsistency(boolean value) {
        this.trackInitInconsistency = value;
    }


    public double getTspMemoryAlmostFullWaterMark() {
        return this.tspMemoryAlmostFullWaterMark;
    }


    public void setTspMemoryAlmostFullWaterMark(double value) {
        this.tspMemoryAlmostFullWaterMark = value;
    }


    public boolean isUsePWLOnWAN() {
        return this.usePWLOnWAN;
    }


    public void setUsePWLOnWAN(boolean value) {
        this.usePWLOnWAN = value;
    }


    public String getVersion() {
        return this.version;
    }


    public void setVersion(String value) {
        this.version = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SystemInternalConfigParams)) {
            return false;
        }
        SystemInternalConfigParams otherObj = (SystemInternalConfigParams) obj;

        return (this.additionToSyncLatency == otherObj.additionToSyncLatency) && (this.allowSettingsChangesDuringMaintenance == otherObj.allowSettingsChangesDuringMaintenance) && (this.clariionFirstSuffix != null ? this.clariionFirstSuffix.equals(otherObj.clariionFirstSuffix) : this.clariionFirstSuffix == otherObj.clariionFirstSuffix) && (this.clariionSecondSuffix != null ? this.clariionSecondSuffix.equals(otherObj.clariionSecondSuffix) : this.clariionSecondSuffix == otherObj.clariionSecondSuffix) && (this.companyName != null ? this.companyName.equals(otherObj.companyName) : this.companyName == otherObj.companyName) && (this.controlWriteTimeout == otherObj.controlWriteTimeout) && (this.daysPerMonth == otherObj.daysPerMonth) && (this.defaultDailyImages == otherObj.defaultDailyImages) && (this.defaultMonthlyImages == otherObj.defaultMonthlyImages) && (this.defaultResumeSyncBelowLatency == otherObj.defaultResumeSyncBelowLatency) && (this.defaultResumeSyncBelowThroughput == otherObj.defaultResumeSyncBelowThroughput) && (this.defaultSnapshotShippingIntervalInMinutes == otherObj.defaultSnapshotShippingIntervalInMinutes) && (this.defaultStartAsyncAboveLatency == otherObj.defaultStartAsyncAboveLatency) && (this.defaultStartAsyncAboveThroughput == otherObj.defaultStartAsyncAboveThroughput) && (this.defaultUnconsolidatedDuration == otherObj.defaultUnconsolidatedDuration) && (this.defaultWeeklyImages == otherObj.defaultWeeklyImages) && (this.displayCertificateExtensions == otherObj.displayCertificateExtensions) && (this.displayTrialVersion == otherObj.displayTrialVersion) && (this.dynamicDontMoveToSyncTime == otherObj.dynamicDontMoveToSyncTime) && (this.e14ServerName != null ? this.e14ServerName.equals(otherObj.e14ServerName) : this.e14ServerName == otherObj.e14ServerName) && (this.enableClariionVirtualWithRoll == otherObj.enableClariionVirtualWithRoll) && (this.eventLogsMaxNumberOfEntries == otherObj.eventLogsMaxNumberOfEntries) && (this.fcReplication == otherObj.fcReplication) && (this.flexFiltersRunIntervalInMinutes == otherObj.flexFiltersRunIntervalInMinutes) && (this.highestLatencyThreshold == otherObj.highestLatencyThreshold) && (this.highestThroughputThreshold == otherObj.highestThroughputThreshold) && (this.journalSizeLimitInGB == otherObj.journalSizeLimitInGB) && (this.lowestLatencyThreshold == otherObj.lowestLatencyThreshold) && (this.lowestThroughputThreshold == otherObj.lowestThroughputThreshold) && (this.maxAllowedSnapshots == otherObj.maxAllowedSnapshots) && (this.maxDesiredSnapshotsDefaultPercentage == otherObj.maxDesiredSnapshotsDefaultPercentage) && (this.maxGridCopiesPerGroup == otherObj.maxGridCopiesPerGroup) && (this.maxGridGroups == otherObj.maxGridGroups) && (this.maxGroups == otherObj.maxGroups) && (this.maxNumberOfCGsInConsistentGroupSet == otherObj.maxNumberOfCGsInConsistentGroupSet) && (this.maxNumberOfGroupSets == otherObj.maxNumberOfGroupSets) && (this.maxPersistentSnapshots == otherObj.maxPersistentSnapshots) && (this.maximumSplittersPerCluster == otherObj.maximumSplittersPerCluster) && (this.mgmtMaxActivityTime == otherObj.mgmtMaxActivityTime) && (this.mgmtScaledMaxActivityTime == otherObj.mgmtScaledMaxActivityTime) && (this.minNumOfVolumesInScaledEnv == otherObj.minNumOfVolumesInScaledEnv) && (this.minTSPPercentage == otherObj.minTSPPercentage) && (this.minUnconsolidatedDuration == otherObj.minUnconsolidatedDuration) && (this.modelUpdaterFrequency == otherObj.modelUpdaterFrequency) && (this.monitorSplitterStateLease == otherObj.monitorSplitterStateLease) && (this.multipleAppliancesString != null ? this.multipleAppliancesString.equals(otherObj.multipleAppliancesString) : this.multipleAppliancesString == otherObj.multipleAppliancesString) && (this.oem != null ? this.oem.equals(otherObj.oem) : this.oem == otherObj.oem) && (this.peerStateUpdateInterval == otherObj.peerStateUpdateInterval) && (this.phoenixSystemTM != null ? this.phoenixSystemTM.equals(otherObj.phoenixSystemTM) : this.phoenixSystemTM == otherObj.phoenixSystemTM) && (this.product != null ? this.product.equals(otherObj.product) : this.product == otherObj.product) && (this.rootCausesStabilizationTime == otherObj.rootCausesStabilizationTime) && (this.rpse == otherObj.rpse) && (this.rpseSetGroupSettingsTimeForSingleOperation == otherObj.rpseSetGroupSettingsTimeForSingleOperation) && (this.simulator == otherObj.simulator) && (this.singleApplianceString != null ? this.singleApplianceString.equals(otherObj.singleApplianceString) : this.singleApplianceString == otherObj.singleApplianceString) && (this.snapshotConsolidationTimeAcceleration == otherObj.snapshotConsolidationTimeAcceleration) && (this.snapshotUpdateInterval == otherObj.snapshotUpdateInterval) && (this.splitterMonitorRPATimeout == otherObj.splitterMonitorRPATimeout) && (this.syrSupported == otherObj.syrSupported) && (this.trackInitInconsistency == otherObj.trackInitInconsistency) && (this.tspMemoryAlmostFullWaterMark == otherObj.tspMemoryAlmostFullWaterMark) && (this.usePWLOnWAN == otherObj.usePWLOnWAN) && (this.version != null ? this.version.equals(otherObj.version) : this.version == otherObj.version);
    }


    public int hashCode() {
        return (int) this.additionToSyncLatency ^ (this.allowSettingsChangesDuringMaintenance ? 1 : 0) ^ (this.clariionFirstSuffix != null ? this.clariionFirstSuffix.hashCode() : 0) ^ (this.clariionSecondSuffix != null ? this.clariionSecondSuffix.hashCode() : 0) ^ (this.companyName != null ? this.companyName.hashCode() : 0) ^ (int) this.controlWriteTimeout ^ this.daysPerMonth ^ this.defaultDailyImages ^ this.defaultMonthlyImages ^ this.defaultResumeSyncBelowLatency ^ this.defaultResumeSyncBelowThroughput ^ this.defaultSnapshotShippingIntervalInMinutes ^ this.defaultStartAsyncAboveLatency ^ this.defaultStartAsyncAboveThroughput ^ this.defaultUnconsolidatedDuration ^ this.defaultWeeklyImages ^ (this.displayCertificateExtensions ? 1 : 0) ^ (this.displayTrialVersion ? 1 : 0) ^ (int) this.dynamicDontMoveToSyncTime ^ (this.e14ServerName != null ? this.e14ServerName.hashCode() : 0) ^ (this.enableClariionVirtualWithRoll ? 1 : 0) ^ (int) this.eventLogsMaxNumberOfEntries ^ (this.fcReplication ? 1 : 0) ^ this.flexFiltersRunIntervalInMinutes ^ this.highestLatencyThreshold ^ this.highestThroughputThreshold ^ (int) this.journalSizeLimitInGB ^ this.lowestLatencyThreshold ^ this.lowestThroughputThreshold ^ this.maxAllowedSnapshots ^ this.maxDesiredSnapshotsDefaultPercentage ^ this.maxGridCopiesPerGroup ^ this.maxGridGroups ^ this.maxGroups ^ this.maxNumberOfCGsInConsistentGroupSet ^ this.maxNumberOfGroupSets ^ this.maxPersistentSnapshots ^ this.maximumSplittersPerCluster ^ this.mgmtMaxActivityTime ^ this.mgmtScaledMaxActivityTime ^ this.minNumOfVolumesInScaledEnv ^ this.minTSPPercentage ^ this.minUnconsolidatedDuration ^ this.modelUpdaterFrequency ^ (int) this.monitorSplitterStateLease ^ (this.multipleAppliancesString != null ? this.multipleAppliancesString.hashCode() : 0) ^ (this.oem != null ? this.oem.hashCode() : 0) ^ this.peerStateUpdateInterval ^ (this.phoenixSystemTM != null ? this.phoenixSystemTM.hashCode() : 0) ^ (this.product != null ? this.product.hashCode() : 0) ^ this.rootCausesStabilizationTime ^ (this.rpse ? 1 : 0) ^ this.rpseSetGroupSettingsTimeForSingleOperation ^ (this.simulator ? 1 : 0) ^ (this.singleApplianceString != null ? this.singleApplianceString.hashCode() : 0) ^ (int) this.snapshotConsolidationTimeAcceleration ^ (int) this.snapshotUpdateInterval ^ (int) this.splitterMonitorRPATimeout ^ (this.syrSupported ? 1 : 0) ^ (this.trackInitInconsistency ? 1 : 0) ^ (int) this.tspMemoryAlmostFullWaterMark ^ (this.usePWLOnWAN ? 1 : 0) ^ (this.version != null ? this.version.hashCode() : 0);
    }


    public String toString() {
        return "SystemInternalConfigParams [additionToSyncLatency=" + this.additionToSyncLatency + ", " + "allowSettingsChangesDuringMaintenance=" + this.allowSettingsChangesDuringMaintenance + ", " + "clariionFirstSuffix=" + this.clariionFirstSuffix + ", " + "clariionSecondSuffix=" + this.clariionSecondSuffix + ", " + "companyName=" + this.companyName + ", " + "controlWriteTimeout=" + this.controlWriteTimeout + ", " + "daysPerMonth=" + this.daysPerMonth + ", " + "defaultDailyImages=" + this.defaultDailyImages + ", " + "defaultMonthlyImages=" + this.defaultMonthlyImages + ", " + "defaultResumeSyncBelowLatency=" + this.defaultResumeSyncBelowLatency + ", " + "defaultResumeSyncBelowThroughput=" + this.defaultResumeSyncBelowThroughput + ", " + "defaultSnapshotShippingIntervalInMinutes=" + this.defaultSnapshotShippingIntervalInMinutes + ", " + "defaultStartAsyncAboveLatency=" + this.defaultStartAsyncAboveLatency + ", " + "defaultStartAsyncAboveThroughput=" + this.defaultStartAsyncAboveThroughput + ", " + "defaultUnconsolidatedDuration=" + this.defaultUnconsolidatedDuration + ", " + "defaultWeeklyImages=" + this.defaultWeeklyImages + ", " + "displayCertificateExtensions=" + this.displayCertificateExtensions + ", " + "displayTrialVersion=" + this.displayTrialVersion + ", " + "dynamicDontMoveToSyncTime=" + this.dynamicDontMoveToSyncTime + ", " + "e14ServerName=" + this.e14ServerName + ", " + "enableClariionVirtualWithRoll=" + this.enableClariionVirtualWithRoll + ", " + "eventLogsMaxNumberOfEntries=" + this.eventLogsMaxNumberOfEntries + ", " + "fcReplication=" + this.fcReplication + ", " + "flexFiltersRunIntervalInMinutes=" + this.flexFiltersRunIntervalInMinutes + ", " + "highestLatencyThreshold=" + this.highestLatencyThreshold + ", " + "highestThroughputThreshold=" + this.highestThroughputThreshold + ", " + "journalSizeLimitInGB=" + this.journalSizeLimitInGB + ", " + "lowestLatencyThreshold=" + this.lowestLatencyThreshold + ", " + "lowestThroughputThreshold=" + this.lowestThroughputThreshold + ", " + "maxAllowedSnapshots=" + this.maxAllowedSnapshots + ", " + "maxDesiredSnapshotsDefaultPercentage=" + this.maxDesiredSnapshotsDefaultPercentage + ", " + "maxGridCopiesPerGroup=" + this.maxGridCopiesPerGroup + ", " + "maxGridGroups=" + this.maxGridGroups + ", " + "maxGroups=" + this.maxGroups + ", " + "maxNumberOfCGsInConsistentGroupSet=" + this.maxNumberOfCGsInConsistentGroupSet + ", " + "maxNumberOfGroupSets=" + this.maxNumberOfGroupSets + ", " + "maxPersistentSnapshots=" + this.maxPersistentSnapshots + ", " + "maximumSplittersPerCluster=" + this.maximumSplittersPerCluster + ", " + "mgmtMaxActivityTime=" + this.mgmtMaxActivityTime + ", " + "mgmtScaledMaxActivityTime=" + this.mgmtScaledMaxActivityTime + ", " + "minNumOfVolumesInScaledEnv=" + this.minNumOfVolumesInScaledEnv + ", " + "minTSPPercentage=" + this.minTSPPercentage + ", " + "minUnconsolidatedDuration=" + this.minUnconsolidatedDuration + ", " + "modelUpdaterFrequency=" + this.modelUpdaterFrequency + ", " + "monitorSplitterStateLease=" + this.monitorSplitterStateLease + ", " + "multipleAppliancesString=" + this.multipleAppliancesString + ", " + "oem=" + this.oem + ", " + "peerStateUpdateInterval=" + this.peerStateUpdateInterval + ", " + "phoenixSystemTM=" + this.phoenixSystemTM + ", " + "product=" + this.product + ", " + "rootCausesStabilizationTime=" + this.rootCausesStabilizationTime + ", " + "rpse=" + this.rpse + ", " + "rpseSetGroupSettingsTimeForSingleOperation=" + this.rpseSetGroupSettingsTimeForSingleOperation + ", " + "simulator=" + this.simulator + ", " + "singleApplianceString=" + this.singleApplianceString + ", " + "snapshotConsolidationTimeAcceleration=" + this.snapshotConsolidationTimeAcceleration + ", " + "snapshotUpdateInterval=" + this.snapshotUpdateInterval + ", " + "splitterMonitorRPATimeout=" + this.splitterMonitorRPATimeout + ", " + "syrSupported=" + this.syrSupported + ", " + "trackInitInconsistency=" + this.trackInitInconsistency + ", " + "tspMemoryAlmostFullWaterMark=" + this.tspMemoryAlmostFullWaterMark + ", " + "usePWLOnWAN=" + this.usePWLOnWAN + ", " + "version=" + this.version + "]";
    }
}


