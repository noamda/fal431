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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="InOutThroughputStatistics", propOrder={"connectionsOutThroughput", "inThroughput"})
/*     */ public class InOutThroughputStatistics
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConnectionOutThroughput> connectionsOutThroughput;
/*     */   protected long inThroughput;
/*     */   
/*     */   public InOutThroughputStatistics() {}
/*     */   
/*     */   public InOutThroughputStatistics(List<ConnectionOutThroughput> connectionsOutThroughput, long inThroughput)
/*     */   {
/*  51 */     this.connectionsOutThroughput = connectionsOutThroughput;
/*  52 */     this.inThroughput = inThroughput;
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
/*     */   public List<ConnectionOutThroughput> getConnectionsOutThroughput()
/*     */   {
/*  78 */     if (this.connectionsOutThroughput == null) {
/*  79 */       this.connectionsOutThroughput = new ArrayList();
/*     */     }
/*  81 */     return this.connectionsOutThroughput;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getInThroughput()
/*     */   {
/*  89 */     return this.inThroughput;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setInThroughput(long value)
/*     */   {
/*  97 */     this.inThroughput = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 107 */     if (!(obj instanceof InOutThroughputStatistics)) {
/* 108 */       return false;
/*     */     }
/* 110 */     InOutThroughputStatistics otherObj = (InOutThroughputStatistics)obj;
/*     */     
/* 112 */     return (this.connectionsOutThroughput != null ? this.connectionsOutThroughput.equals(otherObj.connectionsOutThroughput) : this.connectionsOutThroughput == otherObj.connectionsOutThroughput) && (this.inThroughput == otherObj.inThroughput);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 122 */     return (this.connectionsOutThroughput != null ? this.connectionsOutThroughput.hashCode() : 0) ^ (int)this.inThroughput;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 132 */     return "InOutThroughputStatistics [connectionsOutThroughput=" + this.connectionsOutThroughput + ", " + "inThroughput=" + this.inThroughput + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\InOutThroughputStatistics.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */