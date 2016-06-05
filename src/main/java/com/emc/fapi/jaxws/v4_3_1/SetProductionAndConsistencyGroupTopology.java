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
/*     */ @XmlType(name="setProductionAndConsistencyGroupTopology", propOrder={"groupCopy", "params", "startTransfer"})
/*     */ public class SetProductionAndConsistencyGroupTopology
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   protected ConsistencyGroupTopologyParams params;
/*     */   protected boolean startTransfer;
/*     */   
/*     */   public SetProductionAndConsistencyGroupTopology() {}
/*     */   
/*     */   public SetProductionAndConsistencyGroupTopology(ConsistencyGroupCopyUID groupCopy, ConsistencyGroupTopologyParams params, boolean startTransfer)
/*     */   {
/*  50 */     this.groupCopy = groupCopy;
/*  51 */     this.params = params;
/*  52 */     this.startTransfer = startTransfer;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getGroupCopy()
/*     */   {
/*  64 */     return this.groupCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupCopy(ConsistencyGroupCopyUID value)
/*     */   {
/*  76 */     this.groupCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupTopologyParams getParams()
/*     */   {
/*  88 */     return this.params;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setParams(ConsistencyGroupTopologyParams value)
/*     */   {
/* 100 */     this.params = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isStartTransfer()
/*     */   {
/* 108 */     return this.startTransfer;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setStartTransfer(boolean value)
/*     */   {
/* 116 */     this.startTransfer = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 126 */     if (!(obj instanceof SetProductionAndConsistencyGroupTopology)) {
/* 127 */       return false;
/*     */     }
/* 129 */     SetProductionAndConsistencyGroupTopology otherObj = (SetProductionAndConsistencyGroupTopology)obj;
/*     */     
/* 131 */     return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.params != null ? this.params.equals(otherObj.params) : this.params == otherObj.params) && (this.startTransfer == otherObj.startTransfer);
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
/* 142 */     return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.params != null ? this.params.hashCode() : 0) ^ (this.startTransfer ? 1 : 0);
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
/* 153 */     return "SetProductionAndConsistencyGroupTopology [groupCopy=" + this.groupCopy + ", " + "params=" + this.params + ", " + "startTransfer=" + this.startTransfer + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetProductionAndConsistencyGroupTopology.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */