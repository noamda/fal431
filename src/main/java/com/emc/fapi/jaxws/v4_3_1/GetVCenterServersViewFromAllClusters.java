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
/*    */ @XmlType(name="getVCenterServersViewFromAllClusters", propOrder={"shouldRescan"})
/*    */ public class GetVCenterServersViewFromAllClusters
/*    */ {
/*    */   protected boolean shouldRescan;
/*    */   
/*    */   public GetVCenterServersViewFromAllClusters() {}
/*    */   
/*    */   public GetVCenterServersViewFromAllClusters(boolean shouldRescan)
/*    */   {
/* 44 */     this.shouldRescan = shouldRescan;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean isShouldRescan()
/*    */   {
/* 52 */     return this.shouldRescan;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setShouldRescan(boolean value)
/*    */   {
/* 60 */     this.shouldRescan = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof GetVCenterServersViewFromAllClusters)) {
/* 71 */       return false;
/*    */     }
/* 73 */     GetVCenterServersViewFromAllClusters otherObj = (GetVCenterServersViewFromAllClusters)obj;
/*    */     
/* 75 */     return this.shouldRescan == otherObj.shouldRescan;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return this.shouldRescan ? 1 : 0;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "GetVCenterServersViewFromAllClusters [shouldRescan=" + this.shouldRescan + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetVCenterServersViewFromAllClusters.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */