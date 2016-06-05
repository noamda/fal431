/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ @JsonTypeName("JournalVolumeState")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="JournalVolumeState", propOrder={"groupCopyUID"})
/*     */ public class JournalVolumeState
/*     */   extends VolumeState
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopyUID;
/*     */   
/*     */   public JournalVolumeState() {}
/*     */   
/*     */   public JournalVolumeState(ConsistencyGroupCopyUID groupCopyUID)
/*     */   {
/*  54 */     this.groupCopyUID = groupCopyUID;
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
/*  66 */     return this.groupCopyUID;
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
/*  78 */     this.groupCopyUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  88 */     if (!(obj instanceof JournalVolumeState)) {
/*  89 */       return false;
/*     */     }
/*  91 */     JournalVolumeState otherObj = (JournalVolumeState)obj;
/*     */     
/*  93 */     return (super.equals(obj)) && (this.groupCopyUID != null ? this.groupCopyUID.equals(otherObj.groupCopyUID) : this.groupCopyUID == otherObj.groupCopyUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 103 */     return super.hashCode() ^ (this.groupCopyUID != null ? this.groupCopyUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 113 */     return "JournalVolumeState [super=" + super.toString() + ", " + "groupCopyUID=" + this.groupCopyUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\JournalVolumeState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */