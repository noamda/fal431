/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="rescanSpecificSplittersVolumesConnections", propOrder={"splitters"})
/*     */ public class RescanSpecificSplittersVolumesConnections
/*     */ {
/*     */   protected List<SplitterUID> splitters;
/*     */   
/*     */   public RescanSpecificSplittersVolumesConnections() {}
/*     */   
/*     */   public RescanSpecificSplittersVolumesConnections(List<SplitterUID> splitters)
/*     */   {
/*  46 */     this.splitters = splitters;
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
/*     */   public List<SplitterUID> getSplitters()
/*     */   {
/*  72 */     if (this.splitters == null) {
/*  73 */       this.splitters = new ArrayList();
/*     */     }
/*  75 */     return this.splitters;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  85 */     if (!(obj instanceof RescanSpecificSplittersVolumesConnections)) {
/*  86 */       return false;
/*     */     }
/*  88 */     RescanSpecificSplittersVolumesConnections otherObj = (RescanSpecificSplittersVolumesConnections)obj;
/*     */     
/*  90 */     return this.splitters == otherObj.splitters ? true : this.splitters != null ? this.splitters.equals(otherObj.splitters) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  99 */     return this.splitters != null ? this.splitters.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 108 */     return "RescanSpecificSplittersVolumesConnections [splitters=" + this.splitters + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RescanSpecificSplittersVolumesConnections.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */