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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="volumePage", propOrder={"content", "context", "pageNumber", "pageSize"})
/*     */ public class VolumePage
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VolumeInformation> content;
/*     */   protected ClusterSANVolumesContext context;
/*     */   protected int pageNumber;
/*     */   protected int pageSize;
/*     */   
/*     */   public VolumePage() {}
/*     */   
/*     */   public VolumePage(List<VolumeInformation> content, ClusterSANVolumesContext context, int pageNumber, int pageSize)
/*     */   {
/*  64 */     this.content = content;
/*  65 */     this.context = context;
/*  66 */     this.pageNumber = pageNumber;
/*  67 */     this.pageSize = pageSize;
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
/*     */   public List<VolumeInformation> getContent()
/*     */   {
/*  93 */     if (this.content == null) {
/*  94 */       this.content = new ArrayList();
/*     */     }
/*  96 */     return this.content;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterSANVolumesContext getContext()
/*     */   {
/* 108 */     return this.context;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setContext(ClusterSANVolumesContext value)
/*     */   {
/* 120 */     this.context = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getPageNumber()
/*     */   {
/* 128 */     return this.pageNumber;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPageNumber(int value)
/*     */   {
/* 136 */     this.pageNumber = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getPageSize()
/*     */   {
/* 144 */     return this.pageSize;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPageSize(int value)
/*     */   {
/* 152 */     this.pageSize = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 162 */     if (!(obj instanceof VolumePage)) {
/* 163 */       return false;
/*     */     }
/* 165 */     VolumePage otherObj = (VolumePage)obj;
/*     */     
/* 167 */     return (this.content != null ? this.content.equals(otherObj.content) : this.content == otherObj.content) && (this.context != null ? this.context.equals(otherObj.context) : this.context == otherObj.context) && (this.pageNumber == otherObj.pageNumber) && (this.pageSize == otherObj.pageSize);
/*     */   }
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
/* 179 */     return (this.content != null ? this.content.hashCode() : 0) ^ (this.context != null ? this.context.hashCode() : 0) ^ this.pageNumber ^ this.pageSize;
/*     */   }
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
/* 191 */     return "VolumePage [content=" + this.content + ", " + "context=" + this.context + ", " + "pageNumber=" + this.pageNumber + ", " + "pageSize=" + this.pageSize + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumePage.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */