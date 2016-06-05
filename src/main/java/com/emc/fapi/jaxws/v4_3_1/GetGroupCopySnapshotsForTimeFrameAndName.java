/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ @XmlType(name="getGroupCopySnapshotsForTimeFrameAndName", propOrder={"groupCopy", "timeFrame", "name"})
/*     */ public class GetGroupCopySnapshotsForTimeFrameAndName
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   @XmlElement(nillable=true)
/*     */   protected TimeFrame timeFrame;
/*     */   protected String name;
/*     */   
/*     */   public GetGroupCopySnapshotsForTimeFrameAndName() {}
/*     */   
/*     */   public GetGroupCopySnapshotsForTimeFrameAndName(ConsistencyGroupCopyUID groupCopy, TimeFrame timeFrame, String name)
/*     */   {
/*  52 */     this.groupCopy = groupCopy;
/*  53 */     this.timeFrame = timeFrame;
/*  54 */     this.name = name;
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
/*  66 */     return this.groupCopy;
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
/*  78 */     this.groupCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public TimeFrame getTimeFrame()
/*     */   {
/*  90 */     return this.timeFrame;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTimeFrame(TimeFrame value)
/*     */   {
/* 102 */     this.timeFrame = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getName()
/*     */   {
/* 114 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/* 126 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 136 */     if (!(obj instanceof GetGroupCopySnapshotsForTimeFrameAndName)) {
/* 137 */       return false;
/*     */     }
/* 139 */     GetGroupCopySnapshotsForTimeFrameAndName otherObj = (GetGroupCopySnapshotsForTimeFrameAndName)obj;
/*     */     
/* 141 */     return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.timeFrame != null ? this.timeFrame.equals(otherObj.timeFrame) : this.timeFrame == otherObj.timeFrame) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name);
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
/* 152 */     return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.timeFrame != null ? this.timeFrame.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0);
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
/* 163 */     return "GetGroupCopySnapshotsForTimeFrameAndName [groupCopy=" + this.groupCopy + ", " + "timeFrame=" + this.timeFrame + ", " + "name=" + this.name + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetGroupCopySnapshotsForTimeFrameAndName.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */