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
/*     */ @XmlType(name="changeGroupPowerUpSequence", propOrder={"group", "powerUpGroup"})
/*     */ public class ChangeGroupPowerUpSequence
/*     */ {
/*     */   protected ConsistencyGroupUID group;
/*     */   protected Long powerUpGroup;
/*     */   
/*     */   public ChangeGroupPowerUpSequence() {}
/*     */   
/*     */   public ChangeGroupPowerUpSequence(ConsistencyGroupUID group, Long powerUpGroup)
/*     */   {
/*  47 */     this.group = group;
/*  48 */     this.powerUpGroup = powerUpGroup;
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
/*  60 */     return this.group;
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
/*  72 */     this.group = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getPowerUpGroup()
/*     */   {
/*  84 */     return this.powerUpGroup;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPowerUpGroup(Long value)
/*     */   {
/*  96 */     this.powerUpGroup = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof ChangeGroupPowerUpSequence)) {
/* 107 */       return false;
/*     */     }
/* 109 */     ChangeGroupPowerUpSequence otherObj = (ChangeGroupPowerUpSequence)obj;
/*     */     
/* 111 */     return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.powerUpGroup != null ? this.powerUpGroup.equals(otherObj.powerUpGroup) : this.powerUpGroup == otherObj.powerUpGroup);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.group != null ? this.group.hashCode() : 0) ^ (this.powerUpGroup != null ? this.powerUpGroup.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "ChangeGroupPowerUpSequence [group=" + this.group + ", " + "powerUpGroup=" + this.powerUpGroup + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ChangeGroupPowerUpSequence.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */