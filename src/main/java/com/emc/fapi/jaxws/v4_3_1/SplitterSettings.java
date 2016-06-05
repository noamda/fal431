/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonSubTypes;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.As;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=AggregatedSplitterSettings.class, name="AggregatedSplitterSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ArrayBasedSplitterSettings.class, name="ArrayBasedSplitterSettings")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SplitterSettings", propOrder={"splitterUID", "splitterName", "attachedUserVolumes", "arrayUID"})
/*     */ @XmlSeeAlso({ArrayBasedSplitterSettings.class, AggregatedSplitterSettings.class})
/*     */ public class SplitterSettings
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected SplitterUID splitterUID;
/*     */   protected String splitterName;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<AttachedUserVolumeInfo> attachedUserVolumes;
/*     */   @XmlElement(nillable=true)
/*     */   protected ArrayUID arrayUID;
/*     */   
/*     */   public SplitterSettings() {}
/*     */   
/*     */   public SplitterSettings(SplitterUID splitterUID, String splitterName, List<AttachedUserVolumeInfo> attachedUserVolumes, ArrayUID arrayUID)
/*     */   {
/*  76 */     this.splitterUID = splitterUID;
/*  77 */     this.splitterName = splitterName;
/*  78 */     this.attachedUserVolumes = attachedUserVolumes;
/*  79 */     this.arrayUID = arrayUID;
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
/*  91 */     return this.splitterUID;
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
/* 103 */     this.splitterUID = value;
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
/* 115 */     return this.splitterName;
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
/* 127 */     this.splitterName = value;
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
/*     */   public List<AttachedUserVolumeInfo> getAttachedUserVolumes()
/*     */   {
/* 153 */     if (this.attachedUserVolumes == null) {
/* 154 */       this.attachedUserVolumes = new ArrayList();
/*     */     }
/* 156 */     return this.attachedUserVolumes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayUID getArrayUID()
/*     */   {
/* 168 */     return this.arrayUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArrayUID(ArrayUID value)
/*     */   {
/* 180 */     this.arrayUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 190 */     if (!(obj instanceof SplitterSettings)) {
/* 191 */       return false;
/*     */     }
/* 193 */     SplitterSettings otherObj = (SplitterSettings)obj;
/*     */     
/* 195 */     return (this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : this.splitterUID == otherObj.splitterUID) && (this.splitterName != null ? this.splitterName.equals(otherObj.splitterName) : this.splitterName == otherObj.splitterName) && (this.attachedUserVolumes != null ? this.attachedUserVolumes.equals(otherObj.attachedUserVolumes) : this.attachedUserVolumes == otherObj.attachedUserVolumes) && (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID);
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
/* 207 */     return (this.splitterUID != null ? this.splitterUID.hashCode() : 0) ^ (this.splitterName != null ? this.splitterName.hashCode() : 0) ^ (this.attachedUserVolumes != null ? this.attachedUserVolumes.hashCode() : 0) ^ (this.arrayUID != null ? this.arrayUID.hashCode() : 0);
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
/* 219 */     return "SplitterSettings [splitterUID=" + this.splitterUID + ", " + "splitterName=" + this.splitterName + ", " + "attachedUserVolumes=" + this.attachedUserVolumes + ", " + "arrayUID=" + this.arrayUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SplitterSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */