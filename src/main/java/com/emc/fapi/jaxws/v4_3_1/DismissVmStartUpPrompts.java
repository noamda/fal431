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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="dismissVmStartUpPrompts", propOrder={"groupCopy", "actionUIDs"})
/*     */ public class DismissVmStartUpPrompts
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   protected List<VmStartUpActionUID> actionUIDs;
/*     */   
/*     */   public DismissVmStartUpPrompts() {}
/*     */   
/*     */   public DismissVmStartUpPrompts(ConsistencyGroupCopyUID groupCopy, List<VmStartUpActionUID> actionUIDs)
/*     */   {
/*  49 */     this.groupCopy = groupCopy;
/*  50 */     this.actionUIDs = actionUIDs;
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
/*  62 */     return this.groupCopy;
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
/*  74 */     this.groupCopy = value;
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
/*     */   public List<VmStartUpActionUID> getActionUIDs()
/*     */   {
/* 100 */     if (this.actionUIDs == null) {
/* 101 */       this.actionUIDs = new ArrayList();
/*     */     }
/* 103 */     return this.actionUIDs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof DismissVmStartUpPrompts)) {
/* 114 */       return false;
/*     */     }
/* 116 */     DismissVmStartUpPrompts otherObj = (DismissVmStartUpPrompts)obj;
/*     */     
/* 118 */     return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.actionUIDs != null ? this.actionUIDs.equals(otherObj.actionUIDs) : this.actionUIDs == otherObj.actionUIDs);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.actionUIDs != null ? this.actionUIDs.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "DismissVmStartUpPrompts [groupCopy=" + this.groupCopy + ", " + "actionUIDs=" + this.actionUIDs + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\DismissVmStartUpPrompts.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */