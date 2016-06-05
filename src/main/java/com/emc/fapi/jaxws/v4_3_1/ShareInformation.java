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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ShareInformation", propOrder={"sharePath", "dataMover", "shareType"})
/*     */ public class ShareInformation
/*     */ {
/*     */   protected String sharePath;
/*     */   protected String dataMover;
/*     */   @XmlElement(nillable=true)
/*     */   protected ShareType shareType;
/*     */   
/*     */   public ShareInformation() {}
/*     */   
/*     */   public ShareInformation(String sharePath, String dataMover, ShareType shareType)
/*     */   {
/*  52 */     this.sharePath = sharePath;
/*  53 */     this.dataMover = dataMover;
/*  54 */     this.shareType = shareType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSharePath()
/*     */   {
/*  66 */     return this.sharePath;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSharePath(String value)
/*     */   {
/*  78 */     this.sharePath = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDataMover()
/*     */   {
/*  90 */     return this.dataMover;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDataMover(String value)
/*     */   {
/* 102 */     this.dataMover = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ShareType getShareType()
/*     */   {
/* 114 */     return this.shareType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setShareType(ShareType value)
/*     */   {
/* 126 */     this.shareType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 136 */     if (!(obj instanceof ShareInformation)) {
/* 137 */       return false;
/*     */     }
/* 139 */     ShareInformation otherObj = (ShareInformation)obj;
/*     */     
/* 141 */     return (this.sharePath != null ? this.sharePath.equals(otherObj.sharePath) : this.sharePath == otherObj.sharePath) && (this.dataMover != null ? this.dataMover.equals(otherObj.dataMover) : this.dataMover == otherObj.dataMover) && (this.shareType != null ? this.shareType.equals(otherObj.shareType) : this.shareType == otherObj.shareType);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 152 */     return (this.sharePath != null ? this.sharePath.hashCode() : 0) ^ (this.dataMover != null ? this.dataMover.hashCode() : 0) ^ (this.shareType != null ? this.shareType.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 163 */     return "ShareInformation [sharePath=" + this.sharePath + ", " + "dataMover=" + this.dataMover + ", " + "shareType=" + this.shareType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ShareInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */