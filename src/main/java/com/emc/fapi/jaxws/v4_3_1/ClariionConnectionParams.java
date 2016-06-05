/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ @JsonTypeName("ClariionConnectionParams")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ClariionConnectionParams", propOrder={"spbIP"})
/*     */ public class ClariionConnectionParams
/*     */   extends BaseConnectionParams
/*     */ {
/*     */   protected IPInformation spbIP;
/*     */   
/*     */   public ClariionConnectionParams() {}
/*     */   
/*     */   public ClariionConnectionParams(IPInformation spbIP)
/*     */   {
/*  54 */     this.spbIP = spbIP;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public IPInformation getSpbIP()
/*     */   {
/*  66 */     return this.spbIP;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSpbIP(IPInformation value)
/*     */   {
/*  78 */     this.spbIP = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  88 */     if (!(obj instanceof ClariionConnectionParams)) {
/*  89 */       return false;
/*     */     }
/*  91 */     ClariionConnectionParams otherObj = (ClariionConnectionParams)obj;
/*     */     
/*  93 */     return (super.equals(obj)) && (this.spbIP != null ? this.spbIP.equals(otherObj.spbIP) : this.spbIP == otherObj.spbIP);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 103 */     return super.hashCode() ^ (this.spbIP != null ? this.spbIP.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 113 */     return "ClariionConnectionParams [super=" + super.toString() + ", " + "spbIP=" + this.spbIP + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClariionConnectionParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */