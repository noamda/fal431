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
/*    */ @XmlType(name="VmReplicationSetUID", propOrder={"uid"})
/*    */ public class VmReplicationSetUID
/*    */ {
/*    */   protected long uid;
/*    */   
/*    */   public VmReplicationSetUID() {}
/*    */   
/*    */   public VmReplicationSetUID(long uid)
/*    */   {
/* 44 */     this.uid = uid;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public long getUid()
/*    */   {
/* 52 */     return this.uid;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setUid(long value)
/*    */   {
/* 60 */     this.uid = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof VmReplicationSetUID)) {
/* 71 */       return false;
/*    */     }
/* 73 */     VmReplicationSetUID otherObj = (VmReplicationSetUID)obj;
/*    */     
/* 75 */     return this.uid == otherObj.uid;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return (int)this.uid;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "VmReplicationSetUID [uid=" + this.uid + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VmReplicationSetUID.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */