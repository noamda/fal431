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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ExternalHostParams", propOrder={"clusterUID", "hostNiceName", "configParams"})
/*     */ public class ExternalHostParams
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   @XmlElement(required=true)
/*     */   protected String hostNiceName;
/*     */   @XmlElement(required=true)
/*     */   protected ConfigurationParams configParams;
/*     */   
/*     */   public ExternalHostParams() {}
/*     */   
/*     */   public ExternalHostParams(ClusterUID clusterUID, String hostNiceName, ConfigurationParams configParams)
/*     */   {
/*  54 */     this.clusterUID = clusterUID;
/*  55 */     this.hostNiceName = hostNiceName;
/*  56 */     this.configParams = configParams;
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
/*  68 */     return this.clusterUID;
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
/*  80 */     this.clusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getHostNiceName()
/*     */   {
/*  92 */     return this.hostNiceName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHostNiceName(String value)
/*     */   {
/* 104 */     this.hostNiceName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConfigurationParams getConfigParams()
/*     */   {
/* 116 */     return this.configParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConfigParams(ConfigurationParams value)
/*     */   {
/* 128 */     this.configParams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 138 */     if (!(obj instanceof ExternalHostParams)) {
/* 139 */       return false;
/*     */     }
/* 141 */     ExternalHostParams otherObj = (ExternalHostParams)obj;
/*     */     
/* 143 */     return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.hostNiceName != null ? this.hostNiceName.equals(otherObj.hostNiceName) : this.hostNiceName == otherObj.hostNiceName) && (this.configParams != null ? this.configParams.equals(otherObj.configParams) : this.configParams == otherObj.configParams);
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
/* 154 */     return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.hostNiceName != null ? this.hostNiceName.hashCode() : 0) ^ (this.configParams != null ? this.configParams.hashCode() : 0);
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
/* 165 */     return "ExternalHostParams [clusterUID=" + this.clusterUID + ", " + "hostNiceName=" + this.hostNiceName + ", " + "configParams=" + this.configParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ExternalHostParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */