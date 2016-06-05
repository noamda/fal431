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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupCopyProtectionWindowsInfo", propOrder={"groupCopyUID", "protectionWindows"})
/*     */ public class ConsistencyGroupCopyProtectionWindowsInfo
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopyUID;
/*     */   protected ProtectionWindowsInfo protectionWindows;
/*     */   
/*     */   public ConsistencyGroupCopyProtectionWindowsInfo() {}
/*     */   
/*     */   public ConsistencyGroupCopyProtectionWindowsInfo(ConsistencyGroupCopyUID groupCopyUID, ProtectionWindowsInfo protectionWindows)
/*     */   {
/*  47 */     this.groupCopyUID = groupCopyUID;
/*  48 */     this.protectionWindows = protectionWindows;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getGroupCopyUID()
/*     */   {
/*  60 */     return this.groupCopyUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupCopyUID(ConsistencyGroupCopyUID value)
/*     */   {
/*  72 */     this.groupCopyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ProtectionWindowsInfo getProtectionWindows()
/*     */   {
/*  84 */     return this.protectionWindows;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProtectionWindows(ProtectionWindowsInfo value)
/*     */   {
/*  96 */     this.protectionWindows = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof ConsistencyGroupCopyProtectionWindowsInfo)) {
/* 107 */       return false;
/*     */     }
/* 109 */     ConsistencyGroupCopyProtectionWindowsInfo otherObj = (ConsistencyGroupCopyProtectionWindowsInfo)obj;
/*     */     
/* 111 */     return (this.groupCopyUID != null ? this.groupCopyUID.equals(otherObj.groupCopyUID) : this.groupCopyUID == otherObj.groupCopyUID) && (this.protectionWindows != null ? this.protectionWindows.equals(otherObj.protectionWindows) : this.protectionWindows == otherObj.protectionWindows);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.groupCopyUID != null ? this.groupCopyUID.hashCode() : 0) ^ (this.protectionWindows != null ? this.protectionWindows.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "ConsistencyGroupCopyProtectionWindowsInfo [groupCopyUID=" + this.groupCopyUID + ", " + "protectionWindows=" + this.protectionWindows + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupCopyProtectionWindowsInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */