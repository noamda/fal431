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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SyncReplicationThreshold", propOrder={"thresholdEnabled", "startAsyncReplicationAbove", "resumeSyncReplicationBelow"})
/*     */ public class SyncReplicationThreshold
/*     */ {
/*     */   protected boolean thresholdEnabled;
/*     */   @XmlElement(required=true)
/*     */   protected Quantity startAsyncReplicationAbove;
/*     */   @XmlElement(required=true)
/*     */   protected Quantity resumeSyncReplicationBelow;
/*     */   
/*     */   public SyncReplicationThreshold() {}
/*     */   
/*     */   public SyncReplicationThreshold(boolean thresholdEnabled, Quantity startAsyncReplicationAbove, Quantity resumeSyncReplicationBelow)
/*     */   {
/*  53 */     this.thresholdEnabled = thresholdEnabled;
/*  54 */     this.startAsyncReplicationAbove = startAsyncReplicationAbove;
/*  55 */     this.resumeSyncReplicationBelow = resumeSyncReplicationBelow;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isThresholdEnabled()
/*     */   {
/*  63 */     return this.thresholdEnabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setThresholdEnabled(boolean value)
/*     */   {
/*  71 */     this.thresholdEnabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Quantity getStartAsyncReplicationAbove()
/*     */   {
/*  83 */     return this.startAsyncReplicationAbove;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStartAsyncReplicationAbove(Quantity value)
/*     */   {
/*  95 */     this.startAsyncReplicationAbove = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Quantity getResumeSyncReplicationBelow()
/*     */   {
/* 107 */     return this.resumeSyncReplicationBelow;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResumeSyncReplicationBelow(Quantity value)
/*     */   {
/* 119 */     this.resumeSyncReplicationBelow = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 129 */     if (!(obj instanceof SyncReplicationThreshold)) {
/* 130 */       return false;
/*     */     }
/* 132 */     SyncReplicationThreshold otherObj = (SyncReplicationThreshold)obj;
/*     */     
/* 134 */     return (this.thresholdEnabled == otherObj.thresholdEnabled) && (this.startAsyncReplicationAbove != null ? this.startAsyncReplicationAbove.equals(otherObj.startAsyncReplicationAbove) : this.startAsyncReplicationAbove == otherObj.startAsyncReplicationAbove) && (this.resumeSyncReplicationBelow != null ? this.resumeSyncReplicationBelow.equals(otherObj.resumeSyncReplicationBelow) : this.resumeSyncReplicationBelow == otherObj.resumeSyncReplicationBelow);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 145 */     return (this.thresholdEnabled ? 1 : 0) ^ (this.startAsyncReplicationAbove != null ? this.startAsyncReplicationAbove.hashCode() : 0) ^ (this.resumeSyncReplicationBelow != null ? this.resumeSyncReplicationBelow.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 156 */     return "SyncReplicationThreshold [thresholdEnabled=" + this.thresholdEnabled + ", " + "startAsyncReplicationAbove=" + this.startAsyncReplicationAbove + ", " + "resumeSyncReplicationBelow=" + this.resumeSyncReplicationBelow + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SyncReplicationThreshold.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */