/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VmStartUpActionsPolicy", propOrder={"prePowerUpActions", "postPowerUpActions"})
/*     */ public class VmStartUpActionsPolicy
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected List<BaseVmStartUpAction> prePowerUpActions;
/*     */   @XmlElement(required=true)
/*     */   protected List<BaseVmStartUpAction> postPowerUpActions;
/*     */   
/*     */   public VmStartUpActionsPolicy() {}
/*     */   
/*     */   public VmStartUpActionsPolicy(List<BaseVmStartUpAction> prePowerUpActions, List<BaseVmStartUpAction> postPowerUpActions)
/*     */   {
/*  52 */     this.prePowerUpActions = prePowerUpActions;
/*  53 */     this.postPowerUpActions = postPowerUpActions;
/*     */   }
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
/*     */   public List<BaseVmStartUpAction> getPrePowerUpActions()
/*     */   {
/*  79 */     if (this.prePowerUpActions == null) {
/*  80 */       this.prePowerUpActions = new ArrayList();
/*     */     }
/*  82 */     return this.prePowerUpActions;
/*     */   }
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
/*     */   public List<BaseVmStartUpAction> getPostPowerUpActions()
/*     */   {
/* 108 */     if (this.postPowerUpActions == null) {
/* 109 */       this.postPowerUpActions = new ArrayList();
/*     */     }
/* 111 */     return this.postPowerUpActions;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 121 */     if (!(obj instanceof VmStartUpActionsPolicy)) {
/* 122 */       return false;
/*     */     }
/* 124 */     VmStartUpActionsPolicy otherObj = (VmStartUpActionsPolicy)obj;
/*     */     
/* 126 */     return (this.prePowerUpActions != null ? this.prePowerUpActions.equals(otherObj.prePowerUpActions) : this.prePowerUpActions == otherObj.prePowerUpActions) && (this.postPowerUpActions != null ? this.postPowerUpActions.equals(otherObj.postPowerUpActions) : this.postPowerUpActions == otherObj.postPowerUpActions);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 136 */     return (this.prePowerUpActions != null ? this.prePowerUpActions.hashCode() : 0) ^ (this.postPowerUpActions != null ? this.postPowerUpActions.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 146 */     return "VmStartUpActionsPolicy [prePowerUpActions=" + this.prePowerUpActions + ", " + "postPowerUpActions=" + this.postPowerUpActions + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmStartUpActionsPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */