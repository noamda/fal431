/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ @JsonTypeName("AggregatedSplitterState")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="AggregatedSplitterState", propOrder={"singleSplittersState"})
/*     */ public class AggregatedSplitterState
/*     */   extends SplitterState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SplitterState> singleSplittersState;
/*     */   
/*     */   public AggregatedSplitterState() {}
/*     */   
/*     */   public AggregatedSplitterState(List<SplitterState> singleSplittersState)
/*     */   {
/*  58 */     this.singleSplittersState = singleSplittersState;
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
/*     */   public List<SplitterState> getSingleSplittersState()
/*     */   {
/*  84 */     if (this.singleSplittersState == null) {
/*  85 */       this.singleSplittersState = new ArrayList();
/*     */     }
/*  87 */     return this.singleSplittersState;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  97 */     if (!(obj instanceof AggregatedSplitterState)) {
/*  98 */       return false;
/*     */     }
/* 100 */     AggregatedSplitterState otherObj = (AggregatedSplitterState)obj;
/*     */     
/* 102 */     return (super.equals(obj)) && (this.singleSplittersState != null ? this.singleSplittersState.equals(otherObj.singleSplittersState) : this.singleSplittersState == otherObj.singleSplittersState);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 112 */     return super.hashCode() ^ (this.singleSplittersState != null ? this.singleSplittersState.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 122 */     return "AggregatedSplitterState [super=" + super.toString() + ", " + "singleSplittersState=" + this.singleSplittersState + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AggregatedSplitterState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */