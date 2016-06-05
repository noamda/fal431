/*    */ package com.emc.fapi.jaxws.v4_3_1;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="setSuppressAutoRegistrationWarning", propOrder={"shouldSuppress"})
/*    */ public class SetSuppressAutoRegistrationWarning
/*    */ {
/*    */   protected boolean shouldSuppress;
/*    */   
/*    */   public SetSuppressAutoRegistrationWarning() {}
/*    */   
/*    */   public SetSuppressAutoRegistrationWarning(boolean shouldSuppress)
/*    */   {
/* 44 */     this.shouldSuppress = shouldSuppress;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean isShouldSuppress()
/*    */   {
/* 52 */     return this.shouldSuppress;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setShouldSuppress(boolean value)
/*    */   {
/* 60 */     this.shouldSuppress = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof SetSuppressAutoRegistrationWarning)) {
/* 71 */       return false;
/*    */     }
/* 73 */     SetSuppressAutoRegistrationWarning otherObj = (SetSuppressAutoRegistrationWarning)obj;
/*    */     
/* 75 */     return this.shouldSuppress == otherObj.shouldSuppress;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return this.shouldSuppress ? 1 : 0;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "SetSuppressAutoRegistrationWarning [shouldSuppress=" + this.shouldSuppress + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetSuppressAutoRegistrationWarning.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */