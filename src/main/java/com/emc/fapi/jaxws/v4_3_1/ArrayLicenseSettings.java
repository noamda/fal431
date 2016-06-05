/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ @JsonTypeName("ArrayLicenseSettings")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ArrayLicenseSettings", propOrder={"arraySerial", "arrayType"})
/*     */ public class ArrayLicenseSettings
/*     */   extends LicenseSettings
/*     */ {
/*     */   protected String arraySerial;
/*     */   @XmlElement(nillable=true)
/*     */   protected ArrayType arrayType;
/*     */   
/*     */   public ArrayLicenseSettings() {}
/*     */   
/*     */   public ArrayLicenseSettings(String arraySerial, ArrayType arrayType)
/*     */   {
/*  59 */     this.arraySerial = arraySerial;
/*  60 */     this.arrayType = arrayType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getArraySerial()
/*     */   {
/*  72 */     return this.arraySerial;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArraySerial(String value)
/*     */   {
/*  84 */     this.arraySerial = value;
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
/*  96 */     return this.arrayType;
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
/* 108 */     this.arrayType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 118 */     if (!(obj instanceof ArrayLicenseSettings)) {
/* 119 */       return false;
/*     */     }
/* 121 */     ArrayLicenseSettings otherObj = (ArrayLicenseSettings)obj;
/*     */     
/* 123 */     return (super.equals(obj)) && (this.arraySerial != null ? this.arraySerial.equals(otherObj.arraySerial) : this.arraySerial == otherObj.arraySerial) && (this.arrayType != null ? this.arrayType.equals(otherObj.arrayType) : this.arrayType == otherObj.arrayType);
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
/* 134 */     return super.hashCode() ^ (this.arraySerial != null ? this.arraySerial.hashCode() : 0) ^ (this.arrayType != null ? this.arrayType.hashCode() : 0);
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
/* 145 */     return "ArrayLicenseSettings [super=" + super.toString() + ", " + "arraySerial=" + this.arraySerial + ", " + "arrayType=" + this.arrayType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayLicenseSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */