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
/*     */ @XmlType(name="getGroupSnapshotsForTimeFrameAndName", propOrder={"group", "timeFrame", "name"})
/*     */ public class GetGroupSnapshotsForTimeFrameAndName
/*     */ {
/*     */   protected ConsistencyGroupUID group;
/*     */   @XmlElement(nillable=true)
/*     */   protected TimeFrame timeFrame;
/*     */   protected String name;
/*     */   
/*     */   public GetGroupSnapshotsForTimeFrameAndName() {}
/*     */   
/*     */   public GetGroupSnapshotsForTimeFrameAndName(ConsistencyGroupUID group, TimeFrame timeFrame, String name)
/*     */   {
/*  52 */     this.group = group;
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
/*     */   public ConsistencyGroupUID getGroup()
/*     */   {
/*  66 */     return this.group;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroup(ConsistencyGroupUID value)
/*     */   {
/*  78 */     this.group = value;
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
/* 136 */     if (!(obj instanceof GetGroupSnapshotsForTimeFrameAndName)) {
/* 137 */       return false;
/*     */     }
/* 139 */     GetGroupSnapshotsForTimeFrameAndName otherObj = (GetGroupSnapshotsForTimeFrameAndName)obj;
/*     */     
/* 141 */     return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.timeFrame != null ? this.timeFrame.equals(otherObj.timeFrame) : this.timeFrame == otherObj.timeFrame) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name);
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
/* 152 */     return (this.group != null ? this.group.hashCode() : 0) ^ (this.timeFrame != null ? this.timeFrame.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0);
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
/* 163 */     return "GetGroupSnapshotsForTimeFrameAndName [group=" + this.group + ", " + "timeFrame=" + this.timeFrame + ", " + "name=" + this.name + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetGroupSnapshotsForTimeFrameAndName.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */