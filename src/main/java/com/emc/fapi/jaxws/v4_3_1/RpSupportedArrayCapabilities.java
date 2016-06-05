/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="RpSupportedArrayCapabilities", propOrder={"supportedArrayCapabilities"})
/*     */ public class RpSupportedArrayCapabilities
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RpSupportedArrayCapability> supportedArrayCapabilities;
/*     */   
/*     */   public RpSupportedArrayCapabilities() {}
/*     */   
/*     */   public RpSupportedArrayCapabilities(List<RpSupportedArrayCapability> supportedArrayCapabilities)
/*     */   {
/*  48 */     this.supportedArrayCapabilities = supportedArrayCapabilities;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<RpSupportedArrayCapability> getSupportedArrayCapabilities()
/*     */   {
/*  74 */     if (this.supportedArrayCapabilities == null) {
/*  75 */       this.supportedArrayCapabilities = new ArrayList();
/*     */     }
/*  77 */     return this.supportedArrayCapabilities;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof RpSupportedArrayCapabilities)) {
/*  88 */       return false;
/*     */     }
/*  90 */     RpSupportedArrayCapabilities otherObj = (RpSupportedArrayCapabilities)obj;
/*     */     
/*  92 */     return this.supportedArrayCapabilities == otherObj.supportedArrayCapabilities ? true : this.supportedArrayCapabilities != null ? this.supportedArrayCapabilities.equals(otherObj.supportedArrayCapabilities) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.supportedArrayCapabilities != null ? this.supportedArrayCapabilities.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "RpSupportedArrayCapabilities [supportedArrayCapabilities=" + this.supportedArrayCapabilities + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RpSupportedArrayCapabilities.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */