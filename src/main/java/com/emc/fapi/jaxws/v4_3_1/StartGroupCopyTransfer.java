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
/*     */ @XmlType(name="startGroupCopyTransfer", propOrder={"groupCopy"})
/*     */ public class StartGroupCopyTransfer
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   
/*     */   public StartGroupCopyTransfer() {}
/*     */   
/*     */   public StartGroupCopyTransfer(ConsistencyGroupCopyUID groupCopy)
/*     */   {
/*  44 */     this.groupCopy = groupCopy;
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
/*  56 */     return this.groupCopy;
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
/*  68 */     this.groupCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof StartGroupCopyTransfer)) {
/*  79 */       return false;
/*     */     }
/*  81 */     StartGroupCopyTransfer otherObj = (StartGroupCopyTransfer)obj;
/*     */     
/*  83 */     return this.groupCopy == otherObj.groupCopy ? true : this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.groupCopy != null ? this.groupCopy.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "StartGroupCopyTransfer [groupCopy=" + this.groupCopy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\StartGroupCopyTransfer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */