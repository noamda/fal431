/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="changeVmsPowerUpSequence", propOrder={"group", "powerUpSequenceParams"})
/*     */ public class ChangeVmsPowerUpSequence
/*     */ {
/*     */   protected ConsistencyGroupUID group;
/*     */   protected List<VmPowerUpSequenceParam> powerUpSequenceParams;
/*     */   
/*     */   public ChangeVmsPowerUpSequence() {}
/*     */   
/*     */   public ChangeVmsPowerUpSequence(ConsistencyGroupUID group, List<VmPowerUpSequenceParam> powerUpSequenceParams)
/*     */   {
/*  49 */     this.group = group;
/*  50 */     this.powerUpSequenceParams = powerUpSequenceParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupUID getGroup()
/*     */   {
/*  62 */     return this.group;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroup(ConsistencyGroupUID value)
/*     */   {
/*  74 */     this.group = value;
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
/*     */   public List<VmPowerUpSequenceParam> getPowerUpSequenceParams()
/*     */   {
/* 100 */     if (this.powerUpSequenceParams == null) {
/* 101 */       this.powerUpSequenceParams = new ArrayList();
/*     */     }
/* 103 */     return this.powerUpSequenceParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof ChangeVmsPowerUpSequence)) {
/* 114 */       return false;
/*     */     }
/* 116 */     ChangeVmsPowerUpSequence otherObj = (ChangeVmsPowerUpSequence)obj;
/*     */     
/* 118 */     return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.powerUpSequenceParams != null ? this.powerUpSequenceParams.equals(otherObj.powerUpSequenceParams) : this.powerUpSequenceParams == otherObj.powerUpSequenceParams);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.group != null ? this.group.hashCode() : 0) ^ (this.powerUpSequenceParams != null ? this.powerUpSequenceParams.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "ChangeVmsPowerUpSequence [group=" + this.group + ", " + "powerUpSequenceParams=" + this.powerUpSequenceParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ChangeVmsPowerUpSequence.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */