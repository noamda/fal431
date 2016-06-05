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
/*     */ @XmlType(name="RPOPolicy", propOrder={"maximumAllowedLag", "allowRegulation", "minimizationType"})
/*     */ public class RPOPolicy
/*     */ {
/*     */   protected Quantity maximumAllowedLag;
/*     */   protected boolean allowRegulation;
/*     */   @XmlElement(required=true)
/*     */   protected RpoMinimizationType minimizationType;
/*     */   
/*     */   public RPOPolicy() {}
/*     */   
/*     */   public RPOPolicy(Quantity maximumAllowedLag, boolean allowRegulation, RpoMinimizationType minimizationType)
/*     */   {
/*  52 */     this.maximumAllowedLag = maximumAllowedLag;
/*  53 */     this.allowRegulation = allowRegulation;
/*  54 */     this.minimizationType = minimizationType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Quantity getMaximumAllowedLag()
/*     */   {
/*  66 */     return this.maximumAllowedLag;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMaximumAllowedLag(Quantity value)
/*     */   {
/*  78 */     this.maximumAllowedLag = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isAllowRegulation()
/*     */   {
/*  86 */     return this.allowRegulation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAllowRegulation(boolean value)
/*     */   {
/*  94 */     this.allowRegulation = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpoMinimizationType getMinimizationType()
/*     */   {
/* 106 */     return this.minimizationType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMinimizationType(RpoMinimizationType value)
/*     */   {
/* 118 */     this.minimizationType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 128 */     if (!(obj instanceof RPOPolicy)) {
/* 129 */       return false;
/*     */     }
/* 131 */     RPOPolicy otherObj = (RPOPolicy)obj;
/*     */     
/* 133 */     return (this.maximumAllowedLag != null ? this.maximumAllowedLag.equals(otherObj.maximumAllowedLag) : this.maximumAllowedLag == otherObj.maximumAllowedLag) && (this.allowRegulation == otherObj.allowRegulation) && (this.minimizationType != null ? this.minimizationType.equals(otherObj.minimizationType) : this.minimizationType == otherObj.minimizationType);
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
/* 144 */     return (this.maximumAllowedLag != null ? this.maximumAllowedLag.hashCode() : 0) ^ (this.allowRegulation ? 1 : 0) ^ (this.minimizationType != null ? this.minimizationType.hashCode() : 0);
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
/* 155 */     return "RPOPolicy [maximumAllowedLag=" + this.maximumAllowedLag + ", " + "allowRegulation=" + this.allowRegulation + ", " + "minimizationType=" + this.minimizationType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RPOPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */