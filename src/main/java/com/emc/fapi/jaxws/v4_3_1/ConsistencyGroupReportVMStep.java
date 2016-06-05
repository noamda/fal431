/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonSubTypes;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.As;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("ConsistencyGroupReportVMStep")
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ConsistencyGroupReportStartUpStep.class, name="ConsistencyGroupReportStartUpStep")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupReportVMStep", propOrder={"vmUid"})
/*     */ @XmlSeeAlso({ConsistencyGroupReportStartUpStep.class})
/*     */ public class ConsistencyGroupReportVMStep
/*     */   extends ConsistencyGroupReportStep
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VmUID vmUid;
/*     */   
/*     */   public ConsistencyGroupReportVMStep() {}
/*     */   
/*     */   public ConsistencyGroupReportVMStep(VmUID vmUid)
/*     */   {
/*  71 */     this.vmUid = vmUid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VmUID getVmUid()
/*     */   {
/*  83 */     return this.vmUid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVmUid(VmUID value)
/*     */   {
/*  95 */     this.vmUid = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 105 */     if (!(obj instanceof ConsistencyGroupReportVMStep)) {
/* 106 */       return false;
/*     */     }
/* 108 */     ConsistencyGroupReportVMStep otherObj = (ConsistencyGroupReportVMStep)obj;
/*     */     
/* 110 */     return (super.equals(obj)) && (this.vmUid != null ? this.vmUid.equals(otherObj.vmUid) : this.vmUid == otherObj.vmUid);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 120 */     return super.hashCode() ^ (this.vmUid != null ? this.vmUid.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 130 */     return "ConsistencyGroupReportVMStep [super=" + super.toString() + ", " + "vmUid=" + this.vmUid + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupReportVMStep.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */