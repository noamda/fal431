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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ArrayInfo", propOrder={"serialNumber", "arrayUID", "ampUID", "arrayType", "splitterUID"})
/*     */ public class ArrayInfo
/*     */ {
/*     */   protected String serialNumber;
/*     */   @XmlElement(nillable=true)
/*     */   protected ArrayUID arrayUID;
/*     */   protected ArrayManagementProviderUID ampUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected ArrayType arrayType;
/*     */   @XmlElement(nillable=true)
/*     */   protected SplitterUID splitterUID;
/*     */   
/*     */   public ArrayInfo() {}
/*     */   
/*     */   public ArrayInfo(String serialNumber, ArrayUID arrayUID, ArrayManagementProviderUID ampUID, ArrayType arrayType, SplitterUID splitterUID)
/*     */   {
/*  60 */     this.serialNumber = serialNumber;
/*  61 */     this.arrayUID = arrayUID;
/*  62 */     this.ampUID = ampUID;
/*  63 */     this.arrayType = arrayType;
/*  64 */     this.splitterUID = splitterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSerialNumber()
/*     */   {
/*  76 */     return this.serialNumber;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSerialNumber(String value)
/*     */   {
/*  88 */     this.serialNumber = value;
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
/* 100 */     return this.arrayUID;
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
/* 112 */     this.arrayUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayManagementProviderUID getAmpUID()
/*     */   {
/* 124 */     return this.ampUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAmpUID(ArrayManagementProviderUID value)
/*     */   {
/* 136 */     this.ampUID = value;
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
/* 148 */     return this.arrayType;
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
/* 160 */     this.arrayType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterUID getSplitterUID()
/*     */   {
/* 172 */     return this.splitterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitterUID(SplitterUID value)
/*     */   {
/* 184 */     this.splitterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 194 */     if (!(obj instanceof ArrayInfo)) {
/* 195 */       return false;
/*     */     }
/* 197 */     ArrayInfo otherObj = (ArrayInfo)obj;
/*     */     
/* 199 */     return (this.serialNumber != null ? this.serialNumber.equals(otherObj.serialNumber) : this.serialNumber == otherObj.serialNumber) && (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.ampUID != null ? this.ampUID.equals(otherObj.ampUID) : this.ampUID == otherObj.ampUID) && (this.arrayType != null ? this.arrayType.equals(otherObj.arrayType) : this.arrayType == otherObj.arrayType) && (this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : this.splitterUID == otherObj.splitterUID);
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
/*     */   public int hashCode()
/*     */   {
/* 212 */     return (this.serialNumber != null ? this.serialNumber.hashCode() : 0) ^ (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.ampUID != null ? this.ampUID.hashCode() : 0) ^ (this.arrayType != null ? this.arrayType.hashCode() : 0) ^ (this.splitterUID != null ? this.splitterUID.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 225 */     return "ArrayInfo [serialNumber=" + this.serialNumber + ", " + "arrayUID=" + this.arrayUID + ", " + "ampUID=" + this.ampUID + ", " + "arrayType=" + this.arrayType + ", " + "splitterUID=" + this.splitterUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */