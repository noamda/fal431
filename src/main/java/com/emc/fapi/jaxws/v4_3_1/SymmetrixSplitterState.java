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
/*     */ @JsonTypeName("SymmetrixSplitterState")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SymmetrixSplitterState", propOrder={"srdfVolumes"})
/*     */ public class SymmetrixSplitterState
/*     */   extends SplitterState
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<DeviceUID> srdfVolumes;
/*     */   
/*     */   public SymmetrixSplitterState() {}
/*     */   
/*     */   public SymmetrixSplitterState(List<DeviceUID> srdfVolumes)
/*     */   {
/*  58 */     this.srdfVolumes = srdfVolumes;
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
/*     */   public List<DeviceUID> getSrdfVolumes()
/*     */   {
/*  84 */     if (this.srdfVolumes == null) {
/*  85 */       this.srdfVolumes = new ArrayList();
/*     */     }
/*  87 */     return this.srdfVolumes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  97 */     if (!(obj instanceof SymmetrixSplitterState)) {
/*  98 */       return false;
/*     */     }
/* 100 */     SymmetrixSplitterState otherObj = (SymmetrixSplitterState)obj;
/*     */     
/* 102 */     return (super.equals(obj)) && (this.srdfVolumes != null ? this.srdfVolumes.equals(otherObj.srdfVolumes) : this.srdfVolumes == otherObj.srdfVolumes);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 112 */     return super.hashCode() ^ (this.srdfVolumes != null ? this.srdfVolumes.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 122 */     return "SymmetrixSplitterState [super=" + super.toString() + ", " + "srdfVolumes=" + this.srdfVolumes + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SymmetrixSplitterState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */