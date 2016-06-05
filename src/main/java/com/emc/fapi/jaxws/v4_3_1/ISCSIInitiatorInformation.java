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
/*     */ @JsonTypeName("ISCSIInitiatorInformation")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ISCSIInitiatorInformation", propOrder={"iqn"})
/*     */ public class ISCSIInitiatorInformation
/*     */   extends InitiatorInformation
/*     */ {
/*     */   protected String iqn;
/*     */   
/*     */   public ISCSIInitiatorInformation() {}
/*     */   
/*     */   public ISCSIInitiatorInformation(String iqn)
/*     */   {
/*  54 */     this.iqn = iqn;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getIqn()
/*     */   {
/*  66 */     return this.iqn;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIqn(String value)
/*     */   {
/*  78 */     this.iqn = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  88 */     if (!(obj instanceof ISCSIInitiatorInformation)) {
/*  89 */       return false;
/*     */     }
/*  91 */     ISCSIInitiatorInformation otherObj = (ISCSIInitiatorInformation)obj;
/*     */     
/*  93 */     return (super.equals(obj)) && (this.iqn != null ? this.iqn.equals(otherObj.iqn) : this.iqn == otherObj.iqn);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 103 */     return super.hashCode() ^ (this.iqn != null ? this.iqn.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 113 */     return "ISCSIInitiatorInformation [super=" + super.toString() + ", " + "iqn=" + this.iqn + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ISCSIInitiatorInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */