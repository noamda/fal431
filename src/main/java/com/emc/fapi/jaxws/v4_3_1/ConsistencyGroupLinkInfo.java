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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupLinkInfo", propOrder={"groupName", "linkUID", "sourceCopyName", "targetCopyName"})
/*     */ public class ConsistencyGroupLinkInfo
/*     */ {
/*     */   protected String groupName;
/*     */   protected ConsistencyGroupLinkUID linkUID;
/*     */   protected String sourceCopyName;
/*     */   protected String targetCopyName;
/*     */   
/*     */   public ConsistencyGroupLinkInfo() {}
/*     */   
/*     */   public ConsistencyGroupLinkInfo(String groupName, ConsistencyGroupLinkUID linkUID, String sourceCopyName, String targetCopyName)
/*     */   {
/*  53 */     this.groupName = groupName;
/*  54 */     this.linkUID = linkUID;
/*  55 */     this.sourceCopyName = sourceCopyName;
/*  56 */     this.targetCopyName = targetCopyName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getGroupName()
/*     */   {
/*  68 */     return this.groupName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupName(String value)
/*     */   {
/*  80 */     this.groupName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupLinkUID getLinkUID()
/*     */   {
/*  92 */     return this.linkUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLinkUID(ConsistencyGroupLinkUID value)
/*     */   {
/* 104 */     this.linkUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSourceCopyName()
/*     */   {
/* 116 */     return this.sourceCopyName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSourceCopyName(String value)
/*     */   {
/* 128 */     this.sourceCopyName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getTargetCopyName()
/*     */   {
/* 140 */     return this.targetCopyName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTargetCopyName(String value)
/*     */   {
/* 152 */     this.targetCopyName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 162 */     if (!(obj instanceof ConsistencyGroupLinkInfo)) {
/* 163 */       return false;
/*     */     }
/* 165 */     ConsistencyGroupLinkInfo otherObj = (ConsistencyGroupLinkInfo)obj;
/*     */     
/* 167 */     return (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.linkUID != null ? this.linkUID.equals(otherObj.linkUID) : this.linkUID == otherObj.linkUID) && (this.sourceCopyName != null ? this.sourceCopyName.equals(otherObj.sourceCopyName) : this.sourceCopyName == otherObj.sourceCopyName) && (this.targetCopyName != null ? this.targetCopyName.equals(otherObj.targetCopyName) : this.targetCopyName == otherObj.targetCopyName);
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
/* 179 */     return (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.linkUID != null ? this.linkUID.hashCode() : 0) ^ (this.sourceCopyName != null ? this.sourceCopyName.hashCode() : 0) ^ (this.targetCopyName != null ? this.targetCopyName.hashCode() : 0);
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
/* 191 */     return "ConsistencyGroupLinkInfo [groupName=" + this.groupName + ", " + "linkUID=" + this.linkUID + ", " + "sourceCopyName=" + this.sourceCopyName + ", " + "targetCopyName=" + this.targetCopyName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupLinkInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */