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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("FullRecoverPointContext")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="FullRecoverPointContext", propOrder={"fullSettingsContext", "fullStateContext", "systemStatusContext", "clustersSANVolumesContexts", "clustersClariionVolumesContexts", "clustersVCentersServersContexts"})
/*     */ public class FullRecoverPointContext
/*     */   extends FunctionalAPIContext
/*     */ {
/*     */   protected FullRecoverPointSettingsContext fullSettingsContext;
/*     */   protected FullRecoverPointStateContext fullStateContext;
/*     */   @XmlElement(nillable=true)
/*     */   protected SystemStatusContext systemStatusContext;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClusterSANVolumesContext> clustersSANVolumesContexts;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ClariionVolumesContext> clustersClariionVolumesContexts;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VCenterServerViewContext> clustersVCentersServersContexts;
/*     */   
/*     */   public FullRecoverPointContext() {}
/*     */   
/*     */   public FullRecoverPointContext(FullRecoverPointSettingsContext fullSettingsContext, FullRecoverPointStateContext fullStateContext, SystemStatusContext systemStatusContext, List<ClusterSANVolumesContext> clustersSANVolumesContexts, List<ClariionVolumesContext> clustersClariionVolumesContexts, List<VCenterServerViewContext> clustersVCentersServersContexts)
/*     */   {
/*  76 */     this.fullSettingsContext = fullSettingsContext;
/*  77 */     this.fullStateContext = fullStateContext;
/*  78 */     this.systemStatusContext = systemStatusContext;
/*  79 */     this.clustersSANVolumesContexts = clustersSANVolumesContexts;
/*  80 */     this.clustersClariionVolumesContexts = clustersClariionVolumesContexts;
/*  81 */     this.clustersVCentersServersContexts = clustersVCentersServersContexts;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public FullRecoverPointSettingsContext getFullSettingsContext()
/*     */   {
/*  93 */     return this.fullSettingsContext;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFullSettingsContext(FullRecoverPointSettingsContext value)
/*     */   {
/* 105 */     this.fullSettingsContext = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public FullRecoverPointStateContext getFullStateContext()
/*     */   {
/* 117 */     return this.fullStateContext;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFullStateContext(FullRecoverPointStateContext value)
/*     */   {
/* 129 */     this.fullStateContext = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemStatusContext getSystemStatusContext()
/*     */   {
/* 141 */     return this.systemStatusContext;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSystemStatusContext(SystemStatusContext value)
/*     */   {
/* 153 */     this.systemStatusContext = value;
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
/*     */   public List<ClusterSANVolumesContext> getClustersSANVolumesContexts()
/*     */   {
/* 179 */     if (this.clustersSANVolumesContexts == null) {
/* 180 */       this.clustersSANVolumesContexts = new ArrayList();
/*     */     }
/* 182 */     return this.clustersSANVolumesContexts;
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
/*     */   public List<ClariionVolumesContext> getClustersClariionVolumesContexts()
/*     */   {
/* 208 */     if (this.clustersClariionVolumesContexts == null) {
/* 209 */       this.clustersClariionVolumesContexts = new ArrayList();
/*     */     }
/* 211 */     return this.clustersClariionVolumesContexts;
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
/*     */   public List<VCenterServerViewContext> getClustersVCentersServersContexts()
/*     */   {
/* 237 */     if (this.clustersVCentersServersContexts == null) {
/* 238 */       this.clustersVCentersServersContexts = new ArrayList();
/*     */     }
/* 240 */     return this.clustersVCentersServersContexts;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 250 */     if (!(obj instanceof FullRecoverPointContext)) {
/* 251 */       return false;
/*     */     }
/* 253 */     FullRecoverPointContext otherObj = (FullRecoverPointContext)obj;
/*     */     
/* 255 */     return (super.equals(obj)) && (this.fullSettingsContext != null ? this.fullSettingsContext.equals(otherObj.fullSettingsContext) : this.fullSettingsContext == otherObj.fullSettingsContext) && (this.fullStateContext != null ? this.fullStateContext.equals(otherObj.fullStateContext) : this.fullStateContext == otherObj.fullStateContext) && (this.systemStatusContext != null ? this.systemStatusContext.equals(otherObj.systemStatusContext) : this.systemStatusContext == otherObj.systemStatusContext) && (this.clustersSANVolumesContexts != null ? this.clustersSANVolumesContexts.equals(otherObj.clustersSANVolumesContexts) : this.clustersSANVolumesContexts == otherObj.clustersSANVolumesContexts) && (this.clustersClariionVolumesContexts != null ? this.clustersClariionVolumesContexts.equals(otherObj.clustersClariionVolumesContexts) : this.clustersClariionVolumesContexts == otherObj.clustersClariionVolumesContexts) && (this.clustersVCentersServersContexts != null ? this.clustersVCentersServersContexts.equals(otherObj.clustersVCentersServersContexts) : this.clustersVCentersServersContexts == otherObj.clustersVCentersServersContexts);
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
/*     */   public int hashCode()
/*     */   {
/* 270 */     return super.hashCode() ^ (this.fullSettingsContext != null ? this.fullSettingsContext.hashCode() : 0) ^ (this.fullStateContext != null ? this.fullStateContext.hashCode() : 0) ^ (this.systemStatusContext != null ? this.systemStatusContext.hashCode() : 0) ^ (this.clustersSANVolumesContexts != null ? this.clustersSANVolumesContexts.hashCode() : 0) ^ (this.clustersClariionVolumesContexts != null ? this.clustersClariionVolumesContexts.hashCode() : 0) ^ (this.clustersVCentersServersContexts != null ? this.clustersVCentersServersContexts.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 285 */     return "FullRecoverPointContext [super=" + super.toString() + ", " + "fullSettingsContext=" + this.fullSettingsContext + ", " + "fullStateContext=" + this.fullStateContext + ", " + "systemStatusContext=" + this.systemStatusContext + ", " + "clustersSANVolumesContexts=" + this.clustersSANVolumesContexts + ", " + "clustersClariionVolumesContexts=" + this.clustersClariionVolumesContexts + ", " + "clustersVCentersServersContexts=" + this.clustersVCentersServersContexts + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FullRecoverPointContext.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */