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
/*     */ @XmlType(name="registerArrayResourcePoolParamsSet", propOrder={"innerSet"})
/*     */ public class RegisterArrayResourcePoolParamsSet
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RegisterArrayResourcePoolParams> innerSet;
/*     */   
/*     */   public RegisterArrayResourcePoolParamsSet() {}
/*     */   
/*     */   public RegisterArrayResourcePoolParamsSet(List<RegisterArrayResourcePoolParams> innerSet)
/*     */   {
/*  55 */     this.innerSet = innerSet;
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
/*     */   public List<RegisterArrayResourcePoolParams> getInnerSet()
/*     */   {
/*  81 */     if (this.innerSet == null) {
/*  82 */       this.innerSet = new ArrayList();
/*     */     }
/*  84 */     return this.innerSet;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  94 */     if (!(obj instanceof RegisterArrayResourcePoolParamsSet)) {
/*  95 */       return false;
/*     */     }
/*  97 */     RegisterArrayResourcePoolParamsSet otherObj = (RegisterArrayResourcePoolParamsSet)obj;
/*     */     
/*  99 */     return this.innerSet == otherObj.innerSet ? true : this.innerSet != null ? this.innerSet.equals(otherObj.innerSet) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 108 */     return this.innerSet != null ? this.innerSet.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 117 */     return "RegisterArrayResourcePoolParamsSet [innerSet=" + this.innerSet + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RegisterArrayResourcePoolParamsSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */