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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="GlobalSystemConfiguration", propOrder={"accountId", "clustersConfigurations", "mtusInformation"})
/*     */ public class GlobalSystemConfiguration
/*     */ {
/*     */   protected String accountId;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterConfiguration> clustersConfigurations;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<MTUInformation> mtusInformation;
/*     */   
/*     */   public GlobalSystemConfiguration() {}
/*     */   
/*     */   public GlobalSystemConfiguration(String accountId, List<ClusterConfiguration> clustersConfigurations, List<MTUInformation> mtusInformation)
/*     */   {
/*  55 */     this.accountId = accountId;
/*  56 */     this.clustersConfigurations = clustersConfigurations;
/*  57 */     this.mtusInformation = mtusInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getAccountId()
/*     */   {
/*  69 */     return this.accountId;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAccountId(String value)
/*     */   {
/*  81 */     this.accountId = value;
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
/*     */   public List<ClusterConfiguration> getClustersConfigurations()
/*     */   {
/* 107 */     if (this.clustersConfigurations == null) {
/* 108 */       this.clustersConfigurations = new ArrayList();
/*     */     }
/* 110 */     return this.clustersConfigurations;
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
/*     */   public List<MTUInformation> getMtusInformation()
/*     */   {
/* 136 */     if (this.mtusInformation == null) {
/* 137 */       this.mtusInformation = new ArrayList();
/*     */     }
/* 139 */     return this.mtusInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 149 */     if (!(obj instanceof GlobalSystemConfiguration)) {
/* 150 */       return false;
/*     */     }
/* 152 */     GlobalSystemConfiguration otherObj = (GlobalSystemConfiguration)obj;
/*     */     
/* 154 */     return (this.accountId != null ? this.accountId.equals(otherObj.accountId) : this.accountId == otherObj.accountId) && (this.clustersConfigurations != null ? this.clustersConfigurations.equals(otherObj.clustersConfigurations) : this.clustersConfigurations == otherObj.clustersConfigurations) && (this.mtusInformation != null ? this.mtusInformation.equals(otherObj.mtusInformation) : this.mtusInformation == otherObj.mtusInformation);
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
/* 165 */     return (this.accountId != null ? this.accountId.hashCode() : 0) ^ (this.clustersConfigurations != null ? this.clustersConfigurations.hashCode() : 0) ^ (this.mtusInformation != null ? this.mtusInformation.hashCode() : 0);
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
/* 176 */     return "GlobalSystemConfiguration [accountId=" + this.accountId + ", " + "clustersConfigurations=" + this.clustersConfigurations + ", " + "mtusInformation=" + this.mtusInformation + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GlobalSystemConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */