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
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="restLinkList", propOrder={"linkList"})
/*     */ public class RestLinkList
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<Link> linkList;
/*     */   
/*     */   public RestLinkList() {}
/*     */   
/*     */   public RestLinkList(List<Link> linkList)
/*     */   {
/*  55 */     this.linkList = linkList;
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
/*     */   public List<Link> getLinkList()
/*     */   {
/*  81 */     if (this.linkList == null) {
/*  82 */       this.linkList = new ArrayList();
/*     */     }
/*  84 */     return this.linkList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  94 */     if (!(obj instanceof RestLinkList)) {
/*  95 */       return false;
/*     */     }
/*  97 */     RestLinkList otherObj = (RestLinkList)obj;
/*     */     
/*  99 */     return this.linkList == otherObj.linkList ? true : this.linkList != null ? this.linkList.equals(otherObj.linkList) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 108 */     return this.linkList != null ? this.linkList.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 117 */     return "RestLinkList [linkList=" + this.linkList + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RestLinkList.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */