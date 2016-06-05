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
/*    */ @XmlType(name="CallHomeEventUID", propOrder={"id"})
/*    */ public class CallHomeEventUID
/*    */ {
/*    */   protected long id;
/*    */   
/*    */   public CallHomeEventUID() {}
/*    */   
/*    */   public CallHomeEventUID(long id)
/*    */   {
/* 44 */     this.id = id;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public long getId()
/*    */   {
/* 52 */     return this.id;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setId(long value)
/*    */   {
/* 60 */     this.id = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof CallHomeEventUID)) {
/* 71 */       return false;
/*    */     }
/* 73 */     CallHomeEventUID otherObj = (CallHomeEventUID)obj;
/*    */     
/* 75 */     return this.id == otherObj.id;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return (int)this.id;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "CallHomeEventUID [id=" + this.id + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CallHomeEventUID.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */