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
/*     */ @XmlType(name="VirtualCenterUID", propOrder={"uuid"})
/*     */ public class VirtualCenterUID
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String uuid;
/*     */   
/*     */   public VirtualCenterUID() {}
/*     */   
/*     */   public VirtualCenterUID(String uuid)
/*     */   {
/*  46 */     this.uuid = uuid;
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
/*  58 */     return this.uuid;
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
/*  70 */     this.uuid = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof VirtualCenterUID)) {
/*  81 */       return false;
/*     */     }
/*  83 */     VirtualCenterUID otherObj = (VirtualCenterUID)obj;
/*     */     
/*  85 */     return this.uuid == otherObj.uuid ? true : this.uuid != null ? this.uuid.equals(otherObj.uuid) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  94 */     return this.uuid != null ? this.uuid.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 103 */     return "VirtualCenterUID [uuid=" + this.uuid + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualCenterUID.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */