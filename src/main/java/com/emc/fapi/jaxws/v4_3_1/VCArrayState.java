/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonTypeName;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("VCArrayState")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VCArrayState", propOrder={"vwcPluginVersion", "esxClustersConnectivity"})
/*     */ public class VCArrayState
/*     */   extends ArrayState
/*     */ {
/*     */   protected String vwcPluginVersion;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<EsxClusterConnectivity> esxClustersConnectivity;
/*     */   
/*     */   public VCArrayState() {}
/*     */   
/*     */   public VCArrayState(String vwcPluginVersion, List<EsxClusterConnectivity> esxClustersConnectivity)
/*     */   {
/*  61 */     this.vwcPluginVersion = vwcPluginVersion;
/*  62 */     this.esxClustersConnectivity = esxClustersConnectivity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVwcPluginVersion()
/*     */   {
/*  74 */     return this.vwcPluginVersion;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVwcPluginVersion(String value)
/*     */   {
/*  86 */     this.vwcPluginVersion = value;
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
/*     */   public List<EsxClusterConnectivity> getEsxClustersConnectivity()
/*     */   {
/* 112 */     if (this.esxClustersConnectivity == null) {
/* 113 */       this.esxClustersConnectivity = new ArrayList();
/*     */     }
/* 115 */     return this.esxClustersConnectivity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 125 */     if (!(obj instanceof VCArrayState)) {
/* 126 */       return false;
/*     */     }
/* 128 */     VCArrayState otherObj = (VCArrayState)obj;
/*     */     
/* 130 */     return (super.equals(obj)) && (this.vwcPluginVersion != null ? this.vwcPluginVersion.equals(otherObj.vwcPluginVersion) : this.vwcPluginVersion == otherObj.vwcPluginVersion) && (this.esxClustersConnectivity != null ? this.esxClustersConnectivity.equals(otherObj.esxClustersConnectivity) : this.esxClustersConnectivity == otherObj.esxClustersConnectivity);
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
/* 141 */     return super.hashCode() ^ (this.vwcPluginVersion != null ? this.vwcPluginVersion.hashCode() : 0) ^ (this.esxClustersConnectivity != null ? this.esxClustersConnectivity.hashCode() : 0);
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
/* 152 */     return "VCArrayState [super=" + super.toString() + ", " + "vwcPluginVersion=" + this.vwcPluginVersion + ", " + "esxClustersConnectivity=" + this.esxClustersConnectivity + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VCArrayState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */