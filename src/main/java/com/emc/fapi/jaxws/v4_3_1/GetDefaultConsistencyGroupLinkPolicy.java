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
/*    */ @XmlType(name="getDefaultConsistencyGroupLinkPolicy", propOrder={"isLocalLink"})
/*    */ public class GetDefaultConsistencyGroupLinkPolicy
/*    */ {
/*    */   protected boolean isLocalLink;
/*    */   
/*    */   public GetDefaultConsistencyGroupLinkPolicy() {}
/*    */   
/*    */   public GetDefaultConsistencyGroupLinkPolicy(boolean isLocalLink)
/*    */   {
/* 44 */     this.isLocalLink = isLocalLink;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean isIsLocalLink()
/*    */   {
/* 52 */     return this.isLocalLink;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setIsLocalLink(boolean value)
/*    */   {
/* 60 */     this.isLocalLink = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof GetDefaultConsistencyGroupLinkPolicy)) {
/* 71 */       return false;
/*    */     }
/* 73 */     GetDefaultConsistencyGroupLinkPolicy otherObj = (GetDefaultConsistencyGroupLinkPolicy)obj;
/*    */     
/* 75 */     return this.isLocalLink == otherObj.isLocalLink;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return this.isLocalLink ? 1 : 0;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "GetDefaultConsistencyGroupLinkPolicy [isLocalLink=" + this.isLocalLink + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetDefaultConsistencyGroupLinkPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */