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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="removePassiveConsistencyGroupLinkParams", propOrder={"firstCopy", "secondCopy"})
/*     */ public class RemovePassiveConsistencyGroupLinkParams
/*     */ {
/*     */   protected GlobalCopyUID firstCopy;
/*     */   protected GlobalCopyUID secondCopy;
/*     */   
/*     */   public RemovePassiveConsistencyGroupLinkParams() {}
/*     */   
/*     */   public RemovePassiveConsistencyGroupLinkParams(GlobalCopyUID firstCopy, GlobalCopyUID secondCopy)
/*     */   {
/*  54 */     this.firstCopy = firstCopy;
/*  55 */     this.secondCopy = secondCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GlobalCopyUID getFirstCopy()
/*     */   {
/*  67 */     return this.firstCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFirstCopy(GlobalCopyUID value)
/*     */   {
/*  79 */     this.firstCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GlobalCopyUID getSecondCopy()
/*     */   {
/*  91 */     return this.secondCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSecondCopy(GlobalCopyUID value)
/*     */   {
/* 103 */     this.secondCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof RemovePassiveConsistencyGroupLinkParams)) {
/* 114 */       return false;
/*     */     }
/* 116 */     RemovePassiveConsistencyGroupLinkParams otherObj = (RemovePassiveConsistencyGroupLinkParams)obj;
/*     */     
/* 118 */     return (this.firstCopy != null ? this.firstCopy.equals(otherObj.firstCopy) : this.firstCopy == otherObj.firstCopy) && (this.secondCopy != null ? this.secondCopy.equals(otherObj.secondCopy) : this.secondCopy == otherObj.secondCopy);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.firstCopy != null ? this.firstCopy.hashCode() : 0) ^ (this.secondCopy != null ? this.secondCopy.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "RemovePassiveConsistencyGroupLinkParams [firstCopy=" + this.firstCopy + ", " + "secondCopy=" + this.secondCopy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RemovePassiveConsistencyGroupLinkParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */