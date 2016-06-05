/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="LinkProtectionPolicy", propOrder={"protectionType", "syncReplicationLatencyThresholds", "syncReplicationThroughputThresholds", "rpoPolicy", "replicatingOverWAN", "compression", "bandwidthLimit", "measureLagToTargetRPA", "deduplication", "weight"})
/*     */ public class LinkProtectionPolicy
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ProtectionMode protectionType;
/*     */   @XmlElement(required=true)
/*     */   protected SyncReplicationThreshold syncReplicationLatencyThresholds;
/*     */   @XmlElement(required=true)
/*     */   protected SyncReplicationThreshold syncReplicationThroughputThresholds;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected RPOPolicy rpoPolicy;
/*     */   protected boolean replicatingOverWAN;
/*     */   @XmlElement(required=true)
/*     */   protected WanCompression compression;
/*     */   protected double bandwidthLimit;
/*     */   protected boolean measureLagToTargetRPA;
/*     */   protected boolean deduplication;
/*     */   protected int weight;
/*     */   
/*     */   public LinkProtectionPolicy() {}
/*     */   
/*     */   public LinkProtectionPolicy(ProtectionMode protectionType, SyncReplicationThreshold syncReplicationLatencyThresholds, SyncReplicationThreshold syncReplicationThroughputThresholds, RPOPolicy rpoPolicy, boolean replicatingOverWAN, WanCompression compression, double bandwidthLimit, boolean measureLagToTargetRPA, boolean deduplication, int weight)
/*     */   {
/*  77 */     this.protectionType = protectionType;
/*  78 */     this.syncReplicationLatencyThresholds = syncReplicationLatencyThresholds;
/*  79 */     this.syncReplicationThroughputThresholds = syncReplicationThroughputThresholds;
/*  80 */     this.rpoPolicy = rpoPolicy;
/*  81 */     this.replicatingOverWAN = replicatingOverWAN;
/*  82 */     this.compression = compression;
/*  83 */     this.bandwidthLimit = bandwidthLimit;
/*  84 */     this.measureLagToTargetRPA = measureLagToTargetRPA;
/*  85 */     this.deduplication = deduplication;
/*  86 */     this.weight = weight;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ProtectionMode getProtectionType()
/*     */   {
/*  98 */     return this.protectionType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProtectionType(ProtectionMode value)
/*     */   {
/* 110 */     this.protectionType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SyncReplicationThreshold getSyncReplicationLatencyThresholds()
/*     */   {
/* 122 */     return this.syncReplicationLatencyThresholds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSyncReplicationLatencyThresholds(SyncReplicationThreshold value)
/*     */   {
/* 134 */     this.syncReplicationLatencyThresholds = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SyncReplicationThreshold getSyncReplicationThroughputThresholds()
/*     */   {
/* 146 */     return this.syncReplicationThroughputThresholds;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSyncReplicationThroughputThresholds(SyncReplicationThreshold value)
/*     */   {
/* 158 */     this.syncReplicationThroughputThresholds = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RPOPolicy getRpoPolicy()
/*     */   {
/* 170 */     return this.rpoPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpoPolicy(RPOPolicy value)
/*     */   {
/* 182 */     this.rpoPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isReplicatingOverWAN()
/*     */   {
/* 190 */     return this.replicatingOverWAN;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReplicatingOverWAN(boolean value)
/*     */   {
/* 198 */     this.replicatingOverWAN = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public WanCompression getCompression()
/*     */   {
/* 210 */     return this.compression;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCompression(WanCompression value)
/*     */   {
/* 222 */     this.compression = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public double getBandwidthLimit()
/*     */   {
/* 230 */     return this.bandwidthLimit;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setBandwidthLimit(double value)
/*     */   {
/* 238 */     this.bandwidthLimit = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isMeasureLagToTargetRPA()
/*     */   {
/* 246 */     return this.measureLagToTargetRPA;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMeasureLagToTargetRPA(boolean value)
/*     */   {
/* 254 */     this.measureLagToTargetRPA = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isDeduplication()
/*     */   {
/* 262 */     return this.deduplication;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDeduplication(boolean value)
/*     */   {
/* 270 */     this.deduplication = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getWeight()
/*     */   {
/* 278 */     return this.weight;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setWeight(int value)
/*     */   {
/* 286 */     this.weight = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 296 */     if (!(obj instanceof LinkProtectionPolicy)) {
/* 297 */       return false;
/*     */     }
/* 299 */     LinkProtectionPolicy otherObj = (LinkProtectionPolicy)obj;
/*     */     
/* 301 */     return (this.protectionType != null ? this.protectionType.equals(otherObj.protectionType) : this.protectionType == otherObj.protectionType) && (this.syncReplicationLatencyThresholds != null ? this.syncReplicationLatencyThresholds.equals(otherObj.syncReplicationLatencyThresholds) : this.syncReplicationLatencyThresholds == otherObj.syncReplicationLatencyThresholds) && (this.syncReplicationThroughputThresholds != null ? this.syncReplicationThroughputThresholds.equals(otherObj.syncReplicationThroughputThresholds) : this.syncReplicationThroughputThresholds == otherObj.syncReplicationThroughputThresholds) && (this.rpoPolicy != null ? this.rpoPolicy.equals(otherObj.rpoPolicy) : this.rpoPolicy == otherObj.rpoPolicy) && (this.replicatingOverWAN == otherObj.replicatingOverWAN) && (this.compression != null ? this.compression.equals(otherObj.compression) : this.compression == otherObj.compression) && (this.bandwidthLimit == otherObj.bandwidthLimit) && (this.measureLagToTargetRPA == otherObj.measureLagToTargetRPA) && (this.deduplication == otherObj.deduplication) && (this.weight == otherObj.weight);
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
/*     */   public int hashCode()
/*     */   {
/* 319 */     return (this.protectionType != null ? this.protectionType.hashCode() : 0) ^ (this.syncReplicationLatencyThresholds != null ? this.syncReplicationLatencyThresholds.hashCode() : 0) ^ (this.syncReplicationThroughputThresholds != null ? this.syncReplicationThroughputThresholds.hashCode() : 0) ^ (this.rpoPolicy != null ? this.rpoPolicy.hashCode() : 0) ^ (this.replicatingOverWAN ? 1 : 0) ^ (this.compression != null ? this.compression.hashCode() : 0) ^ (int)this.bandwidthLimit ^ (this.measureLagToTargetRPA ? 1 : 0) ^ (this.deduplication ? 1 : 0) ^ this.weight;
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
/*     */   public String toString()
/*     */   {
/* 337 */     return "LinkProtectionPolicy [protectionType=" + this.protectionType + ", " + "syncReplicationLatencyThresholds=" + this.syncReplicationLatencyThresholds + ", " + "syncReplicationThroughputThresholds=" + this.syncReplicationThroughputThresholds + ", " + "rpoPolicy=" + this.rpoPolicy + ", " + "replicatingOverWAN=" + this.replicatingOverWAN + ", " + "compression=" + this.compression + ", " + "bandwidthLimit=" + this.bandwidthLimit + ", " + "measureLagToTargetRPA=" + this.measureLagToTargetRPA + ", " + "deduplication=" + this.deduplication + ", " + "weight=" + this.weight + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\LinkProtectionPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */