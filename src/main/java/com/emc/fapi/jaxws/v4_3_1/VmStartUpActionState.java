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
/*     */ @XmlType(name="VmStartUpActionState", propOrder={"vmActionUID", "vmStartUpStep"})
/*     */ public class VmStartUpActionState
/*     */ {
/*     */   protected VmStartUpActionUID vmActionUID;
/*     */   protected BaseVmStartUpAction vmStartUpStep;
/*     */   
/*     */   public VmStartUpActionState() {}
/*     */   
/*     */   public VmStartUpActionState(VmStartUpActionUID vmActionUID, BaseVmStartUpAction vmStartUpStep)
/*     */   {
/*  47 */     this.vmActionUID = vmActionUID;
/*  48 */     this.vmStartUpStep = vmStartUpStep;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmStartUpActionUID getVmActionUID()
/*     */   {
/*  60 */     return this.vmActionUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmActionUID(VmStartUpActionUID value)
/*     */   {
/*  72 */     this.vmActionUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public BaseVmStartUpAction getVmStartUpStep()
/*     */   {
/*  84 */     return this.vmStartUpStep;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmStartUpStep(BaseVmStartUpAction value)
/*     */   {
/*  96 */     this.vmStartUpStep = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof VmStartUpActionState)) {
/* 107 */       return false;
/*     */     }
/* 109 */     VmStartUpActionState otherObj = (VmStartUpActionState)obj;
/*     */     
/* 111 */     return (this.vmActionUID != null ? this.vmActionUID.equals(otherObj.vmActionUID) : this.vmActionUID == otherObj.vmActionUID) && (this.vmStartUpStep != null ? this.vmStartUpStep.equals(otherObj.vmStartUpStep) : this.vmStartUpStep == otherObj.vmStartUpStep);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.vmActionUID != null ? this.vmActionUID.hashCode() : 0) ^ (this.vmStartUpStep != null ? this.vmStartUpStep.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "VmStartUpActionState [vmActionUID=" + this.vmActionUID + ", " + "vmStartUpStep=" + this.vmStartUpStep + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmStartUpActionState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */