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
/*    */ @XmlType(name="EsxClusterAbilities", propOrder={"automaticResourcePlacementEnabled"})
/*    */ public class EsxClusterAbilities
/*    */ {
/*    */   protected boolean automaticResourcePlacementEnabled;
/*    */   
/*    */   public EsxClusterAbilities() {}
/*    */   
/*    */   public EsxClusterAbilities(boolean automaticResourcePlacementEnabled)
/*    */   {
/* 44 */     this.automaticResourcePlacementEnabled = automaticResourcePlacementEnabled;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean isAutomaticResourcePlacementEnabled()
/*    */   {
/* 52 */     return this.automaticResourcePlacementEnabled;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setAutomaticResourcePlacementEnabled(boolean value)
/*    */   {
/* 60 */     this.automaticResourcePlacementEnabled = value;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean equals(Object obj)
/*    */   {
/* 70 */     if (!(obj instanceof EsxClusterAbilities)) {
/* 71 */       return false;
/*    */     }
/* 73 */     EsxClusterAbilities otherObj = (EsxClusterAbilities)obj;
/*    */     
/* 75 */     return this.automaticResourcePlacementEnabled == otherObj.automaticResourcePlacementEnabled;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 84 */     return this.automaticResourcePlacementEnabled ? 1 : 0;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 93 */     return "EsxClusterAbilities [automaticResourcePlacementEnabled=" + this.automaticResourcePlacementEnabled + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EsxClusterAbilities.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */