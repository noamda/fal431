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
/*     */ @XmlType(name="VirtualCenterProtectedVmCountState", propOrder={"protectedVmCount", "vcUID"})
/*     */ public class VirtualCenterProtectedVmCountState
/*     */ {
/*     */   protected long protectedVmCount;
/*     */   protected VirtualCenterUID vcUID;
/*     */   
/*     */   public VirtualCenterProtectedVmCountState() {}
/*     */   
/*     */   public VirtualCenterProtectedVmCountState(long protectedVmCount, VirtualCenterUID vcUID)
/*     */   {
/*  47 */     this.protectedVmCount = protectedVmCount;
/*  48 */     this.vcUID = vcUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getProtectedVmCount()
/*     */   {
/*  56 */     return this.protectedVmCount;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProtectedVmCount(long value)
/*     */   {
/*  64 */     this.protectedVmCount = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualCenterUID getVcUID()
/*     */   {
/*  76 */     return this.vcUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVcUID(VirtualCenterUID value)
/*     */   {
/*  88 */     this.vcUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof VirtualCenterProtectedVmCountState)) {
/*  99 */       return false;
/*     */     }
/* 101 */     VirtualCenterProtectedVmCountState otherObj = (VirtualCenterProtectedVmCountState)obj;
/*     */     
/* 103 */     return (this.protectedVmCount == otherObj.protectedVmCount) && (this.vcUID != null ? this.vcUID.equals(otherObj.vcUID) : this.vcUID == otherObj.vcUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (int)this.protectedVmCount ^ (this.vcUID != null ? this.vcUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "VirtualCenterProtectedVmCountState [protectedVmCount=" + this.protectedVmCount + ", " + "vcUID=" + this.vcUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualCenterProtectedVmCountState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */