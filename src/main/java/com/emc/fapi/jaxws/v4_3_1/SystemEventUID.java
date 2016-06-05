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
/*    */ @XmlType(name="SystemEventUID", propOrder={"uniqueId"})
/*    */ public class SystemEventUID
/*    */ {
/*    */   protected long uniqueId;
/*    */   
/*    */   public SystemEventUID() {}
/*    */   
/*    */   public SystemEventUID(long uniqueId)
/*    */   {
/* 44 */     this.uniqueId = uniqueId;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public long getUniqueId()
/*    */   {
/* 52 */     return this.uniqueId;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setUniqueId(long value)
/*    */   {
/* 60 */     this.uniqueId = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof SystemEventUID)) {
/* 71 */       return false;
/*    */     }
/* 73 */     SystemEventUID otherObj = (SystemEventUID)obj;
/*    */     
/* 75 */     return this.uniqueId == otherObj.uniqueId;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return (int)this.uniqueId;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "SystemEventUID [uniqueId=" + this.uniqueId + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SystemEventUID.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */