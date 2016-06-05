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
/*     */ @XmlType(name="ExternalHostSettings", propOrder={"hostUID", "hostParams"})
/*     */ public class ExternalHostSettings
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ExternalHostUID hostUID;
/*     */   @XmlElement(required=true)
/*     */   protected ExternalHostParams hostParams;
/*     */   
/*     */   public ExternalHostSettings() {}
/*     */   
/*     */   public ExternalHostSettings(ExternalHostUID hostUID, ExternalHostParams hostParams)
/*     */   {
/*  50 */     this.hostUID = hostUID;
/*  51 */     this.hostParams = hostParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ExternalHostUID getHostUID()
/*     */   {
/*  63 */     return this.hostUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHostUID(ExternalHostUID value)
/*     */   {
/*  75 */     this.hostUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ExternalHostParams getHostParams()
/*     */   {
/*  87 */     return this.hostParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHostParams(ExternalHostParams value)
/*     */   {
/*  99 */     this.hostParams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof ExternalHostSettings)) {
/* 110 */       return false;
/*     */     }
/* 112 */     ExternalHostSettings otherObj = (ExternalHostSettings)obj;
/*     */     
/* 114 */     return (this.hostUID != null ? this.hostUID.equals(otherObj.hostUID) : this.hostUID == otherObj.hostUID) && (this.hostParams != null ? this.hostParams.equals(otherObj.hostParams) : this.hostParams == otherObj.hostParams);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.hostUID != null ? this.hostUID.hashCode() : 0) ^ (this.hostParams != null ? this.hostParams.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "ExternalHostSettings [hostUID=" + this.hostUID + ", " + "hostParams=" + this.hostParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ExternalHostSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */