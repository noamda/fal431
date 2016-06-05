/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ImageAccessParameters", propOrder={"timeStamp", "mode", "imageType", "searchText", "searchExactText", "maximumSearchRange"})
/*     */ public class ImageAccessParameters
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected RecoverPointTimeStamp timeStamp;
/*     */   @XmlElement(required=true)
/*     */   protected ImageAccessMode mode;
/*     */   protected SearchImageType imageType;
/*     */   protected String searchText;
/*     */   protected boolean searchExactText;
/*     */   protected Long maximumSearchRange;
/*     */   
/*     */   public ImageAccessParameters() {}
/*     */   
/*     */   public ImageAccessParameters(RecoverPointTimeStamp timeStamp, ImageAccessMode mode, SearchImageType imageType, String searchText, boolean searchExactText, Long maximumSearchRange)
/*     */   {
/*  62 */     this.timeStamp = timeStamp;
/*  63 */     this.mode = mode;
/*  64 */     this.imageType = imageType;
/*  65 */     this.searchText = searchText;
/*  66 */     this.searchExactText = searchExactText;
/*  67 */     this.maximumSearchRange = maximumSearchRange;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getTimeStamp()
/*     */   {
/*  79 */     return this.timeStamp;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTimeStamp(RecoverPointTimeStamp value)
/*     */   {
/*  91 */     this.timeStamp = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ImageAccessMode getMode()
/*     */   {
/* 103 */     return this.mode;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMode(ImageAccessMode value)
/*     */   {
/* 115 */     this.mode = value;
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
/* 127 */     return this.imageType;
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
/* 139 */     this.imageType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSearchText()
/*     */   {
/* 151 */     return this.searchText;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSearchText(String value)
/*     */   {
/* 163 */     this.searchText = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isSearchExactText()
/*     */   {
/* 171 */     return this.searchExactText;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSearchExactText(boolean value)
/*     */   {
/* 179 */     this.searchExactText = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getMaximumSearchRange()
/*     */   {
/* 191 */     return this.maximumSearchRange;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMaximumSearchRange(Long value)
/*     */   {
/* 203 */     this.maximumSearchRange = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 213 */     if (!(obj instanceof ImageAccessParameters)) {
/* 214 */       return false;
/*     */     }
/* 216 */     ImageAccessParameters otherObj = (ImageAccessParameters)obj;
/*     */     
/* 218 */     return (this.timeStamp != null ? this.timeStamp.equals(otherObj.timeStamp) : this.timeStamp == otherObj.timeStamp) && (this.mode != null ? this.mode.equals(otherObj.mode) : this.mode == otherObj.mode) && (this.imageType != null ? this.imageType.equals(otherObj.imageType) : this.imageType == otherObj.imageType) && (this.searchText != null ? this.searchText.equals(otherObj.searchText) : this.searchText == otherObj.searchText) && (this.searchExactText == otherObj.searchExactText) && (this.maximumSearchRange != null ? this.maximumSearchRange.equals(otherObj.maximumSearchRange) : this.maximumSearchRange == otherObj.maximumSearchRange);
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
/*     */   public int hashCode()
/*     */   {
/* 232 */     return (this.timeStamp != null ? this.timeStamp.hashCode() : 0) ^ (this.mode != null ? this.mode.hashCode() : 0) ^ (this.imageType != null ? this.imageType.hashCode() : 0) ^ (this.searchText != null ? this.searchText.hashCode() : 0) ^ (this.searchExactText ? 1 : 0) ^ (this.maximumSearchRange != null ? this.maximumSearchRange.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 246 */     return "ImageAccessParameters [timeStamp=" + this.timeStamp + ", " + "mode=" + this.mode + ", " + "imageType=" + this.imageType + ", " + "searchText=" + this.searchText + ", " + "searchExactText=" + this.searchExactText + ", " + "maximumSearchRange=" + this.maximumSearchRange + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ImageAccessParameters.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */