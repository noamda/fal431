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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="MountInformation", propOrder={"dataMover", "mountPath", "readOnly", "sharesInfo"})
/*     */ public class MountInformation
/*     */ {
/*     */   protected String dataMover;
/*     */   protected String mountPath;
/*     */   protected boolean readOnly;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ShareInformation> sharesInfo;
/*     */   
/*     */   public MountInformation() {}
/*     */   
/*     */   public MountInformation(String dataMover, String mountPath, boolean readOnly, List<ShareInformation> sharesInfo)
/*     */   {
/*  57 */     this.dataMover = dataMover;
/*  58 */     this.mountPath = mountPath;
/*  59 */     this.readOnly = readOnly;
/*  60 */     this.sharesInfo = sharesInfo;
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
/*  72 */     return this.dataMover;
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
/*  84 */     this.dataMover = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getMountPath()
/*     */   {
/*  96 */     return this.mountPath;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMountPath(String value)
/*     */   {
/* 108 */     this.mountPath = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isReadOnly()
/*     */   {
/* 116 */     return this.readOnly;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReadOnly(boolean value)
/*     */   {
/* 124 */     this.readOnly = value;
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
/*     */   public List<ShareInformation> getSharesInfo()
/*     */   {
/* 150 */     if (this.sharesInfo == null) {
/* 151 */       this.sharesInfo = new ArrayList();
/*     */     }
/* 153 */     return this.sharesInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 163 */     if (!(obj instanceof MountInformation)) {
/* 164 */       return false;
/*     */     }
/* 166 */     MountInformation otherObj = (MountInformation)obj;
/*     */     
/* 168 */     return (this.dataMover != null ? this.dataMover.equals(otherObj.dataMover) : this.dataMover == otherObj.dataMover) && (this.mountPath != null ? this.mountPath.equals(otherObj.mountPath) : this.mountPath == otherObj.mountPath) && (this.readOnly == otherObj.readOnly) && (this.sharesInfo != null ? this.sharesInfo.equals(otherObj.sharesInfo) : this.sharesInfo == otherObj.sharesInfo);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 180 */     return (this.dataMover != null ? this.dataMover.hashCode() : 0) ^ (this.mountPath != null ? this.mountPath.hashCode() : 0) ^ (this.readOnly ? 1 : 0) ^ (this.sharesInfo != null ? this.sharesInfo.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 192 */     return "MountInformation [dataMover=" + this.dataMover + ", " + "mountPath=" + this.mountPath + ", " + "readOnly=" + this.readOnly + ", " + "sharesInfo=" + this.sharesInfo + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\MountInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */