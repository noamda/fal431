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
/*     */ @XmlType(name="getSymmetrixGateKeepersInfo", propOrder={"cluster", "symmetrixID"})
/*     */ public class GetSymmetrixGateKeepersInfo
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   protected String symmetrixID;
/*     */   
/*     */   public GetSymmetrixGateKeepersInfo() {}
/*     */   
/*     */   public GetSymmetrixGateKeepersInfo(ClusterUID cluster, String symmetrixID)
/*     */   {
/*  47 */     this.cluster = cluster;
/*  48 */     this.symmetrixID = symmetrixID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getCluster()
/*     */   {
/*  60 */     return this.cluster;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCluster(ClusterUID value)
/*     */   {
/*  72 */     this.cluster = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSymmetrixID()
/*     */   {
/*  84 */     return this.symmetrixID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSymmetrixID(String value)
/*     */   {
/*  96 */     this.symmetrixID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof GetSymmetrixGateKeepersInfo)) {
/* 107 */       return false;
/*     */     }
/* 109 */     GetSymmetrixGateKeepersInfo otherObj = (GetSymmetrixGateKeepersInfo)obj;
/*     */     
/* 111 */     return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.symmetrixID != null ? this.symmetrixID.equals(otherObj.symmetrixID) : this.symmetrixID == otherObj.symmetrixID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.symmetrixID != null ? this.symmetrixID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "GetSymmetrixGateKeepersInfo [cluster=" + this.cluster + ", " + "symmetrixID=" + this.symmetrixID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetSymmetrixGateKeepersInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */