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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SetArraySettingsParams", propOrder={"arrayUID", "name", "arrayConfiguration"})
/*     */ public class SetArraySettingsParams
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected ArrayUID arrayUID;
/*     */   @XmlElement(required=true)
/*     */   protected String name;
/*     */   protected ConfigurationParams arrayConfiguration;
/*     */   
/*     */   public SetArraySettingsParams() {}
/*     */   
/*     */   public SetArraySettingsParams(ArrayUID arrayUID, String name, ConfigurationParams arrayConfiguration)
/*     */   {
/*  53 */     this.arrayUID = arrayUID;
/*  54 */     this.name = name;
/*  55 */     this.arrayConfiguration = arrayConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayUID getArrayUID()
/*     */   {
/*  67 */     return this.arrayUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArrayUID(ArrayUID value)
/*     */   {
/*  79 */     this.arrayUID = value;
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
/*  91 */     return this.name;
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
/* 103 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConfigurationParams getArrayConfiguration()
/*     */   {
/* 115 */     return this.arrayConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArrayConfiguration(ConfigurationParams value)
/*     */   {
/* 127 */     this.arrayConfiguration = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 137 */     if (!(obj instanceof SetArraySettingsParams)) {
/* 138 */       return false;
/*     */     }
/* 140 */     SetArraySettingsParams otherObj = (SetArraySettingsParams)obj;
/*     */     
/* 142 */     return (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.arrayConfiguration != null ? this.arrayConfiguration.equals(otherObj.arrayConfiguration) : this.arrayConfiguration == otherObj.arrayConfiguration);
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
/* 153 */     return (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.arrayConfiguration != null ? this.arrayConfiguration.hashCode() : 0);
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
/* 164 */     return "SetArraySettingsParams [arrayUID=" + this.arrayUID + ", " + "name=" + this.name + ", " + "arrayConfiguration=" + this.arrayConfiguration + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetArraySettingsParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */