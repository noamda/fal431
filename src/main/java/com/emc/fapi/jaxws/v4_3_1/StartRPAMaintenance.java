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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="startRPAMaintenance", propOrder={"rpa"})
/*     */ public class StartRPAMaintenance
/*     */ {
/*     */   protected RpaUID rpa;
/*     */   
/*     */   public StartRPAMaintenance() {}
/*     */   
/*     */   public StartRPAMaintenance(RpaUID rpa)
/*     */   {
/*  44 */     this.rpa = rpa;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaUID getRpa()
/*     */   {
/*  56 */     return this.rpa;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpa(RpaUID value)
/*     */   {
/*  68 */     this.rpa = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof StartRPAMaintenance)) {
/*  79 */       return false;
/*     */     }
/*  81 */     StartRPAMaintenance otherObj = (StartRPAMaintenance)obj;
/*     */     
/*  83 */     return this.rpa == otherObj.rpa ? true : this.rpa != null ? this.rpa.equals(otherObj.rpa) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.rpa != null ? this.rpa.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "StartRPAMaintenance [rpa=" + this.rpa + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\StartRPAMaintenance.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */