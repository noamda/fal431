/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="moveToImageParams", propOrder={"accessType", "imageType", "scenario"})
/*     */ public class MoveToImageParams
/*     */ {
/*     */   protected SpecificImageAccessType accessType;
/*     */   protected SearchImageType imageType;
/*     */   protected ImageAccessScenario scenario;
/*     */   
/*     */   public MoveToImageParams() {}
/*     */   
/*     */   public MoveToImageParams(SpecificImageAccessType accessType, SearchImageType imageType, ImageAccessScenario scenario)
/*     */   {
/*  57 */     this.accessType = accessType;
/*  58 */     this.imageType = imageType;
/*  59 */     this.scenario = scenario;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SpecificImageAccessType getAccessType()
/*     */   {
/*  71 */     return this.accessType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAccessType(SpecificImageAccessType value)
/*     */   {
/*  83 */     this.accessType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SearchImageType getImageType()
/*     */   {
/*  95 */     return this.imageType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setImageType(SearchImageType value)
/*     */   {
/* 107 */     this.imageType = value;
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
/* 119 */     return this.scenario;
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
/* 131 */     this.scenario = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 141 */     if (!(obj instanceof MoveToImageParams)) {
/* 142 */       return false;
/*     */     }
/* 144 */     MoveToImageParams otherObj = (MoveToImageParams)obj;
/*     */     
/* 146 */     return (this.accessType != null ? this.accessType.equals(otherObj.accessType) : this.accessType == otherObj.accessType) && (this.imageType != null ? this.imageType.equals(otherObj.imageType) : this.imageType == otherObj.imageType) && (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario);
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
/* 157 */     return (this.accessType != null ? this.accessType.hashCode() : 0) ^ (this.imageType != null ? this.imageType.hashCode() : 0) ^ (this.scenario != null ? this.scenario.hashCode() : 0);
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
/* 168 */     return "MoveToImageParams [accessType=" + this.accessType + ", " + "imageType=" + this.imageType + ", " + "scenario=" + this.scenario + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\MoveToImageParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */