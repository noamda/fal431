/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonSubTypes;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.As;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VCenterServerViewContext.class, name="VCenterServerViewContext"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ClusterSANVolumesContext.class, name="ClusterSANVolumesContext"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=FullRecoverPointSettingsContext.class, name="FullRecoverPointSettingsContext"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ClariionVolumesContext.class, name="ClariionVolumesContext"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=SystemStatusContext.class, name="SystemStatusContext"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=FullRecoverPointContext.class, name="FullRecoverPointContext"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=FullRecoverPointStateContext.class, name="FullRecoverPointStateContext"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ClusterFileSystemViewContext.class, name="ClusterFileSystemViewContext")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="FunctionalAPIContext", propOrder={"globalContext"})
/*     */ @XmlSeeAlso({VCenterServerViewContext.class, FullRecoverPointSettingsContext.class, FullRecoverPointStateContext.class, ClusterSANVolumesContext.class, FullRecoverPointContext.class, ClariionVolumesContext.class, ClusterFileSystemViewContext.class, SystemStatusContext.class})
/*     */ public abstract class FunctionalAPIContext
/*     */ {
/*     */   protected long globalContext;
/*     */   
/*     */   public FunctionalAPIContext() {}
/*     */   
/*     */   public FunctionalAPIContext(long globalContext)
/*     */   {
/*  73 */     this.globalContext = globalContext;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getGlobalContext()
/*     */   {
/*  81 */     return this.globalContext;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGlobalContext(long value)
/*     */   {
/*  89 */     this.globalContext = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  99 */     if (!(obj instanceof FunctionalAPIContext)) {
/* 100 */       return false;
/*     */     }
/* 102 */     FunctionalAPIContext otherObj = (FunctionalAPIContext)obj;
/*     */     
/* 104 */     return this.globalContext == otherObj.globalContext;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (int)this.globalContext;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 122 */     return "FunctionalAPIContext [globalContext=" + this.globalContext + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FunctionalAPIContext.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */