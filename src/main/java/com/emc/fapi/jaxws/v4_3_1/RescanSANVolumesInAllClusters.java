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
/*    */ @XmlType(name="rescanSANVolumesInAllClusters", propOrder={"checkExistingVolumesAsWell"})
/*    */ public class RescanSANVolumesInAllClusters
/*    */ {
/*    */   protected boolean checkExistingVolumesAsWell;
/*    */   
/*    */   public RescanSANVolumesInAllClusters() {}
/*    */   
/*    */   public RescanSANVolumesInAllClusters(boolean checkExistingVolumesAsWell)
/*    */   {
/* 44 */     this.checkExistingVolumesAsWell = checkExistingVolumesAsWell;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean isCheckExistingVolumesAsWell()
/*    */   {
/* 52 */     return this.checkExistingVolumesAsWell;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setCheckExistingVolumesAsWell(boolean value)
/*    */   {
/* 60 */     this.checkExistingVolumesAsWell = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof RescanSANVolumesInAllClusters)) {
/* 71 */       return false;
/*    */     }
/* 73 */     RescanSANVolumesInAllClusters otherObj = (RescanSANVolumesInAllClusters)obj;
/*    */     
/* 75 */     return this.checkExistingVolumesAsWell == otherObj.checkExistingVolumesAsWell;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return this.checkExistingVolumesAsWell ? 1 : 0;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "RescanSANVolumesInAllClusters [checkExistingVolumesAsWell=" + this.checkExistingVolumesAsWell + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RescanSANVolumesInAllClusters.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */