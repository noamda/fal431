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
/*     */ @XmlType(name="PhoenixClusterProtectionPolicy", propOrder={"domino", "regulate"})
/*     */ public class PhoenixClusterProtectionPolicy
/*     */ {
/*     */   protected boolean domino;
/*     */   protected boolean regulate;
/*     */   
/*     */   public PhoenixClusterProtectionPolicy() {}
/*     */   
/*     */   public PhoenixClusterProtectionPolicy(boolean domino, boolean regulate)
/*     */   {
/*  47 */     this.domino = domino;
/*  48 */     this.regulate = regulate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isDomino()
/*     */   {
/*  56 */     return this.domino;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDomino(boolean value)
/*     */   {
/*  64 */     this.domino = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isRegulate()
/*     */   {
/*  72 */     return this.regulate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRegulate(boolean value)
/*     */   {
/*  80 */     this.regulate = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof PhoenixClusterProtectionPolicy)) {
/*  91 */       return false;
/*     */     }
/*  93 */     PhoenixClusterProtectionPolicy otherObj = (PhoenixClusterProtectionPolicy)obj;
/*     */     
/*  95 */     return (this.domino == otherObj.domino) && (this.regulate == otherObj.regulate);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return (this.domino ? 1 : 0) ^ (this.regulate ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "PhoenixClusterProtectionPolicy [domino=" + this.domino + ", " + "regulate=" + this.regulate + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\PhoenixClusterProtectionPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */