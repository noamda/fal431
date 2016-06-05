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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="RPAStatistics", propOrder={"rpaUID", "cpuUsage", "traffic"})
/*     */ public class RPAStatistics
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected RpaUID rpaUID;
/*     */   protected double cpuUsage;
/*     */   protected TrafficStatistics traffic;
/*     */   
/*     */   public RPAStatistics() {}
/*     */   
/*     */   public RPAStatistics(RpaUID rpaUID, double cpuUsage, TrafficStatistics traffic)
/*     */   {
/*  52 */     this.rpaUID = rpaUID;
/*  53 */     this.cpuUsage = cpuUsage;
/*  54 */     this.traffic = traffic;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaUID getRpaUID()
/*     */   {
/*  66 */     return this.rpaUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpaUID(RpaUID value)
/*     */   {
/*  78 */     this.rpaUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public double getCpuUsage()
/*     */   {
/*  86 */     return this.cpuUsage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCpuUsage(double value)
/*     */   {
/*  94 */     this.cpuUsage = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public TrafficStatistics getTraffic()
/*     */   {
/* 106 */     return this.traffic;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTraffic(TrafficStatistics value)
/*     */   {
/* 118 */     this.traffic = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 128 */     if (!(obj instanceof RPAStatistics)) {
/* 129 */       return false;
/*     */     }
/* 131 */     RPAStatistics otherObj = (RPAStatistics)obj;
/*     */     
/* 133 */     return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.cpuUsage == otherObj.cpuUsage) && (this.traffic != null ? this.traffic.equals(otherObj.traffic) : this.traffic == otherObj.traffic);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 144 */     return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ (int)this.cpuUsage ^ (this.traffic != null ? this.traffic.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 155 */     return "RPAStatistics [rpaUID=" + this.rpaUID + ", " + "cpuUsage=" + this.cpuUsage + ", " + "traffic=" + this.traffic + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RPAStatistics.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */