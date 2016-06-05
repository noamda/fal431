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
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @XmlType(name="VolumeAccessState", propOrder={"attachedToOtherCluster", "busy", "delayed", "inErrorState", "markingDataOnSplitter", "readOnly", "splittingToVolume", "targetRPA", "writable"})
/*     */ public class VolumeAccessState
/*     */ {
/*     */   protected Boolean attachedToOtherCluster;
/*     */   protected Boolean busy;
/*     */   protected Boolean delayed;
/*     */   protected Boolean inErrorState;
/*     */   protected Boolean markingDataOnSplitter;
/*     */   protected Boolean readOnly;
/*     */   protected Boolean splittingToVolume;
/*     */   protected RpaUID targetRPA;
/*     */   protected Boolean writable;
/*     */   
/*     */   public VolumeAccessState() {}
/*     */   
/*     */   public VolumeAccessState(Boolean attachedToOtherCluster, Boolean busy, Boolean delayed, Boolean inErrorState, Boolean markingDataOnSplitter, Boolean readOnly, Boolean splittingToVolume, RpaUID targetRPA, Boolean writable)
/*     */   {
/*  68 */     this.attachedToOtherCluster = attachedToOtherCluster;
/*  69 */     this.busy = busy;
/*  70 */     this.delayed = delayed;
/*  71 */     this.inErrorState = inErrorState;
/*  72 */     this.markingDataOnSplitter = markingDataOnSplitter;
/*  73 */     this.readOnly = readOnly;
/*  74 */     this.splittingToVolume = splittingToVolume;
/*  75 */     this.targetRPA = targetRPA;
/*  76 */     this.writable = writable;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isAttachedToOtherCluster()
/*     */   {
/*  88 */     return this.attachedToOtherCluster;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAttachedToOtherCluster(Boolean value)
/*     */   {
/* 100 */     this.attachedToOtherCluster = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isBusy()
/*     */   {
/* 112 */     return this.busy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setBusy(Boolean value)
/*     */   {
/* 124 */     this.busy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isDelayed()
/*     */   {
/* 136 */     return this.delayed;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDelayed(Boolean value)
/*     */   {
/* 148 */     this.delayed = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isInErrorState()
/*     */   {
/* 160 */     return this.inErrorState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInErrorState(Boolean value)
/*     */   {
/* 172 */     this.inErrorState = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isMarkingDataOnSplitter()
/*     */   {
/* 184 */     return this.markingDataOnSplitter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMarkingDataOnSplitter(Boolean value)
/*     */   {
/* 196 */     this.markingDataOnSplitter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isReadOnly()
/*     */   {
/* 208 */     return this.readOnly;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReadOnly(Boolean value)
/*     */   {
/* 220 */     this.readOnly = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isSplittingToVolume()
/*     */   {
/* 232 */     return this.splittingToVolume;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplittingToVolume(Boolean value)
/*     */   {
/* 244 */     this.splittingToVolume = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaUID getTargetRPA()
/*     */   {
/* 256 */     return this.targetRPA;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTargetRPA(RpaUID value)
/*     */   {
/* 268 */     this.targetRPA = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isWritable()
/*     */   {
/* 280 */     return this.writable;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setWritable(Boolean value)
/*     */   {
/* 292 */     this.writable = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 302 */     if (!(obj instanceof VolumeAccessState)) {
/* 303 */       return false;
/*     */     }
/* 305 */     VolumeAccessState otherObj = (VolumeAccessState)obj;
/*     */     
/* 307 */     return (this.attachedToOtherCluster != null ? this.attachedToOtherCluster.equals(otherObj.attachedToOtherCluster) : this.attachedToOtherCluster == otherObj.attachedToOtherCluster) && (this.busy != null ? this.busy.equals(otherObj.busy) : this.busy == otherObj.busy) && (this.delayed != null ? this.delayed.equals(otherObj.delayed) : this.delayed == otherObj.delayed) && (this.inErrorState != null ? this.inErrorState.equals(otherObj.inErrorState) : this.inErrorState == otherObj.inErrorState) && (this.markingDataOnSplitter != null ? this.markingDataOnSplitter.equals(otherObj.markingDataOnSplitter) : this.markingDataOnSplitter == otherObj.markingDataOnSplitter) && (this.readOnly != null ? this.readOnly.equals(otherObj.readOnly) : this.readOnly == otherObj.readOnly) && (this.splittingToVolume != null ? this.splittingToVolume.equals(otherObj.splittingToVolume) : this.splittingToVolume == otherObj.splittingToVolume) && (this.targetRPA != null ? this.targetRPA.equals(otherObj.targetRPA) : this.targetRPA == otherObj.targetRPA) && (this.writable != null ? this.writable.equals(otherObj.writable) : this.writable == otherObj.writable);
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
/*     */   public int hashCode()
/*     */   {
/* 324 */     return (this.attachedToOtherCluster != null ? this.attachedToOtherCluster.hashCode() : 0) ^ (this.busy != null ? this.busy.hashCode() : 0) ^ (this.delayed != null ? this.delayed.hashCode() : 0) ^ (this.inErrorState != null ? this.inErrorState.hashCode() : 0) ^ (this.markingDataOnSplitter != null ? this.markingDataOnSplitter.hashCode() : 0) ^ (this.readOnly != null ? this.readOnly.hashCode() : 0) ^ (this.splittingToVolume != null ? this.splittingToVolume.hashCode() : 0) ^ (this.targetRPA != null ? this.targetRPA.hashCode() : 0) ^ (this.writable != null ? this.writable.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 341 */     return "VolumeAccessState [attachedToOtherCluster=" + this.attachedToOtherCluster + ", " + "busy=" + this.busy + ", " + "delayed=" + this.delayed + ", " + "inErrorState=" + this.inErrorState + ", " + "markingDataOnSplitter=" + this.markingDataOnSplitter + ", " + "readOnly=" + this.readOnly + ", " + "splittingToVolume=" + this.splittingToVolume + ", " + "targetRPA=" + this.targetRPA + ", " + "writable=" + this.writable + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumeAccessState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */