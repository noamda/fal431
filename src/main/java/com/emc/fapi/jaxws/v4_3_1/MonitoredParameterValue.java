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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="MonitoredParameterValue", propOrder={"parameterWaterMarks", "reverseWaterMarksDirection", "value"})
/*     */ public class MonitoredParameterValue
/*     */ {
/*     */   protected MonitoredParameterWaterMarks parameterWaterMarks;
/*     */   protected boolean reverseWaterMarksDirection;
/*     */   protected long value;
/*     */   
/*     */   public MonitoredParameterValue() {}
/*     */   
/*     */   public MonitoredParameterValue(MonitoredParameterWaterMarks parameterWaterMarks, boolean reverseWaterMarksDirection, long value)
/*     */   {
/*  50 */     this.parameterWaterMarks = parameterWaterMarks;
/*  51 */     this.reverseWaterMarksDirection = reverseWaterMarksDirection;
/*  52 */     this.value = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public MonitoredParameterWaterMarks getParameterWaterMarks()
/*     */   {
/*  64 */     return this.parameterWaterMarks;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setParameterWaterMarks(MonitoredParameterWaterMarks value)
/*     */   {
/*  76 */     this.parameterWaterMarks = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isReverseWaterMarksDirection()
/*     */   {
/*  84 */     return this.reverseWaterMarksDirection;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setReverseWaterMarksDirection(boolean value)
/*     */   {
/*  92 */     this.reverseWaterMarksDirection = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getValue()
/*     */   {
/* 100 */     return this.value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setValue(long value)
/*     */   {
/* 108 */     this.value = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 118 */     if (!(obj instanceof MonitoredParameterValue)) {
/* 119 */       return false;
/*     */     }
/* 121 */     MonitoredParameterValue otherObj = (MonitoredParameterValue)obj;
/*     */     
/* 123 */     return (this.parameterWaterMarks != null ? this.parameterWaterMarks.equals(otherObj.parameterWaterMarks) : this.parameterWaterMarks == otherObj.parameterWaterMarks) && (this.reverseWaterMarksDirection == otherObj.reverseWaterMarksDirection) && (this.value == otherObj.value);
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
/* 134 */     return (this.parameterWaterMarks != null ? this.parameterWaterMarks.hashCode() : 0) ^ (this.reverseWaterMarksDirection ? 1 : 0) ^ (int)this.value;
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
/* 145 */     return "MonitoredParameterValue [parameterWaterMarks=" + this.parameterWaterMarks + ", " + "reverseWaterMarksDirection=" + this.reverseWaterMarksDirection + ", " + "value=" + this.value + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\MonitoredParameterValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */