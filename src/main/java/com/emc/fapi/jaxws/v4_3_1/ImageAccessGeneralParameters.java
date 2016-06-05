/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ImageAccessQueryParameters.class, name="ImageAccessQueryParameters"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ImageAccessLatestSnapshotParameters.class, name="ImageAccessLatestSnapshotParameters"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ImageAccessSpecificSnapshotParameters.class, name="ImageAccessSpecificSnapshotParameters")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ImageAccessGeneralParameters", propOrder={"scenario", "targetNetwork"})
/*     */ @XmlSeeAlso({ImageAccessSpecificSnapshotParameters.class, ImageAccessLatestSnapshotParameters.class, ImageAccessQueryParameters.class})
/*     */ public abstract class ImageAccessGeneralParameters
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ImageAccessScenario scenario;
/*     */   protected ImageAccessTargetVirtualNetworkParam targetNetwork;
/*     */   
/*     */   public ImageAccessGeneralParameters() {}
/*     */   
/*     */   public ImageAccessGeneralParameters(ImageAccessScenario scenario, ImageAccessTargetVirtualNetworkParam targetNetwork)
/*     */   {
/*  68 */     this.scenario = scenario;
/*  69 */     this.targetNetwork = targetNetwork;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ImageAccessScenario getScenario()
/*     */   {
/*  81 */     return this.scenario;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setScenario(ImageAccessScenario value)
/*     */   {
/*  93 */     this.scenario = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ImageAccessTargetVirtualNetworkParam getTargetNetwork()
/*     */   {
/* 105 */     return this.targetNetwork;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTargetNetwork(ImageAccessTargetVirtualNetworkParam value)
/*     */   {
/* 117 */     this.targetNetwork = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 127 */     if (!(obj instanceof ImageAccessGeneralParameters)) {
/* 128 */       return false;
/*     */     }
/* 130 */     ImageAccessGeneralParameters otherObj = (ImageAccessGeneralParameters)obj;
/*     */     
/* 132 */     return (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario) && (this.targetNetwork != null ? this.targetNetwork.equals(otherObj.targetNetwork) : this.targetNetwork == otherObj.targetNetwork);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 142 */     return (this.scenario != null ? this.scenario.hashCode() : 0) ^ (this.targetNetwork != null ? this.targetNetwork.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 152 */     return "ImageAccessGeneralParameters [scenario=" + this.scenario + ", " + "targetNetwork=" + this.targetNetwork + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ImageAccessGeneralParameters.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */