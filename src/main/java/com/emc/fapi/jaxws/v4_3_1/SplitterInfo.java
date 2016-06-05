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
/*     */ @XmlType(name="SplitterInfo", propOrder={"splitterUID", "splitterName"})
/*     */ public class SplitterInfo
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected SplitterUID splitterUID;
/*     */   @XmlElement(required=true)
/*     */   protected String splitterName;
/*     */   
/*     */   public SplitterInfo() {}
/*     */   
/*     */   public SplitterInfo(SplitterUID splitterUID, String splitterName)
/*     */   {
/*  50 */     this.splitterUID = splitterUID;
/*  51 */     this.splitterName = splitterName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterUID getSplitterUID()
/*     */   {
/*  63 */     return this.splitterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitterUID(SplitterUID value)
/*     */   {
/*  75 */     this.splitterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSplitterName()
/*     */   {
/*  87 */     return this.splitterName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitterName(String value)
/*     */   {
/*  99 */     this.splitterName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof SplitterInfo)) {
/* 110 */       return false;
/*     */     }
/* 112 */     SplitterInfo otherObj = (SplitterInfo)obj;
/*     */     
/* 114 */     return (this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : this.splitterUID == otherObj.splitterUID) && (this.splitterName != null ? this.splitterName.equals(otherObj.splitterName) : this.splitterName == otherObj.splitterName);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.splitterUID != null ? this.splitterUID.hashCode() : 0) ^ (this.splitterName != null ? this.splitterName.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "SplitterInfo [splitterUID=" + this.splitterUID + ", " + "splitterName=" + this.splitterName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SplitterInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */