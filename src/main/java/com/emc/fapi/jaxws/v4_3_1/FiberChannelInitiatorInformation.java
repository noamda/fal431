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
/*     */ 
/*     */ 
/*     */ @JsonTypeName("FiberChannelInitiatorInformation")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="FiberChannelInitiatorInformation", propOrder={"nodeWWN", "portWWN"})
/*     */ public class FiberChannelInitiatorInformation
/*     */   extends InitiatorInformation
/*     */ {
/*     */   protected String nodeWWN;
/*     */   protected String portWWN;
/*     */   
/*     */   public FiberChannelInitiatorInformation() {}
/*     */   
/*     */   public FiberChannelInitiatorInformation(String nodeWWN, String portWWN)
/*     */   {
/*  57 */     this.nodeWWN = nodeWWN;
/*  58 */     this.portWWN = portWWN;
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
/*  70 */     return this.nodeWWN;
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
/*  82 */     this.nodeWWN = value;
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
/*  94 */     return this.portWWN;
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
/* 106 */     this.portWWN = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof FiberChannelInitiatorInformation)) {
/* 117 */       return false;
/*     */     }
/* 119 */     FiberChannelInitiatorInformation otherObj = (FiberChannelInitiatorInformation)obj;
/*     */     
/* 121 */     return (super.equals(obj)) && (this.nodeWWN != null ? this.nodeWWN.equals(otherObj.nodeWWN) : this.nodeWWN == otherObj.nodeWWN) && (this.portWWN != null ? this.portWWN.equals(otherObj.portWWN) : this.portWWN == otherObj.portWWN);
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
/* 132 */     return super.hashCode() ^ (this.nodeWWN != null ? this.nodeWWN.hashCode() : 0) ^ (this.portWWN != null ? this.portWWN.hashCode() : 0);
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
/* 143 */     return "FiberChannelInitiatorInformation [super=" + super.toString() + ", " + "nodeWWN=" + this.nodeWWN + ", " + "portWWN=" + this.portWWN + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FiberChannelInitiatorInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */