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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="validateDisableImageAccess", propOrder={"groupCopy", "startTransfer"})
/*     */ public class ValidateDisableImageAccess
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   protected boolean startTransfer;
/*     */   
/*     */   public ValidateDisableImageAccess() {}
/*     */   
/*     */   public ValidateDisableImageAccess(ConsistencyGroupCopyUID groupCopy, boolean startTransfer)
/*     */   {
/*  47 */     this.groupCopy = groupCopy;
/*  48 */     this.startTransfer = startTransfer;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getGroupCopy()
/*     */   {
/*  60 */     return this.groupCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupCopy(ConsistencyGroupCopyUID value)
/*     */   {
/*  72 */     this.groupCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isStartTransfer()
/*     */   {
/*  80 */     return this.startTransfer;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStartTransfer(boolean value)
/*     */   {
/*  88 */     this.startTransfer = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof ValidateDisableImageAccess)) {
/*  99 */       return false;
/*     */     }
/* 101 */     ValidateDisableImageAccess otherObj = (ValidateDisableImageAccess)obj;
/*     */     
/* 103 */     return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.startTransfer == otherObj.startTransfer);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.startTransfer ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "ValidateDisableImageAccess [groupCopy=" + this.groupCopy + ", " + "startTransfer=" + this.startTransfer + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateDisableImageAccess.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */