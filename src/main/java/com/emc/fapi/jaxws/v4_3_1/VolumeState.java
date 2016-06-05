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
/*     */ 
/*     */ 
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=RepositoryVolumeState.class, name="RepositoryVolumeState"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=UserVolumeState.class, name="UserVolumeState"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=JournalVolumeState.class, name="JournalVolumeState")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VolumeState", propOrder={"volumeType", "clusterUID", "volumeID", "rpasAccessStatus"})
/*     */ @XmlSeeAlso({UserVolumeState.class, JournalVolumeState.class, RepositoryVolumeState.class})
/*     */ public abstract class VolumeState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VolumeType volumeType;
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   protected DeviceUID volumeID;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VolumeRPAAccessStatus> rpasAccessStatus;
/*     */   
/*     */   public VolumeState() {}
/*     */   
/*     */   public VolumeState(VolumeType volumeType, ClusterUID clusterUID, DeviceUID volumeID, List<VolumeRPAAccessStatus> rpasAccessStatus)
/*     */   {
/*  78 */     this.volumeType = volumeType;
/*  79 */     this.clusterUID = clusterUID;
/*  80 */     this.volumeID = volumeID;
/*  81 */     this.rpasAccessStatus = rpasAccessStatus;
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
/*  93 */     return this.volumeType;
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
/* 105 */     this.volumeType = value;
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
/* 117 */     return this.clusterUID;
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
/* 129 */     this.clusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DeviceUID getVolumeID()
/*     */   {
/* 141 */     return this.volumeID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeID(DeviceUID value)
/*     */   {
/* 153 */     this.volumeID = value;
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
/*     */   public List<VolumeRPAAccessStatus> getRpasAccessStatus()
/*     */   {
/* 179 */     if (this.rpasAccessStatus == null) {
/* 180 */       this.rpasAccessStatus = new ArrayList();
/*     */     }
/* 182 */     return this.rpasAccessStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 192 */     if (!(obj instanceof VolumeState)) {
/* 193 */       return false;
/*     */     }
/* 195 */     VolumeState otherObj = (VolumeState)obj;
/*     */     
/* 197 */     return (this.volumeType != null ? this.volumeType.equals(otherObj.volumeType) : this.volumeType == otherObj.volumeType) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID) && (this.rpasAccessStatus != null ? this.rpasAccessStatus.equals(otherObj.rpasAccessStatus) : this.rpasAccessStatus == otherObj.rpasAccessStatus);
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
/* 209 */     return (this.volumeType != null ? this.volumeType.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.volumeID != null ? this.volumeID.hashCode() : 0) ^ (this.rpasAccessStatus != null ? this.rpasAccessStatus.hashCode() : 0);
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
/* 221 */     return "VolumeState [volumeType=" + this.volumeType + ", " + "clusterUID=" + this.clusterUID + ", " + "volumeID=" + this.volumeID + ", " + "rpasAccessStatus=" + this.rpasAccessStatus + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumeState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */