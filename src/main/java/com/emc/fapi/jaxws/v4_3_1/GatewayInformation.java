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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="GatewayInformation", propOrder={"destinationNetworkMask", "destinationSubnet", "gatewayIP"})
/*     */ public class GatewayInformation
/*     */ {
/*     */   protected String destinationNetworkMask;
/*     */   protected String destinationSubnet;
/*     */   protected IPInformation gatewayIP;
/*     */   
/*     */   public GatewayInformation() {}
/*     */   
/*     */   public GatewayInformation(String destinationNetworkMask, String destinationSubnet, IPInformation gatewayIP)
/*     */   {
/*  50 */     this.destinationNetworkMask = destinationNetworkMask;
/*  51 */     this.destinationSubnet = destinationSubnet;
/*  52 */     this.gatewayIP = gatewayIP;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDestinationNetworkMask()
/*     */   {
/*  64 */     return this.destinationNetworkMask;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDestinationNetworkMask(String value)
/*     */   {
/*  76 */     this.destinationNetworkMask = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDestinationSubnet()
/*     */   {
/*  88 */     return this.destinationSubnet;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDestinationSubnet(String value)
/*     */   {
/* 100 */     this.destinationSubnet = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public IPInformation getGatewayIP()
/*     */   {
/* 112 */     return this.gatewayIP;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGatewayIP(IPInformation value)
/*     */   {
/* 124 */     this.gatewayIP = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 134 */     if (!(obj instanceof GatewayInformation)) {
/* 135 */       return false;
/*     */     }
/* 137 */     GatewayInformation otherObj = (GatewayInformation)obj;
/*     */     
/* 139 */     return (this.destinationNetworkMask != null ? this.destinationNetworkMask.equals(otherObj.destinationNetworkMask) : this.destinationNetworkMask == otherObj.destinationNetworkMask) && (this.destinationSubnet != null ? this.destinationSubnet.equals(otherObj.destinationSubnet) : this.destinationSubnet == otherObj.destinationSubnet) && (this.gatewayIP != null ? this.gatewayIP.equals(otherObj.gatewayIP) : this.gatewayIP == otherObj.gatewayIP);
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
/* 150 */     return (this.destinationNetworkMask != null ? this.destinationNetworkMask.hashCode() : 0) ^ (this.destinationSubnet != null ? this.destinationSubnet.hashCode() : 0) ^ (this.gatewayIP != null ? this.gatewayIP.hashCode() : 0);
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
/* 161 */     return "GatewayInformation [destinationNetworkMask=" + this.destinationNetworkMask + ", " + "destinationSubnet=" + this.destinationSubnet + ", " + "gatewayIP=" + this.gatewayIP + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GatewayInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */