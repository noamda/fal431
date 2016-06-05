/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VirtualDiskId", propOrder={"unitNumber", "controller", "controllerType"})
/*     */ public class VirtualDiskId
/*     */ {
/*     */   protected int unitNumber;
/*     */   protected int controller;
/*     */   @XmlElement(nillable=true)
/*     */   protected ControllerType controllerType;
/*     */   
/*     */   public VirtualDiskId() {}
/*     */   
/*     */   public VirtualDiskId(int unitNumber, int controller, ControllerType controllerType)
/*     */   {
/*  52 */     this.unitNumber = unitNumber;
/*  53 */     this.controller = controller;
/*  54 */     this.controllerType = controllerType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getUnitNumber()
/*     */   {
/*  62 */     return this.unitNumber;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUnitNumber(int value)
/*     */   {
/*  70 */     this.unitNumber = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getController()
/*     */   {
/*  78 */     return this.controller;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setController(int value)
/*     */   {
/*  86 */     this.controller = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ControllerType getControllerType()
/*     */   {
/*  98 */     return this.controllerType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setControllerType(ControllerType value)
/*     */   {
/* 110 */     this.controllerType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 120 */     if (!(obj instanceof VirtualDiskId)) {
/* 121 */       return false;
/*     */     }
/* 123 */     VirtualDiskId otherObj = (VirtualDiskId)obj;
/*     */     
/* 125 */     return (this.unitNumber == otherObj.unitNumber) && (this.controller == otherObj.controller) && (this.controllerType != null ? this.controllerType.equals(otherObj.controllerType) : this.controllerType == otherObj.controllerType);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 136 */     return this.unitNumber ^ this.controller ^ (this.controllerType != null ? this.controllerType.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 147 */     return "VirtualDiskId [unitNumber=" + this.unitNumber + ", " + "controller=" + this.controller + ", " + "controllerType=" + this.controllerType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualDiskId.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */