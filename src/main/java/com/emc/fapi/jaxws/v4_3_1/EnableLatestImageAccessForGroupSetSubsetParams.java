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
/*     */ @XmlType(name="enableLatestImageAccessForGroupSetSubsetParams", propOrder={"groupSetSubset", "mode", "scenario"})
/*     */ public class EnableLatestImageAccessForGroupSetSubsetParams
/*     */ {
/*     */   protected ConsistencyGroupSetSubset groupSetSubset;
/*     */   protected ImageAccessMode mode;
/*     */   protected ImageAccessScenario scenario;
/*     */   
/*     */   public EnableLatestImageAccessForGroupSetSubsetParams() {}
/*     */   
/*     */   public EnableLatestImageAccessForGroupSetSubsetParams(ConsistencyGroupSetSubset groupSetSubset, ImageAccessMode mode, ImageAccessScenario scenario)
/*     */   {
/*  57 */     this.groupSetSubset = groupSetSubset;
/*  58 */     this.mode = mode;
/*  59 */     this.scenario = scenario;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupSetSubset getGroupSetSubset()
/*     */   {
/*  71 */     return this.groupSetSubset;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupSetSubset(ConsistencyGroupSetSubset value)
/*     */   {
/*  83 */     this.groupSetSubset = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ImageAccessMode getMode()
/*     */   {
/*  95 */     return this.mode;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMode(ImageAccessMode value)
/*     */   {
/* 107 */     this.mode = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ImageAccessScenario getScenario()
/*     */   {
/* 119 */     return this.scenario;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setScenario(ImageAccessScenario value)
/*     */   {
/* 131 */     this.scenario = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 141 */     if (!(obj instanceof EnableLatestImageAccessForGroupSetSubsetParams)) {
/* 142 */       return false;
/*     */     }
/* 144 */     EnableLatestImageAccessForGroupSetSubsetParams otherObj = (EnableLatestImageAccessForGroupSetSubsetParams)obj;
/*     */     
/* 146 */     return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.mode != null ? this.mode.equals(otherObj.mode) : this.mode == otherObj.mode) && (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario);
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
/* 157 */     return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.mode != null ? this.mode.hashCode() : 0) ^ (this.scenario != null ? this.scenario.hashCode() : 0);
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
/* 168 */     return "EnableLatestImageAccessForGroupSetSubsetParams [groupSetSubset=" + this.groupSetSubset + ", " + "mode=" + this.mode + ", " + "scenario=" + this.scenario + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EnableLatestImageAccessForGroupSetSubsetParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */