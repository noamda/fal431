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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getArrayCertificateInformationResponse", propOrder={"_return"})
/*     */ public class GetArrayCertificateInformationResponse
/*     */ {
/*     */   @XmlElement(name="return")
/*     */   protected CertificateInformation _return;
/*     */   
/*     */   public GetArrayCertificateInformationResponse() {}
/*     */   
/*     */   public GetArrayCertificateInformationResponse(CertificateInformation _return)
/*     */   {
/*  46 */     this._return = _return;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public CertificateInformation getReturn()
/*     */   {
/*  58 */     return this._return;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReturn(CertificateInformation value)
/*     */   {
/*  70 */     this._return = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof GetArrayCertificateInformationResponse)) {
/*  81 */       return false;
/*     */     }
/*  83 */     GetArrayCertificateInformationResponse otherObj = (GetArrayCertificateInformationResponse)obj;
/*     */     
/*  85 */     return this._return == otherObj._return ? true : this._return != null ? this._return.equals(otherObj._return) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  94 */     return this._return != null ? this._return.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 103 */     return "GetArrayCertificateInformationResponse [_return=" + this._return + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetArrayCertificateInformationResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */