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
/*     */ @XmlType(name="VmReplicationSettingsChangesParam", propOrder={"copyUID", "vmParam"})
/*     */ public class VmReplicationSettingsChangesParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupCopyUID copyUID;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VMParam vmParam;
/*     */   
/*     */   public VmReplicationSettingsChangesParam() {}
/*     */   
/*     */   public VmReplicationSettingsChangesParam(ConsistencyGroupCopyUID copyUID, VMParam vmParam)
/*     */   {
/*  50 */     this.copyUID = copyUID;
/*  51 */     this.vmParam = vmParam;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getCopyUID()
/*     */   {
/*  63 */     return this.copyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCopyUID(ConsistencyGroupCopyUID value)
/*     */   {
/*  75 */     this.copyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VMParam getVmParam()
/*     */   {
/*  87 */     return this.vmParam;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmParam(VMParam value)
/*     */   {
/*  99 */     this.vmParam = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof VmReplicationSettingsChangesParam)) {
/* 110 */       return false;
/*     */     }
/* 112 */     VmReplicationSettingsChangesParam otherObj = (VmReplicationSettingsChangesParam)obj;
/*     */     
/* 114 */     return (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.vmParam != null ? this.vmParam.equals(otherObj.vmParam) : this.vmParam == otherObj.vmParam);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.vmParam != null ? this.vmParam.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "VmReplicationSettingsChangesParam [copyUID=" + this.copyUID + ", " + "vmParam=" + this.vmParam + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmReplicationSettingsChangesParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */