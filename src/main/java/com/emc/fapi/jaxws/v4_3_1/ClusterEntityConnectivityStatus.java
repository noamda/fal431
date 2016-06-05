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
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=RPAConnectivityStatus.class, name="RPAConnectivityStatus"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VolumeConnectivityStatus.class, name="VolumeConnectivityStatus"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=SplitterConnectivityStatus.class, name="SplitterConnectivityStatus")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ClusterEntityConnectivityStatus", propOrder={"clusterUID", "entityType", "connectivityStatus"})
/*     */ @XmlSeeAlso({RPAConnectivityStatus.class, VolumeConnectivityStatus.class, SplitterConnectivityStatus.class})
/*     */ public abstract class ClusterEntityConnectivityStatus
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   protected ClusterEntityType entityType;
/*     */   protected GeneralStatus connectivityStatus;
/*     */   
/*     */   public ClusterEntityConnectivityStatus() {}
/*     */   
/*     */   public ClusterEntityConnectivityStatus(ClusterUID clusterUID, ClusterEntityType entityType, GeneralStatus connectivityStatus)
/*     */   {
/*  71 */     this.clusterUID = clusterUID;
/*  72 */     this.entityType = entityType;
/*  73 */     this.connectivityStatus = connectivityStatus;
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
/*  85 */     return this.clusterUID;
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
/*  97 */     this.clusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterEntityType getEntityType()
/*     */   {
/* 109 */     return this.entityType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEntityType(ClusterEntityType value)
/*     */   {
/* 121 */     this.entityType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GeneralStatus getConnectivityStatus()
/*     */   {
/* 133 */     return this.connectivityStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConnectivityStatus(GeneralStatus value)
/*     */   {
/* 145 */     this.connectivityStatus = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 155 */     if (!(obj instanceof ClusterEntityConnectivityStatus)) {
/* 156 */       return false;
/*     */     }
/* 158 */     ClusterEntityConnectivityStatus otherObj = (ClusterEntityConnectivityStatus)obj;
/*     */     
/* 160 */     return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.entityType != null ? this.entityType.equals(otherObj.entityType) : this.entityType == otherObj.entityType) && (this.connectivityStatus != null ? this.connectivityStatus.equals(otherObj.connectivityStatus) : this.connectivityStatus == otherObj.connectivityStatus);
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
/* 171 */     return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.entityType != null ? this.entityType.hashCode() : 0) ^ (this.connectivityStatus != null ? this.connectivityStatus.hashCode() : 0);
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
/* 182 */     return "ClusterEntityConnectivityStatus [clusterUID=" + this.clusterUID + ", " + "entityType=" + this.entityType + ", " + "connectivityStatus=" + this.connectivityStatus + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClusterEntityConnectivityStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */