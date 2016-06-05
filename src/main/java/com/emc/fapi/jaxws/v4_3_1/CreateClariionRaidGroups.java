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
/*     */ @XmlType(name="createClariionRaidGroups", propOrder={"cluster", "numberOfGroups"})
/*     */ public class CreateClariionRaidGroups
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   protected int numberOfGroups;
/*     */   
/*     */   public CreateClariionRaidGroups() {}
/*     */   
/*     */   public CreateClariionRaidGroups(ClusterUID cluster, int numberOfGroups)
/*     */   {
/*  47 */     this.cluster = cluster;
/*  48 */     this.numberOfGroups = numberOfGroups;
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
/*     */   public int getNumberOfGroups()
/*     */   {
/*  80 */     return this.numberOfGroups;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNumberOfGroups(int value)
/*     */   {
/*  88 */     this.numberOfGroups = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof CreateClariionRaidGroups)) {
/*  99 */       return false;
/*     */     }
/* 101 */     CreateClariionRaidGroups otherObj = (CreateClariionRaidGroups)obj;
/*     */     
/* 103 */     return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.numberOfGroups == otherObj.numberOfGroups);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (this.cluster != null ? this.cluster.hashCode() : 0) ^ this.numberOfGroups;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "CreateClariionRaidGroups [cluster=" + this.cluster + ", " + "numberOfGroups=" + this.numberOfGroups + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CreateClariionRaidGroups.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */