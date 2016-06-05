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
/*     */ @XmlType(name="validateEditVMsHardwareReplicationParams", propOrder={"params"})
/*     */ public class ValidateEditVMsHardwareReplicationParams
/*     */ {
/*     */   protected ConsistencyGroupVMHardwareReplicationParams params;
/*     */   
/*     */   public ValidateEditVMsHardwareReplicationParams() {}
/*     */   
/*     */   public ValidateEditVMsHardwareReplicationParams(ConsistencyGroupVMHardwareReplicationParams params)
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
/*     */   public ConsistencyGroupVMHardwareReplicationParams getParams()
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
/*     */   public void setParams(ConsistencyGroupVMHardwareReplicationParams value)
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
/*  78 */     if (!(obj instanceof ValidateEditVMsHardwareReplicationParams)) {
/*  79 */       return false;
/*     */     }
/*  81 */     ValidateEditVMsHardwareReplicationParams otherObj = (ValidateEditVMsHardwareReplicationParams)obj;
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
/* 101 */     return "ValidateEditVMsHardwareReplicationParams [params=" + this.params + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateEditVMsHardwareReplicationParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */