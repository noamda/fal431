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
/*     */ @XmlType(name="EsxClusterConfiguration", propOrder={"esxClusterUID", "name", "esxsConfiguration", "resourcePoolConfiguration", "abilities"})
/*     */ public class EsxClusterConfiguration
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected EsxClusterUID esxClusterUID;
/*     */   protected String name;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<EsxConfiguration> esxsConfiguration;
/*     */   @XmlElement(nillable=true)
/*     */   protected ResourcePoolConfiguration resourcePoolConfiguration;
/*     */   protected EsxClusterAbilities abilities;
/*     */   
/*     */   public EsxClusterConfiguration() {}
/*     */   
/*     */   public EsxClusterConfiguration(EsxClusterUID esxClusterUID, String name, List<EsxConfiguration> esxsConfiguration, ResourcePoolConfiguration resourcePoolConfiguration, EsxClusterAbilities abilities)
/*     */   {
/*  62 */     this.esxClusterUID = esxClusterUID;
/*  63 */     this.name = name;
/*  64 */     this.esxsConfiguration = esxsConfiguration;
/*  65 */     this.resourcePoolConfiguration = resourcePoolConfiguration;
/*  66 */     this.abilities = abilities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EsxClusterUID getEsxClusterUID()
/*     */   {
/*  78 */     return this.esxClusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEsxClusterUID(EsxClusterUID value)
/*     */   {
/*  90 */     this.esxClusterUID = value;
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
/* 102 */     return this.name;
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
/* 114 */     this.name = value;
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
/*     */   public List<EsxConfiguration> getEsxsConfiguration()
/*     */   {
/* 140 */     if (this.esxsConfiguration == null) {
/* 141 */       this.esxsConfiguration = new ArrayList();
/*     */     }
/* 143 */     return this.esxsConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ResourcePoolConfiguration getResourcePoolConfiguration()
/*     */   {
/* 155 */     return this.resourcePoolConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResourcePoolConfiguration(ResourcePoolConfiguration value)
/*     */   {
/* 167 */     this.resourcePoolConfiguration = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EsxClusterAbilities getAbilities()
/*     */   {
/* 179 */     return this.abilities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAbilities(EsxClusterAbilities value)
/*     */   {
/* 191 */     this.abilities = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 201 */     if (!(obj instanceof EsxClusterConfiguration)) {
/* 202 */       return false;
/*     */     }
/* 204 */     EsxClusterConfiguration otherObj = (EsxClusterConfiguration)obj;
/*     */     
/* 206 */     return (this.esxClusterUID != null ? this.esxClusterUID.equals(otherObj.esxClusterUID) : this.esxClusterUID == otherObj.esxClusterUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.esxsConfiguration != null ? this.esxsConfiguration.equals(otherObj.esxsConfiguration) : this.esxsConfiguration == otherObj.esxsConfiguration) && (this.resourcePoolConfiguration != null ? this.resourcePoolConfiguration.equals(otherObj.resourcePoolConfiguration) : this.resourcePoolConfiguration == otherObj.resourcePoolConfiguration) && (this.abilities != null ? this.abilities.equals(otherObj.abilities) : this.abilities == otherObj.abilities);
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
/* 219 */     return (this.esxClusterUID != null ? this.esxClusterUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.esxsConfiguration != null ? this.esxsConfiguration.hashCode() : 0) ^ (this.resourcePoolConfiguration != null ? this.resourcePoolConfiguration.hashCode() : 0) ^ (this.abilities != null ? this.abilities.hashCode() : 0);
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
/* 232 */     return "EsxClusterConfiguration [esxClusterUID=" + this.esxClusterUID + ", " + "name=" + this.name + ", " + "esxsConfiguration=" + this.esxsConfiguration + ", " + "resourcePoolConfiguration=" + this.resourcePoolConfiguration + ", " + "abilities=" + this.abilities + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EsxClusterConfiguration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */