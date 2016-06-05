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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupLinkState", propOrder={"groupLinkUID", "pipeState", "transferErrorReason", "inSyncMode", "stateUnknown"})
/*     */ public class ConsistencyGroupLinkState
/*     */ {
/*     */   protected ConsistencyGroupLinkUID groupLinkUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected PipeState pipeState;
/*     */   protected String transferErrorReason;
/*     */   protected boolean inSyncMode;
/*     */   protected boolean stateUnknown;
/*     */   
/*     */   public ConsistencyGroupLinkState() {}
/*     */   
/*     */   public ConsistencyGroupLinkState(ConsistencyGroupLinkUID groupLinkUID, PipeState pipeState, String transferErrorReason, boolean inSyncMode, boolean stateUnknown)
/*     */   {
/*  58 */     this.groupLinkUID = groupLinkUID;
/*  59 */     this.pipeState = pipeState;
/*  60 */     this.transferErrorReason = transferErrorReason;
/*  61 */     this.inSyncMode = inSyncMode;
/*  62 */     this.stateUnknown = stateUnknown;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupLinkUID getGroupLinkUID()
/*     */   {
/*  74 */     return this.groupLinkUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupLinkUID(ConsistencyGroupLinkUID value)
/*     */   {
/*  86 */     this.groupLinkUID = value;
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
/*  98 */     return this.pipeState;
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
/* 110 */     this.pipeState = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getTransferErrorReason()
/*     */   {
/* 122 */     return this.transferErrorReason;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTransferErrorReason(String value)
/*     */   {
/* 134 */     this.transferErrorReason = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isInSyncMode()
/*     */   {
/* 142 */     return this.inSyncMode;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInSyncMode(boolean value)
/*     */   {
/* 150 */     this.inSyncMode = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isStateUnknown()
/*     */   {
/* 158 */     return this.stateUnknown;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStateUnknown(boolean value)
/*     */   {
/* 166 */     this.stateUnknown = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 176 */     if (!(obj instanceof ConsistencyGroupLinkState)) {
/* 177 */       return false;
/*     */     }
/* 179 */     ConsistencyGroupLinkState otherObj = (ConsistencyGroupLinkState)obj;
/*     */     
/* 181 */     return (this.groupLinkUID != null ? this.groupLinkUID.equals(otherObj.groupLinkUID) : this.groupLinkUID == otherObj.groupLinkUID) && (this.pipeState != null ? this.pipeState.equals(otherObj.pipeState) : this.pipeState == otherObj.pipeState) && (this.transferErrorReason != null ? this.transferErrorReason.equals(otherObj.transferErrorReason) : this.transferErrorReason == otherObj.transferErrorReason) && (this.inSyncMode == otherObj.inSyncMode) && (this.stateUnknown == otherObj.stateUnknown);
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
/*     */   public int hashCode()
/*     */   {
/* 194 */     return (this.groupLinkUID != null ? this.groupLinkUID.hashCode() : 0) ^ (this.pipeState != null ? this.pipeState.hashCode() : 0) ^ (this.transferErrorReason != null ? this.transferErrorReason.hashCode() : 0) ^ (this.inSyncMode ? 1 : 0) ^ (this.stateUnknown ? 1 : 0);
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
/*     */   public String toString()
/*     */   {
/* 207 */     return "ConsistencyGroupLinkState [groupLinkUID=" + this.groupLinkUID + ", " + "pipeState=" + this.pipeState + ", " + "transferErrorReason=" + this.transferErrorReason + ", " + "inSyncMode=" + this.inSyncMode + ", " + "stateUnknown=" + this.stateUnknown + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupLinkState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */