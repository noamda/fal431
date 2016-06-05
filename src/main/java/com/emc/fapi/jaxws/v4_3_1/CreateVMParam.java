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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("CreateVMParam")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="CreateVMParam", propOrder={"targetVirtualCenterUID", "targetResourcePlacementParam", "targetDatastoreUID"})
/*     */ public class CreateVMParam
/*     */   extends VMParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected VirtualCenterUID targetVirtualCenterUID;
/*     */   @XmlElement(required=true)
/*     */   protected CreateTargetVMResourcePlacementParam targetResourcePlacementParam;
/*     */   @XmlElement(required=true)
/*     */   protected DatastoreUID targetDatastoreUID;
/*     */   
/*     */   public CreateVMParam() {}
/*     */   
/*     */   public CreateVMParam(VirtualCenterUID targetVirtualCenterUID, CreateTargetVMResourcePlacementParam targetResourcePlacementParam, DatastoreUID targetDatastoreUID)
/*     */   {
/*  64 */     this.targetVirtualCenterUID = targetVirtualCenterUID;
/*  65 */     this.targetResourcePlacementParam = targetResourcePlacementParam;
/*  66 */     this.targetDatastoreUID = targetDatastoreUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualCenterUID getTargetVirtualCenterUID()
/*     */   {
/*  78 */     return this.targetVirtualCenterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTargetVirtualCenterUID(VirtualCenterUID value)
/*     */   {
/*  90 */     this.targetVirtualCenterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public CreateTargetVMResourcePlacementParam getTargetResourcePlacementParam()
/*     */   {
/* 102 */     return this.targetResourcePlacementParam;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTargetResourcePlacementParam(CreateTargetVMResourcePlacementParam value)
/*     */   {
/* 114 */     this.targetResourcePlacementParam = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DatastoreUID getTargetDatastoreUID()
/*     */   {
/* 126 */     return this.targetDatastoreUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTargetDatastoreUID(DatastoreUID value)
/*     */   {
/* 138 */     this.targetDatastoreUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 148 */     if (!(obj instanceof CreateVMParam)) {
/* 149 */       return false;
/*     */     }
/* 151 */     CreateVMParam otherObj = (CreateVMParam)obj;
/*     */     
/* 153 */     return (super.equals(obj)) && (this.targetVirtualCenterUID != null ? this.targetVirtualCenterUID.equals(otherObj.targetVirtualCenterUID) : this.targetVirtualCenterUID == otherObj.targetVirtualCenterUID) && (this.targetResourcePlacementParam != null ? this.targetResourcePlacementParam.equals(otherObj.targetResourcePlacementParam) : this.targetResourcePlacementParam == otherObj.targetResourcePlacementParam) && (this.targetDatastoreUID != null ? this.targetDatastoreUID.equals(otherObj.targetDatastoreUID) : this.targetDatastoreUID == otherObj.targetDatastoreUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 165 */     return super.hashCode() ^ (this.targetVirtualCenterUID != null ? this.targetVirtualCenterUID.hashCode() : 0) ^ (this.targetResourcePlacementParam != null ? this.targetResourcePlacementParam.hashCode() : 0) ^ (this.targetDatastoreUID != null ? this.targetDatastoreUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 177 */     return "CreateVMParam [super=" + super.toString() + ", " + "targetVirtualCenterUID=" + this.targetVirtualCenterUID + ", " + "targetResourcePlacementParam=" + this.targetResourcePlacementParam + ", " + "targetDatastoreUID=" + this.targetDatastoreUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CreateVMParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */