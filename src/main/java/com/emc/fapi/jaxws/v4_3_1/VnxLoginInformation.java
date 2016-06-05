/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="VnxLoginInformation", propOrder={"endPoints", "vnxCredentials"})
/*     */ public class VnxLoginInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VnxEndPoint> endPoints;
/*     */   @XmlElement(nillable=true)
/*     */   protected VnxCredentials vnxCredentials;
/*     */   
/*     */   public VnxLoginInformation() {}
/*     */   
/*     */   public VnxLoginInformation(List<VnxEndPoint> endPoints, VnxCredentials vnxCredentials)
/*     */   {
/*  52 */     this.endPoints = endPoints;
/*  53 */     this.vnxCredentials = vnxCredentials;
/*     */   }
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
/*     */   public List<VnxEndPoint> getEndPoints()
/*     */   {
/*  79 */     if (this.endPoints == null) {
/*  80 */       this.endPoints = new ArrayList();
/*     */     }
/*  82 */     return this.endPoints;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VnxCredentials getVnxCredentials()
/*     */   {
/*  94 */     return this.vnxCredentials;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVnxCredentials(VnxCredentials value)
/*     */   {
/* 106 */     this.vnxCredentials = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof VnxLoginInformation)) {
/* 117 */       return false;
/*     */     }
/* 119 */     VnxLoginInformation otherObj = (VnxLoginInformation)obj;
/*     */     
/* 121 */     return (this.endPoints != null ? this.endPoints.equals(otherObj.endPoints) : this.endPoints == otherObj.endPoints) && (this.vnxCredentials != null ? this.vnxCredentials.equals(otherObj.vnxCredentials) : this.vnxCredentials == otherObj.vnxCredentials);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 131 */     return (this.endPoints != null ? this.endPoints.hashCode() : 0) ^ (this.vnxCredentials != null ? this.vnxCredentials.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 141 */     return "VnxLoginInformation [endPoints=" + this.endPoints + ", " + "vnxCredentials=" + this.vnxCredentials + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VnxLoginInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */