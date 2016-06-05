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
/*     */ @XmlType(name="RPAPortInformation", propOrder={"nodeWWN", "portIndex", "portWWN"})
/*     */ public class RPAPortInformation
/*     */ {
/*     */   protected String nodeWWN;
/*     */   protected long portIndex;
/*     */   protected String portWWN;
/*     */   
/*     */   public RPAPortInformation() {}
/*     */   
/*     */   public RPAPortInformation(String nodeWWN, long portIndex, String portWWN)
/*     */   {
/*  50 */     this.nodeWWN = nodeWWN;
/*  51 */     this.portIndex = portIndex;
/*  52 */     this.portWWN = portWWN;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getNodeWWN()
/*     */   {
/*  64 */     return this.nodeWWN;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNodeWWN(String value)
/*     */   {
/*  76 */     this.nodeWWN = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getPortIndex()
/*     */   {
/*  84 */     return this.portIndex;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPortIndex(long value)
/*     */   {
/*  92 */     this.portIndex = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getPortWWN()
/*     */   {
/* 104 */     return this.portWWN;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPortWWN(String value)
/*     */   {
/* 116 */     this.portWWN = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 126 */     if (!(obj instanceof RPAPortInformation)) {
/* 127 */       return false;
/*     */     }
/* 129 */     RPAPortInformation otherObj = (RPAPortInformation)obj;
/*     */     
/* 131 */     return (this.nodeWWN != null ? this.nodeWWN.equals(otherObj.nodeWWN) : this.nodeWWN == otherObj.nodeWWN) && (this.portIndex == otherObj.portIndex) && (this.portWWN != null ? this.portWWN.equals(otherObj.portWWN) : this.portWWN == otherObj.portWWN);
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
/* 142 */     return (this.nodeWWN != null ? this.nodeWWN.hashCode() : 0) ^ (int)this.portIndex ^ (this.portWWN != null ? this.portWWN.hashCode() : 0);
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
/* 153 */     return "RPAPortInformation [nodeWWN=" + this.nodeWWN + ", " + "portIndex=" + this.portIndex + ", " + "portWWN=" + this.portWWN + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RPAPortInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */