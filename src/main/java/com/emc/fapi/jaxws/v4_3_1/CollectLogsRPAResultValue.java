/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ @JsonTypeName("CollectLogsRPAResultValue")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="CollectLogsRPAResultValue", propOrder={"rpa"})
/*     */ public class CollectLogsRPAResultValue
/*     */   extends CollectLogsResultValue
/*     */ {
/*     */   protected RpaUID rpa;
/*     */   
/*     */   public CollectLogsRPAResultValue() {}
/*     */   
/*     */   public CollectLogsRPAResultValue(RpaUID rpa)
/*     */   {
/*  54 */     this.rpa = rpa;
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
/*  66 */     return this.rpa;
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
/*  78 */     this.rpa = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  88 */     if (!(obj instanceof CollectLogsRPAResultValue)) {
/*  89 */       return false;
/*     */     }
/*  91 */     CollectLogsRPAResultValue otherObj = (CollectLogsRPAResultValue)obj;
/*     */     
/*  93 */     return (super.equals(obj)) && (this.rpa != null ? this.rpa.equals(otherObj.rpa) : this.rpa == otherObj.rpa);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 103 */     return super.hashCode() ^ (this.rpa != null ? this.rpa.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 113 */     return "CollectLogsRPAResultValue [super=" + super.toString() + ", " + "rpa=" + this.rpa + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CollectLogsRPAResultValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */