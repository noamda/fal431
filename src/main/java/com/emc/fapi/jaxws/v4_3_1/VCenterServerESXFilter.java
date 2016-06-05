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
/*     */ @JsonTypeName("VCenterServerESXFilter")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VCenterServerESXFilter", propOrder={"ip"})
/*     */ public class VCenterServerESXFilter
/*     */   extends VCenterServerFilter
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String ip;
/*     */   
/*     */   public VCenterServerESXFilter() {}
/*     */   
/*     */   public VCenterServerESXFilter(String ip)
/*     */   {
/*  56 */     this.ip = ip;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getIp()
/*     */   {
/*  68 */     return this.ip;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIp(String value)
/*     */   {
/*  80 */     this.ip = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof VCenterServerESXFilter)) {
/*  91 */       return false;
/*     */     }
/*  93 */     VCenterServerESXFilter otherObj = (VCenterServerESXFilter)obj;
/*     */     
/*  95 */     return (super.equals(obj)) && (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return super.hashCode() ^ (this.ip != null ? this.ip.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "VCenterServerESXFilter [super=" + super.toString() + ", " + "ip=" + this.ip + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VCenterServerESXFilter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */