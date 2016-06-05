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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="restStringSet", propOrder={"stringSet"})
/*     */ public class RestStringSet
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<String> stringSet;
/*     */   
/*     */   public RestStringSet() {}
/*     */   
/*     */   public RestStringSet(List<String> stringSet)
/*     */   {
/*  55 */     this.stringSet = stringSet;
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
/*     */   public List<String> getStringSet()
/*     */   {
/*  81 */     if (this.stringSet == null) {
/*  82 */       this.stringSet = new ArrayList();
/*     */     }
/*  84 */     return this.stringSet;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  94 */     if (!(obj instanceof RestStringSet)) {
/*  95 */       return false;
/*     */     }
/*  97 */     RestStringSet otherObj = (RestStringSet)obj;
/*     */     
/*  99 */     return this.stringSet == otherObj.stringSet ? true : this.stringSet != null ? this.stringSet.equals(otherObj.stringSet) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 108 */     return this.stringSet != null ? this.stringSet.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 117 */     return "RestStringSet [stringSet=" + this.stringSet + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RestStringSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */