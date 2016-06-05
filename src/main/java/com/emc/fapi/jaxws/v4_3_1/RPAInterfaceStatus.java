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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="RPAInterfaceStatus", propOrder={"interfaceType", "interfaceStatus", "otherRPAsIPV4ConnectivityStatus", "otherRPAsIPV6ConnectivityStatus"})
/*     */ public class RPAInterfaceStatus
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected InterfaceType interfaceType;
/*     */   protected GeneralStatus interfaceStatus;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RPAConnectivityStatus> otherRPAsIPV4ConnectivityStatus;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<RPAConnectivityStatus> otherRPAsIPV6ConnectivityStatus;
/*     */   
/*     */   public RPAInterfaceStatus() {}
/*     */   
/*     */   public RPAInterfaceStatus(InterfaceType interfaceType, GeneralStatus interfaceStatus, List<RPAConnectivityStatus> otherRPAsIPV4ConnectivityStatus, List<RPAConnectivityStatus> otherRPAsIPV6ConnectivityStatus)
/*     */   {
/*  59 */     this.interfaceType = interfaceType;
/*  60 */     this.interfaceStatus = interfaceStatus;
/*  61 */     this.otherRPAsIPV4ConnectivityStatus = otherRPAsIPV4ConnectivityStatus;
/*  62 */     this.otherRPAsIPV6ConnectivityStatus = otherRPAsIPV6ConnectivityStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public InterfaceType getInterfaceType()
/*     */   {
/*  74 */     return this.interfaceType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInterfaceType(InterfaceType value)
/*     */   {
/*  86 */     this.interfaceType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GeneralStatus getInterfaceStatus()
/*     */   {
/*  98 */     return this.interfaceStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInterfaceStatus(GeneralStatus value)
/*     */   {
/* 110 */     this.interfaceStatus = value;
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
/*     */   public List<RPAConnectivityStatus> getOtherRPAsIPV4ConnectivityStatus()
/*     */   {
/* 136 */     if (this.otherRPAsIPV4ConnectivityStatus == null) {
/* 137 */       this.otherRPAsIPV4ConnectivityStatus = new ArrayList();
/*     */     }
/* 139 */     return this.otherRPAsIPV4ConnectivityStatus;
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
/*     */   public List<RPAConnectivityStatus> getOtherRPAsIPV6ConnectivityStatus()
/*     */   {
/* 165 */     if (this.otherRPAsIPV6ConnectivityStatus == null) {
/* 166 */       this.otherRPAsIPV6ConnectivityStatus = new ArrayList();
/*     */     }
/* 168 */     return this.otherRPAsIPV6ConnectivityStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 178 */     if (!(obj instanceof RPAInterfaceStatus)) {
/* 179 */       return false;
/*     */     }
/* 181 */     RPAInterfaceStatus otherObj = (RPAInterfaceStatus)obj;
/*     */     
/* 183 */     return (this.interfaceType != null ? this.interfaceType.equals(otherObj.interfaceType) : this.interfaceType == otherObj.interfaceType) && (this.interfaceStatus != null ? this.interfaceStatus.equals(otherObj.interfaceStatus) : this.interfaceStatus == otherObj.interfaceStatus) && (this.otherRPAsIPV4ConnectivityStatus != null ? this.otherRPAsIPV4ConnectivityStatus.equals(otherObj.otherRPAsIPV4ConnectivityStatus) : this.otherRPAsIPV4ConnectivityStatus == otherObj.otherRPAsIPV4ConnectivityStatus) && (this.otherRPAsIPV6ConnectivityStatus != null ? this.otherRPAsIPV6ConnectivityStatus.equals(otherObj.otherRPAsIPV6ConnectivityStatus) : this.otherRPAsIPV6ConnectivityStatus == otherObj.otherRPAsIPV6ConnectivityStatus);
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
/* 195 */     return (this.interfaceType != null ? this.interfaceType.hashCode() : 0) ^ (this.interfaceStatus != null ? this.interfaceStatus.hashCode() : 0) ^ (this.otherRPAsIPV4ConnectivityStatus != null ? this.otherRPAsIPV4ConnectivityStatus.hashCode() : 0) ^ (this.otherRPAsIPV6ConnectivityStatus != null ? this.otherRPAsIPV6ConnectivityStatus.hashCode() : 0);
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
/* 207 */     return "RPAInterfaceStatus [interfaceType=" + this.interfaceType + ", " + "interfaceStatus=" + this.interfaceStatus + ", " + "otherRPAsIPV4ConnectivityStatus=" + this.otherRPAsIPV4ConnectivityStatus + ", " + "otherRPAsIPV6ConnectivityStatus=" + this.otherRPAsIPV6ConnectivityStatus + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RPAInterfaceStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */