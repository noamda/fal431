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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="RecoverPointVersion", propOrder={"version", "versionInformation"})
/*     */ public class RecoverPointVersion
/*     */ {
/*     */   protected String version;
/*     */   protected RecoverPointVersionInformation versionInformation;
/*     */   
/*     */   public RecoverPointVersion() {}
/*     */   
/*     */   public RecoverPointVersion(String version, RecoverPointVersionInformation versionInformation)
/*     */   {
/*  47 */     this.version = version;
/*  48 */     this.versionInformation = versionInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVersion()
/*     */   {
/*  60 */     return this.version;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVersion(String value)
/*     */   {
/*  72 */     this.version = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointVersionInformation getVersionInformation()
/*     */   {
/*  84 */     return this.versionInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVersionInformation(RecoverPointVersionInformation value)
/*     */   {
/*  96 */     this.versionInformation = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof RecoverPointVersion)) {
/* 107 */       return false;
/*     */     }
/* 109 */     RecoverPointVersion otherObj = (RecoverPointVersion)obj;
/*     */     
/* 111 */     return (this.version != null ? this.version.equals(otherObj.version) : this.version == otherObj.version) && (this.versionInformation != null ? this.versionInformation.equals(otherObj.versionInformation) : this.versionInformation == otherObj.versionInformation);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.version != null ? this.version.hashCode() : 0) ^ (this.versionInformation != null ? this.versionInformation.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "RecoverPointVersion [version=" + this.version + ", " + "versionInformation=" + this.versionInformation + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RecoverPointVersion.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */