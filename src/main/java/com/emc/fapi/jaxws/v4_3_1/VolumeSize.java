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
/*    */ @XmlType(name="VolumeSize", propOrder={"sizeInBytes"})
/*    */ public class VolumeSize
/*    */ {
/*    */   protected long sizeInBytes;
/*    */   
/*    */   public VolumeSize() {}
/*    */   
/*    */   public VolumeSize(long sizeInBytes)
/*    */   {
/* 44 */     this.sizeInBytes = sizeInBytes;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public long getSizeInBytes()
/*    */   {
/* 52 */     return this.sizeInBytes;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setSizeInBytes(long value)
/*    */   {
/* 60 */     this.sizeInBytes = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof VolumeSize)) {
/* 71 */       return false;
/*    */     }
/* 73 */     VolumeSize otherObj = (VolumeSize)obj;
/*    */     
/* 75 */     return this.sizeInBytes == otherObj.sizeInBytes;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return (int)this.sizeInBytes;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "VolumeSize [sizeInBytes=" + this.sizeInBytes + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumeSize.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */