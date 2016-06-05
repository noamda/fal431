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
/*    */ @XmlType(name="getAvailableVolumesFromAllClusters", propOrder={"refreshView"})
/*    */ public class GetAvailableVolumesFromAllClusters
/*    */ {
/*    */   protected boolean refreshView;
/*    */   
/*    */   public GetAvailableVolumesFromAllClusters() {}
/*    */   
/*    */   public GetAvailableVolumesFromAllClusters(boolean refreshView)
/*    */   {
/* 44 */     this.refreshView = refreshView;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean isRefreshView()
/*    */   {
/* 52 */     return this.refreshView;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setRefreshView(boolean value)
/*    */   {
/* 60 */     this.refreshView = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof GetAvailableVolumesFromAllClusters)) {
/* 71 */       return false;
/*    */     }
/* 73 */     GetAvailableVolumesFromAllClusters otherObj = (GetAvailableVolumesFromAllClusters)obj;
/*    */     
/* 75 */     return this.refreshView == otherObj.refreshView;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return this.refreshView ? 1 : 0;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "GetAvailableVolumesFromAllClusters [refreshView=" + this.refreshView + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetAvailableVolumesFromAllClusters.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */