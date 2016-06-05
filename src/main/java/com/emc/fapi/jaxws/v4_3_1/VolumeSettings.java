/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=UserVolumeSettings.class, name="UserVolumeSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=RepositoryVolumeSettings.class, name="RepositoryVolumeSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=JournalVolumeSettings.class, name="JournalVolumeSettings")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VolumeSettings", propOrder={"volumeType", "clusterUID", "volumeInfo"})
/*     */ @XmlSeeAlso({UserVolumeSettings.class, RepositoryVolumeSettings.class, JournalVolumeSettings.class})
/*     */ public abstract class VolumeSettings
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VolumeType volumeType;
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   protected VolumeInformation volumeInfo;
/*     */   
/*     */   public VolumeSettings() {}
/*     */   
/*     */   public VolumeSettings(VolumeType volumeType, ClusterUID clusterUID, VolumeInformation volumeInfo)
/*     */   {
/*  72 */     this.volumeType = volumeType;
/*  73 */     this.clusterUID = clusterUID;
/*  74 */     this.volumeInfo = volumeInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VolumeType getVolumeType()
/*     */   {
/*  86 */     return this.volumeType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeType(VolumeType value)
/*     */   {
/*  98 */     this.volumeType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getClusterUID()
/*     */   {
/* 110 */     return this.clusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setClusterUID(ClusterUID value)
/*     */   {
/* 122 */     this.clusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VolumeInformation getVolumeInfo()
/*     */   {
/* 134 */     return this.volumeInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeInfo(VolumeInformation value)
/*     */   {
/* 146 */     this.volumeInfo = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 156 */     if (!(obj instanceof VolumeSettings)) {
/* 157 */       return false;
/*     */     }
/* 159 */     VolumeSettings otherObj = (VolumeSettings)obj;
/*     */     
/* 161 */     return (this.volumeType != null ? this.volumeType.equals(otherObj.volumeType) : this.volumeType == otherObj.volumeType) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.volumeInfo != null ? this.volumeInfo.equals(otherObj.volumeInfo) : this.volumeInfo == otherObj.volumeInfo);
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
/* 172 */     return (this.volumeType != null ? this.volumeType.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.volumeInfo != null ? this.volumeInfo.hashCode() : 0);
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
/* 183 */     return "VolumeSettings [volumeType=" + this.volumeType + ", " + "clusterUID=" + this.clusterUID + ", " + "volumeInfo=" + this.volumeInfo + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumeSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */