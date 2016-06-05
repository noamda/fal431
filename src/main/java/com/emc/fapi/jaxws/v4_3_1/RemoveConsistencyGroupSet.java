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
/*     */ @XmlType(name="removeConsistencyGroupSet", propOrder={"getGroupSetName"})
/*     */ public class RemoveConsistencyGroupSet
/*     */ {
/*     */   protected ConsistencyGroupSetUID getGroupSetName;
/*     */   
/*     */   public RemoveConsistencyGroupSet() {}
/*     */   
/*     */   public RemoveConsistencyGroupSet(ConsistencyGroupSetUID getGroupSetName)
/*     */   {
/*  44 */     this.getGroupSetName = getGroupSetName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupSetUID getGetGroupSetName()
/*     */   {
/*  56 */     return this.getGroupSetName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGetGroupSetName(ConsistencyGroupSetUID value)
/*     */   {
/*  68 */     this.getGroupSetName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof RemoveConsistencyGroupSet)) {
/*  79 */       return false;
/*     */     }
/*  81 */     RemoveConsistencyGroupSet otherObj = (RemoveConsistencyGroupSet)obj;
/*     */     
/*  83 */     return this.getGroupSetName == otherObj.getGroupSetName ? true : this.getGroupSetName != null ? this.getGroupSetName.equals(otherObj.getGroupSetName) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.getGroupSetName != null ? this.getGroupSetName.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "RemoveConsistencyGroupSet [getGroupSetName=" + this.getGroupSetName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RemoveConsistencyGroupSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */