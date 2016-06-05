/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonTypeName;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("ConsistencyGroupCopyPolicy")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupCopyPolicy", propOrder={"journalCompressionLevel", "requiredProtectionWindowInMicroSeconds", "automaticSnapshotConsolidationPolicy", "rto", "loggedAccessAllocationProportion", "journalSizeLimitInBytes", "hostsOS", "allowDistributionOfLargeSnapshots", "allowSymmetrixWithOneRPA", "fastForwardBound", "phoenixProtectionPolicy", "snapshotsPolicy"})
/*     */ public class ConsistencyGroupCopyPolicy
/*     */   extends BaseValidatablePolicyTemplateType
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected JournalCompressionLevel journalCompressionLevel;
/*     */   protected Long requiredProtectionWindowInMicroSeconds;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected AutomaticSnapshotConsolidationPolicy automaticSnapshotConsolidationPolicy;
/*     */   protected Quantity rto;
/*     */   protected double loggedAccessAllocationProportion;
/*     */   protected long journalSizeLimitInBytes;
/*     */   protected HostOS hostsOS;
/*     */   protected boolean allowDistributionOfLargeSnapshots;
/*     */   protected boolean allowSymmetrixWithOneRPA;
/*     */   protected RecoverPointTimeStamp fastForwardBound;
/*     */   @XmlElement(nillable=true)
/*     */   protected PhoenixProtectionPolicy phoenixProtectionPolicy;
/*     */   @XmlElement(nillable=true)
/*     */   protected SnapshotsPolicy snapshotsPolicy;
/*     */   
/*     */   public ConsistencyGroupCopyPolicy() {}
/*     */   
/*     */   public ConsistencyGroupCopyPolicy(JournalCompressionLevel journalCompressionLevel, Long requiredProtectionWindowInMicroSeconds, AutomaticSnapshotConsolidationPolicy automaticSnapshotConsolidationPolicy, Quantity rto, double loggedAccessAllocationProportion, long journalSizeLimitInBytes, HostOS hostsOS, boolean allowDistributionOfLargeSnapshots, boolean allowSymmetrixWithOneRPA, RecoverPointTimeStamp fastForwardBound, PhoenixProtectionPolicy phoenixProtectionPolicy, SnapshotsPolicy snapshotsPolicy)
/*     */   {
/*  92 */     this.journalCompressionLevel = journalCompressionLevel;
/*  93 */     this.requiredProtectionWindowInMicroSeconds = requiredProtectionWindowInMicroSeconds;
/*  94 */     this.automaticSnapshotConsolidationPolicy = automaticSnapshotConsolidationPolicy;
/*  95 */     this.rto = rto;
/*  96 */     this.loggedAccessAllocationProportion = loggedAccessAllocationProportion;
/*  97 */     this.journalSizeLimitInBytes = journalSizeLimitInBytes;
/*  98 */     this.hostsOS = hostsOS;
/*  99 */     this.allowDistributionOfLargeSnapshots = allowDistributionOfLargeSnapshots;
/* 100 */     this.allowSymmetrixWithOneRPA = allowSymmetrixWithOneRPA;
/* 101 */     this.fastForwardBound = fastForwardBound;
/* 102 */     this.phoenixProtectionPolicy = phoenixProtectionPolicy;
/* 103 */     this.snapshotsPolicy = snapshotsPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public JournalCompressionLevel getJournalCompressionLevel()
/*     */   {
/* 115 */     return this.journalCompressionLevel;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setJournalCompressionLevel(JournalCompressionLevel value)
/*     */   {
/* 127 */     this.journalCompressionLevel = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getRequiredProtectionWindowInMicroSeconds()
/*     */   {
/* 139 */     return this.requiredProtectionWindowInMicroSeconds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRequiredProtectionWindowInMicroSeconds(Long value)
/*     */   {
/* 151 */     this.requiredProtectionWindowInMicroSeconds = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public AutomaticSnapshotConsolidationPolicy getAutomaticSnapshotConsolidationPolicy()
/*     */   {
/* 163 */     return this.automaticSnapshotConsolidationPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAutomaticSnapshotConsolidationPolicy(AutomaticSnapshotConsolidationPolicy value)
/*     */   {
/* 175 */     this.automaticSnapshotConsolidationPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Quantity getRto()
/*     */   {
/* 187 */     return this.rto;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRto(Quantity value)
/*     */   {
/* 199 */     this.rto = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public double getLoggedAccessAllocationProportion()
/*     */   {
/* 207 */     return this.loggedAccessAllocationProportion;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLoggedAccessAllocationProportion(double value)
/*     */   {
/* 215 */     this.loggedAccessAllocationProportion = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getJournalSizeLimitInBytes()
/*     */   {
/* 223 */     return this.journalSizeLimitInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setJournalSizeLimitInBytes(long value)
/*     */   {
/* 231 */     this.journalSizeLimitInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public HostOS getHostsOS()
/*     */   {
/* 243 */     return this.hostsOS;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHostsOS(HostOS value)
/*     */   {
/* 255 */     this.hostsOS = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isAllowDistributionOfLargeSnapshots()
/*     */   {
/* 263 */     return this.allowDistributionOfLargeSnapshots;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAllowDistributionOfLargeSnapshots(boolean value)
/*     */   {
/* 271 */     this.allowDistributionOfLargeSnapshots = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isAllowSymmetrixWithOneRPA()
/*     */   {
/* 279 */     return this.allowSymmetrixWithOneRPA;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAllowSymmetrixWithOneRPA(boolean value)
/*     */   {
/* 287 */     this.allowSymmetrixWithOneRPA = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getFastForwardBound()
/*     */   {
/* 299 */     return this.fastForwardBound;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFastForwardBound(RecoverPointTimeStamp value)
/*     */   {
/* 311 */     this.fastForwardBound = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public PhoenixProtectionPolicy getPhoenixProtectionPolicy()
/*     */   {
/* 323 */     return this.phoenixProtectionPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPhoenixProtectionPolicy(PhoenixProtectionPolicy value)
/*     */   {
/* 335 */     this.phoenixProtectionPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SnapshotsPolicy getSnapshotsPolicy()
/*     */   {
/* 347 */     return this.snapshotsPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSnapshotsPolicy(SnapshotsPolicy value)
/*     */   {
/* 359 */     this.snapshotsPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 369 */     if (!(obj instanceof ConsistencyGroupCopyPolicy)) {
/* 370 */       return false;
/*     */     }
/* 372 */     ConsistencyGroupCopyPolicy otherObj = (ConsistencyGroupCopyPolicy)obj;
/*     */     
/* 374 */     return (super.equals(obj)) && (this.journalCompressionLevel != null ? this.journalCompressionLevel.equals(otherObj.journalCompressionLevel) : this.journalCompressionLevel == otherObj.journalCompressionLevel) && (this.requiredProtectionWindowInMicroSeconds != null ? this.requiredProtectionWindowInMicroSeconds.equals(otherObj.requiredProtectionWindowInMicroSeconds) : this.requiredProtectionWindowInMicroSeconds == otherObj.requiredProtectionWindowInMicroSeconds) && (this.automaticSnapshotConsolidationPolicy != null ? this.automaticSnapshotConsolidationPolicy.equals(otherObj.automaticSnapshotConsolidationPolicy) : this.automaticSnapshotConsolidationPolicy == otherObj.automaticSnapshotConsolidationPolicy) && (this.rto != null ? this.rto.equals(otherObj.rto) : this.rto == otherObj.rto) && (this.loggedAccessAllocationProportion == otherObj.loggedAccessAllocationProportion) && (this.journalSizeLimitInBytes == otherObj.journalSizeLimitInBytes) && (this.hostsOS != null ? this.hostsOS.equals(otherObj.hostsOS) : this.hostsOS == otherObj.hostsOS) && (this.allowDistributionOfLargeSnapshots == otherObj.allowDistributionOfLargeSnapshots) && (this.allowSymmetrixWithOneRPA == otherObj.allowSymmetrixWithOneRPA) && (this.fastForwardBound != null ? this.fastForwardBound.equals(otherObj.fastForwardBound) : this.fastForwardBound == otherObj.fastForwardBound) && (this.phoenixProtectionPolicy != null ? this.phoenixProtectionPolicy.equals(otherObj.phoenixProtectionPolicy) : this.phoenixProtectionPolicy == otherObj.phoenixProtectionPolicy) && (this.snapshotsPolicy != null ? this.snapshotsPolicy.equals(otherObj.snapshotsPolicy) : this.snapshotsPolicy == otherObj.snapshotsPolicy);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 395 */     return super.hashCode() ^ (this.journalCompressionLevel != null ? this.journalCompressionLevel.hashCode() : 0) ^ (this.requiredProtectionWindowInMicroSeconds != null ? this.requiredProtectionWindowInMicroSeconds.hashCode() : 0) ^ (this.automaticSnapshotConsolidationPolicy != null ? this.automaticSnapshotConsolidationPolicy.hashCode() : 0) ^ (this.rto != null ? this.rto.hashCode() : 0) ^ (int)this.loggedAccessAllocationProportion ^ (int)this.journalSizeLimitInBytes ^ (this.hostsOS != null ? this.hostsOS.hashCode() : 0) ^ (this.allowDistributionOfLargeSnapshots ? 1 : 0) ^ (this.allowSymmetrixWithOneRPA ? 1 : 0) ^ (this.fastForwardBound != null ? this.fastForwardBound.hashCode() : 0) ^ (this.phoenixProtectionPolicy != null ? this.phoenixProtectionPolicy.hashCode() : 0) ^ (this.snapshotsPolicy != null ? this.snapshotsPolicy.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 416 */     return "ConsistencyGroupCopyPolicy [super=" + super.toString() + ", " + "journalCompressionLevel=" + this.journalCompressionLevel + ", " + "requiredProtectionWindowInMicroSeconds=" + this.requiredProtectionWindowInMicroSeconds + ", " + "automaticSnapshotConsolidationPolicy=" + this.automaticSnapshotConsolidationPolicy + ", " + "rto=" + this.rto + ", " + "loggedAccessAllocationProportion=" + this.loggedAccessAllocationProportion + ", " + "journalSizeLimitInBytes=" + this.journalSizeLimitInBytes + ", " + "hostsOS=" + this.hostsOS + ", " + "allowDistributionOfLargeSnapshots=" + this.allowDistributionOfLargeSnapshots + ", " + "allowSymmetrixWithOneRPA=" + this.allowSymmetrixWithOneRPA + ", " + "fastForwardBound=" + this.fastForwardBound + ", " + "phoenixProtectionPolicy=" + this.phoenixProtectionPolicy + ", " + "snapshotsPolicy=" + this.snapshotsPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopyPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */