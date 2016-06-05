/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonTypeName;
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
/*     */ @JsonTypeName("ConsistencyGroupReportStartUpStep")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupReportStartUpStep", propOrder={"vmStartUpActionUID"})
/*     */ public class ConsistencyGroupReportStartUpStep
/*     */   extends ConsistencyGroupReportVMStep
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VmStartUpActionUID vmStartUpActionUID;
/*     */   
/*     */   public ConsistencyGroupReportStartUpStep() {}
/*     */   
/*     */   public ConsistencyGroupReportStartUpStep(VmStartUpActionUID vmStartUpActionUID)
/*     */   {
/*  56 */     this.vmStartUpActionUID = vmStartUpActionUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmStartUpActionUID getVmStartUpActionUID()
/*     */   {
/*  68 */     return this.vmStartUpActionUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmStartUpActionUID(VmStartUpActionUID value)
/*     */   {
/*  80 */     this.vmStartUpActionUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof ConsistencyGroupReportStartUpStep)) {
/*  91 */       return false;
/*     */     }
/*  93 */     ConsistencyGroupReportStartUpStep otherObj = (ConsistencyGroupReportStartUpStep)obj;
/*     */     
/*  95 */     return (super.equals(obj)) && (this.vmStartUpActionUID != null ? this.vmStartUpActionUID.equals(otherObj.vmStartUpActionUID) : this.vmStartUpActionUID == otherObj.vmStartUpActionUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return super.hashCode() ^ (this.vmStartUpActionUID != null ? this.vmStartUpActionUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "ConsistencyGroupReportStartUpStep [super=" + super.toString() + ", " + "vmStartUpActionUID=" + this.vmStartUpActionUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupReportStartUpStep.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */