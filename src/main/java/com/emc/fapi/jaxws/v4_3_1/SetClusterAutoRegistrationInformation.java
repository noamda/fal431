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
/*     */ @XmlType(name="setClusterAutoRegistrationInformation", propOrder={"clusterUID", "autoRegInfo"})
/*     */ public class SetClusterAutoRegistrationInformation
/*     */ {
/*     */   @XmlElement(namespace="http://impl.version4_3_1.fapi.emc.com/")
/*     */   protected ClusterUID clusterUID;
/*     */   protected ClusterAutoRegistrationInformation autoRegInfo;
/*     */   
/*     */   public SetClusterAutoRegistrationInformation() {}
/*     */   
/*     */   public SetClusterAutoRegistrationInformation(ClusterUID clusterUID, ClusterAutoRegistrationInformation autoRegInfo)
/*     */   {
/*  49 */     this.clusterUID = clusterUID;
/*  50 */     this.autoRegInfo = autoRegInfo;
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
/*  62 */     return this.clusterUID;
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
/*  74 */     this.clusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterAutoRegistrationInformation getAutoRegInfo()
/*     */   {
/*  86 */     return this.autoRegInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAutoRegInfo(ClusterAutoRegistrationInformation value)
/*     */   {
/*  98 */     this.autoRegInfo = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 108 */     if (!(obj instanceof SetClusterAutoRegistrationInformation)) {
/* 109 */       return false;
/*     */     }
/* 111 */     SetClusterAutoRegistrationInformation otherObj = (SetClusterAutoRegistrationInformation)obj;
/*     */     
/* 113 */     return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.autoRegInfo != null ? this.autoRegInfo.equals(otherObj.autoRegInfo) : this.autoRegInfo == otherObj.autoRegInfo);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 123 */     return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.autoRegInfo != null ? this.autoRegInfo.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 133 */     return "SetClusterAutoRegistrationInformation [clusterUID=" + this.clusterUID + ", " + "autoRegInfo=" + this.autoRegInfo + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetClusterAutoRegistrationInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */