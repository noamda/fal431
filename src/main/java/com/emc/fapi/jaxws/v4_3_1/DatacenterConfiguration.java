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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="DatacenterConfiguration", propOrder={"datacenterUID", "name", "esxClustersConfiguration", "datastoresConfiguration", "datastoreClustersConfiguration"})
/*     */ public class DatacenterConfiguration
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected DatacenterUID datacenterUID;
/*     */   protected String name;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<EsxClusterConfiguration> esxClustersConfiguration;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DatastoreConfiguration> datastoresConfiguration;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DatastoreClusterConfiguration> datastoreClustersConfiguration;
/*     */   
/*     */   public DatacenterConfiguration() {}
/*     */   
/*     */   public DatacenterConfiguration(DatacenterUID datacenterUID, String name, List<EsxClusterConfiguration> esxClustersConfiguration, List<DatastoreConfiguration> datastoresConfiguration, List<DatastoreClusterConfiguration> datastoreClustersConfiguration)
/*     */   {
/*  63 */     this.datacenterUID = datacenterUID;
/*  64 */     this.name = name;
/*  65 */     this.esxClustersConfiguration = esxClustersConfiguration;
/*  66 */     this.datastoresConfiguration = datastoresConfiguration;
/*  67 */     this.datastoreClustersConfiguration = datastoreClustersConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DatacenterUID getDatacenterUID()
/*     */   {
/*  79 */     return this.datacenterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDatacenterUID(DatacenterUID value)
/*     */   {
/*  91 */     this.datacenterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getName()
/*     */   {
/* 103 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/* 115 */     this.name = value;
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
/*     */   public List<EsxClusterConfiguration> getEsxClustersConfiguration()
/*     */   {
/* 141 */     if (this.esxClustersConfiguration == null) {
/* 142 */       this.esxClustersConfiguration = new ArrayList();
/*     */     }
/* 144 */     return this.esxClustersConfiguration;
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
/*     */   public List<DatastoreConfiguration> getDatastoresConfiguration()
/*     */   {
/* 170 */     if (this.datastoresConfiguration == null) {
/* 171 */       this.datastoresConfiguration = new ArrayList();
/*     */     }
/* 173 */     return this.datastoresConfiguration;
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
/*     */   public List<DatastoreClusterConfiguration> getDatastoreClustersConfiguration()
/*     */   {
/* 199 */     if (this.datastoreClustersConfiguration == null) {
/* 200 */       this.datastoreClustersConfiguration = new ArrayList();
/*     */     }
/* 202 */     return this.datastoreClustersConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 212 */     if (!(obj instanceof DatacenterConfiguration)) {
/* 213 */       return false;
/*     */     }
/* 215 */     DatacenterConfiguration otherObj = (DatacenterConfiguration)obj;
/*     */     
/* 217 */     return (this.datacenterUID != null ? this.datacenterUID.equals(otherObj.datacenterUID) : this.datacenterUID == otherObj.datacenterUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.esxClustersConfiguration != null ? this.esxClustersConfiguration.equals(otherObj.esxClustersConfiguration) : this.esxClustersConfiguration == otherObj.esxClustersConfiguration) && (this.datastoresConfiguration != null ? this.datastoresConfiguration.equals(otherObj.datastoresConfiguration) : this.datastoresConfiguration == otherObj.datastoresConfiguration) && (this.datastoreClustersConfiguration != null ? this.datastoreClustersConfiguration.equals(otherObj.datastoreClustersConfiguration) : this.datastoreClustersConfiguration == otherObj.datastoreClustersConfiguration);
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
/*     */   public int hashCode()
/*     */   {
/* 230 */     return (this.datacenterUID != null ? this.datacenterUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.esxClustersConfiguration != null ? this.esxClustersConfiguration.hashCode() : 0) ^ (this.datastoresConfiguration != null ? this.datastoresConfiguration.hashCode() : 0) ^ (this.datastoreClustersConfiguration != null ? this.datastoreClustersConfiguration.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 243 */     return "DatacenterConfiguration [datacenterUID=" + this.datacenterUID + ", " + "name=" + this.name + ", " + "esxClustersConfiguration=" + this.esxClustersConfiguration + ", " + "datastoresConfiguration=" + this.datastoresConfiguration + ", " + "datastoreClustersConfiguration=" + this.datastoreClustersConfiguration + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\DatacenterConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */