/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="EsxClusterConnectivity", propOrder={"esxClusterUID", "status"})
/*     */ public class EsxClusterConnectivity
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected EsxClusterUID esxClusterUID;
/*     */   protected EsxClusterConnectivityStatus status;
/*     */   
/*     */   public EsxClusterConnectivity() {}
/*     */   
/*     */   public EsxClusterConnectivity(EsxClusterUID esxClusterUID, EsxClusterConnectivityStatus status)
/*     */   {
/*  49 */     this.esxClusterUID = esxClusterUID;
/*  50 */     this.status = status;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EsxClusterUID getEsxClusterUID()
/*     */   {
/*  62 */     return this.esxClusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEsxClusterUID(EsxClusterUID value)
/*     */   {
/*  74 */     this.esxClusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EsxClusterConnectivityStatus getStatus()
/*     */   {
/*  86 */     return this.status;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStatus(EsxClusterConnectivityStatus value)
/*     */   {
/*  98 */     this.status = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 108 */     if (!(obj instanceof EsxClusterConnectivity)) {
/* 109 */       return false;
/*     */     }
/* 111 */     EsxClusterConnectivity otherObj = (EsxClusterConnectivity)obj;
/*     */     
/* 113 */     return (this.esxClusterUID != null ? this.esxClusterUID.equals(otherObj.esxClusterUID) : this.esxClusterUID == otherObj.esxClusterUID) && (this.status != null ? this.status.equals(otherObj.status) : this.status == otherObj.status);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 123 */     return (this.esxClusterUID != null ? this.esxClusterUID.hashCode() : 0) ^ (this.status != null ? this.status.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 133 */     return "EsxClusterConnectivity [esxClusterUID=" + this.esxClusterUID + ", " + "status=" + this.status + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EsxClusterConnectivity.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */