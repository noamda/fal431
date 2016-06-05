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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getArrayCertificateInformation", propOrder={"certificateInfoParam"})
/*     */ public class GetArrayCertificateInformation
/*     */ {
/*     */   protected ArrayCertificateInformationParam certificateInfoParam;
/*     */   
/*     */   public GetArrayCertificateInformation() {}
/*     */   
/*     */   public GetArrayCertificateInformation(ArrayCertificateInformationParam certificateInfoParam)
/*     */   {
/*  44 */     this.certificateInfoParam = certificateInfoParam;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayCertificateInformationParam getCertificateInfoParam()
/*     */   {
/*  56 */     return this.certificateInfoParam;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCertificateInfoParam(ArrayCertificateInformationParam value)
/*     */   {
/*  68 */     this.certificateInfoParam = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof GetArrayCertificateInformation)) {
/*  79 */       return false;
/*     */     }
/*  81 */     GetArrayCertificateInformation otherObj = (GetArrayCertificateInformation)obj;
/*     */     
/*  83 */     return this.certificateInfoParam == otherObj.certificateInfoParam ? true : this.certificateInfoParam != null ? this.certificateInfoParam.equals(otherObj.certificateInfoParam) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.certificateInfoParam != null ? this.certificateInfoParam.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "GetArrayCertificateInformation [certificateInfoParam=" + this.certificateInfoParam + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetArrayCertificateInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */