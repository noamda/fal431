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
/*     */ @XmlType(name="markGroupCopyVolumesAsClean", propOrder={"groupCopy"})
/*     */ public class MarkGroupCopyVolumesAsClean
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   
/*     */   public MarkGroupCopyVolumesAsClean() {}
/*     */   
/*     */   public MarkGroupCopyVolumesAsClean(ConsistencyGroupCopyUID groupCopy)
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
/*  78 */     if (!(obj instanceof MarkGroupCopyVolumesAsClean)) {
/*  79 */       return false;
/*     */     }
/*  81 */     MarkGroupCopyVolumesAsClean otherObj = (MarkGroupCopyVolumesAsClean)obj;
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
/* 101 */     return "MarkGroupCopyVolumesAsClean [groupCopy=" + this.groupCopy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\MarkGroupCopyVolumesAsClean.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */