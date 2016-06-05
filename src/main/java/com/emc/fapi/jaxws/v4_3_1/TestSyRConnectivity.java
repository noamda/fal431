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
/*     */ @XmlType(name="testSyRConnectivity", propOrder={"contactEmail"})
/*     */ public class TestSyRConnectivity
/*     */ {
/*     */   protected String contactEmail;
/*     */   
/*     */   public TestSyRConnectivity() {}
/*     */   
/*     */   public TestSyRConnectivity(String contactEmail)
/*     */   {
/*  44 */     this.contactEmail = contactEmail;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getContactEmail()
/*     */   {
/*  56 */     return this.contactEmail;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setContactEmail(String value)
/*     */   {
/*  68 */     this.contactEmail = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof TestSyRConnectivity)) {
/*  79 */       return false;
/*     */     }
/*  81 */     TestSyRConnectivity otherObj = (TestSyRConnectivity)obj;
/*     */     
/*  83 */     return this.contactEmail == otherObj.contactEmail ? true : this.contactEmail != null ? this.contactEmail.equals(otherObj.contactEmail) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.contactEmail != null ? this.contactEmail.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "TestSyRConnectivity [contactEmail=" + this.contactEmail + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\TestSyRConnectivity.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */