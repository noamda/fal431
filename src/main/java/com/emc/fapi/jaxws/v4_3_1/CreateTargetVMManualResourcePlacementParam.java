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
/*     */ @JsonTypeName("CreateTargetVMManualResourcePlacementParam")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="CreateTargetVMManualResourcePlacementParam", propOrder={"targetEsxUID"})
/*     */ public class CreateTargetVMManualResourcePlacementParam
/*     */   extends CreateTargetVMResourcePlacementParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected EsxUID targetEsxUID;
/*     */   
/*     */   public CreateTargetVMManualResourcePlacementParam() {}
/*     */   
/*     */   public CreateTargetVMManualResourcePlacementParam(EsxUID targetEsxUID)
/*     */   {
/*  56 */     this.targetEsxUID = targetEsxUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EsxUID getTargetEsxUID()
/*     */   {
/*  68 */     return this.targetEsxUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTargetEsxUID(EsxUID value)
/*     */   {
/*  80 */     this.targetEsxUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof CreateTargetVMManualResourcePlacementParam)) {
/*  91 */       return false;
/*     */     }
/*  93 */     CreateTargetVMManualResourcePlacementParam otherObj = (CreateTargetVMManualResourcePlacementParam)obj;
/*     */     
/*  95 */     return (super.equals(obj)) && (this.targetEsxUID != null ? this.targetEsxUID.equals(otherObj.targetEsxUID) : this.targetEsxUID == otherObj.targetEsxUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return super.hashCode() ^ (this.targetEsxUID != null ? this.targetEsxUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "CreateTargetVMManualResourcePlacementParam [super=" + super.toString() + ", " + "targetEsxUID=" + this.targetEsxUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CreateTargetVMManualResourcePlacementParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */