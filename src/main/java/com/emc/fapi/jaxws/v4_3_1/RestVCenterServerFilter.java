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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="restVCenterServerFilter", propOrder={"restClass"})
/*     */ public class RestVCenterServerFilter
/*     */ {
/*     */   protected VCenterServerFilter restClass;
/*     */   
/*     */   public RestVCenterServerFilter() {}
/*     */   
/*     */   public RestVCenterServerFilter(VCenterServerFilter restClass)
/*     */   {
/*  51 */     this.restClass = restClass;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VCenterServerFilter getRestClass()
/*     */   {
/*  63 */     return this.restClass;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRestClass(VCenterServerFilter value)
/*     */   {
/*  75 */     this.restClass = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  85 */     if (!(obj instanceof RestVCenterServerFilter)) {
/*  86 */       return false;
/*     */     }
/*  88 */     RestVCenterServerFilter otherObj = (RestVCenterServerFilter)obj;
/*     */     
/*  90 */     return this.restClass == otherObj.restClass ? true : this.restClass != null ? this.restClass.equals(otherObj.restClass) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  99 */     return this.restClass != null ? this.restClass.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 108 */     return "RestVCenterServerFilter [restClass=" + this.restClass + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RestVCenterServerFilter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */