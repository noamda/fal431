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
/*     */ @XmlType(name="SymmetrixHostId", propOrder={"rpaUID", "hostId"})
/*     */ public class SymmetrixHostId
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected RpaUID rpaUID;
/*     */   protected String hostId;
/*     */   
/*     */   public SymmetrixHostId() {}
/*     */   
/*     */   public SymmetrixHostId(RpaUID rpaUID, String hostId)
/*     */   {
/*  49 */     this.rpaUID = rpaUID;
/*  50 */     this.hostId = hostId;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaUID getRpaUID()
/*     */   {
/*  62 */     return this.rpaUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpaUID(RpaUID value)
/*     */   {
/*  74 */     this.rpaUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getHostId()
/*     */   {
/*  86 */     return this.hostId;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHostId(String value)
/*     */   {
/*  98 */     this.hostId = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 108 */     if (!(obj instanceof SymmetrixHostId)) {
/* 109 */       return false;
/*     */     }
/* 111 */     SymmetrixHostId otherObj = (SymmetrixHostId)obj;
/*     */     
/* 113 */     return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.hostId != null ? this.hostId.equals(otherObj.hostId) : this.hostId == otherObj.hostId);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 123 */     return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ (this.hostId != null ? this.hostId.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 133 */     return "SymmetrixHostId [rpaUID=" + this.rpaUID + ", " + "hostId=" + this.hostId + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SymmetrixHostId.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */