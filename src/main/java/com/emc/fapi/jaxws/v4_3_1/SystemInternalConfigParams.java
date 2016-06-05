/*      */ package com.emc.fapi.jaxws.v4_3_1;
/*      */ 
/*      */ import javax.xml.bind.annotation.XmlAccessType;
/*      */ import javax.xml.bind.annotation.XmlAccessorType;
/*      */ import javax.xml.bind.annotation.XmlType;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @XmlAccessorType(XmlAccessType.FIELD)
/*      */ @XmlType(name="SystemInternalConfigParams", propOrder={"additionToSyncLatency", "allowSettingsChangesDuringMaintenance", "clariionFirstSuffix", "clariionSecondSuffix", "companyName", "controlWriteTimeout", "daysPerMonth", "defaultDailyImages", "defaultMonthlyImages", "defaultResumeSyncBelowLatency", "defaultResumeSyncBelowThroughput", "defaultSnapshotShippingIntervalInMinutes", "defaultStartAsyncAboveLatency", "defaultStartAsyncAboveThroughput", "defaultUnconsolidatedDuration", "defaultWeeklyImages", "displayCertificateExtensions", "displayTrialVersion", "dynamicDontMoveToSyncTime", "e14ServerName", "enableClariionVirtualWithRoll", "eventLogsMaxNumberOfEntries", "fcReplication", "flexFiltersRunIntervalInMinutes", "highestLatencyThreshold", "highestThroughputThreshold", "journalSizeLimitInGB", "lowestLatencyThreshold", "lowestThroughputThreshold", "maxAllowedSnapshots", "maxDesiredSnapshotsDefaultPercentage", "maxGridCopiesPerGroup", "maxGridGroups", "maxGroups", "maxNumberOfCGsInConsistentGroupSet", "maxNumberOfGroupSets", "maxPersistentSnapshots", "maximumSplittersPerCluster", "mgmtMaxActivityTime", "mgmtScaledMaxActivityTime", "minNumOfVolumesInScaledEnv", "minTSPPercentage", "minUnconsolidatedDuration", "modelUpdaterFrequency", "monitorSplitterStateLease", "multipleAppliancesString", "oem", "peerStateUpdateInterval", "phoenixSystemTM", "product", "rootCausesStabilizationTime", "rpse", "rpseSetGroupSettingsTimeForSingleOperation", "simulator", "singleApplianceString", "snapshotConsolidationTimeAcceleration", "snapshotUpdateInterval", "splitterMonitorRPATimeout", "syrSupported", "trackInitInconsistency", "tspMemoryAlmostFullWaterMark", "usePWLOnWAN", "version"})
/*      */ public class SystemInternalConfigParams
/*      */ {
/*      */   protected long additionToSyncLatency;
/*      */   protected boolean allowSettingsChangesDuringMaintenance;
/*      */   protected String clariionFirstSuffix;
/*      */   protected String clariionSecondSuffix;
/*      */   protected String companyName;
/*      */   protected long controlWriteTimeout;
/*      */   protected int daysPerMonth;
/*      */   protected int defaultDailyImages;
/*      */   protected int defaultMonthlyImages;
/*      */   protected int defaultResumeSyncBelowLatency;
/*      */   protected int defaultResumeSyncBelowThroughput;
/*      */   protected int defaultSnapshotShippingIntervalInMinutes;
/*      */   protected int defaultStartAsyncAboveLatency;
/*      */   protected int defaultStartAsyncAboveThroughput;
/*      */   protected int defaultUnconsolidatedDuration;
/*      */   protected int defaultWeeklyImages;
/*      */   protected boolean displayCertificateExtensions;
/*      */   protected boolean displayTrialVersion;
/*      */   protected long dynamicDontMoveToSyncTime;
/*      */   protected String e14ServerName;
/*      */   protected boolean enableClariionVirtualWithRoll;
/*      */   protected long eventLogsMaxNumberOfEntries;
/*      */   protected boolean fcReplication;
/*      */   protected int flexFiltersRunIntervalInMinutes;
/*      */   protected int highestLatencyThreshold;
/*      */   protected int highestThroughputThreshold;
/*      */   protected long journalSizeLimitInGB;
/*      */   protected int lowestLatencyThreshold;
/*      */   protected int lowestThroughputThreshold;
/*      */   protected int maxAllowedSnapshots;
/*      */   protected int maxDesiredSnapshotsDefaultPercentage;
/*      */   protected int maxGridCopiesPerGroup;
/*      */   protected int maxGridGroups;
/*      */   protected int maxGroups;
/*      */   protected int maxNumberOfCGsInConsistentGroupSet;
/*      */   protected int maxNumberOfGroupSets;
/*      */   protected int maxPersistentSnapshots;
/*      */   protected int maximumSplittersPerCluster;
/*      */   protected int mgmtMaxActivityTime;
/*      */   protected int mgmtScaledMaxActivityTime;
/*      */   protected int minNumOfVolumesInScaledEnv;
/*      */   protected int minTSPPercentage;
/*      */   protected int minUnconsolidatedDuration;
/*      */   protected int modelUpdaterFrequency;
/*      */   protected long monitorSplitterStateLease;
/*      */   protected String multipleAppliancesString;
/*      */   protected String oem;
/*      */   protected int peerStateUpdateInterval;
/*      */   protected String phoenixSystemTM;
/*      */   protected String product;
/*      */   protected int rootCausesStabilizationTime;
/*      */   protected boolean rpse;
/*      */   protected int rpseSetGroupSettingsTimeForSingleOperation;
/*      */   protected boolean simulator;
/*      */   protected String singleApplianceString;
/*      */   protected long snapshotConsolidationTimeAcceleration;
/*      */   protected long snapshotUpdateInterval;
/*      */   protected long splitterMonitorRPATimeout;
/*      */   protected boolean syrSupported;
/*      */   protected boolean trackInitInconsistency;
/*      */   protected double tspMemoryAlmostFullWaterMark;
/*      */   protected boolean usePWLOnWAN;
/*      */   protected String version;
/*      */   
/*      */   public SystemInternalConfigParams() {}
/*      */   
/*      */   public SystemInternalConfigParams(long additionToSyncLatency, boolean allowSettingsChangesDuringMaintenance, String clariionFirstSuffix, String clariionSecondSuffix, String companyName, long controlWriteTimeout, int daysPerMonth, int defaultDailyImages, int defaultMonthlyImages, int defaultResumeSyncBelowLatency, int defaultResumeSyncBelowThroughput, int defaultSnapshotShippingIntervalInMinutes, int defaultStartAsyncAboveLatency, int defaultStartAsyncAboveThroughput, int defaultUnconsolidatedDuration, int defaultWeeklyImages, boolean displayCertificateExtensions, boolean displayTrialVersion, long dynamicDontMoveToSyncTime, String e14ServerName, boolean enableClariionVirtualWithRoll, long eventLogsMaxNumberOfEntries, boolean fcReplication, int flexFiltersRunIntervalInMinutes, int highestLatencyThreshold, int highestThroughputThreshold, long journalSizeLimitInGB, int lowestLatencyThreshold, int lowestThroughputThreshold, int maxAllowedSnapshots, int maxDesiredSnapshotsDefaultPercentage, int maxGridCopiesPerGroup, int maxGridGroups, int maxGroups, int maxNumberOfCGsInConsistentGroupSet, int maxNumberOfGroupSets, int maxPersistentSnapshots, int maximumSplittersPerCluster, int mgmtMaxActivityTime, int mgmtScaledMaxActivityTime, int minNumOfVolumesInScaledEnv, int minTSPPercentage, int minUnconsolidatedDuration, int modelUpdaterFrequency, long monitorSplitterStateLease, String multipleAppliancesString, String oem, int peerStateUpdateInterval, String phoenixSystemTM, String product, int rootCausesStabilizationTime, boolean rpse, int rpseSetGroupSettingsTimeForSingleOperation, boolean simulator, String singleApplianceString, long snapshotConsolidationTimeAcceleration, long snapshotUpdateInterval, long splitterMonitorRPATimeout, boolean syrSupported, boolean trackInitInconsistency, double tspMemoryAlmostFullWaterMark, boolean usePWLOnWAN, String version)
/*      */   {
/*  230 */     this.additionToSyncLatency = additionToSyncLatency;
/*  231 */     this.allowSettingsChangesDuringMaintenance = allowSettingsChangesDuringMaintenance;
/*  232 */     this.clariionFirstSuffix = clariionFirstSuffix;
/*  233 */     this.clariionSecondSuffix = clariionSecondSuffix;
/*  234 */     this.companyName = companyName;
/*  235 */     this.controlWriteTimeout = controlWriteTimeout;
/*  236 */     this.daysPerMonth = daysPerMonth;
/*  237 */     this.defaultDailyImages = defaultDailyImages;
/*  238 */     this.defaultMonthlyImages = defaultMonthlyImages;
/*  239 */     this.defaultResumeSyncBelowLatency = defaultResumeSyncBelowLatency;
/*  240 */     this.defaultResumeSyncBelowThroughput = defaultResumeSyncBelowThroughput;
/*  241 */     this.defaultSnapshotShippingIntervalInMinutes = defaultSnapshotShippingIntervalInMinutes;
/*  242 */     this.defaultStartAsyncAboveLatency = defaultStartAsyncAboveLatency;
/*  243 */     this.defaultStartAsyncAboveThroughput = defaultStartAsyncAboveThroughput;
/*  244 */     this.defaultUnconsolidatedDuration = defaultUnconsolidatedDuration;
/*  245 */     this.defaultWeeklyImages = defaultWeeklyImages;
/*  246 */     this.displayCertificateExtensions = displayCertificateExtensions;
/*  247 */     this.displayTrialVersion = displayTrialVersion;
/*  248 */     this.dynamicDontMoveToSyncTime = dynamicDontMoveToSyncTime;
/*  249 */     this.e14ServerName = e14ServerName;
/*  250 */     this.enableClariionVirtualWithRoll = enableClariionVirtualWithRoll;
/*  251 */     this.eventLogsMaxNumberOfEntries = eventLogsMaxNumberOfEntries;
/*  252 */     this.fcReplication = fcReplication;
/*  253 */     this.flexFiltersRunIntervalInMinutes = flexFiltersRunIntervalInMinutes;
/*  254 */     this.highestLatencyThreshold = highestLatencyThreshold;
/*  255 */     this.highestThroughputThreshold = highestThroughputThreshold;
/*  256 */     this.journalSizeLimitInGB = journalSizeLimitInGB;
/*  257 */     this.lowestLatencyThreshold = lowestLatencyThreshold;
/*  258 */     this.lowestThroughputThreshold = lowestThroughputThreshold;
/*  259 */     this.maxAllowedSnapshots = maxAllowedSnapshots;
/*  260 */     this.maxDesiredSnapshotsDefaultPercentage = maxDesiredSnapshotsDefaultPercentage;
/*  261 */     this.maxGridCopiesPerGroup = maxGridCopiesPerGroup;
/*  262 */     this.maxGridGroups = maxGridGroups;
/*  263 */     this.maxGroups = maxGroups;
/*  264 */     this.maxNumberOfCGsInConsistentGroupSet = maxNumberOfCGsInConsistentGroupSet;
/*  265 */     this.maxNumberOfGroupSets = maxNumberOfGroupSets;
/*  266 */     this.maxPersistentSnapshots = maxPersistentSnapshots;
/*  267 */     this.maximumSplittersPerCluster = maximumSplittersPerCluster;
/*  268 */     this.mgmtMaxActivityTime = mgmtMaxActivityTime;
/*  269 */     this.mgmtScaledMaxActivityTime = mgmtScaledMaxActivityTime;
/*  270 */     this.minNumOfVolumesInScaledEnv = minNumOfVolumesInScaledEnv;
/*  271 */     this.minTSPPercentage = minTSPPercentage;
/*  272 */     this.minUnconsolidatedDuration = minUnconsolidatedDuration;
/*  273 */     this.modelUpdaterFrequency = modelUpdaterFrequency;
/*  274 */     this.monitorSplitterStateLease = monitorSplitterStateLease;
/*  275 */     this.multipleAppliancesString = multipleAppliancesString;
/*  276 */     this.oem = oem;
/*  277 */     this.peerStateUpdateInterval = peerStateUpdateInterval;
/*  278 */     this.phoenixSystemTM = phoenixSystemTM;
/*  279 */     this.product = product;
/*  280 */     this.rootCausesStabilizationTime = rootCausesStabilizationTime;
/*  281 */     this.rpse = rpse;
/*  282 */     this.rpseSetGroupSettingsTimeForSingleOperation = rpseSetGroupSettingsTimeForSingleOperation;
/*  283 */     this.simulator = simulator;
/*  284 */     this.singleApplianceString = singleApplianceString;
/*  285 */     this.snapshotConsolidationTimeAcceleration = snapshotConsolidationTimeAcceleration;
/*  286 */     this.snapshotUpdateInterval = snapshotUpdateInterval;
/*  287 */     this.splitterMonitorRPATimeout = splitterMonitorRPATimeout;
/*  288 */     this.syrSupported = syrSupported;
/*  289 */     this.trackInitInconsistency = trackInitInconsistency;
/*  290 */     this.tspMemoryAlmostFullWaterMark = tspMemoryAlmostFullWaterMark;
/*  291 */     this.usePWLOnWAN = usePWLOnWAN;
/*  292 */     this.version = version;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public long getAdditionToSyncLatency()
/*      */   {
/*  300 */     return this.additionToSyncLatency;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setAdditionToSyncLatency(long value)
/*      */   {
/*  308 */     this.additionToSyncLatency = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean isAllowSettingsChangesDuringMaintenance()
/*      */   {
/*  316 */     return this.allowSettingsChangesDuringMaintenance;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setAllowSettingsChangesDuringMaintenance(boolean value)
/*      */   {
/*  324 */     this.allowSettingsChangesDuringMaintenance = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String getClariionFirstSuffix()
/*      */   {
/*  336 */     return this.clariionFirstSuffix;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setClariionFirstSuffix(String value)
/*      */   {
/*  348 */     this.clariionFirstSuffix = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String getClariionSecondSuffix()
/*      */   {
/*  360 */     return this.clariionSecondSuffix;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setClariionSecondSuffix(String value)
/*      */   {
/*  372 */     this.clariionSecondSuffix = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String getCompanyName()
/*      */   {
/*  384 */     return this.companyName;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setCompanyName(String value)
/*      */   {
/*  396 */     this.companyName = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public long getControlWriteTimeout()
/*      */   {
/*  404 */     return this.controlWriteTimeout;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setControlWriteTimeout(long value)
/*      */   {
/*  412 */     this.controlWriteTimeout = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getDaysPerMonth()
/*      */   {
/*  420 */     return this.daysPerMonth;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setDaysPerMonth(int value)
/*      */   {
/*  428 */     this.daysPerMonth = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getDefaultDailyImages()
/*      */   {
/*  436 */     return this.defaultDailyImages;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setDefaultDailyImages(int value)
/*      */   {
/*  444 */     this.defaultDailyImages = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getDefaultMonthlyImages()
/*      */   {
/*  452 */     return this.defaultMonthlyImages;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setDefaultMonthlyImages(int value)
/*      */   {
/*  460 */     this.defaultMonthlyImages = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getDefaultResumeSyncBelowLatency()
/*      */   {
/*  468 */     return this.defaultResumeSyncBelowLatency;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setDefaultResumeSyncBelowLatency(int value)
/*      */   {
/*  476 */     this.defaultResumeSyncBelowLatency = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getDefaultResumeSyncBelowThroughput()
/*      */   {
/*  484 */     return this.defaultResumeSyncBelowThroughput;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setDefaultResumeSyncBelowThroughput(int value)
/*      */   {
/*  492 */     this.defaultResumeSyncBelowThroughput = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getDefaultSnapshotShippingIntervalInMinutes()
/*      */   {
/*  500 */     return this.defaultSnapshotShippingIntervalInMinutes;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setDefaultSnapshotShippingIntervalInMinutes(int value)
/*      */   {
/*  508 */     this.defaultSnapshotShippingIntervalInMinutes = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getDefaultStartAsyncAboveLatency()
/*      */   {
/*  516 */     return this.defaultStartAsyncAboveLatency;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setDefaultStartAsyncAboveLatency(int value)
/*      */   {
/*  524 */     this.defaultStartAsyncAboveLatency = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getDefaultStartAsyncAboveThroughput()
/*      */   {
/*  532 */     return this.defaultStartAsyncAboveThroughput;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setDefaultStartAsyncAboveThroughput(int value)
/*      */   {
/*  540 */     this.defaultStartAsyncAboveThroughput = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getDefaultUnconsolidatedDuration()
/*      */   {
/*  548 */     return this.defaultUnconsolidatedDuration;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setDefaultUnconsolidatedDuration(int value)
/*      */   {
/*  556 */     this.defaultUnconsolidatedDuration = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getDefaultWeeklyImages()
/*      */   {
/*  564 */     return this.defaultWeeklyImages;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setDefaultWeeklyImages(int value)
/*      */   {
/*  572 */     this.defaultWeeklyImages = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean isDisplayCertificateExtensions()
/*      */   {
/*  580 */     return this.displayCertificateExtensions;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setDisplayCertificateExtensions(boolean value)
/*      */   {
/*  588 */     this.displayCertificateExtensions = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean isDisplayTrialVersion()
/*      */   {
/*  596 */     return this.displayTrialVersion;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setDisplayTrialVersion(boolean value)
/*      */   {
/*  604 */     this.displayTrialVersion = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public long getDynamicDontMoveToSyncTime()
/*      */   {
/*  612 */     return this.dynamicDontMoveToSyncTime;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setDynamicDontMoveToSyncTime(long value)
/*      */   {
/*  620 */     this.dynamicDontMoveToSyncTime = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String getE14ServerName()
/*      */   {
/*  632 */     return this.e14ServerName;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setE14ServerName(String value)
/*      */   {
/*  644 */     this.e14ServerName = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean isEnableClariionVirtualWithRoll()
/*      */   {
/*  652 */     return this.enableClariionVirtualWithRoll;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setEnableClariionVirtualWithRoll(boolean value)
/*      */   {
/*  660 */     this.enableClariionVirtualWithRoll = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public long getEventLogsMaxNumberOfEntries()
/*      */   {
/*  668 */     return this.eventLogsMaxNumberOfEntries;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setEventLogsMaxNumberOfEntries(long value)
/*      */   {
/*  676 */     this.eventLogsMaxNumberOfEntries = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean isFcReplication()
/*      */   {
/*  684 */     return this.fcReplication;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setFcReplication(boolean value)
/*      */   {
/*  692 */     this.fcReplication = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getFlexFiltersRunIntervalInMinutes()
/*      */   {
/*  700 */     return this.flexFiltersRunIntervalInMinutes;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setFlexFiltersRunIntervalInMinutes(int value)
/*      */   {
/*  708 */     this.flexFiltersRunIntervalInMinutes = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getHighestLatencyThreshold()
/*      */   {
/*  716 */     return this.highestLatencyThreshold;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setHighestLatencyThreshold(int value)
/*      */   {
/*  724 */     this.highestLatencyThreshold = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getHighestThroughputThreshold()
/*      */   {
/*  732 */     return this.highestThroughputThreshold;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setHighestThroughputThreshold(int value)
/*      */   {
/*  740 */     this.highestThroughputThreshold = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public long getJournalSizeLimitInGB()
/*      */   {
/*  748 */     return this.journalSizeLimitInGB;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setJournalSizeLimitInGB(long value)
/*      */   {
/*  756 */     this.journalSizeLimitInGB = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getLowestLatencyThreshold()
/*      */   {
/*  764 */     return this.lowestLatencyThreshold;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setLowestLatencyThreshold(int value)
/*      */   {
/*  772 */     this.lowestLatencyThreshold = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getLowestThroughputThreshold()
/*      */   {
/*  780 */     return this.lowestThroughputThreshold;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setLowestThroughputThreshold(int value)
/*      */   {
/*  788 */     this.lowestThroughputThreshold = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getMaxAllowedSnapshots()
/*      */   {
/*  796 */     return this.maxAllowedSnapshots;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setMaxAllowedSnapshots(int value)
/*      */   {
/*  804 */     this.maxAllowedSnapshots = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getMaxDesiredSnapshotsDefaultPercentage()
/*      */   {
/*  812 */     return this.maxDesiredSnapshotsDefaultPercentage;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setMaxDesiredSnapshotsDefaultPercentage(int value)
/*      */   {
/*  820 */     this.maxDesiredSnapshotsDefaultPercentage = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getMaxGridCopiesPerGroup()
/*      */   {
/*  828 */     return this.maxGridCopiesPerGroup;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setMaxGridCopiesPerGroup(int value)
/*      */   {
/*  836 */     this.maxGridCopiesPerGroup = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getMaxGridGroups()
/*      */   {
/*  844 */     return this.maxGridGroups;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setMaxGridGroups(int value)
/*      */   {
/*  852 */     this.maxGridGroups = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getMaxGroups()
/*      */   {
/*  860 */     return this.maxGroups;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setMaxGroups(int value)
/*      */   {
/*  868 */     this.maxGroups = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getMaxNumberOfCGsInConsistentGroupSet()
/*      */   {
/*  876 */     return this.maxNumberOfCGsInConsistentGroupSet;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setMaxNumberOfCGsInConsistentGroupSet(int value)
/*      */   {
/*  884 */     this.maxNumberOfCGsInConsistentGroupSet = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getMaxNumberOfGroupSets()
/*      */   {
/*  892 */     return this.maxNumberOfGroupSets;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setMaxNumberOfGroupSets(int value)
/*      */   {
/*  900 */     this.maxNumberOfGroupSets = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getMaxPersistentSnapshots()
/*      */   {
/*  908 */     return this.maxPersistentSnapshots;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setMaxPersistentSnapshots(int value)
/*      */   {
/*  916 */     this.maxPersistentSnapshots = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getMaximumSplittersPerCluster()
/*      */   {
/*  924 */     return this.maximumSplittersPerCluster;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setMaximumSplittersPerCluster(int value)
/*      */   {
/*  932 */     this.maximumSplittersPerCluster = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getMgmtMaxActivityTime()
/*      */   {
/*  940 */     return this.mgmtMaxActivityTime;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setMgmtMaxActivityTime(int value)
/*      */   {
/*  948 */     this.mgmtMaxActivityTime = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getMgmtScaledMaxActivityTime()
/*      */   {
/*  956 */     return this.mgmtScaledMaxActivityTime;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setMgmtScaledMaxActivityTime(int value)
/*      */   {
/*  964 */     this.mgmtScaledMaxActivityTime = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getMinNumOfVolumesInScaledEnv()
/*      */   {
/*  972 */     return this.minNumOfVolumesInScaledEnv;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setMinNumOfVolumesInScaledEnv(int value)
/*      */   {
/*  980 */     this.minNumOfVolumesInScaledEnv = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getMinTSPPercentage()
/*      */   {
/*  988 */     return this.minTSPPercentage;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setMinTSPPercentage(int value)
/*      */   {
/*  996 */     this.minTSPPercentage = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getMinUnconsolidatedDuration()
/*      */   {
/* 1004 */     return this.minUnconsolidatedDuration;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setMinUnconsolidatedDuration(int value)
/*      */   {
/* 1012 */     this.minUnconsolidatedDuration = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getModelUpdaterFrequency()
/*      */   {
/* 1020 */     return this.modelUpdaterFrequency;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setModelUpdaterFrequency(int value)
/*      */   {
/* 1028 */     this.modelUpdaterFrequency = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public long getMonitorSplitterStateLease()
/*      */   {
/* 1036 */     return this.monitorSplitterStateLease;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setMonitorSplitterStateLease(long value)
/*      */   {
/* 1044 */     this.monitorSplitterStateLease = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String getMultipleAppliancesString()
/*      */   {
/* 1056 */     return this.multipleAppliancesString;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setMultipleAppliancesString(String value)
/*      */   {
/* 1068 */     this.multipleAppliancesString = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String getOem()
/*      */   {
/* 1080 */     return this.oem;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setOem(String value)
/*      */   {
/* 1092 */     this.oem = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getPeerStateUpdateInterval()
/*      */   {
/* 1100 */     return this.peerStateUpdateInterval;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setPeerStateUpdateInterval(int value)
/*      */   {
/* 1108 */     this.peerStateUpdateInterval = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String getPhoenixSystemTM()
/*      */   {
/* 1120 */     return this.phoenixSystemTM;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setPhoenixSystemTM(String value)
/*      */   {
/* 1132 */     this.phoenixSystemTM = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String getProduct()
/*      */   {
/* 1144 */     return this.product;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setProduct(String value)
/*      */   {
/* 1156 */     this.product = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getRootCausesStabilizationTime()
/*      */   {
/* 1164 */     return this.rootCausesStabilizationTime;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setRootCausesStabilizationTime(int value)
/*      */   {
/* 1172 */     this.rootCausesStabilizationTime = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean isRpse()
/*      */   {
/* 1180 */     return this.rpse;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setRpse(boolean value)
/*      */   {
/* 1188 */     this.rpse = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getRpseSetGroupSettingsTimeForSingleOperation()
/*      */   {
/* 1196 */     return this.rpseSetGroupSettingsTimeForSingleOperation;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setRpseSetGroupSettingsTimeForSingleOperation(int value)
/*      */   {
/* 1204 */     this.rpseSetGroupSettingsTimeForSingleOperation = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean isSimulator()
/*      */   {
/* 1212 */     return this.simulator;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setSimulator(boolean value)
/*      */   {
/* 1220 */     this.simulator = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String getSingleApplianceString()
/*      */   {
/* 1232 */     return this.singleApplianceString;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setSingleApplianceString(String value)
/*      */   {
/* 1244 */     this.singleApplianceString = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public long getSnapshotConsolidationTimeAcceleration()
/*      */   {
/* 1252 */     return this.snapshotConsolidationTimeAcceleration;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setSnapshotConsolidationTimeAcceleration(long value)
/*      */   {
/* 1260 */     this.snapshotConsolidationTimeAcceleration = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public long getSnapshotUpdateInterval()
/*      */   {
/* 1268 */     return this.snapshotUpdateInterval;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setSnapshotUpdateInterval(long value)
/*      */   {
/* 1276 */     this.snapshotUpdateInterval = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public long getSplitterMonitorRPATimeout()
/*      */   {
/* 1284 */     return this.splitterMonitorRPATimeout;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setSplitterMonitorRPATimeout(long value)
/*      */   {
/* 1292 */     this.splitterMonitorRPATimeout = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean isSyrSupported()
/*      */   {
/* 1300 */     return this.syrSupported;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setSyrSupported(boolean value)
/*      */   {
/* 1308 */     this.syrSupported = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean isTrackInitInconsistency()
/*      */   {
/* 1316 */     return this.trackInitInconsistency;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setTrackInitInconsistency(boolean value)
/*      */   {
/* 1324 */     this.trackInitInconsistency = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public double getTspMemoryAlmostFullWaterMark()
/*      */   {
/* 1332 */     return this.tspMemoryAlmostFullWaterMark;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setTspMemoryAlmostFullWaterMark(double value)
/*      */   {
/* 1340 */     this.tspMemoryAlmostFullWaterMark = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean isUsePWLOnWAN()
/*      */   {
/* 1348 */     return this.usePWLOnWAN;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setUsePWLOnWAN(boolean value)
/*      */   {
/* 1356 */     this.usePWLOnWAN = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String getVersion()
/*      */   {
/* 1368 */     return this.version;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setVersion(String value)
/*      */   {
/* 1380 */     this.version = value;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean equals(Object obj)
/*      */   {
/* 1390 */     if (!(obj instanceof SystemInternalConfigParams)) {
/* 1391 */       return false;
/*      */     }
/* 1393 */     SystemInternalConfigParams otherObj = (SystemInternalConfigParams)obj;
/*      */     
/* 1395 */     return (this.additionToSyncLatency == otherObj.additionToSyncLatency) && (this.allowSettingsChangesDuringMaintenance == otherObj.allowSettingsChangesDuringMaintenance) && (this.clariionFirstSuffix != null ? this.clariionFirstSuffix.equals(otherObj.clariionFirstSuffix) : this.clariionFirstSuffix == otherObj.clariionFirstSuffix) && (this.clariionSecondSuffix != null ? this.clariionSecondSuffix.equals(otherObj.clariionSecondSuffix) : this.clariionSecondSuffix == otherObj.clariionSecondSuffix) && (this.companyName != null ? this.companyName.equals(otherObj.companyName) : this.companyName == otherObj.companyName) && (this.controlWriteTimeout == otherObj.controlWriteTimeout) && (this.daysPerMonth == otherObj.daysPerMonth) && (this.defaultDailyImages == otherObj.defaultDailyImages) && (this.defaultMonthlyImages == otherObj.defaultMonthlyImages) && (this.defaultResumeSyncBelowLatency == otherObj.defaultResumeSyncBelowLatency) && (this.defaultResumeSyncBelowThroughput == otherObj.defaultResumeSyncBelowThroughput) && (this.defaultSnapshotShippingIntervalInMinutes == otherObj.defaultSnapshotShippingIntervalInMinutes) && (this.defaultStartAsyncAboveLatency == otherObj.defaultStartAsyncAboveLatency) && (this.defaultStartAsyncAboveThroughput == otherObj.defaultStartAsyncAboveThroughput) && (this.defaultUnconsolidatedDuration == otherObj.defaultUnconsolidatedDuration) && (this.defaultWeeklyImages == otherObj.defaultWeeklyImages) && (this.displayCertificateExtensions == otherObj.displayCertificateExtensions) && (this.displayTrialVersion == otherObj.displayTrialVersion) && (this.dynamicDontMoveToSyncTime == otherObj.dynamicDontMoveToSyncTime) && (this.e14ServerName != null ? this.e14ServerName.equals(otherObj.e14ServerName) : this.e14ServerName == otherObj.e14ServerName) && (this.enableClariionVirtualWithRoll == otherObj.enableClariionVirtualWithRoll) && (this.eventLogsMaxNumberOfEntries == otherObj.eventLogsMaxNumberOfEntries) && (this.fcReplication == otherObj.fcReplication) && (this.flexFiltersRunIntervalInMinutes == otherObj.flexFiltersRunIntervalInMinutes) && (this.highestLatencyThreshold == otherObj.highestLatencyThreshold) && (this.highestThroughputThreshold == otherObj.highestThroughputThreshold) && (this.journalSizeLimitInGB == otherObj.journalSizeLimitInGB) && (this.lowestLatencyThreshold == otherObj.lowestLatencyThreshold) && (this.lowestThroughputThreshold == otherObj.lowestThroughputThreshold) && (this.maxAllowedSnapshots == otherObj.maxAllowedSnapshots) && (this.maxDesiredSnapshotsDefaultPercentage == otherObj.maxDesiredSnapshotsDefaultPercentage) && (this.maxGridCopiesPerGroup == otherObj.maxGridCopiesPerGroup) && (this.maxGridGroups == otherObj.maxGridGroups) && (this.maxGroups == otherObj.maxGroups) && (this.maxNumberOfCGsInConsistentGroupSet == otherObj.maxNumberOfCGsInConsistentGroupSet) && (this.maxNumberOfGroupSets == otherObj.maxNumberOfGroupSets) && (this.maxPersistentSnapshots == otherObj.maxPersistentSnapshots) && (this.maximumSplittersPerCluster == otherObj.maximumSplittersPerCluster) && (this.mgmtMaxActivityTime == otherObj.mgmtMaxActivityTime) && (this.mgmtScaledMaxActivityTime == otherObj.mgmtScaledMaxActivityTime) && (this.minNumOfVolumesInScaledEnv == otherObj.minNumOfVolumesInScaledEnv) && (this.minTSPPercentage == otherObj.minTSPPercentage) && (this.minUnconsolidatedDuration == otherObj.minUnconsolidatedDuration) && (this.modelUpdaterFrequency == otherObj.modelUpdaterFrequency) && (this.monitorSplitterStateLease == otherObj.monitorSplitterStateLease) && (this.multipleAppliancesString != null ? this.multipleAppliancesString.equals(otherObj.multipleAppliancesString) : this.multipleAppliancesString == otherObj.multipleAppliancesString) && (this.oem != null ? this.oem.equals(otherObj.oem) : this.oem == otherObj.oem) && (this.peerStateUpdateInterval == otherObj.peerStateUpdateInterval) && (this.phoenixSystemTM != null ? this.phoenixSystemTM.equals(otherObj.phoenixSystemTM) : this.phoenixSystemTM == otherObj.phoenixSystemTM) && (this.product != null ? this.product.equals(otherObj.product) : this.product == otherObj.product) && (this.rootCausesStabilizationTime == otherObj.rootCausesStabilizationTime) && (this.rpse == otherObj.rpse) && (this.rpseSetGroupSettingsTimeForSingleOperation == otherObj.rpseSetGroupSettingsTimeForSingleOperation) && (this.simulator == otherObj.simulator) && (this.singleApplianceString != null ? this.singleApplianceString.equals(otherObj.singleApplianceString) : this.singleApplianceString == otherObj.singleApplianceString) && (this.snapshotConsolidationTimeAcceleration == otherObj.snapshotConsolidationTimeAcceleration) && (this.snapshotUpdateInterval == otherObj.snapshotUpdateInterval) && (this.splitterMonitorRPATimeout == otherObj.splitterMonitorRPATimeout) && (this.syrSupported == otherObj.syrSupported) && (this.trackInitInconsistency == otherObj.trackInitInconsistency) && (this.tspMemoryAlmostFullWaterMark == otherObj.tspMemoryAlmostFullWaterMark) && (this.usePWLOnWAN == otherObj.usePWLOnWAN) && (this.version != null ? this.version.equals(otherObj.version) : this.version == otherObj.version);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int hashCode()
/*      */   {
/* 1466 */     return (int)this.additionToSyncLatency ^ (this.allowSettingsChangesDuringMaintenance ? 1 : 0) ^ (this.clariionFirstSuffix != null ? this.clariionFirstSuffix.hashCode() : 0) ^ (this.clariionSecondSuffix != null ? this.clariionSecondSuffix.hashCode() : 0) ^ (this.companyName != null ? this.companyName.hashCode() : 0) ^ (int)this.controlWriteTimeout ^ this.daysPerMonth ^ this.defaultDailyImages ^ this.defaultMonthlyImages ^ this.defaultResumeSyncBelowLatency ^ this.defaultResumeSyncBelowThroughput ^ this.defaultSnapshotShippingIntervalInMinutes ^ this.defaultStartAsyncAboveLatency ^ this.defaultStartAsyncAboveThroughput ^ this.defaultUnconsolidatedDuration ^ this.defaultWeeklyImages ^ (this.displayCertificateExtensions ? 1 : 0) ^ (this.displayTrialVersion ? 1 : 0) ^ (int)this.dynamicDontMoveToSyncTime ^ (this.e14ServerName != null ? this.e14ServerName.hashCode() : 0) ^ (this.enableClariionVirtualWithRoll ? 1 : 0) ^ (int)this.eventLogsMaxNumberOfEntries ^ (this.fcReplication ? 1 : 0) ^ this.flexFiltersRunIntervalInMinutes ^ this.highestLatencyThreshold ^ this.highestThroughputThreshold ^ (int)this.journalSizeLimitInGB ^ this.lowestLatencyThreshold ^ this.lowestThroughputThreshold ^ this.maxAllowedSnapshots ^ this.maxDesiredSnapshotsDefaultPercentage ^ this.maxGridCopiesPerGroup ^ this.maxGridGroups ^ this.maxGroups ^ this.maxNumberOfCGsInConsistentGroupSet ^ this.maxNumberOfGroupSets ^ this.maxPersistentSnapshots ^ this.maximumSplittersPerCluster ^ this.mgmtMaxActivityTime ^ this.mgmtScaledMaxActivityTime ^ this.minNumOfVolumesInScaledEnv ^ this.minTSPPercentage ^ this.minUnconsolidatedDuration ^ this.modelUpdaterFrequency ^ (int)this.monitorSplitterStateLease ^ (this.multipleAppliancesString != null ? this.multipleAppliancesString.hashCode() : 0) ^ (this.oem != null ? this.oem.hashCode() : 0) ^ this.peerStateUpdateInterval ^ (this.phoenixSystemTM != null ? this.phoenixSystemTM.hashCode() : 0) ^ (this.product != null ? this.product.hashCode() : 0) ^ this.rootCausesStabilizationTime ^ (this.rpse ? 1 : 0) ^ this.rpseSetGroupSettingsTimeForSingleOperation ^ (this.simulator ? 1 : 0) ^ (this.singleApplianceString != null ? this.singleApplianceString.hashCode() : 0) ^ (int)this.snapshotConsolidationTimeAcceleration ^ (int)this.snapshotUpdateInterval ^ (int)this.splitterMonitorRPATimeout ^ (this.syrSupported ? 1 : 0) ^ (this.trackInitInconsistency ? 1 : 0) ^ (int)this.tspMemoryAlmostFullWaterMark ^ (this.usePWLOnWAN ? 1 : 0) ^ (this.version != null ? this.version.hashCode() : 0);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String toString()
/*      */   {
/* 1537 */     return "SystemInternalConfigParams [additionToSyncLatency=" + this.additionToSyncLatency + ", " + "allowSettingsChangesDuringMaintenance=" + this.allowSettingsChangesDuringMaintenance + ", " + "clariionFirstSuffix=" + this.clariionFirstSuffix + ", " + "clariionSecondSuffix=" + this.clariionSecondSuffix + ", " + "companyName=" + this.companyName + ", " + "controlWriteTimeout=" + this.controlWriteTimeout + ", " + "daysPerMonth=" + this.daysPerMonth + ", " + "defaultDailyImages=" + this.defaultDailyImages + ", " + "defaultMonthlyImages=" + this.defaultMonthlyImages + ", " + "defaultResumeSyncBelowLatency=" + this.defaultResumeSyncBelowLatency + ", " + "defaultResumeSyncBelowThroughput=" + this.defaultResumeSyncBelowThroughput + ", " + "defaultSnapshotShippingIntervalInMinutes=" + this.defaultSnapshotShippingIntervalInMinutes + ", " + "defaultStartAsyncAboveLatency=" + this.defaultStartAsyncAboveLatency + ", " + "defaultStartAsyncAboveThroughput=" + this.defaultStartAsyncAboveThroughput + ", " + "defaultUnconsolidatedDuration=" + this.defaultUnconsolidatedDuration + ", " + "defaultWeeklyImages=" + this.defaultWeeklyImages + ", " + "displayCertificateExtensions=" + this.displayCertificateExtensions + ", " + "displayTrialVersion=" + this.displayTrialVersion + ", " + "dynamicDontMoveToSyncTime=" + this.dynamicDontMoveToSyncTime + ", " + "e14ServerName=" + this.e14ServerName + ", " + "enableClariionVirtualWithRoll=" + this.enableClariionVirtualWithRoll + ", " + "eventLogsMaxNumberOfEntries=" + this.eventLogsMaxNumberOfEntries + ", " + "fcReplication=" + this.fcReplication + ", " + "flexFiltersRunIntervalInMinutes=" + this.flexFiltersRunIntervalInMinutes + ", " + "highestLatencyThreshold=" + this.highestLatencyThreshold + ", " + "highestThroughputThreshold=" + this.highestThroughputThreshold + ", " + "journalSizeLimitInGB=" + this.journalSizeLimitInGB + ", " + "lowestLatencyThreshold=" + this.lowestLatencyThreshold + ", " + "lowestThroughputThreshold=" + this.lowestThroughputThreshold + ", " + "maxAllowedSnapshots=" + this.maxAllowedSnapshots + ", " + "maxDesiredSnapshotsDefaultPercentage=" + this.maxDesiredSnapshotsDefaultPercentage + ", " + "maxGridCopiesPerGroup=" + this.maxGridCopiesPerGroup + ", " + "maxGridGroups=" + this.maxGridGroups + ", " + "maxGroups=" + this.maxGroups + ", " + "maxNumberOfCGsInConsistentGroupSet=" + this.maxNumberOfCGsInConsistentGroupSet + ", " + "maxNumberOfGroupSets=" + this.maxNumberOfGroupSets + ", " + "maxPersistentSnapshots=" + this.maxPersistentSnapshots + ", " + "maximumSplittersPerCluster=" + this.maximumSplittersPerCluster + ", " + "mgmtMaxActivityTime=" + this.mgmtMaxActivityTime + ", " + "mgmtScaledMaxActivityTime=" + this.mgmtScaledMaxActivityTime + ", " + "minNumOfVolumesInScaledEnv=" + this.minNumOfVolumesInScaledEnv + ", " + "minTSPPercentage=" + this.minTSPPercentage + ", " + "minUnconsolidatedDuration=" + this.minUnconsolidatedDuration + ", " + "modelUpdaterFrequency=" + this.modelUpdaterFrequency + ", " + "monitorSplitterStateLease=" + this.monitorSplitterStateLease + ", " + "multipleAppliancesString=" + this.multipleAppliancesString + ", " + "oem=" + this.oem + ", " + "peerStateUpdateInterval=" + this.peerStateUpdateInterval + ", " + "phoenixSystemTM=" + this.phoenixSystemTM + ", " + "product=" + this.product + ", " + "rootCausesStabilizationTime=" + this.rootCausesStabilizationTime + ", " + "rpse=" + this.rpse + ", " + "rpseSetGroupSettingsTimeForSingleOperation=" + this.rpseSetGroupSettingsTimeForSingleOperation + ", " + "simulator=" + this.simulator + ", " + "singleApplianceString=" + this.singleApplianceString + ", " + "snapshotConsolidationTimeAcceleration=" + this.snapshotConsolidationTimeAcceleration + ", " + "snapshotUpdateInterval=" + this.snapshotUpdateInterval + ", " + "splitterMonitorRPATimeout=" + this.splitterMonitorRPATimeout + ", " + "syrSupported=" + this.syrSupported + ", " + "trackInitInconsistency=" + this.trackInitInconsistency + ", " + "tspMemoryAlmostFullWaterMark=" + this.tspMemoryAlmostFullWaterMark + ", " + "usePWLOnWAN=" + this.usePWLOnWAN + ", " + "version=" + this.version + "]";
/*      */   }
/*      */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SystemInternalConfigParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */