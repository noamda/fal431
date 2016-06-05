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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VerifyGroupCopySnapshotsParam", propOrder={"snapshotDescription"})
/*     */ public class VerifyGroupCopySnapshotsParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String snapshotDescription;
/*     */   
/*     */   public VerifyGroupCopySnapshotsParam() {}
/*     */   
/*     */   public VerifyGroupCopySnapshotsParam(String snapshotDescription)
/*     */   {
/*  46 */     this.snapshotDescription = snapshotDescription;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSnapshotDescription()
/*     */   {
/*  58 */     return this.snapshotDescription;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSnapshotDescription(String value)
/*     */   {
/*  70 */     this.snapshotDescription = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof VerifyGroupCopySnapshotsParam)) {
/*  81 */       return false;
/*     */     }
/*  83 */     VerifyGroupCopySnapshotsParam otherObj = (VerifyGroupCopySnapshotsParam)obj;
/*     */     
/*  85 */     return this.snapshotDescription == otherObj.snapshotDescription ? true : this.snapshotDescription != null ? this.snapshotDescription.equals(otherObj.snapshotDescription) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  94 */     return this.snapshotDescription != null ? this.snapshotDescription.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 103 */     return "VerifyGroupCopySnapshotsParam [snapshotDescription=" + this.snapshotDescription + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VerifyGroupCopySnapshotsParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */