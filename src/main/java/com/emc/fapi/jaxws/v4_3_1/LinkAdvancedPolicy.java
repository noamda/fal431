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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="LinkAdvancedPolicy", propOrder={"performLongInitialization", "snapshotGranularity"})
/*     */ public class LinkAdvancedPolicy
/*     */ {
/*     */   protected boolean performLongInitialization;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected SnapshotGranularity snapshotGranularity;
/*     */   
/*     */   public LinkAdvancedPolicy() {}
/*     */   
/*     */   public LinkAdvancedPolicy(boolean performLongInitialization, SnapshotGranularity snapshotGranularity)
/*     */   {
/*  49 */     this.performLongInitialization = performLongInitialization;
/*  50 */     this.snapshotGranularity = snapshotGranularity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isPerformLongInitialization()
/*     */   {
/*  58 */     return this.performLongInitialization;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPerformLongInitialization(boolean value)
/*     */   {
/*  66 */     this.performLongInitialization = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SnapshotGranularity getSnapshotGranularity()
/*     */   {
/*  78 */     return this.snapshotGranularity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSnapshotGranularity(SnapshotGranularity value)
/*     */   {
/*  90 */     this.snapshotGranularity = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 100 */     if (!(obj instanceof LinkAdvancedPolicy)) {
/* 101 */       return false;
/*     */     }
/* 103 */     LinkAdvancedPolicy otherObj = (LinkAdvancedPolicy)obj;
/*     */     
/* 105 */     return (this.performLongInitialization == otherObj.performLongInitialization) && (this.snapshotGranularity != null ? this.snapshotGranularity.equals(otherObj.snapshotGranularity) : this.snapshotGranularity == otherObj.snapshotGranularity);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 115 */     return (this.performLongInitialization ? 1 : 0) ^ (this.snapshotGranularity != null ? this.snapshotGranularity.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 125 */     return "LinkAdvancedPolicy [performLongInitialization=" + this.performLongInitialization + ", " + "snapshotGranularity=" + this.snapshotGranularity + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\LinkAdvancedPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */