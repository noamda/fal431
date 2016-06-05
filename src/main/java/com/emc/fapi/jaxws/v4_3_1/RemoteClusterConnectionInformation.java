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
/*     */ @XmlType(name="RemoteClusterConnectionInformation", propOrder={"cluster", "connectionType"})
/*     */ public class RemoteClusterConnectionInformation
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   @XmlElement(nillable=true)
/*     */   protected ConnectionType connectionType;
/*     */   
/*     */   public RemoteClusterConnectionInformation() {}
/*     */   
/*     */   public RemoteClusterConnectionInformation(ClusterUID cluster, ConnectionType connectionType)
/*     */   {
/*  49 */     this.cluster = cluster;
/*  50 */     this.connectionType = connectionType;
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
/*  62 */     return this.cluster;
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
/*  74 */     this.cluster = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConnectionType getConnectionType()
/*     */   {
/*  86 */     return this.connectionType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConnectionType(ConnectionType value)
/*     */   {
/*  98 */     this.connectionType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 108 */     if (!(obj instanceof RemoteClusterConnectionInformation)) {
/* 109 */       return false;
/*     */     }
/* 111 */     RemoteClusterConnectionInformation otherObj = (RemoteClusterConnectionInformation)obj;
/*     */     
/* 113 */     return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.connectionType != null ? this.connectionType.equals(otherObj.connectionType) : this.connectionType == otherObj.connectionType);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 123 */     return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.connectionType != null ? this.connectionType.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 133 */     return "RemoteClusterConnectionInformation [cluster=" + this.cluster + ", " + "connectionType=" + this.connectionType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RemoteClusterConnectionInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */