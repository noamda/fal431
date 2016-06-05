/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="VmReplicationSetSettingsChangesParam", propOrder={"vmReplicationSetUID", "vmReplicationChanges"})
/*     */ public class VmReplicationSetSettingsChangesParam
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VmReplicationSetUID vmReplicationSetUID;
/*     */   @XmlElement(required=true)
/*     */   protected List<VmReplicationSettingsChangesParam> vmReplicationChanges;
/*     */   
/*     */   public VmReplicationSetSettingsChangesParam() {}
/*     */   
/*     */   public VmReplicationSetSettingsChangesParam(VmReplicationSetUID vmReplicationSetUID, List<VmReplicationSettingsChangesParam> vmReplicationChanges)
/*     */   {
/*  52 */     this.vmReplicationSetUID = vmReplicationSetUID;
/*  53 */     this.vmReplicationChanges = vmReplicationChanges;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmReplicationSetUID getVmReplicationSetUID()
/*     */   {
/*  65 */     return this.vmReplicationSetUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmReplicationSetUID(VmReplicationSetUID value)
/*     */   {
/*  77 */     this.vmReplicationSetUID = value;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<VmReplicationSettingsChangesParam> getVmReplicationChanges()
/*     */   {
/* 103 */     if (this.vmReplicationChanges == null) {
/* 104 */       this.vmReplicationChanges = new ArrayList();
/*     */     }
/* 106 */     return this.vmReplicationChanges;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof VmReplicationSetSettingsChangesParam)) {
/* 117 */       return false;
/*     */     }
/* 119 */     VmReplicationSetSettingsChangesParam otherObj = (VmReplicationSetSettingsChangesParam)obj;
/*     */     
/* 121 */     return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.equals(otherObj.vmReplicationSetUID) : this.vmReplicationSetUID == otherObj.vmReplicationSetUID) && (this.vmReplicationChanges != null ? this.vmReplicationChanges.equals(otherObj.vmReplicationChanges) : this.vmReplicationChanges == otherObj.vmReplicationChanges);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 131 */     return (this.vmReplicationSetUID != null ? this.vmReplicationSetUID.hashCode() : 0) ^ (this.vmReplicationChanges != null ? this.vmReplicationChanges.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 141 */     return "VmReplicationSetSettingsChangesParam [vmReplicationSetUID=" + this.vmReplicationSetUID + ", " + "vmReplicationChanges=" + this.vmReplicationChanges + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmReplicationSetSettingsChangesParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */