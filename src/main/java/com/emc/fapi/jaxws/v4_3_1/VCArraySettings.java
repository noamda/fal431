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
/*     */ @JsonTypeName("VCArraySettings")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VCArraySettings", propOrder={"registeredEsxClusters"})
/*     */ public class VCArraySettings
/*     */   extends ArraySettings
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<EsxCluster> registeredEsxClusters;
/*     */   
/*     */   public VCArraySettings() {}
/*     */   
/*     */   public VCArraySettings(List<EsxCluster> registeredEsxClusters)
/*     */   {
/*  58 */     this.registeredEsxClusters = registeredEsxClusters;
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
/*     */   public List<EsxCluster> getRegisteredEsxClusters()
/*     */   {
/*  84 */     if (this.registeredEsxClusters == null) {
/*  85 */       this.registeredEsxClusters = new ArrayList();
/*     */     }
/*  87 */     return this.registeredEsxClusters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  97 */     if (!(obj instanceof VCArraySettings)) {
/*  98 */       return false;
/*     */     }
/* 100 */     VCArraySettings otherObj = (VCArraySettings)obj;
/*     */     
/* 102 */     return (super.equals(obj)) && (this.registeredEsxClusters != null ? this.registeredEsxClusters.equals(otherObj.registeredEsxClusters) : this.registeredEsxClusters == otherObj.registeredEsxClusters);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 112 */     return super.hashCode() ^ (this.registeredEsxClusters != null ? this.registeredEsxClusters.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 122 */     return "VCArraySettings [super=" + super.toString() + ", " + "registeredEsxClusters=" + this.registeredEsxClusters + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VCArraySettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */