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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getConsistencyGroupUIDAccordingToVMBiosUuid", propOrder={"vmBiosUuid"})
/*     */ public class GetConsistencyGroupUIDAccordingToVMBiosUuid
/*     */ {
/*     */   protected String vmBiosUuid;
/*     */   
/*     */   public GetConsistencyGroupUIDAccordingToVMBiosUuid() {}
/*     */   
/*     */   public GetConsistencyGroupUIDAccordingToVMBiosUuid(String vmBiosUuid)
/*     */   {
/*  44 */     this.vmBiosUuid = vmBiosUuid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVmBiosUuid()
/*     */   {
/*  56 */     return this.vmBiosUuid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmBiosUuid(String value)
/*     */   {
/*  68 */     this.vmBiosUuid = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof GetConsistencyGroupUIDAccordingToVMBiosUuid)) {
/*  79 */       return false;
/*     */     }
/*  81 */     GetConsistencyGroupUIDAccordingToVMBiosUuid otherObj = (GetConsistencyGroupUIDAccordingToVMBiosUuid)obj;
/*     */     
/*  83 */     return this.vmBiosUuid == otherObj.vmBiosUuid ? true : this.vmBiosUuid != null ? this.vmBiosUuid.equals(otherObj.vmBiosUuid) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.vmBiosUuid != null ? this.vmBiosUuid.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "GetConsistencyGroupUIDAccordingToVMBiosUuid [vmBiosUuid=" + this.vmBiosUuid + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetConsistencyGroupUIDAccordingToVMBiosUuid.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */