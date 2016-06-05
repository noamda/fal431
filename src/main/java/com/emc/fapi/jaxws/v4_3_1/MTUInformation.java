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
/*     */ @XmlType(name="MTUInformation", propOrder={"networkInterface", "mtu"})
/*     */ public class MTUInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected NetworkInterface networkInterface;
/*     */   protected int mtu;
/*     */   
/*     */   public MTUInformation() {}
/*     */   
/*     */   public MTUInformation(NetworkInterface networkInterface, int mtu)
/*     */   {
/*  49 */     this.networkInterface = networkInterface;
/*  50 */     this.mtu = mtu;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public NetworkInterface getNetworkInterface()
/*     */   {
/*  62 */     return this.networkInterface;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNetworkInterface(NetworkInterface value)
/*     */   {
/*  74 */     this.networkInterface = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getMtu()
/*     */   {
/*  82 */     return this.mtu;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMtu(int value)
/*     */   {
/*  90 */     this.mtu = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 100 */     if (!(obj instanceof MTUInformation)) {
/* 101 */       return false;
/*     */     }
/* 103 */     MTUInformation otherObj = (MTUInformation)obj;
/*     */     
/* 105 */     return (this.networkInterface != null ? this.networkInterface.equals(otherObj.networkInterface) : this.networkInterface == otherObj.networkInterface) && (this.mtu == otherObj.mtu);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 115 */     return (this.networkInterface != null ? this.networkInterface.hashCode() : 0) ^ this.mtu;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 125 */     return "MTUInformation [networkInterface=" + this.networkInterface + ", " + "mtu=" + this.mtu + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\MTUInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */