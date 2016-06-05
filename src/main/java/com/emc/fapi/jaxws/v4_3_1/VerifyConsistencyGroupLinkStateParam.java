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
/*     */ @XmlType(name="VerifyConsistencyGroupLinkStateParam", propOrder={"linkUID", "pipeState"})
/*     */ public class VerifyConsistencyGroupLinkStateParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupLinkUID linkUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected PipeState pipeState;
/*     */   
/*     */   public VerifyConsistencyGroupLinkStateParam() {}
/*     */   
/*     */   public VerifyConsistencyGroupLinkStateParam(ConsistencyGroupLinkUID linkUID, PipeState pipeState)
/*     */   {
/*  50 */     this.linkUID = linkUID;
/*  51 */     this.pipeState = pipeState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupLinkUID getLinkUID()
/*     */   {
/*  63 */     return this.linkUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLinkUID(ConsistencyGroupLinkUID value)
/*     */   {
/*  75 */     this.linkUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public PipeState getPipeState()
/*     */   {
/*  87 */     return this.pipeState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPipeState(PipeState value)
/*     */   {
/*  99 */     this.pipeState = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof VerifyConsistencyGroupLinkStateParam)) {
/* 110 */       return false;
/*     */     }
/* 112 */     VerifyConsistencyGroupLinkStateParam otherObj = (VerifyConsistencyGroupLinkStateParam)obj;
/*     */     
/* 114 */     return (this.linkUID != null ? this.linkUID.equals(otherObj.linkUID) : this.linkUID == otherObj.linkUID) && (this.pipeState != null ? this.pipeState.equals(otherObj.pipeState) : this.pipeState == otherObj.pipeState);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.linkUID != null ? this.linkUID.hashCode() : 0) ^ (this.pipeState != null ? this.pipeState.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "VerifyConsistencyGroupLinkStateParam [linkUID=" + this.linkUID + ", " + "pipeState=" + this.pipeState + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VerifyConsistencyGroupLinkStateParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */