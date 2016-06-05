/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ @XmlType(name="SnapshotShippingPolicy", propOrder={"intervaInMinutes", "mode"})
/*     */ public class SnapshotShippingPolicy
/*     */ {
/*     */   protected Long intervaInMinutes;
/*     */   protected SnapshotShippingMode mode;
/*     */   
/*     */   public SnapshotShippingPolicy() {}
/*     */   
/*     */   public SnapshotShippingPolicy(Long intervaInMinutes, SnapshotShippingMode mode)
/*     */   {
/*  47 */     this.intervaInMinutes = intervaInMinutes;
/*  48 */     this.mode = mode;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getIntervaInMinutes()
/*     */   {
/*  60 */     return this.intervaInMinutes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIntervaInMinutes(Long value)
/*     */   {
/*  72 */     this.intervaInMinutes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SnapshotShippingMode getMode()
/*     */   {
/*  84 */     return this.mode;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMode(SnapshotShippingMode value)
/*     */   {
/*  96 */     this.mode = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof SnapshotShippingPolicy)) {
/* 107 */       return false;
/*     */     }
/* 109 */     SnapshotShippingPolicy otherObj = (SnapshotShippingPolicy)obj;
/*     */     
/* 111 */     return (this.intervaInMinutes != null ? this.intervaInMinutes.equals(otherObj.intervaInMinutes) : this.intervaInMinutes == otherObj.intervaInMinutes) && (this.mode != null ? this.mode.equals(otherObj.mode) : this.mode == otherObj.mode);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.intervaInMinutes != null ? this.intervaInMinutes.hashCode() : 0) ^ (this.mode != null ? this.mode.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "SnapshotShippingPolicy [intervaInMinutes=" + this.intervaInMinutes + ", " + "mode=" + this.mode + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SnapshotShippingPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */