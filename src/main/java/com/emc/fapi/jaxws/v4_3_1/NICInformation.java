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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="NICInformation", propOrder={"ipInformation", "networkInterface", "networkMask", "autoNegotiationInformation"})
/*     */ public class NICInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected IPInformation ipInformation;
/*     */   @XmlElement(nillable=true)
/*     */   protected NetworkInterface networkInterface;
/*     */   protected String networkMask;
/*     */   @XmlElement(nillable=true)
/*     */   protected AutoNegotiationInformation autoNegotiationInformation;
/*     */   
/*     */   public NICInformation() {}
/*     */   
/*     */   public NICInformation(IPInformation ipInformation, NetworkInterface networkInterface, String networkMask, AutoNegotiationInformation autoNegotiationInformation)
/*     */   {
/*  57 */     this.ipInformation = ipInformation;
/*  58 */     this.networkInterface = networkInterface;
/*  59 */     this.networkMask = networkMask;
/*  60 */     this.autoNegotiationInformation = autoNegotiationInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public IPInformation getIpInformation()
/*     */   {
/*  72 */     return this.ipInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIpInformation(IPInformation value)
/*     */   {
/*  84 */     this.ipInformation = value;
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
/*  96 */     return this.networkInterface;
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
/* 108 */     this.networkInterface = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getNetworkMask()
/*     */   {
/* 120 */     return this.networkMask;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNetworkMask(String value)
/*     */   {
/* 132 */     this.networkMask = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public AutoNegotiationInformation getAutoNegotiationInformation()
/*     */   {
/* 144 */     return this.autoNegotiationInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAutoNegotiationInformation(AutoNegotiationInformation value)
/*     */   {
/* 156 */     this.autoNegotiationInformation = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 166 */     if (!(obj instanceof NICInformation)) {
/* 167 */       return false;
/*     */     }
/* 169 */     NICInformation otherObj = (NICInformation)obj;
/*     */     
/* 171 */     return (this.ipInformation != null ? this.ipInformation.equals(otherObj.ipInformation) : this.ipInformation == otherObj.ipInformation) && (this.networkInterface != null ? this.networkInterface.equals(otherObj.networkInterface) : this.networkInterface == otherObj.networkInterface) && (this.networkMask != null ? this.networkMask.equals(otherObj.networkMask) : this.networkMask == otherObj.networkMask) && (this.autoNegotiationInformation != null ? this.autoNegotiationInformation.equals(otherObj.autoNegotiationInformation) : this.autoNegotiationInformation == otherObj.autoNegotiationInformation);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 183 */     return (this.ipInformation != null ? this.ipInformation.hashCode() : 0) ^ (this.networkInterface != null ? this.networkInterface.hashCode() : 0) ^ (this.networkMask != null ? this.networkMask.hashCode() : 0) ^ (this.autoNegotiationInformation != null ? this.autoNegotiationInformation.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 195 */     return "NICInformation [ipInformation=" + this.ipInformation + ", " + "networkInterface=" + this.networkInterface + ", " + "networkMask=" + this.networkMask + ", " + "autoNegotiationInformation=" + this.autoNegotiationInformation + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\NICInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */