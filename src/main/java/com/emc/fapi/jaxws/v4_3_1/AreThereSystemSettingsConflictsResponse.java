/*    */ package com.emc.fapi.jaxws.v4_3_1;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
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
/*    */ @XmlType(name="areThereSystemSettingsConflictsResponse", propOrder={"_return"})
/*    */ public class AreThereSystemSettingsConflictsResponse
/*    */ {
/*    */   @XmlElement(name="return")
/*    */   protected boolean _return;
/*    */   
/*    */   public AreThereSystemSettingsConflictsResponse() {}
/*    */   
/*    */   public AreThereSystemSettingsConflictsResponse(boolean _return)
/*    */   {
/* 46 */     this._return = _return;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean isReturn()
/*    */   {
/* 54 */     return this._return;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setReturn(boolean value)
/*    */   {
/* 62 */     this._return = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 72 */     if (!(obj instanceof AreThereSystemSettingsConflictsResponse)) {
/* 73 */       return false;
/*    */     }
/* 75 */     AreThereSystemSettingsConflictsResponse otherObj = (AreThereSystemSettingsConflictsResponse)obj;
/*    */     
/* 77 */     return this._return == otherObj._return;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 86 */     return this._return ? 1 : 0;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 95 */     return "AreThereSystemSettingsConflictsResponse [_return=" + this._return + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AreThereSystemSettingsConflictsResponse.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */