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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="EsxConfiguration", propOrder={"esxUID", "name", "version", "nonRelevantVMs"})
/*     */ public class EsxConfiguration
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected EsxUID esxUID;
/*     */   protected String name;
/*     */   protected String version;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VmUID> nonRelevantVMs;
/*     */   
/*     */   public EsxConfiguration() {}
/*     */   
/*     */   public EsxConfiguration(EsxUID esxUID, String name, String version, List<VmUID> nonRelevantVMs)
/*     */   {
/*  58 */     this.esxUID = esxUID;
/*  59 */     this.name = name;
/*  60 */     this.version = version;
/*  61 */     this.nonRelevantVMs = nonRelevantVMs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EsxUID getEsxUID()
/*     */   {
/*  73 */     return this.esxUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEsxUID(EsxUID value)
/*     */   {
/*  85 */     this.esxUID = value;
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
/*  97 */     return this.name;
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
/* 109 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVersion()
/*     */   {
/* 121 */     return this.version;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVersion(String value)
/*     */   {
/* 133 */     this.version = value;
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
/*     */   public List<VmUID> getNonRelevantVMs()
/*     */   {
/* 159 */     if (this.nonRelevantVMs == null) {
/* 160 */       this.nonRelevantVMs = new ArrayList();
/*     */     }
/* 162 */     return this.nonRelevantVMs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 172 */     if (!(obj instanceof EsxConfiguration)) {
/* 173 */       return false;
/*     */     }
/* 175 */     EsxConfiguration otherObj = (EsxConfiguration)obj;
/*     */     
/* 177 */     return (this.esxUID != null ? this.esxUID.equals(otherObj.esxUID) : this.esxUID == otherObj.esxUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.version != null ? this.version.equals(otherObj.version) : this.version == otherObj.version) && (this.nonRelevantVMs != null ? this.nonRelevantVMs.equals(otherObj.nonRelevantVMs) : this.nonRelevantVMs == otherObj.nonRelevantVMs);
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
/* 189 */     return (this.esxUID != null ? this.esxUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.version != null ? this.version.hashCode() : 0) ^ (this.nonRelevantVMs != null ? this.nonRelevantVMs.hashCode() : 0);
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
/* 201 */     return "EsxConfiguration [esxUID=" + this.esxUID + ", " + "name=" + this.name + ", " + "version=" + this.version + ", " + "nonRelevantVMs=" + this.nonRelevantVMs + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EsxConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */