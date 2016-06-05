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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupTopologyParams", propOrder={"copiesToDisable", "copiesToRemove", "linksToAdd"})
/*     */ public class ConsistencyGroupTopologyParams
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyUID> copiesToDisable;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyUID> copiesToRemove;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupLinkSettings> linksToAdd;
/*     */   
/*     */   public ConsistencyGroupTopologyParams() {}
/*     */   
/*     */   public ConsistencyGroupTopologyParams(List<ConsistencyGroupCopyUID> copiesToDisable, List<ConsistencyGroupCopyUID> copiesToRemove, List<ConsistencyGroupLinkSettings> linksToAdd)
/*     */   {
/*  56 */     this.copiesToDisable = copiesToDisable;
/*  57 */     this.copiesToRemove = copiesToRemove;
/*  58 */     this.linksToAdd = linksToAdd;
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
/*     */   public List<ConsistencyGroupCopyUID> getCopiesToDisable()
/*     */   {
/*  84 */     if (this.copiesToDisable == null) {
/*  85 */       this.copiesToDisable = new ArrayList();
/*     */     }
/*  87 */     return this.copiesToDisable;
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
/*     */   public List<ConsistencyGroupCopyUID> getCopiesToRemove()
/*     */   {
/* 113 */     if (this.copiesToRemove == null) {
/* 114 */       this.copiesToRemove = new ArrayList();
/*     */     }
/* 116 */     return this.copiesToRemove;
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
/*     */   public List<ConsistencyGroupLinkSettings> getLinksToAdd()
/*     */   {
/* 142 */     if (this.linksToAdd == null) {
/* 143 */       this.linksToAdd = new ArrayList();
/*     */     }
/* 145 */     return this.linksToAdd;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 155 */     if (!(obj instanceof ConsistencyGroupTopologyParams)) {
/* 156 */       return false;
/*     */     }
/* 158 */     ConsistencyGroupTopologyParams otherObj = (ConsistencyGroupTopologyParams)obj;
/*     */     
/* 160 */     return (this.copiesToDisable != null ? this.copiesToDisable.equals(otherObj.copiesToDisable) : this.copiesToDisable == otherObj.copiesToDisable) && (this.copiesToRemove != null ? this.copiesToRemove.equals(otherObj.copiesToRemove) : this.copiesToRemove == otherObj.copiesToRemove) && (this.linksToAdd != null ? this.linksToAdd.equals(otherObj.linksToAdd) : this.linksToAdd == otherObj.linksToAdd);
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
/* 171 */     return (this.copiesToDisable != null ? this.copiesToDisable.hashCode() : 0) ^ (this.copiesToRemove != null ? this.copiesToRemove.hashCode() : 0) ^ (this.linksToAdd != null ? this.linksToAdd.hashCode() : 0);
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
/* 182 */     return "ConsistencyGroupTopologyParams [copiesToDisable=" + this.copiesToDisable + ", " + "copiesToRemove=" + this.copiesToRemove + ", " + "linksToAdd=" + this.linksToAdd + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupTopologyParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */