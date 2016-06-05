/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonTypeName;
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
/*     */ @JsonTypeName("IPv4CustomizationPolicy")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="IPv4CustomizationPolicy", propOrder={"subnetMask"})
/*     */ public class IPv4CustomizationPolicy
/*     */   extends IPCustomizationPolicy
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String subnetMask;
/*     */   
/*     */   public IPv4CustomizationPolicy() {}
/*     */   
/*     */   public IPv4CustomizationPolicy(String subnetMask)
/*     */   {
/*  56 */     this.subnetMask = subnetMask;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSubnetMask()
/*     */   {
/*  68 */     return this.subnetMask;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSubnetMask(String value)
/*     */   {
/*  80 */     this.subnetMask = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof IPv4CustomizationPolicy)) {
/*  91 */       return false;
/*     */     }
/*  93 */     IPv4CustomizationPolicy otherObj = (IPv4CustomizationPolicy)obj;
/*     */     
/*  95 */     return (super.equals(obj)) && (this.subnetMask != null ? this.subnetMask.equals(otherObj.subnetMask) : this.subnetMask == otherObj.subnetMask);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return super.hashCode() ^ (this.subnetMask != null ? this.subnetMask.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "IPv4CustomizationPolicy [super=" + super.toString() + ", " + "subnetMask=" + this.subnetMask + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\IPv4CustomizationPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */