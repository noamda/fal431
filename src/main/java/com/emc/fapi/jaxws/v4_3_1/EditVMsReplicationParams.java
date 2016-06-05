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
/*     */ @XmlType(name="editVMsReplicationParams", propOrder={"params"})
/*     */ public class EditVMsReplicationParams
/*     */ {
/*     */   protected ConsistencyGroupVMReplicationParams params;
/*     */   
/*     */   public EditVMsReplicationParams() {}
/*     */   
/*     */   public EditVMsReplicationParams(ConsistencyGroupVMReplicationParams params)
/*     */   {
/*  44 */     this.params = params;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupVMReplicationParams getParams()
/*     */   {
/*  56 */     return this.params;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setParams(ConsistencyGroupVMReplicationParams value)
/*     */   {
/*  68 */     this.params = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof EditVMsReplicationParams)) {
/*  79 */       return false;
/*     */     }
/*  81 */     EditVMsReplicationParams otherObj = (EditVMsReplicationParams)obj;
/*     */     
/*  83 */     return this.params == otherObj.params ? true : this.params != null ? this.params.equals(otherObj.params) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.params != null ? this.params.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "EditVMsReplicationParams [params=" + this.params + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EditVMsReplicationParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */