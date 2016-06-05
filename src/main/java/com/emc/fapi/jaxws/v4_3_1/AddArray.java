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
/*     */ @XmlType(name="addArray", propOrder={"addArrayParams"})
/*     */ public class AddArray
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected AddArrayParams addArrayParams;
/*     */   
/*     */   public AddArray() {}
/*     */   
/*     */   public AddArray(AddArrayParams addArrayParams)
/*     */   {
/*  46 */     this.addArrayParams = addArrayParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public AddArrayParams getAddArrayParams()
/*     */   {
/*  58 */     return this.addArrayParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAddArrayParams(AddArrayParams value)
/*     */   {
/*  70 */     this.addArrayParams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof AddArray)) {
/*  81 */       return false;
/*     */     }
/*  83 */     AddArray otherObj = (AddArray)obj;
/*     */     
/*  85 */     return this.addArrayParams == otherObj.addArrayParams ? true : this.addArrayParams != null ? this.addArrayParams.equals(otherObj.addArrayParams) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  94 */     return this.addArrayParams != null ? this.addArrayParams.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 103 */     return "AddArray [addArrayParams=" + this.addArrayParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AddArray.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */