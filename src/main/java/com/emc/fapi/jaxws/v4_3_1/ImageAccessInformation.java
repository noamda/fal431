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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ImageAccessInformation", propOrder={"imageAccessEnabled", "imageInformation", "imageName", "scenario"})
/*     */ public class ImageAccessInformation
/*     */ {
/*     */   protected boolean imageAccessEnabled;
/*     */   protected ImageAccessParameters imageInformation;
/*     */   protected String imageName;
/*     */   protected ImageAccessScenario scenario;
/*     */   
/*     */   public ImageAccessInformation() {}
/*     */   
/*     */   public ImageAccessInformation(boolean imageAccessEnabled, ImageAccessParameters imageInformation, String imageName, ImageAccessScenario scenario)
/*     */   {
/*  53 */     this.imageAccessEnabled = imageAccessEnabled;
/*  54 */     this.imageInformation = imageInformation;
/*  55 */     this.imageName = imageName;
/*  56 */     this.scenario = scenario;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isImageAccessEnabled()
/*     */   {
/*  64 */     return this.imageAccessEnabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setImageAccessEnabled(boolean value)
/*     */   {
/*  72 */     this.imageAccessEnabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ImageAccessParameters getImageInformation()
/*     */   {
/*  84 */     return this.imageInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setImageInformation(ImageAccessParameters value)
/*     */   {
/*  96 */     this.imageInformation = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getImageName()
/*     */   {
/* 108 */     return this.imageName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setImageName(String value)
/*     */   {
/* 120 */     this.imageName = value;
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
/* 132 */     return this.scenario;
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
/* 144 */     this.scenario = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 154 */     if (!(obj instanceof ImageAccessInformation)) {
/* 155 */       return false;
/*     */     }
/* 157 */     ImageAccessInformation otherObj = (ImageAccessInformation)obj;
/*     */     
/* 159 */     return (this.imageAccessEnabled == otherObj.imageAccessEnabled) && (this.imageInformation != null ? this.imageInformation.equals(otherObj.imageInformation) : this.imageInformation == otherObj.imageInformation) && (this.imageName != null ? this.imageName.equals(otherObj.imageName) : this.imageName == otherObj.imageName) && (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario);
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
/* 171 */     return (this.imageAccessEnabled ? 1 : 0) ^ (this.imageInformation != null ? this.imageInformation.hashCode() : 0) ^ (this.imageName != null ? this.imageName.hashCode() : 0) ^ (this.scenario != null ? this.scenario.hashCode() : 0);
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
/* 183 */     return "ImageAccessInformation [imageAccessEnabled=" + this.imageAccessEnabled + ", " + "imageInformation=" + this.imageInformation + ", " + "imageName=" + this.imageName + ", " + "scenario=" + this.scenario + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ImageAccessInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */