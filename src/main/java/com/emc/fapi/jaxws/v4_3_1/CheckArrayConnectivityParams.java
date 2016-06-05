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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="checkArrayConnectivityParams", propOrder={"arrayType", "arrayConfiguration"})
/*     */ public class CheckArrayConnectivityParams
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ArrayType arrayType;
/*     */   protected ConfigurationParams arrayConfiguration;
/*     */   
/*     */   public CheckArrayConnectivityParams() {}
/*     */   
/*     */   public CheckArrayConnectivityParams(ArrayType arrayType, ConfigurationParams arrayConfiguration)
/*     */   {
/*  56 */     this.arrayType = arrayType;
/*  57 */     this.arrayConfiguration = arrayConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayType getArrayType()
/*     */   {
/*  69 */     return this.arrayType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArrayType(ArrayType value)
/*     */   {
/*  81 */     this.arrayType = value;
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
/*  93 */     return this.arrayConfiguration;
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
/* 105 */     this.arrayConfiguration = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 115 */     if (!(obj instanceof CheckArrayConnectivityParams)) {
/* 116 */       return false;
/*     */     }
/* 118 */     CheckArrayConnectivityParams otherObj = (CheckArrayConnectivityParams)obj;
/*     */     
/* 120 */     return (this.arrayType != null ? this.arrayType.equals(otherObj.arrayType) : this.arrayType == otherObj.arrayType) && (this.arrayConfiguration != null ? this.arrayConfiguration.equals(otherObj.arrayConfiguration) : this.arrayConfiguration == otherObj.arrayConfiguration);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.arrayType != null ? this.arrayType.hashCode() : 0) ^ (this.arrayConfiguration != null ? this.arrayConfiguration.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "CheckArrayConnectivityParams [arrayType=" + this.arrayType + ", " + "arrayConfiguration=" + this.arrayConfiguration + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CheckArrayConnectivityParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */