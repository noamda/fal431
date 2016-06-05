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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SymmetrixGateKeepersInfo", propOrder={"symmetrixGateKeepersRPAInfo"})
/*     */ public class SymmetrixGateKeepersInfo
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SymmetrixGateKeepersRPAInfo> symmetrixGateKeepersRPAInfo;
/*     */   
/*     */   public SymmetrixGateKeepersInfo() {}
/*     */   
/*     */   public SymmetrixGateKeepersInfo(List<SymmetrixGateKeepersRPAInfo> symmetrixGateKeepersRPAInfo)
/*     */   {
/*  48 */     this.symmetrixGateKeepersRPAInfo = symmetrixGateKeepersRPAInfo;
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
/*     */   public List<SymmetrixGateKeepersRPAInfo> getSymmetrixGateKeepersRPAInfo()
/*     */   {
/*  74 */     if (this.symmetrixGateKeepersRPAInfo == null) {
/*  75 */       this.symmetrixGateKeepersRPAInfo = new ArrayList();
/*     */     }
/*  77 */     return this.symmetrixGateKeepersRPAInfo;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof SymmetrixGateKeepersInfo)) {
/*  88 */       return false;
/*     */     }
/*  90 */     SymmetrixGateKeepersInfo otherObj = (SymmetrixGateKeepersInfo)obj;
/*     */     
/*  92 */     return this.symmetrixGateKeepersRPAInfo == otherObj.symmetrixGateKeepersRPAInfo ? true : this.symmetrixGateKeepersRPAInfo != null ? this.symmetrixGateKeepersRPAInfo.equals(otherObj.symmetrixGateKeepersRPAInfo) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.symmetrixGateKeepersRPAInfo != null ? this.symmetrixGateKeepersRPAInfo.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "SymmetrixGateKeepersInfo [symmetrixGateKeepersRPAInfo=" + this.symmetrixGateKeepersRPAInfo + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SymmetrixGateKeepersInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */