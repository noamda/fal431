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
/*     */ @XmlType(name="getGroupSetName", propOrder={"groupSet"})
/*     */ public class GetGroupSetName
/*     */ {
/*     */   protected ConsistencyGroupSetUID groupSet;
/*     */   
/*     */   public GetGroupSetName() {}
/*     */   
/*     */   public GetGroupSetName(ConsistencyGroupSetUID groupSet)
/*     */   {
/*  44 */     this.groupSet = groupSet;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupSetUID getGroupSet()
/*     */   {
/*  56 */     return this.groupSet;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupSet(ConsistencyGroupSetUID value)
/*     */   {
/*  68 */     this.groupSet = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof GetGroupSetName)) {
/*  79 */       return false;
/*     */     }
/*  81 */     GetGroupSetName otherObj = (GetGroupSetName)obj;
/*     */     
/*  83 */     return this.groupSet == otherObj.groupSet ? true : this.groupSet != null ? this.groupSet.equals(otherObj.groupSet) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.groupSet != null ? this.groupSet.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "GetGroupSetName [groupSet=" + this.groupSet + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetGroupSetName.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */