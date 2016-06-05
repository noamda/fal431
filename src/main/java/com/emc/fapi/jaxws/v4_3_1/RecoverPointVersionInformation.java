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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="RecoverPointVersionInformation", propOrder={"buildDescription", "hotFix", "major", "minor", "patch", "servicePack"})
/*     */ public class RecoverPointVersionInformation
/*     */ {
/*     */   protected String buildDescription;
/*     */   protected String hotFix;
/*     */   protected int major;
/*     */   protected int minor;
/*     */   protected Integer patch;
/*     */   protected Integer servicePack;
/*     */   
/*     */   public RecoverPointVersionInformation() {}
/*     */   
/*     */   public RecoverPointVersionInformation(String buildDescription, String hotFix, int major, int minor, Integer patch, Integer servicePack)
/*     */   {
/*  59 */     this.buildDescription = buildDescription;
/*  60 */     this.hotFix = hotFix;
/*  61 */     this.major = major;
/*  62 */     this.minor = minor;
/*  63 */     this.patch = patch;
/*  64 */     this.servicePack = servicePack;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getBuildDescription()
/*     */   {
/*  76 */     return this.buildDescription;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setBuildDescription(String value)
/*     */   {
/*  88 */     this.buildDescription = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getHotFix()
/*     */   {
/* 100 */     return this.hotFix;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHotFix(String value)
/*     */   {
/* 112 */     this.hotFix = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getMajor()
/*     */   {
/* 120 */     return this.major;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMajor(int value)
/*     */   {
/* 128 */     this.major = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getMinor()
/*     */   {
/* 136 */     return this.minor;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMinor(int value)
/*     */   {
/* 144 */     this.minor = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getPatch()
/*     */   {
/* 156 */     return this.patch;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPatch(Integer value)
/*     */   {
/* 168 */     this.patch = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Integer getServicePack()
/*     */   {
/* 180 */     return this.servicePack;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setServicePack(Integer value)
/*     */   {
/* 192 */     this.servicePack = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 202 */     if (!(obj instanceof RecoverPointVersionInformation)) {
/* 203 */       return false;
/*     */     }
/* 205 */     RecoverPointVersionInformation otherObj = (RecoverPointVersionInformation)obj;
/*     */     
/* 207 */     return (this.buildDescription != null ? this.buildDescription.equals(otherObj.buildDescription) : this.buildDescription == otherObj.buildDescription) && (this.hotFix != null ? this.hotFix.equals(otherObj.hotFix) : this.hotFix == otherObj.hotFix) && (this.major == otherObj.major) && (this.minor == otherObj.minor) && (this.patch != null ? this.patch.equals(otherObj.patch) : this.patch == otherObj.patch) && (this.servicePack != null ? this.servicePack.equals(otherObj.servicePack) : this.servicePack == otherObj.servicePack);
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
/* 221 */     return (this.buildDescription != null ? this.buildDescription.hashCode() : 0) ^ (this.hotFix != null ? this.hotFix.hashCode() : 0) ^ this.major ^ this.minor ^ (this.patch != null ? this.patch.hashCode() : 0) ^ (this.servicePack != null ? this.servicePack.hashCode() : 0);
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
/* 235 */     return "RecoverPointVersionInformation [buildDescription=" + this.buildDescription + ", " + "hotFix=" + this.hotFix + ", " + "major=" + this.major + ", " + "minor=" + this.minor + ", " + "patch=" + this.patch + ", " + "servicePack=" + this.servicePack + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RecoverPointVersionInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */