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
/*     */ @XmlType(name="VolumeStatus", propOrder={"accessStatus", "multipathingProblems"})
/*     */ public class VolumeStatus
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected VolumeAccessStatus accessStatus;
/*     */   protected boolean multipathingProblems;
/*     */   
/*     */   public VolumeStatus() {}
/*     */   
/*     */   public VolumeStatus(VolumeAccessStatus accessStatus, boolean multipathingProblems)
/*     */   {
/*  49 */     this.accessStatus = accessStatus;
/*  50 */     this.multipathingProblems = multipathingProblems;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VolumeAccessStatus getAccessStatus()
/*     */   {
/*  62 */     return this.accessStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAccessStatus(VolumeAccessStatus value)
/*     */   {
/*  74 */     this.accessStatus = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isMultipathingProblems()
/*     */   {
/*  82 */     return this.multipathingProblems;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMultipathingProblems(boolean value)
/*     */   {
/*  90 */     this.multipathingProblems = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 100 */     if (!(obj instanceof VolumeStatus)) {
/* 101 */       return false;
/*     */     }
/* 103 */     VolumeStatus otherObj = (VolumeStatus)obj;
/*     */     
/* 105 */     return (this.accessStatus != null ? this.accessStatus.equals(otherObj.accessStatus) : this.accessStatus == otherObj.accessStatus) && (this.multipathingProblems == otherObj.multipathingProblems);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 115 */     return (this.accessStatus != null ? this.accessStatus.hashCode() : 0) ^ (this.multipathingProblems ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 125 */     return "VolumeStatus [accessStatus=" + this.accessStatus + ", " + "multipathingProblems=" + this.multipathingProblems + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumeStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */