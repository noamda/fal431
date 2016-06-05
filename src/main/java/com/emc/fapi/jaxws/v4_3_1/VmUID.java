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
/*     */ @XmlType(name="VmUID", propOrder={"uuid", "virtualCenterUID"})
/*     */ public class VmUID
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String uuid;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected VirtualCenterUID virtualCenterUID;
/*     */   
/*     */   public VmUID() {}
/*     */   
/*     */   public VmUID(String uuid, VirtualCenterUID virtualCenterUID)
/*     */   {
/*  50 */     this.uuid = uuid;
/*  51 */     this.virtualCenterUID = virtualCenterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getUuid()
/*     */   {
/*  63 */     return this.uuid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUuid(String value)
/*     */   {
/*  75 */     this.uuid = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualCenterUID getVirtualCenterUID()
/*     */   {
/*  87 */     return this.virtualCenterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVirtualCenterUID(VirtualCenterUID value)
/*     */   {
/*  99 */     this.virtualCenterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof VmUID)) {
/* 110 */       return false;
/*     */     }
/* 112 */     VmUID otherObj = (VmUID)obj;
/*     */     
/* 114 */     return (this.uuid != null ? this.uuid.equals(otherObj.uuid) : this.uuid == otherObj.uuid) && (this.virtualCenterUID != null ? this.virtualCenterUID.equals(otherObj.virtualCenterUID) : this.virtualCenterUID == otherObj.virtualCenterUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.uuid != null ? this.uuid.hashCode() : 0) ^ (this.virtualCenterUID != null ? this.virtualCenterUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "VmUID [uuid=" + this.uuid + ", " + "virtualCenterUID=" + this.virtualCenterUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmUID.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */