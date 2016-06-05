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
/*     */ @JsonTypeName("CreateTargetVMAutomaticResourcePlacementParam")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="CreateTargetVMAutomaticResourcePlacementParam", propOrder={"targetResourcePoolUID"})
/*     */ public class CreateTargetVMAutomaticResourcePlacementParam
/*     */   extends CreateTargetVMResourcePlacementParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected VirtualResourcePoolUUID targetResourcePoolUID;
/*     */   
/*     */   public CreateTargetVMAutomaticResourcePlacementParam() {}
/*     */   
/*     */   public CreateTargetVMAutomaticResourcePlacementParam(VirtualResourcePoolUUID targetResourcePoolUID)
/*     */   {
/*  56 */     this.targetResourcePoolUID = targetResourcePoolUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualResourcePoolUUID getTargetResourcePoolUID()
/*     */   {
/*  68 */     return this.targetResourcePoolUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTargetResourcePoolUID(VirtualResourcePoolUUID value)
/*     */   {
/*  80 */     this.targetResourcePoolUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof CreateTargetVMAutomaticResourcePlacementParam)) {
/*  91 */       return false;
/*     */     }
/*  93 */     CreateTargetVMAutomaticResourcePlacementParam otherObj = (CreateTargetVMAutomaticResourcePlacementParam)obj;
/*     */     
/*  95 */     return (super.equals(obj)) && (this.targetResourcePoolUID != null ? this.targetResourcePoolUID.equals(otherObj.targetResourcePoolUID) : this.targetResourcePoolUID == otherObj.targetResourcePoolUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return super.hashCode() ^ (this.targetResourcePoolUID != null ? this.targetResourcePoolUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "CreateTargetVMAutomaticResourcePlacementParam [super=" + super.toString() + ", " + "targetResourcePoolUID=" + this.targetResourcePoolUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CreateTargetVMAutomaticResourcePlacementParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */