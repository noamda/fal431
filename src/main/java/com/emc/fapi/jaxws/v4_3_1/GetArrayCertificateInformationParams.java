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
/*     */ @XmlType(name="getArrayCertificateInformationParams", propOrder={"arrayType", "ip"})
/*     */ public class GetArrayCertificateInformationParams
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ArrayType arrayType;
/*     */   protected String ip;
/*     */   
/*     */   public GetArrayCertificateInformationParams() {}
/*     */   
/*     */   public GetArrayCertificateInformationParams(ArrayType arrayType, String ip)
/*     */   {
/*  56 */     this.arrayType = arrayType;
/*  57 */     this.ip = ip;
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
/*     */   public String getIp()
/*     */   {
/*  93 */     return this.ip;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIp(String value)
/*     */   {
/* 105 */     this.ip = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 115 */     if (!(obj instanceof GetArrayCertificateInformationParams)) {
/* 116 */       return false;
/*     */     }
/* 118 */     GetArrayCertificateInformationParams otherObj = (GetArrayCertificateInformationParams)obj;
/*     */     
/* 120 */     return (this.arrayType != null ? this.arrayType.equals(otherObj.arrayType) : this.arrayType == otherObj.arrayType) && (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.arrayType != null ? this.arrayType.hashCode() : 0) ^ (this.ip != null ? this.ip.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "GetArrayCertificateInformationParams [arrayType=" + this.arrayType + ", " + "ip=" + this.ip + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetArrayCertificateInformationParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */