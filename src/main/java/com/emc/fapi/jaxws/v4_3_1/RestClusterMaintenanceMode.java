/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="restClusterMaintenanceMode", propOrder={"restEnum"})
/*     */ public class RestClusterMaintenanceMode
/*     */ {
/*     */   protected ClusterMaintenanceMode restEnum;
/*     */   
/*     */   public RestClusterMaintenanceMode() {}
/*     */   
/*     */   public RestClusterMaintenanceMode(ClusterMaintenanceMode restEnum)
/*     */   {
/*  51 */     this.restEnum = restEnum;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterMaintenanceMode getRestEnum()
/*     */   {
/*  63 */     return this.restEnum;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRestEnum(ClusterMaintenanceMode value)
/*     */   {
/*  75 */     this.restEnum = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  85 */     if (!(obj instanceof RestClusterMaintenanceMode)) {
/*  86 */       return false;
/*     */     }
/*  88 */     RestClusterMaintenanceMode otherObj = (RestClusterMaintenanceMode)obj;
/*     */     
/*  90 */     return this.restEnum == otherObj.restEnum ? true : this.restEnum != null ? this.restEnum.equals(otherObj.restEnum) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  99 */     return this.restEnum != null ? this.restEnum.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 108 */     return "RestClusterMaintenanceMode [restEnum=" + this.restEnum + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RestClusterMaintenanceMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */