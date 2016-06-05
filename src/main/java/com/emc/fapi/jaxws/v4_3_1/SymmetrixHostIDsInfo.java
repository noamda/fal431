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
/*     */ @XmlType(name="SymmetrixHostIDsInfo", propOrder={"symmetrixHostIDs"})
/*     */ public class SymmetrixHostIDsInfo
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<SymmetrixHostId> symmetrixHostIDs;
/*     */   
/*     */   public SymmetrixHostIDsInfo() {}
/*     */   
/*     */   public SymmetrixHostIDsInfo(List<SymmetrixHostId> symmetrixHostIDs)
/*     */   {
/*  48 */     this.symmetrixHostIDs = symmetrixHostIDs;
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
/*     */   public List<SymmetrixHostId> getSymmetrixHostIDs()
/*     */   {
/*  74 */     if (this.symmetrixHostIDs == null) {
/*  75 */       this.symmetrixHostIDs = new ArrayList();
/*     */     }
/*  77 */     return this.symmetrixHostIDs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof SymmetrixHostIDsInfo)) {
/*  88 */       return false;
/*     */     }
/*  90 */     SymmetrixHostIDsInfo otherObj = (SymmetrixHostIDsInfo)obj;
/*     */     
/*  92 */     return this.symmetrixHostIDs == otherObj.symmetrixHostIDs ? true : this.symmetrixHostIDs != null ? this.symmetrixHostIDs.equals(otherObj.symmetrixHostIDs) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.symmetrixHostIDs != null ? this.symmetrixHostIDs.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "SymmetrixHostIDsInfo [symmetrixHostIDs=" + this.symmetrixHostIDs + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SymmetrixHostIDsInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */