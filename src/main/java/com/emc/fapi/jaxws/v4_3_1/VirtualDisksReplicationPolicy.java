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
/*     */ @XmlType(name="VirtualDisksReplicationPolicy", propOrder={"autoReplicateNewVirtualDisks", "diskSettings"})
/*     */ public class VirtualDisksReplicationPolicy
/*     */ {
/*     */   protected boolean autoReplicateNewVirtualDisks;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VirtualDiskSettings> diskSettings;
/*     */   
/*     */   public VirtualDisksReplicationPolicy() {}
/*     */   
/*     */   public VirtualDisksReplicationPolicy(boolean autoReplicateNewVirtualDisks, List<VirtualDiskSettings> diskSettings)
/*     */   {
/*  51 */     this.autoReplicateNewVirtualDisks = autoReplicateNewVirtualDisks;
/*  52 */     this.diskSettings = diskSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isAutoReplicateNewVirtualDisks()
/*     */   {
/*  60 */     return this.autoReplicateNewVirtualDisks;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAutoReplicateNewVirtualDisks(boolean value)
/*     */   {
/*  68 */     this.autoReplicateNewVirtualDisks = value;
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
/*     */   public List<VirtualDiskSettings> getDiskSettings()
/*     */   {
/*  94 */     if (this.diskSettings == null) {
/*  95 */       this.diskSettings = new ArrayList();
/*     */     }
/*  97 */     return this.diskSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 107 */     if (!(obj instanceof VirtualDisksReplicationPolicy)) {
/* 108 */       return false;
/*     */     }
/* 110 */     VirtualDisksReplicationPolicy otherObj = (VirtualDisksReplicationPolicy)obj;
/*     */     
/* 112 */     return (this.autoReplicateNewVirtualDisks == otherObj.autoReplicateNewVirtualDisks) && (this.diskSettings != null ? this.diskSettings.equals(otherObj.diskSettings) : this.diskSettings == otherObj.diskSettings);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 122 */     return (this.autoReplicateNewVirtualDisks ? 1 : 0) ^ (this.diskSettings != null ? this.diskSettings.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 132 */     return "VirtualDisksReplicationPolicy [autoReplicateNewVirtualDisks=" + this.autoReplicateNewVirtualDisks + ", " + "diskSettings=" + this.diskSettings + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualDisksReplicationPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */