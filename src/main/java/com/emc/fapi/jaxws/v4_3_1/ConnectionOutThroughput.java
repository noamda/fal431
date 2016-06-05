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
/*     */ @XmlType(name="ConnectionOutThroughput", propOrder={"cluster", "outThroughput"})
/*     */ public class ConnectionOutThroughput
/*     */ {
/*     */   protected ClusterUID cluster;
/*     */   protected long outThroughput;
/*     */   
/*     */   public ConnectionOutThroughput() {}
/*     */   
/*     */   public ConnectionOutThroughput(ClusterUID cluster, long outThroughput)
/*     */   {
/*  47 */     this.cluster = cluster;
/*  48 */     this.outThroughput = outThroughput;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getCluster()
/*     */   {
/*  60 */     return this.cluster;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCluster(ClusterUID value)
/*     */   {
/*  72 */     this.cluster = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getOutThroughput()
/*     */   {
/*  80 */     return this.outThroughput;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setOutThroughput(long value)
/*     */   {
/*  88 */     this.outThroughput = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof ConnectionOutThroughput)) {
/*  99 */       return false;
/*     */     }
/* 101 */     ConnectionOutThroughput otherObj = (ConnectionOutThroughput)obj;
/*     */     
/* 103 */     return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.outThroughput == otherObj.outThroughput);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (int)this.outThroughput;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "ConnectionOutThroughput [cluster=" + this.cluster + ", " + "outThroughput=" + this.outThroughput + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConnectionOutThroughput.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */